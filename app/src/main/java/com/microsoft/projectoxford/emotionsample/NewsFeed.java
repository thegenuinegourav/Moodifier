package com.microsoft.projectoxford.emotionsample;

public class NewsFeed {
    private String status,video_url,image_url;
    public NewsFeed() {
    }

    public NewsFeed(String text, String image, String video) {
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

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }
}
