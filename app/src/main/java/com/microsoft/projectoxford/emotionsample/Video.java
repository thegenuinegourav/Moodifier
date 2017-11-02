package com.microsoft.projectoxford.emotionsample;

/**
 * Created by Gourav on 03-11-2017.
 */

public class Video {
    private String video_url, thumbnail_url;

    public Video() {

    }

    public Video(String url, String thumbnail_url) {
        this.video_url = url;
        this.thumbnail_url = thumbnail_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }
}
