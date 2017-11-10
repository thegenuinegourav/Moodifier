package com.microsoft.projectoxford.emotionsample;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;

public class NewsFeedAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private List<NewsFeed> newsFeedListList;
    public View v;

    private final int VIEW_ITEM = 1;
    private final int VIEW_PROG = 0;

    private int visibleThreshold = 5;
    private int lastVisibleItem, totalItemCount;
    private boolean loading;
    private OnLoadMoreListener onLoadMoreListener;


    public static class ProgressViewHolder extends RecyclerView.ViewHolder {
        public ProgressBar progressBar;

        public ProgressViewHolder(View v) {
            super(v);
            progressBar = (ProgressBar) v.findViewById(R.id.progressBar1);
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView status;
        public ImageView imageView;
        public ImageView videoView,playButton;
        public NewsFeed currentItem;
        public MyViewHolder(View view) {
            super(view);
            status = (TextView) view.findViewById(R.id.status);
            imageView = (ImageView) view.findViewById(R.id.image_url);
            videoView = (ImageView) view.findViewById(R.id.video_url);
            playButton = (ImageView) view.findViewById(R.id.play_button);
            v = view;
            v.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    if(currentItem.getVideo_url()!=null) {
                        Intent intent = new Intent(mContext, WebViewActivity.class);
                        intent.putExtra("url", currentItem.getVideo_url().getVideo_url());
                        mContext.startActivity(intent);
                    }
                }
            });
        }
    }


    public NewsFeedAdapter(Context mContext, List<NewsFeed> albumList, RecyclerView recyclerView) {
        this.mContext = mContext;
        this.newsFeedListList = albumList;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {

            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                        @Override
                        public void onScrolled(RecyclerView recyclerView,
                                               int dx, int dy) {
                            super.onScrolled(recyclerView, dx, dy);

                            totalItemCount = linearLayoutManager.getItemCount();
                            lastVisibleItem = linearLayoutManager
                                    .findLastVisibleItemPosition();
                            if (!loading
                                    && totalItemCount <= (lastVisibleItem + visibleThreshold)) {
                                // End has been reached
                                // Do something
                                if (onLoadMoreListener != null) {
                                    onLoadMoreListener.onLoadMore();
                                }
                                loading = true;
                            }
                        }
                    });
        }
    }

    public static int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override
    public int getItemViewType(int position) {
        return newsFeedListList.get(position) != null ? VIEW_ITEM : VIEW_PROG;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder vh;
        if (viewType == VIEW_ITEM) {
            View v = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.cardview_newsfeed, parent, false);

            vh = new MyViewHolder(v);
        } else {
            View v = LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.layout_loading_item, parent, false);

            vh = new ProgressViewHolder(v);
        }
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder h, int position) {

        if (h instanceof MyViewHolder) {
            final MyViewHolder holder = (MyViewHolder) h;
            final NewsFeed album = (NewsFeed) newsFeedListList.get(position);
            holder.currentItem = newsFeedListList.get(position);
            holder.playButton.setVisibility(View.GONE);
            if(album.getStatus().equals("")) holder.status.setVisibility(View.GONE);
            else {
                holder.status.setVisibility(View.VISIBLE);
                holder.status.setText(album.getStatus());
            }

            if(album.getImage_url().equals("")){
                holder.imageView.setVisibility(View.GONE);
            }
            else {
                holder.imageView.setVisibility(View.VISIBLE);
                Picasso.with(mContext).load(album.getImage_url()).resize(getScreenWidth(), getScreenHeight()/2).into(holder.imageView);
            }

            if(album.getVideo_url()==null){
                holder.videoView.setVisibility(View.GONE);
            }
            else {
                if(!album.getVideo_url().getThumbnail_url().equals("")) Picasso.with(mContext).load(album.getVideo_url().getThumbnail_url()).resize(getScreenWidth(), getScreenHeight()/2).into(holder.videoView);
                holder.videoView.setVisibility(View.VISIBLE);
                holder.playButton.setVisibility(View.VISIBLE);
            }

        } else {
            ((ProgressViewHolder) h).progressBar.setIndeterminate(true);
        }
    }

    public void setLoaded() {
        loading = false;
    }

    public void setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener) {
        this.onLoadMoreListener = onLoadMoreListener;
    }


    @Override
    public int getItemCount() {
        return newsFeedListList.size();
    }
}