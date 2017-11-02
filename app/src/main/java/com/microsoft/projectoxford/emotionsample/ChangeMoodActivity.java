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
        Happy();
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

        String[] videos = new String[]{
                "http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4",
                "https://www.youtube.com/watch?v=YaVWCbv4lvM"
        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        NewsFeed a = new NewsFeed(quotes[0], "", "");
        albumList.add(a);

        a = new NewsFeed("", images[0], "");
        albumList.add(a);

        a = new NewsFeed("", images[1], "");
        albumList.add(a);

        a = new NewsFeed("", images[2], "");
        albumList.add(a);

        a = new NewsFeed("", "", videos[0]);
        albumList.add(a);

        a = new NewsFeed("Hello","","");
        albumList.add(a);

        a = new NewsFeed("","",videos[1]);
        albumList.add(a);

        Collections.shuffle(albumList);

    }


    private void Neutral() {
        String[] images = new String[]{
                "http://www.planwallpaper.com/static/images/desktop-year-of-the-tiger-images-wallpaper.jpg",
                "http://www.mybligr.com/wp-content/uploads/2017/01/most-beautiful-tiger-animals-pics-images-photos-pictures-6.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGru7M9U6PUAxD2FogVGRh5g6jR76dSi70yaTEJ7Q0NTYFR3RqNg"
        };

        String[] videos = new String[]{
                "http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4",
                "https://www.youtube.com/watch?v=YaVWCbv4lvM"
        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        NewsFeed a = new NewsFeed(quotes[0], "", "");
        albumList.add(a);

        a = new NewsFeed("", images[0], "");
        albumList.add(a);

        a = new NewsFeed("", images[1], "");
        albumList.add(a);

        a = new NewsFeed("", images[2], "");
        albumList.add(a);

        a = new NewsFeed("", "", videos[0]);
        albumList.add(a);

        a = new NewsFeed("Hello","","");
        albumList.add(a);

        a = new NewsFeed("","",videos[1]);
        albumList.add(a);

        Collections.shuffle(albumList);

    }


    private void Fear() {
        String[] images = new String[]{
                "http://www.planwallpaper.com/static/images/desktop-year-of-the-tiger-images-wallpaper.jpg",
                "http://www.mybligr.com/wp-content/uploads/2017/01/most-beautiful-tiger-animals-pics-images-photos-pictures-6.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGru7M9U6PUAxD2FogVGRh5g6jR76dSi70yaTEJ7Q0NTYFR3RqNg"
        };

        String[] videos = new String[]{
                "http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4",
                "https://www.youtube.com/watch?v=YaVWCbv4lvM"
        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        NewsFeed a = new NewsFeed(quotes[0], "", "");
        albumList.add(a);

        a = new NewsFeed("", images[0], "");
        albumList.add(a);

        a = new NewsFeed("", images[1], "");
        albumList.add(a);

        a = new NewsFeed("", images[2], "");
        albumList.add(a);

        a = new NewsFeed("", "", videos[0]);
        albumList.add(a);

        a = new NewsFeed("Hello","","");
        albumList.add(a);

        a = new NewsFeed("","",videos[1]);
        albumList.add(a);

        Collections.shuffle(albumList);

    }


    private void Disgust() {
        String[] images = new String[]{
                "http://www.planwallpaper.com/static/images/desktop-year-of-the-tiger-images-wallpaper.jpg",
                "http://www.mybligr.com/wp-content/uploads/2017/01/most-beautiful-tiger-animals-pics-images-photos-pictures-6.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGru7M9U6PUAxD2FogVGRh5g6jR76dSi70yaTEJ7Q0NTYFR3RqNg"
        };

        String[] videos = new String[]{
                "http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4",
                "https://www.youtube.com/watch?v=YaVWCbv4lvM"
        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        NewsFeed a = new NewsFeed(quotes[0], "", "");
        albumList.add(a);

        a = new NewsFeed("", images[0], "");
        albumList.add(a);

        a = new NewsFeed("", images[1], "");
        albumList.add(a);

        a = new NewsFeed("", images[2], "");
        albumList.add(a);

        a = new NewsFeed("", "", videos[0]);
        albumList.add(a);

        a = new NewsFeed("Hello","","");
        albumList.add(a);

        a = new NewsFeed("","",videos[1]);
        albumList.add(a);

        Collections.shuffle(albumList);

    }


    private void Contempt() {
        String[] images = new String[]{
                "http://www.planwallpaper.com/static/images/desktop-year-of-the-tiger-images-wallpaper.jpg",
                "http://www.mybligr.com/wp-content/uploads/2017/01/most-beautiful-tiger-animals-pics-images-photos-pictures-6.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGru7M9U6PUAxD2FogVGRh5g6jR76dSi70yaTEJ7Q0NTYFR3RqNg"
        };

        String[] videos = new String[]{
                "http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4",
                "https://www.youtube.com/watch?v=YaVWCbv4lvM"
        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        NewsFeed a = new NewsFeed(quotes[0], "", "");
        albumList.add(a);

        a = new NewsFeed("", images[0], "");
        albumList.add(a);

        a = new NewsFeed("", images[1], "");
        albumList.add(a);

        a = new NewsFeed("", images[2], "");
        albumList.add(a);

        a = new NewsFeed("", "", videos[0]);
        albumList.add(a);

        a = new NewsFeed("Hello","","");
        albumList.add(a);

        a = new NewsFeed("","",videos[1]);
        albumList.add(a);

        Collections.shuffle(albumList);

    }


    private void Angry() {
        String[] images = new String[]{
                "http://www.planwallpaper.com/static/images/desktop-year-of-the-tiger-images-wallpaper.jpg",
                "http://www.mybligr.com/wp-content/uploads/2017/01/most-beautiful-tiger-animals-pics-images-photos-pictures-6.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGru7M9U6PUAxD2FogVGRh5g6jR76dSi70yaTEJ7Q0NTYFR3RqNg"
        };

        String[] videos = new String[]{
                "http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4",
                "https://www.youtube.com/watch?v=YaVWCbv4lvM"
        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        NewsFeed a = new NewsFeed(quotes[0], "", "");
        albumList.add(a);

        a = new NewsFeed("", images[0], "");
        albumList.add(a);

        a = new NewsFeed("", images[1], "");
        albumList.add(a);

        a = new NewsFeed("", images[2], "");
        albumList.add(a);

        a = new NewsFeed("", "", videos[0]);
        albumList.add(a);

        a = new NewsFeed("Hello","","");
        albumList.add(a);

        a = new NewsFeed("","",videos[1]);
        albumList.add(a);

        Collections.shuffle(albumList);

    }


    private void Sad() {
        String[] images = new String[]{
                "http://www.planwallpaper.com/static/images/desktop-year-of-the-tiger-images-wallpaper.jpg",
                "http://www.mybligr.com/wp-content/uploads/2017/01/most-beautiful-tiger-animals-pics-images-photos-pictures-6.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGru7M9U6PUAxD2FogVGRh5g6jR76dSi70yaTEJ7Q0NTYFR3RqNg"
        };

        String[] videos = new String[]{
                "http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4",
                "https://www.youtube.com/watch?v=YaVWCbv4lvM"
        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        NewsFeed a = new NewsFeed(quotes[0], "", "");
        albumList.add(a);

        a = new NewsFeed("", images[0], "");
        albumList.add(a);

        a = new NewsFeed("", images[1], "");
        albumList.add(a);

        a = new NewsFeed("", images[2], "");
        albumList.add(a);

        a = new NewsFeed("", "", videos[0]);
        albumList.add(a);

        a = new NewsFeed("Hello","","");
        albumList.add(a);

        a = new NewsFeed("","",videos[1]);
        albumList.add(a);

        Collections.shuffle(albumList);

    }


    private void Happy() {
        String[] images = new String[]{
                "http://www.planwallpaper.com/static/images/desktop-year-of-the-tiger-images-wallpaper.jpg",
                "http://www.mybligr.com/wp-content/uploads/2017/01/most-beautiful-tiger-animals-pics-images-photos-pictures-6.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGru7M9U6PUAxD2FogVGRh5g6jR76dSi70yaTEJ7Q0NTYFR3RqNg"
        };

        String[] videos = new String[]{
                "http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4",
                "https://www.youtube.com/watch?v=YaVWCbv4lvM"
        };

        String[] quotes = new String[]{
                "Be Happy Asshole"
        };

        NewsFeed a = new NewsFeed(quotes[0], "", "");
        albumList.add(a);

        a = new NewsFeed("", images[0], "");
        albumList.add(a);

        a = new NewsFeed("", images[1], "");
        albumList.add(a);

        a = new NewsFeed("", images[2], "");
        albumList.add(a);

        a = new NewsFeed("", "", videos[0]);
        albumList.add(a);

        a = new NewsFeed("Hello","","");
        albumList.add(a);

        a = new NewsFeed("","",videos[1]);
        albumList.add(a);

        Collections.shuffle(albumList);

    }
}
