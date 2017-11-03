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
                "https://www.google.co.in/imgres?imgurl=https%3A%2F%2Fvignette.wikia.nocookie.net%2Fsteven-universe%2Fimages%2F2%2F23%2FFunny-meme-walking-passed-a-class.jpg%2Frevision%2Flatest%3Fcb%3D20150812200658&imgrefurl=http%3A%2F%2Fsteven-universe.wikia.com%2Fwiki%2FFile%3AFunny-meme-walking-passed-a-class.jpg&docid=o9hb6Zs3oMDCxM&tbnid=KK63szCmhY0rNM%3A&vet=10ahUKEwiTn8LHx6LXAhWKL48KHb9BAKQQMwiOAiglMCU..i&w=400&h=423&bih=826&biw=1440&q=funny%20meme&ved=0ahUKEwiTn8LHx6LXAhWKL48KHb9BAKQQMwiOAiglMCU&iact=mrc&uact=8",
                "https://www.google.co.in/imgres?imgurl=https%3A%2F%2Fs-media-cache-ak0.pinimg.com%2Foriginals%2F6d%2F5c%2F4a%2F6d5c4a6a1f50e9d91bbb8aec1a7861ce.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F319263061063062652%2F&docid=Ybgk_Mgm0f9dnM&tbnid=W603jXrFv1iovM%3A&vet=10ahUKEwiogKmMyKLXAhUKNI8KHWmkA04QMwiIAigRMBE..i&w=400&h=387&bih=826&biw=1440&q=meme%20very%20funny&ved=0ahUKEwiogKmMyKLXAhUKNI8KHWmkA04QMwiIAigRMBE&iact=mrc&uact=8",
                "https://www.google.co.in/imgres?imgurl=https%3A%2F%2Fi.pinimg.com%2F736x%2F46%2F5c%2Ff7%2F465cf7e37de58dbc909fa65bd7a241f1--engineering-humor-environmental-engineering.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fcivilengineers%2Fcivil-engineering-humor-fun%2F&docid=MkoftEHHQ_UuzM&tbnid=CnmdpfkgPlJRrM%3A&vet=10ahUKEwiJ1uiyyKLXAhUKqY8KHdfCAYAQMwh8KDUwNQ..i&w=460&h=371&itg=1&bih=826&biw=1440&q=meme%20very%20funny%20engineering&ved=0ahUKEwiJ1uiyyKLXAhUKqY8KHdfCAYAQMwh8KDUwNQ&iact=mrc&uact=8",
                "https://www.google.co.in/imgres?imgurl=http%3A%2F%2Fstatic.ibnlive.in.com%2Fibnlive%2Fpix%2Fibnhome%2Fengineeringmemes3.jpg&imgrefurl=http%3A%2F%2Fwww.news18.com%2Fnews%2Fbuzz%2Fbecome-an-engineer-then-decide-what-you-want-to-do-in-life-25-hilarious-memes-every-indian-engineer-identifies-with-699293.html&docid=TW_jVI8tQqNitM&tbnid=8V9CjTiSYV_rHM%3A&vet=10ahUKEwiJ1uiyyKLXAhUKqY8KHdfCAYAQMwiLAShEMEQ..i&w=517&h=357&bih=826&biw=1440&q=meme%20very%20funny%20engineering&ved=0ahUKEwiJ1uiyyKLXAhUKqY8KHdfCAYAQMwiLAShEMEQ&iact=mrc&uact=8",
                "https://www.google.co.in/imgres?imgurl=https%3A%2F%2Fi.pinimg.com%2F736x%2Fb9%2Fa4%2F43%2Fb9a443e4dc1b25423f13f8c9869cb28c--funny-things-funny-stuff.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2FTrojanGoddess11%2Fa-day-in-a-life-of-an-engineering-student%2F&docid=Na-wINY9HexPXM&tbnid=DFnVEQf5NN7rbM%3A&vet=10ahUKEwiqhIK9yKLXAhUDMo8KHX1nDkc4ZBAzCAQoAjAC..i&w=540&h=405&bih=826&biw=1440&q=meme%20very%20funny%20engineering&ved=0ahUKEwiqhIK9yKLXAhUDMo8KHX1nDkc4ZBAzCAQoAjAC&iact=mrc&uact=8",
                "https://www.google.co.in/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwj3hOP8yKLXAhWGs48KHZQLCl8QjRwIBw&url=https%3A%2F%2Fme.me%2Ft%2Fhostels%3Fsince%3D1484893576%252C7879702&psig=AOvVaw2Zcjv6swTQLXMdB29rwxXZ&ust=1509804132715172",
                "https://www.google.co.in/imgres?imgurl=https%3A%2F%2Fi.pinimg.com%2F736x%2F03%2F38%2Ff4%2F0338f4c9dad940d699aeeb917355dc25--lol-memes-fail.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2F1hour1pic%2Ffunny%2F&docid=kFPtz8tq2IRvcM&tbnid=g3x3qbE2KTJt0M%3A&vet=10ahUKEwjVgd7fyaLXAhUFpY8KHWBuDuEQMwiMAShDMEM..i&w=736&h=613&bih=826&biw=1440&q=meme%20funny&ved=0ahUKEwjVgd7fyaLXAhUFpY8KHWBuDuEQMwiMAShDMEM&iact=mrc&uact=8"
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
