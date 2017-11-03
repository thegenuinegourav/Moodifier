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
                "data:image/jpeg;base64,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",
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
