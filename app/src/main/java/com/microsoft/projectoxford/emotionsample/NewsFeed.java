package com.microsoft.projectoxford.emotionsample;

public class NewsFeed {
    private String status,image_url;
    private Video video_url;
    public NewsFeed() {
    }

    public NewsFeed(String text, String image, Video video) {
        this.status = text;
        this.image_url = image;
        this.video_url = video;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Video getVideo_url() {
        return video_url;
    }

    public void setVideo_url(Video video_url) {
        this.video_url = video_url;
    }
}
