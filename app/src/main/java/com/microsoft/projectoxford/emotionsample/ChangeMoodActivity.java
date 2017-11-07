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
