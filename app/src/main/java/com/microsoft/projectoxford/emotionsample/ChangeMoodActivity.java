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


     private void Sad() {
        String[] images = new String[]{
                "https://vignette.wikia.nocookie.net/steven-universe/images/2/23/Funny-meme-walking-passed-a-class.jpg/revision/latest?cb=20150812200658",
                "https://s-media-cache-ak0.pinimg.com/originals/6d/5c/4a/6d5c4a6a1f50e9d91bbb8aec1a7861ce.jpg",
                "https://i.pinimg.com/736x/46/5c/f7/465cf7e37de58dbc909fa65bd7a241f1--engineering-humor-environmental-engineering.jpg",
                "http://static.ibnlive.in.com/ibnlive/pix/ibnhome/engineeringmemes3.jpg",
                "https://i.pinimg.com/736x/b9/a4/43/b9a443e4dc1b25423f13f8c9869cb28c--funny-things-funny-stuff.jpg",
                "https://i.pinimg.com/736x/03/38/f4/0338f4c9dad940d699aeeb917355dc25--lol-memes-fail.jpg"
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
                "http://www.quertime.com/wp-content/uploads/2012/02/top_12_most_funny_and_hilarious_youtube_videos.jpg");
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


        Collections.shuffle(albumList);
    }


    
    private void Happy() {
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
}
