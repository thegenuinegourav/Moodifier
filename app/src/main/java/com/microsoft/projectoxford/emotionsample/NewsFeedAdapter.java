package com.microsoft.projectoxford.emotionsample;

import android.content.Context;
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
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.util.List;

import javax.sql.DataSource;

public class NewsFeedAdapter extends RecyclerView.Adapter<NewsFeedAdapter.MyViewHolder> {

    private Context mContext;
    private List<NewsFeed> newsFeedListList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView status;
        public ImageView imageView;
        public VideoView videoView;
        public ProgressBar progressBar;
        public MyViewHolder(View view) {
            super(view);
            status = (TextView) view.findViewById(R.id.status);
            imageView = (ImageView) view.findViewById(R.id.image_url);
            videoView = (VideoView) view.findViewById(R.id.video_url);
            progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
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
        NewsFeed album = newsFeedListList.get(position);

        holder.progressBar.setVisibility(View.INVISIBLE);
        if(album.getStatus().equals("")) holder.status.setVisibility(View.INVISIBLE);
        else {
            holder.status.setVisibility(View.VISIBLE);
            holder.status.setText(album.getStatus());
        }

        if(album.getImage_url().equals("")) holder.imageView.setVisibility(View.INVISIBLE);
        else {
            holder.progressBar.setVisibility(View.VISIBLE);
            Glide.with(mContext).load(album.getImage_url())
                    .listener(new RequestListener<String, GlideDrawable>() {
                        @Override
                        public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                            holder.progressBar.setVisibility(View.INVISIBLE);
                            holder.imageView.setVisibility(View.VISIBLE);
                            return false;
                        }
                    }).into(holder.imageView);
        }

        if(album.getVideo_url().equals("")) holder.videoView.setVisibility(View.INVISIBLE);
        else {
            holder.progressBar.setVisibility(View.VISIBLE);
            try {
                holder.videoView.setVideoPath(album.getVideo_url());
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }

            holder.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                // Close the progress bar and play the video
                public void onPrepared(MediaPlayer mp) {
                    holder.videoView.setVisibility(View.VISIBLE);
                    holder.progressBar.setVisibility(View.INVISIBLE);
                    holder.videoView.start();
                }
            });
        }

    }


    @Override
    public int getItemCount() {
        return newsFeedListList.size();
    }
}