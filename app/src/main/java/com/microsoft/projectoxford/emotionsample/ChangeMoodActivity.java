package com.microsoft.projectoxford.emotionsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static android.os.Looper.prepare;

public class ChangeMoodActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NewsFeedAdapter adapter;
    private List<NewsFeed> albumList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_mood);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();

        String mood = getIntent().getStringExtra("mood");
        switch (mood) {
            case "happy": Happy(); break;
            case "sad": Sad(); break;
            case "angry": Angry(); break;
            case "contempt": Contempt(); break;
            case "disgust": Disgust(); break;
            case "fear": Fear(); break;
            case "neutral": Neutral(); break;
            case "surprise": Surprise(); break;
        }
        adapter = new NewsFeedAdapter(this, albumList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }

    private void Surprise() {
        String[] images = new String[]{
                "http://www.planwallpaper.com/static/images/desktop-year-of-the-tiger-images-wallpaper.jpg",
                "http://www.mybligr.com/wp-content/uploads/2017/01/most-beautiful-tiger-animals-pics-images-photos-pictures-6.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGru7M9U6PUAxD2FogVGRh5g6jR76dSi70yaTEJ7Q0NTYFR3RqNg"
        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        //To add text
        NewsFeed a = new NewsFeed(quotes[0], "", null);
        albumList.add(a);

        //To add images
        a = new NewsFeed("", images[0], null);
        albumList.add(a);

        //To add videos
        Video v = new Video("https://www.youtube.com/watch?v=PF48IFkHXgI",
                "http://www.quertime.com/wp-content/uploads/2012/02/top_12_most_funny_and_hilarious_youtube_videos.jpg");
        a = new NewsFeed("","",v);
        albumList.add(a);

        //--------

        a = new NewsFeed("", images[1], null);
        albumList.add(a);

        a = new NewsFeed("", images[2], null);
        albumList.add(a);


        Collections.shuffle(albumList);

    }


    private void Neutral() {
        String[] images = new String[]{
                "http://www.planwallpaper.com/static/images/desktop-year-of-the-tiger-images-wallpaper.jpg",
                "http://www.mybligr.com/wp-content/uploads/2017/01/most-beautiful-tiger-animals-pics-images-photos-pictures-6.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGru7M9U6PUAxD2FogVGRh5g6jR76dSi70yaTEJ7Q0NTYFR3RqNg"
        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        //To add text
        NewsFeed a = new NewsFeed(quotes[0], "", null);
        albumList.add(a);

        //To add images
        a = new NewsFeed("", images[0], null);
        albumList.add(a);

        //To add videos
        Video v = new Video("https://www.youtube.com/watch?v=PF48IFkHXgI",
                "http://www.quertime.com/wp-content/uploads/2012/02/top_12_most_funny_and_hilarious_youtube_videos.jpg");
        a = new NewsFeed("","",v);
        albumList.add(a);

        //--------

        a = new NewsFeed("", images[1], null);
        albumList.add(a);

        a = new NewsFeed("", images[2], null);
        albumList.add(a);


        Collections.shuffle(albumList);
    }


    private void Fear() {
        String[] images = new String[]{
                "http://www.planwallpaper.com/static/images/desktop-year-of-the-tiger-images-wallpaper.jpg",
                "http://www.mybligr.com/wp-content/uploads/2017/01/most-beautiful-tiger-animals-pics-images-photos-pictures-6.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGru7M9U6PUAxD2FogVGRh5g6jR76dSi70yaTEJ7Q0NTYFR3RqNg"
        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        //To add text
        NewsFeed a = new NewsFeed(quotes[0], "", null);
        albumList.add(a);

        //To add images
        a = new NewsFeed("", images[0], null);
        albumList.add(a);

        //To add videos
        Video v = new Video("https://www.youtube.com/watch?v=PF48IFkHXgI",
                "http://www.quertime.com/wp-content/uploads/2012/02/top_12_most_funny_and_hilarious_youtube_videos.jpg");
        a = new NewsFeed("","",v);
        albumList.add(a);

        //--------

        a = new NewsFeed("", images[1], null);
        albumList.add(a);

        a = new NewsFeed("", images[2], null);
        albumList.add(a);


        Collections.shuffle(albumList);
    }


    private void Disgust() {
        String[] images = new String[]{
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrvgSFkBZsfnlqlz4pXhx1fXv8ae_dWap6vUlZRcE6xFo7KgzN",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZcjTk2cV9dXXPH_yc9ykWuzCBPvIaCSfh7Xp81BYYs3ZmSNbT",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4sUoU9ALwzvM7S_luOWFSXzBvNVH7w4pJGcY_OPVdlCEgF7ntNQ",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpBAhEucAffA7hdzMCAqO1GFNnWgiGHYUngOJL8AhVXt1UBFVI",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ8dHwEPNpVUdTavaGMFSYK6hzh8ggnO1tfKZhZ9Isy04m1VzQULA",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQy9Op313yQy9X-F8CqkAk98nWgpmZEjeFlnvEbIAwnytJ0rESv",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRx6wM8dxRVeeuKAFMtRkaYResNxqcNn7V-YVoqpyLPIrzgav6NVg",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXWY87rX-hjCDMl0OME1QxvOYc99zAQqdMpQX9IBwnH4GDfECnlA",
               "https://s-media-cache-ak0.pinimg.com/originals/b9/5a/91/b95a91038eb042dcab48096540b3f480.jpg",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQW3IwxLaQM3lo9HdhtWqThOnhfycGJ9f68MCGsZO24Vcbp_IzX",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS5N0ebBnt-YK3QjIgKS_kCHCZsbuEdSBH1PkdViPFLfAjVWD_fww",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSRmCXYKOyXlvD__15njmozycmwtWFJMqZadCvH_opTdoCy4_jM1w",
               "https://m.popkey.co/18ebb5/GezJe.gif",
               "http://www.pbh2.com/wordpress/wp-content/uploads/2013/06/funny-gif-grocery-bags.gif",
               "https://i0.wp.com/jhandlog.com/wp-content/uploads/2017/10/26tP3M3i03hoIYL6M.gif",
               "https://media.giphy.com/media/DZ3aqBIOt9Uqc/giphy.gif",
               "https://media.giphy.com/media/g3oRYQ1BSAxHO/giphy.gif",
               "http://cdn1.clevver.com/wp-content/uploads/2014/02/friends-tv-show-bad-lessons-5.gif",
               "https://media.giphy.com/media/DTExfM2bxlQI0/giphy.gif",
               "http://lamanzanaingravida.files.wordpress.com/2011/03/unagi.gif?w=500&h=230",
               "http://pumpernickelpixie.com/wp-content/uploads/2015/02/4-joey.gif",
               "http://img17.laughinggif.com/pic/HTTPS9tZWRpYS5naXBoeS5jb20vbWVkaWEvRHdSckhQWHZPcmpSUy9naXBoeS5naWYlog.gif",
               "https://s-media-cache-ak0.pinimg.com/originals/44/53/71/4453711e31efbf74092b77c7870a19c1.gif",
               "https://media.giphy.com/media/kgjQFAbRLfrgs/giphy.gif",
               "http://lovelace-media.imgix.net/uploads/528/2852eb70-7e54-0132-1d7e-0a2c89e5f2f5.gif?", 
               "https://vignette.wikia.nocookie.net/ssb/images/f/fb/Large.gif/revision/latest?cb=20150117040313",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRoiO7cne3U7c-Byk2rM0TFcuJ8vQeZAnM8uAx742xDnmX2wTIy1A",
               "https://static.fjcdn.com/gifs/Random+gifs+im+just+dumping+funny+gifs+here+because+im_799be1_4495283.gif",
               "https://media.giphy.com/media/yZjcNgKGCYfJu/giphy.gif",
               "https://78.media.tumblr.com/766d1832d02728928c434913899e50ff/tumblr_mnaqy95oyh1qhsr9bo1_500.gif",
               "http://cdn.ebaumsworld.com/mediaFiles/picture/2165492/84441560.gif",
               "https://acparmyofclubpenguin.files.wordpress.com/2014/09/aggerortizfront.gif"
        };





        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        //To add text
        NewsFeed a = new NewsFeed(quotes[0], "", null);
        albumList.add(a);

        //To add images
         a = new NewsFeed("", images[0], null);
        albumList.add(a);

        a = new NewsFeed("", images[1], null);
        albumList.add(a);

        
        a = new NewsFeed("", images[2], null);
        albumList.add(a);

        a = new NewsFeed("", images[3], null);
        albumList.add(a);

        a = new NewsFeed("", images[4], null);
        albumList.add(a);

        a = new NewsFeed("", images[5], null);
        albumList.add(a);

        a = new NewsFeed("", images[6], null);
        albumList.add(a);

        a = new NewsFeed("", images[7], null);
        albumList.add(a);

        a = new NewsFeed("", images[8], null);
        albumList.add(a);

        a = new NewsFeed("", images[9], null);
        albumList.add(a);

        a = new NewsFeed("", images[10], null);
        albumList.add(a);

        a = new NewsFeed("", images[11], null);
        albumList.add(a);

        a = new NewsFeed("", images[12], null);
        albumList.add(a);

        a = new NewsFeed("", images[13], null);
        albumList.add(a);

        a = new NewsFeed("", images[14], null);
        albumList.add(a);

        a = new NewsFeed("", images[15], null);
        albumList.add(a);

        a = new NewsFeed("", images[16], null);
        albumList.add(a);

        a = new NewsFeed("", images[17], null);
        albumList.add(a);

        a = new NewsFeed("", images[18], null);
        albumList.add(a);

        a = new NewsFeed("", images[19], null);
        albumList.add(a);

        a = new NewsFeed("", images[20], null);
        albumList.add(a);

        a = new NewsFeed("", images[21], null);
        albumList.add(a);

        a = new NewsFeed("", images[22], null);
        albumList.add(a);

        a = new NewsFeed("", images[23], null);
        albumList.add(a);

        a = new NewsFeed("", images[24], null);
        albumList.add(a);

        a = new NewsFeed("", images[25], null);
        albumList.add(a);

        a = new NewsFeed("", images[26], null);
        albumList.add(a);

        a = new NewsFeed("", images[27], null);
        albumList.add(a);

        a = new NewsFeed("", images[28], null);
        albumList.add(a);

        a = new NewsFeed("", images[29], null);
        albumList.add(a);

        a = new NewsFeed("", images[30], null);
        albumList.add(a);        

       


        //To add videos
        Video v = new Video("https://www.youtube.com/watch?v=o-ajSt2FcT0",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3UEQeBoI9LZVrkU-6Lv24JtaAVnGwE87BCf-_GLMM4GITKh4nEg");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=ZuMQlAYcB2g",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTo2usHo38dUkqssr7nE3GgdbHtk6xZ2_nF8w0NMoaLx4lWOmxNQA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=lGP1YFE5s4M",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtji9eyhpFirGScumiTSeDRuSFPPeqzonbTbWKJU7eygCDgjk");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=0QnKHfWgaao",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtji9eyhpFirGScumiTSeDRuSFPPeqzonbTbWKJU7eygCDgjk");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=hoIWtgQ3Wz4",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5eMq73DnD69mMJZ6KnmfmE9oXmxb1BvNn24T2grSKypviG8Sd");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=ARM42-eorzE",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRezfYmSILD5pwAeOf3aOLVsfYR4NMtv-2spgLp-Z6eDaDAeK-S");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=dCq1hFWSOwo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdWfN9WJ5-H76O7muCyjVD9-lKp1pIXtyAQiKs10U8xYPnzD9Z");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=0mqFlu0ZE7Q",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOuDE2iYsk2gHDqe5YySyQpSjyfi4tewgaHkOwsjIzSlKW1xW1MQ");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=QFH747sK200",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4K69ibbLleGhm_5UMIGU_3BkkDbRfPihOEbkOB1DP9HJdvm30");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=j9dLVJgT79M",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpxCc0s7sXStuCg_kbgQMpR3JFSLYBFsEmtOERdhKPIsR-wDRJ");
        a = new NewsFeed("","",v);
        albumList.add(a);

  

        Collections.shuffle(albumList);
    }


    private void Contempt() {
        String[] images = new String[]{
                "http://www.planwallpaper.com/static/images/desktop-year-of-the-tiger-images-wallpaper.jpg",
                "http://www.mybligr.com/wp-content/uploads/2017/01/most-beautiful-tiger-animals-pics-images-photos-pictures-6.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGru7M9U6PUAxD2FogVGRh5g6jR76dSi70yaTEJ7Q0NTYFR3RqNg"
        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        //To add text
        NewsFeed a = new NewsFeed(quotes[0], "", null);
        albumList.add(a);

        //To add images
        a = new NewsFeed("", images[0], null);
        albumList.add(a);

        //To add videos
        Video v = new Video("https://www.youtube.com/watch?v=PF48IFkHXgI",
                "http://www.quertime.com/wp-content/uploads/2012/02/top_12_most_funny_and_hilarious_youtube_videos.jpg");
        a = new NewsFeed("","",v);
        albumList.add(a);

        //--------

        a = new NewsFeed("", images[1], null);
        albumList.add(a);

        a = new NewsFeed("", images[2], null);
        albumList.add(a);


        Collections.shuffle(albumList);
    }


    private void Angry() {
        String[] images = new String[]{
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6doSrJZbPPfNU7X416VgvPFXqGJPpbBe0hXeQ8HPTEvm63xI1",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVmtl2ItoBoKqjbtEPNkUMnTQSyhvzknJnUTGjmF-CjDMQ9731gQ".
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFd1W0EtGaePcS2kU4FZCUg6vsMvFA6P4E-NjIEegG_yATlvUkTA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLIcZaVsTMXr77WYREkT0FgodCWGai9W4DyNxwSQZEAiUcNPDKsA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEuRCLOaXg9EPneGqzLolY_budTdKAjdTQx4SNnyua8tlhqzSS",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROIkA-6bZ-_CDvkNEXsYeyrrfyiVBPbFzj3qrjv57fQvf4jz4XWQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSyYbwmGsAWzZC1HcG6xomB77d-m4qE7Na8zBs_m2cnpDJ4TuYKbQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4P0jMZ2EPZ-K1WJ1srrBCJQi-4cDcN5uF9RtbKL4YDe36QWQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGmTxNsrzoA5wU8FUzaK7teNtErmOY1Rz2ffc5VNQ5ry0z2frX",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTv2aQvlq25pvehhC173eBf-thzPLMIMpSxvWzy-CnE2Sc7Jore7g",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTaqdOHe2oLLq24hbdMiiBpsHt8X4_QP9zQqfmJjWYdWsAAPBAL",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1-TU1jfTKL9FxWELBCTsKm_Cxcm3vMvhg5cCrV2wfMpPQrHJK",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSJGb966Qrh8AW7UbjgxwrQyi0fYQARBYmYOCZUbxrEH9QSv7s-g",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS17oEFpKdUfvS-Pg7fRUEQzzVKVZfosb_YllcgWBKLqqhkL2Dm",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEXbu0ZxhAhH9LrQzObwJM4NuyporB3-ZNjAY8jHX856N1BB5Clw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRabFgkEAWoslXX6zi7CN2Z0oB7zbn6iscpP_gZvHRq8FrItenn",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnCmOjg5CEE3CbM3-GlD9lPmar2mFhLZ8QDRMjpFHuuXc8M0t3LA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8J5Kx-xzlytS9A8I_mWKeTpznguGrxzx7xWp5id9ML8c9CDGv8w",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8bxzshWzgMPTKgIZqLpohsNmymb8x0rq5lLu01DHxsnxu81yJ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqPP_xIUFaJ7epi5HE0bf_5RvmecfR-ShGqS4lbgveOZR_0e9r",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSREC0TAIjKvyJ4qIIuSH6n7kI75YC8bkeBdYoVeV9DVlnl-7hSIA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR90iY5bcy5SGH_qVq4BZn5Z8elh12GBrdcJhwN31cZXycnvE27",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ32C1IanoXlMQFIsGKMhUE-Dhrs1_uSCCM11HhF51gcosAgamVPw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNfVdVLFLAX-oW4qX6ZQTnMjjNRMGAG0Blszo-lhZjB8UNe8MEvw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMeyMoEpVRuvkREFJdGjRGP-qybktAsIlP5p-ZJq1mTfdHy7Bg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCxjjLcg4pGSekMtg5yfLNJ3Pbz0QcCQWCfrCSR1Ml3XH65-Zm",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0nLhxnpFgj5UqAOe_BEbvpvANdMXJntqUpJnaHIIO8QsVTJuX",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcBzb1ODMHLW3N-Hm08vqOz3OBxF30K_i-6F-Jr3fr7pinqw96",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8R0hy8xmkKySGQxu3x3OvfGT0DgAlJvmIx0i0QPgl9m3KAthL",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFlO5L0SamOJgEMYcAqWQBaLfdPS-IxwxtGB-cNo_Sp72BgIZ5sQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQu4Llh1GNqsK17qZMXkJrkLi4CKs25PUZQ0BdWwuRFYDs-iEEv",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYBeKyKTkIoHn8wZorVLKWoQYgveU0oACWkP1e-6RQtLwSe3AXpw"

        };

        String[] quotes = new String[]{
                "Anger doesn't solve anything, It builds nothing & destroys everything"
        };

        //To add text
        NewsFeed a = new NewsFeed(quotes[0], "", null);
        albumList.add(a);

        //To add images
        a = new NewsFeed("", images[0], null);
        albumList.add(a);

        a = new NewsFeed("", images[1], null);
        albumList.add(a);

        
        a = new NewsFeed("", images[2], null);
        albumList.add(a);

        a = new NewsFeed("", images[3], null);
        albumList.add(a);

        a = new NewsFeed("", images[4], null);
        albumList.add(a);

        a = new NewsFeed("", images[5], null);
        albumList.add(a);

        a = new NewsFeed("", images[6], null);
        albumList.add(a);

        a = new NewsFeed("", images[7], null);
        albumList.add(a);

        a = new NewsFeed("", images[8], null);
        albumList.add(a);

        a = new NewsFeed("", images[9], null);
        albumList.add(a);

        a = new NewsFeed("", images[10], null);
        albumList.add(a);

        a = new NewsFeed("", images[11], null);
        albumList.add(a);

        a = new NewsFeed("", images[12], null);
        albumList.add(a);

        a = new NewsFeed("", images[13], null);
        albumList.add(a);

        a = new NewsFeed("", images[14], null);
        albumList.add(a);

        a = new NewsFeed("", images[15], null);
        albumList.add(a);

        a = new NewsFeed("", images[16], null);
        albumList.add(a);

        a = new NewsFeed("", images[17], null);
        albumList.add(a);

        a = new NewsFeed("", images[18], null);
        albumList.add(a);

        a = new NewsFeed("", images[19], null);
        albumList.add(a);

        a = new NewsFeed("", images[20], null);
        albumList.add(a);

        a = new NewsFeed("", images[21], null);
        albumList.add(a);

        a = new NewsFeed("", images[22], null);
        albumList.add(a);

        a = new NewsFeed("", images[23], null);
        albumList.add(a);

        a = new NewsFeed("", images[24], null);
        albumList.add(a);

        a = new NewsFeed("", images[25], null);
        albumList.add(a);

        a = new NewsFeed("", images[26], null);
        albumList.add(a);

        a = new NewsFeed("", images[27], null);
        albumList.add(a);

        a = new NewsFeed("", images[28], null);
        albumList.add(a);

        a = new NewsFeed("", images[29], null);
        albumList.add(a);

        a = new NewsFeed("", images[30], null);
        albumList.add(a);        

        a = new NewsFeed("", images[31], null);
        albumList.add(a);


        //To add videos
        Video v = new Video("https://www.youtube.com/watch?v=coiCkmcKjX8",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSI1yxd8fNRpa4-N8l5JgiWb4gDydf5aHyKsnGdsHwigA2LHcPUwQ");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=du035tg-SwY",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJvBxuptEZUQY0QEq97UM--QzrE6BwaIisoTQqGuRrxCPsMxQC");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=d_5DU5opOFk",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLbBrjZ0Ol7vYwrS2_zBbyiIczEMO48BCZQqZWYUaC2MqsKSGD4Q");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=BsVq5R_F6RA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-CU1P-edYGs8RIM5qWf-22Q55SfRZea3b_xFEdwA0JIm2PsYmUg");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=KH3PHGjpo5Y",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4J9S19KjXDZbB9XHkZx49LEkDJqyh_LpQkSQnpTAYlPWhho5_6A");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=6JAmWc1daDo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShAiCezhwgYWkbCWhRwlmISTau0xiltleClVoyRwldnXu7Q7u0");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=wDOQMKGYJQo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFy0hk1385PguhwZy5XRX_RYF5XHuQCwWeNe2AH6Jc02ZM8x5D");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=VTa5w_fN-3w",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKrxopn32aQ22ZDRNPbyUlAVwQHIXopQR_phvaTNVS36V_DDSenQ");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=xI3sVuH7rms",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRCtGjx0bAauOwroR5BBKrzqUc0P5QrqWS_rbGaqDTvgjAuVjF65g");
        a = new NewsFeed("","",v);
        albumList.add(a);




        


        Collections.shuffle(albumList);
    }


     private void Sad() {
        String[] images = new String[]{
               "https://m.popkey.co/18ebb5/GezJe.gif",
               "http://www.pbh2.com/wordpress/wp-content/uploads/2013/06/funny-gif-grocery-bags.gif",
               "https://i0.wp.com/jhandlog.com/wp-content/uploads/2017/10/26tP3M3i03hoIYL6M.gif",
               "https://media.giphy.com/media/DZ3aqBIOt9Uqc/giphy.gif",
               "https://media.giphy.com/media/g3oRYQ1BSAxHO/giphy.gif",
               "http://cdn1.clevver.com/wp-content/uploads/2014/02/friends-tv-show-bad-lessons-5.gif",
               "https://media.giphy.com/media/DTExfM2bxlQI0/giphy.gif",
               "http://lamanzanaingravida.files.wordpress.com/2011/03/unagi.gif?w=500&h=230",
               "http://pumpernickelpixie.com/wp-content/uploads/2015/02/4-joey.gif",
               "http://img17.laughinggif.com/pic/HTTPS9tZWRpYS5naXBoeS5jb20vbWVkaWEvRHdSckhQWHZPcmpSUy9naXBoeS5naWYlog.gif",
               "https://s-media-cache-ak0.pinimg.com/originals/44/53/71/4453711e31efbf74092b77c7870a19c1.gif",
               "https://media.giphy.com/media/kgjQFAbRLfrgs/giphy.gif",
               "http://lovelace-media.imgix.net/uploads/528/2852eb70-7e54-0132-1d7e-0a2c89e5f2f5.gif?", 
               "https://vignette.wikia.nocookie.net/ssb/images/f/fb/Large.gif/revision/latest?cb=20150117040313",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRoiO7cne3U7c-Byk2rM0TFcuJ8vQeZAnM8uAx742xDnmX2wTIy1A",
               "https://static.fjcdn.com/gifs/Random+gifs+im+just+dumping+funny+gifs+here+because+im_799be1_4495283.gif",
               "https://media.giphy.com/media/yZjcNgKGCYfJu/giphy.gif",
               "https://78.media.tumblr.com/766d1832d02728928c434913899e50ff/tumblr_mnaqy95oyh1qhsr9bo1_500.gif",
               "http://cdn.ebaumsworld.com/mediaFiles/picture/2165492/84441560.gif",
               "https://acparmyofclubpenguin.files.wordpress.com/2014/09/aggerortizfront.gif",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRc7zTfH2NgbAESgcnA6tR4aPw7co259F_FUuO8bLGxPzUdTFGI".
               "http://24.media.tumblr.com/682e0773e54f03277823354b012f7b8e/tumblr_n406q4KwlM1qfisvuo1_500.gif",
               "https://media.tenor.com/images/eb52979676b73f7551e650ad8658921b/tenor.gif",
               "https://i0.wp.com/fromsizezerotowisehero.com/wp-content/uploads/2017/08/tyrion-got.gif?resize=564%2C295&ssl=1",
               "https://i.imgur.com/ffpRAXz.gif",
               "http://quotationsquotes.com/wp-content/uploads/2017/07/tumblr_ofzv8t8i2M1vs6xh0o1_500.gif",
               "https://s-media-cache-ak0.pinimg.com/originals/84/bb/d3/84bbd3d96cee964e438a5fbb8c1eb457.jpg",
               "https://s13.favim.com/orig/161104/benedict-cumberbatch-funny-gif-lol-Favim.com-4845868.gif",
               "https://cloud.lovindubai.com/images/uploads/2017/03/_relatedEntryImage2x/TV-shows.gif?mtime=20170306134934",
               "http://38.media.tumblr.com/fecf01dad002d09bbebe6bf8ff9815ef/tumblr_n97yriTMig1rc7zl1o5_400.gif",
               "https://media.giphy.com/media/QlwpKczGlBNvi/giphy.gif",
               "https://s-media-cache-ak0.pinimg.com/originals/21/eb/5e/21eb5e241f62b4cb844d9e75fa100eab.jpg",
               "http://1.bp.blogspot.com/-4EbWmfRzlCc/Vb9-BQ7ekdI/AAAAAAAATMU/Cv6AYYotIxc/s1600/download%2B%25284%2529.gif",
               "https://cdn-images-1.medium.com/max/1600/1*pmtslsWzGquq6OYwFV5A3g.gif",
               "http://img49.laughinggif.com/pic/HTTP3Nwb3J0enNkay5ob3RzdGFyLmNvbS9jb21tb24vc29jaWFsbWVkaWEvc3Rhci9naWZzL2NyaWNrZXQvQnVtcmFoRGhvbmkuZ2lm.gif",
               "http://4.bp.blogspot.com/-uCWvSjdFZ-Y/UXxHaCDe_RI/AAAAAAAADZM/ssojfcRBq0A/s1600/Harbhajan+Singh+Gangnam+Style+Dance+After+Chris+Gayle+Wicket+Funny+-+RCB+vs+MI+IPL+match++2013.gif",
               "https://media.giphy.com/media/aDL9oP00LeuPK/giphy.gif"



     };





        String[] quotes = new String[]{
                "Be Happy Asshole",
                "If you want to be happy, do not dwell in the past, do not worry about the future, focus on living fully in the present.",
                "Do not set aside your happiness. Do not wait to be happy in the future. The best time to be happy is always now.",
                "Happiness depends on your mindset and attitude",
                "If you have good thoughts they will shine out of your face like sunbeams and you will always look lovely.",
                "Be believing, be happy, don't get discouraged. Things will work out",
                "Drink because you are happy, but never because you are miserable.",
                "You cannot be with someone just because you don’t want to hurt him. You have your own happiness to think about.",
                "So he tasted the deep pain that is reserved only for the strong, just as he had tasted for a little while the deep happiness.",
                "you might want to decide fast. We live in a dangerous world. If you see a chance to be happy, you have to fight for it, so later you have no regrets.",
                "When you are joyful, when you say yes to life and have fun and project positivity all around you, you become a sun in the center of every constellation, and people want to be near you.",
                "Count your age by friends, not years. Count your life by smiles, not tears.",
                "Sanity and happiness are an impossible combination."
                
        };

        //To add text
        NewsFeed a = new NewsFeed(quotes[0], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[0], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[1], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[2], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[3], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[4], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[5], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[6], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[7], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[8], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[9], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[10], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[11], "", null);
        albumList.add(a);

        a = new NewsFeed(quotes[12], "", null);
        albumList.add(a);



        //To add images
       

        //To add videos
        Video v = new Video("https://www.youtube.com/watch?v=PF48IFkHXgI",
                "http://www.quertime.com/wp-content/uploads/2012/02/top_12_most_funny_and_hilarious_youtube_videos.jpg");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=OI9jv_KJsTw",
                "https://www.google.co.in/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwiAx8WY0qLXAhXLto8KHeD6DyIQjRwIBw&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D7j5OoFgzTgE&psig=AOvVaw1KJEV4CK5aJk05UlIqDvn8&ust=1509806618303264");
        a = new NewsFeed("","",v);
        albumList.add(a);

         Video v = new Video("https://www.youtube.com/watch?v=o-ajSt2FcT0",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3UEQeBoI9LZVrkU-6Lv24JtaAVnGwE87BCf-_GLMM4GITKh4nEg");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=ZuMQlAYcB2g",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTo2usHo38dUkqssr7nE3GgdbHtk6xZ2_nF8w0NMoaLx4lWOmxNQA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=lGP1YFE5s4M",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtji9eyhpFirGScumiTSeDRuSFPPeqzonbTbWKJU7eygCDgjk");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=0QnKHfWgaao",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtji9eyhpFirGScumiTSeDRuSFPPeqzonbTbWKJU7eygCDgjk");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=hoIWtgQ3Wz4",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5eMq73DnD69mMJZ6KnmfmE9oXmxb1BvNn24T2grSKypviG8Sd");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=ARM42-eorzE",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRezfYmSILD5pwAeOf3aOLVsfYR4NMtv-2spgLp-Z6eDaDAeK-S");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=dCq1hFWSOwo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdWfN9WJ5-H76O7muCyjVD9-lKp1pIXtyAQiKs10U8xYPnzD9Z");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=0mqFlu0ZE7Q",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOuDE2iYsk2gHDqe5YySyQpSjyfi4tewgaHkOwsjIzSlKW1xW1MQ");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=QFH747sK200",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4K69ibbLleGhm_5UMIGU_3BkkDbRfPihOEbkOB1DP9HJdvm30");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=j9dLVJgT79M",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpxCc0s7sXStuCg_kbgQMpR3JFSLYBFsEmtOERdhKPIsR-wDRJ");
        a = new NewsFeed("","",v);
        albumList.add(a);

        Video v = new Video("https://www.youtube.com/watch?v=EaQ4pAhf0nw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwaSbHdZSZ5DtnmwxhtY0ByDU-Xl5T64iwdN2dLony1yBh3h04");
        a = new NewsFeed("","",v);
        albumList.add(a);

          Video v = new Video("https://www.youtube.com/watch?v=6f0sFCGBW_k",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzxHQWqmN0dSNFE6PCLP6Q6oKEIHU0xiyPNGjXkVtfxv0FlSyX");
        a = new NewsFeed("","",v);
        albumList.add(a);

          Video v = new Video("https://www.youtube.com/watch?v=gxBERAhEU7w",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSONHwVM4xJ9gS7D7uXeF4zqODqKBix7SbpyC8oc9cWXcSoYROT");
        a = new NewsFeed("","",v);
        albumList.add(a);

          Video v = new Video("https://www.youtube.com/watch?v=ZHtF2-toQis",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSm3GPWitoI4icXN8Iryl0E_rzWDyXukfcvaE2IZee2nqVEsVNa");
        a = new NewsFeed("","",v);
        albumList.add(a);

          Video v = new Video("https://www.youtube.com/watch?v=BWED8Gz4JvQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZfjZ1TECZ8cFZs5ImReYwyPUuyuQhVfqZBYx_FAqzoFObb9A1_w");
        a = new NewsFeed("","",v);
        albumList.add(a);






        



        //--------
        a = new NewsFeed("", images[0], null);
        albumList.add(a);

        a = new NewsFeed("", images[1], null);
        albumList.add(a);

        a = new NewsFeed("", images[2], null);
        albumList.add(a);

        a = new NewsFeed("", images[3], null);
        albumList.add(a);

        a = new NewsFeed("", images[4], null);
        albumList.add(a);

        a = new NewsFeed("", images[5], null);
        albumList.add(a);

        a = new NewsFeed("", images[6], null);
        albumList.add(a);
       
        a = new NewsFeed("", images[7], null);
        albumList.add(a);

        a = new NewsFeed("", images[8], null);
        albumList.add(a);

        a = new NewsFeed("", images[9], null);
        albumList.add(a);

        a = new NewsFeed("", images[10], null);
        albumList.add(a);

        a = new NewsFeed("", images[11], null);
        albumList.add(a);

        a = new NewsFeed("", images[12], null);
        albumList.add(a);

        a = new NewsFeed("", images[13], null);
        albumList.add(a);

        a = new NewsFeed("", images[14], null);
        albumList.add(a);

        a = new NewsFeed("", images[15], null);
        albumList.add(a);

        a = new NewsFeed("", images[16], null);
        albumList.add(a);

        a = new NewsFeed("", images[17], null);
        albumList.add(a);

        a = new NewsFeed("", images[18], null);
        albumList.add(a);

        a = new NewsFeed("", images[19], null);
        albumList.add(a);

        a = new NewsFeed("", images[20], null);
        albumList.add(a);

        a = new NewsFeed("", images[21], null);
        albumList.add(a);

        a = new NewsFeed("", images[22], null);
        albumList.add(a);

        a = new NewsFeed("", images[23], null);
        albumList.add(a);

        a = new NewsFeed("", images[24], null);
        albumList.add(a);

        a = new NewsFeed("", images[25], null);
        albumList.add(a);

        a = new NewsFeed("", images[26], null);
        albumList.add(a);

        a = new NewsFeed("", images[27], null);
        albumList.add(a);

        a = new NewsFeed("", images[28], null);
        albumList.add(a);

        a = new NewsFeed("", images[29], null);
        albumList.add(a);

        a = new NewsFeed("", images[30], null);
        albumList.add(a);        

        a = new NewsFeed("", images[31], null);
        albumList.add(a);

        a = new NewsFeed("", images[32], null);
        albumList.add(a);

        a = new NewsFeed("", images[33], null);
        albumList.add(a);

        a = new NewsFeed("", images[34], null);
        albumList.add(a);        

        a = new NewsFeed("", images[35], null);
        albumList.add(a);

        Collections.shuffle(albumList);
    }


    
    private void Happy() {
        String[] images = new String[]{
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFr4Qu8azv4E2SO0n2ZwwR_ta4JqNkyjka4lDTn6o-5145gqMyAw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2WOE6E8uCF9p2MdDPUaEMZEYsKhuIz4LhTh1_a9BoSNk0s_Mr",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2W2w9mCGNsVxQrRyNdl_qrl1RUDB9Nqly5FEGK7AR1lUnbRT7og",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUYiXow5W7pE1La9WC6--F_H9Mp2ves2n7DU5OS4YoTwcUJ4xABQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQskU5LJ_ouqnsxvFHJSREFi88NQayU4lTvM0VuSebnRtaP4RXY",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkLcpiQXAuQq4mLWRf9_9bEerWn9tj1Oq7dOsI61jlnWCiQjckrg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMqAtaVUpZOMiSrJxqizxqacMCC_21z7wBPPzC8RujTW-Ku9ZQlw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfGrvbMVtBbuvz6Nx8TUIPkx2RvPPKuym2gnVxU_KQ1q2c-7lC",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmATvpdLZJhclT0JBLXEkY1hCNs3SHyYfX0TYgo-Ko63fCzwsk",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS5EEjLoGYjO7U2ALmfLnr-4UzSbzhVHuBHPfvilQ47qYYjI5br",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9IDyH1Kk46uRFaJNzBN8q38R1rJKk0-_iDgU1I-heT4GjZme2",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNXJtIu_4gglDdMEvBpdI5XCAT26X854Fetk85c7rkBKBrQhrb",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTv2djh5gTKHoPbLJ3KGw_MRRLwOuhMV8nZpqB2Zx2uUONnPpmnoA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShFoR-0wBwdJwXGkBChZHHpq9mbLhhXgT9BEBAgnM_WIy0rNpR",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTYOvXG4HEpGfx7QQHyRclAHlxJWDUMCbHBoOkpElewCiwy3kS4w",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQGB9vZs8yr6TGnYEkf25Kvdwapbw2VzRTkNqbE4vxeQAMT_ZZb8w",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQg6n7SD033mC6Ev0cl_yYAEFtSgUIaoX2r_r3hRM4g6udH8hGdrA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8SMjc4kyKw93_VITPGL2F6Pl8ybP6T2_csDrj_Z7j767FOkvGrw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSU3bZWxWywNbC_iA443TWgNNfBQtWm34EP5MNAz5hez25UNk9_eA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_DZqaK7kH_wceVpLbqmew1RycNXXS0xiKmYKmdgFYfvtEjUJT7A",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8NsvYpv6HMuoF_0Z3Wc9czZTF_TCgrUUrIyQTklQyt1XA1EOy",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpIfupJy6mFXW322xzOSITVgD_ocOyMvD-Mwxy2ahi8DTMkqFe",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSd8ARiIMhWLpcgHp0uyAsH57pL0ebu0BC1vISF7eWEEyIs0-dg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTj8i_ZI0SIidhz6Esbx_AO-xevhBPqyRDBhQimoGAt4Gg3teIqA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCBES53FwlQO5NC3e5nFWanK3Do_wiNle1jMfo-uoIIntlReHj",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTH5zCRFDDmR2WqMguux2YfsICciLSpfnsgjmaumra-hHp1Clp-2Q",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-xEBITZS4Ua34SSJ0UpvayUBmAZcdun_9NfamW5pcPW5F1bo3"

        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        //To add text
        NewsFeed a = new NewsFeed(quotes[0], "", null);
        albumList.add(a);

        //To add images
        a = new NewsFeed("", images[0], null);
        albumList.add(a);

          a = new NewsFeed("", images[1], null);
        albumList.add(a);

        
        a = new NewsFeed("", images[2], null);
        albumList.add(a);

        a = new NewsFeed("", images[3], null);
        albumList.add(a);

        a = new NewsFeed("", images[4], null);
        albumList.add(a);

        a = new NewsFeed("", images[5], null);
        albumList.add(a);

        a = new NewsFeed("", images[6], null);
        albumList.add(a);

        a = new NewsFeed("", images[7], null);
        albumList.add(a);

        a = new NewsFeed("", images[8], null);
        albumList.add(a);

        a = new NewsFeed("", images[9], null);
        albumList.add(a);

        a = new NewsFeed("", images[10], null);
        albumList.add(a);

        a = new NewsFeed("", images[11], null);
        albumList.add(a);

        a = new NewsFeed("", images[12], null);
        albumList.add(a);

        a = new NewsFeed("", images[13], null);
        albumList.add(a);

        a = new NewsFeed("", images[14], null);
        albumList.add(a);

        a = new NewsFeed("", images[15], null);
        albumList.add(a);

        a = new NewsFeed("", images[16], null);
        albumList.add(a);

        a = new NewsFeed("", images[17], null);
        albumList.add(a);

        a = new NewsFeed("", images[18], null);
        albumList.add(a);

        a = new NewsFeed("", images[19], null);
        albumList.add(a);

        a = new NewsFeed("", images[20], null);
        albumList.add(a);

        a = new NewsFeed("", images[21], null);
        albumList.add(a);

        a = new NewsFeed("", images[22], null);
        albumList.add(a);

        a = new NewsFeed("", images[23], null);
        albumList.add(a);

        a = new NewsFeed("", images[24], null);
        albumList.add(a);

        a = new NewsFeed("", images[25], null);
        albumList.add(a);

        a = new NewsFeed("", images[26], null);
        albumList.add(a);

      

        //To add videos
        Video v = new Video("https://www.youtube.com/watch?v=Z8oJV_mBY9g",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiPet3Exl1YUcTHxDw93d1GF-fHTfvB1WN-g8I5pC1UDchytk93g");
        a = new NewsFeed("","",v);
        albumList.add(a);

         v = new Video("https://www.youtube.com/watch?v=YMz2_S2y9WE",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkQis8mx-7eRruSlX5VDnw3AfrRIb_7bPWLXuwSeDqd6qhpUzy");
        a = new NewsFeed("","",v);
        albumList.add(a);

         v = new Video("https://www.youtube.com/watch?v=4ltDn2xqJPY",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGwzajGLqPOga_Zr0oYG-WKqH2Gu9YKbkLmpOamokdK9R4KPmDsQ");
        a = new NewsFeed("","",v);
        albumList.add(a);


         v = new Video("https://www.youtube.com/watch?v=4FJ9ssSc8E8",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTb4h70keSfH10FXBvUh02LRBFKit6HaLSvKkylLiXTSMgry2JR");
        a = new NewsFeed("","",v);
        albumList.add(a);


         v = new Video("https://www.youtube.com/watch?v=_hXLkj5H6pI",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnviEpMBA_RMuWkUpWk8qW9RT-1a7a8cO0UdrkEd9wfXYh9Rvc");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=CPQ1budJRIQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZsgKeR2BCKt21Lb3V4wgLdwZOify23ndjOdtb1YKYJiHaW5bo");
        a = new NewsFeed("","",v);
        albumList.add(a);

         v = new Video("https://www.youtube.com/watch?v=9G3e06N4qSs",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYquvWCKEQUB7l5WrmwnVJ_4MCkoogpiDXa-DH359w6Q4bLXFQ");
        a = new NewsFeed("","",v);
        albumList.add(a);

         v = new Video("https://www.youtube.com/watch?v=6Mgqbai3fKo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbJbU1Y5xb_Zpa89nmf0saKDYuv5w6gxjrtRZughRt7wPI-bv6");
        a = new NewsFeed("","",v);
        albumList.add(a);

         v = new Video("https://www.youtube.com/watch?v=XAhTt60W7qo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRW5GxRug6ZYSyWmYLAZ-wSaerWPrYozt7wMlc350dBifGJSrWU");
        a = new NewsFeed("","",v);
        albumList.add(a);



        Collections.shuffle(albumList);

    }
}
