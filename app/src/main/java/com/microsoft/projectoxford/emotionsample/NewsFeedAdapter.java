package com.microsoft.projectoxford.emotionsample;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.util.List;

import javax.sql.DataSource;

public class NewsFeedAdapter extends RecyclerView.Adapter<NewsFeedAdapter.MyViewHolder> {

    private Context mContext;
    private List<NewsFeed> newsFeedListList;
    public View v;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView status;
        public ImageView imageView;
        public ImageView videoView,playButton;
        public ProgressBar progressBar;
        public NewsFeed currentItem;
        public MyViewHolder(View view) {
            super(view);
            status = (TextView) view.findViewById(R.id.status);
            imageView = (ImageView) view.findViewById(R.id.image_url);
            videoView = (ImageView) view.findViewById(R.id.video_url);
            progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
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


    public NewsFeedAdapter(Context mContext, List<NewsFeed> albumList) {
        this.mContext = mContext;
        this.newsFeedListList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_newsfeed, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final NewsFeed album = newsFeedListList.get(position);

        holder.currentItem = newsFeedListList.get(position);
        holder.progressBar.setVisibility(View.GONE);
        holder.playButton.setVisibility(View.GONE);
        if(album.getStatus().equals("")) holder.status.setVisibility(View.GONE);
        else {
            holder.status.setVisibility(View.VISIBLE);
            holder.status.setText(album.getStatus());
        }

        if(album.getImage_url().equals("")){
            Glide.clear(holder.imageView);
            holder.imageView.setVisibility(View.GONE);
        }
        else {
            holder.progressBar.setVisibility(View.VISIBLE);
            Glide.with(mContext).load(album.getImage_url())
                    .error(R.drawable.ic_error_outline_black_24dp)//in case of any glide exception or not able to download then this image will be appear . if you won't mention this error() then nothing to worry placeHolder image would be remain as it is.
                    .diskCacheStrategy(DiskCacheStrategy.ALL) //using to load into cache then second time it will load fast.
                    .animate(R.anim.fade_in) // when image (url) will be loaded by glide then this face in animation help to replace url image in the place of placeHolder (default) image.
                    .listener(new RequestListener<String, GlideDrawable>() {
                        @Override
                        public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                            holder.progressBar.setVisibility(View.GONE);
                            holder.imageView.setVisibility(View.VISIBLE);
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                            holder.progressBar.setVisibility(View.GONE);
                            holder.imageView.setVisibility(View.VISIBLE);
                            return false;
                        }
                    }).into(holder.imageView);
        }

        if(album.getVideo_url()==null){
            holder.videoView.setVisibility(View.GONE);
            Glide.clear(holder.videoView);
        }
        else {
            holder.progressBar.setVisibility(View.VISIBLE);
            Glide.with(mContext).load(album.getVideo_url().getThumbnail_url())
                    .error(R.drawable.ic_error_outline_black_24dp)//in case of any glide exception or not able to download then this image will be appear . if you won't mention this error() then nothing to worry placeHolder image would be remain as it is.
                    .diskCacheStrategy(DiskCacheStrategy.ALL) //using to load into cache then second time it will load fast.
                    .animate(R.anim.fade_in) // when image (url) will be loaded by glide then this face in animation help to replace url image in the place of placeHolder (default) image.
                    .listener(new RequestListener<String, GlideDrawable>() {
                        @Override
                        public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                            holder.progressBar.setVisibility(View.GONE);
                            holder.videoView.setVisibility(View.VISIBLE);
                            holder.playButton.setVisibility(View.VISIBLE);
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                            holder.progressBar.setVisibility(View.GONE);
                            holder.videoView.setVisibility(View.VISIBLE);
                            holder.playButton.setVisibility(View.VISIBLE);
                            return false;
                        }
                    }).into(holder.videoView);
        }
    }


    @Override
    public int getItemCount() {
        return newsFeedListList.size();
    }
}