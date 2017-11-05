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
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStPpyNcfo68ZDrvGN3br3c1NS-KVP7EBURu-QkQ4pXhy_GFPdq",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRckUJKt530SUonjdfptpzQJJrYMY6Bp0MuIFXQlMy5lBLOj-8B0Q",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuz_WjAwmu74ZKOIOAIVkZu83WEtvxmWg_PGaRnH7rXfUepZ3d",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ19qFwkI1Vg9Jq-2bWcAcGIHMNZA61xGfQL8lRIVrC2M0GqYAWfg",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQa0ZyuJ1mFKbZ1iJrqE83rhYDHELF5HpeIB-AckyG4Drohfct1JQ",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRa1xxS7JCpik7M0PPAHjKZMKYA7qhgoyoNF6GwpAbz2D30yDjrXg",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGdV7N-kugasJD31bGqRabZ87rO67mfr_Z7YnitOVSQd9TCz3V",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSf_p53VZDB_Zj-fBS70Qde397jICDjZZ37gUpcjlPB7YWSgnGw",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdYzCEKYFTZUBVO_MRCy8on_eBf2QeF8ygZcCcoMwVOudhSIF3",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvm0IOe6qkxCPdc1Kbp3n_1NFICQjghq4Xofc2z2p-s0WyepTGpw",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzllKQuqImNcEqWyjP1Vkzjzx-Xi2bT_qZ2pFNPJcgIzHI2xO_iw",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRB0bxeQetu3PHJZ8jucr5W506Xs_99dL9c4YoqbjLeXoYcvIKt",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUBTgZFPjw-TzMvaXpxKIpgT4zBoMUvcMS2AYb5FQgWqUctl_C",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQv6qAVPbB6Ld2XCkHZj2WA4HW-pzSEQc5Hh9XQmWBucuTHKqVzeg",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTr1aHDRGHPzYzXBqcKUvVqOFyd1pO-nmNa8LeoPhbV_M6dNSleOA",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqO35LLvbQ6I7GkuyfXq1rErEGu1vRNiM5Hz5-AciyvDV2HIV5",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeN87WEpYKxYdV--c3a2nXQMTsYz2crzBKK79A93BPTjeMeDVI",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZyovaKjyEuu8-3NF9VMMAkZEE2pgHS1hZjuvG5qh0mvb4X5dw",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT0RkGoHgBbRRtU5h2zJ_hNZjrhD_e7nflbFbgiQRsfal-Oz1zVA",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrenLJgYPtmEozZcM8-UVCn9HvatTYlMLDsLgDYeZ-9PGMSpPzeg",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQio_-toL2bQXWtOjMkK-6plS8cEid6jo8FeQYKfcI1yDptkl2",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYNsVL12WBq36MIi1w14PIovPVR2PiZ6Zf8he3zTvf_FNovbsE",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkQtSeNjt1P-nk6AuOEILrJQFxyDYEhDhUrZDn-ckXdgMrZaRx",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTK3j9PxUPLI7fpeTBDI0kyo0kEm-8oOmPpXn79Vsky5670tikkgQ",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfjF4WPMl8HTVDbIGp_ljoxEx-01WSZniIf7V5AySJjgcXHV0YgA",
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
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSd8ARiIMhWLpcgHp0uyAsH57pL0ebu0BC1vISF7eWEEyIs0-dg"


               


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


        //To add videos
        Video v = new Video("https://www.youtube.com/watch?v=PF48IFkHXgI",
                "http://www.quertime.com/wp-content/uploads/2012/02/top_12_most_funny_and_hilarious_youtube_videos.jpg");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=dhcfZSyZM_0",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOKHDtzmNIHuJO9_lYaxChhgBHmbKM-n-GyspWwzMwUys6wVHanA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=f8sW_tv0WRI",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzVJM5xPpXWRlmEtVcHpJoMD96122ADgYS9euwDBMJbTHyPoBAaA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=LspOh-os6s8",
                "");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=Sk96Y21kxdE",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEzVzdOo1RVG9L9LK2XnZuF84cjCbFzn9HEEB8mDBqKXtMLLiZ");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=hahKCboz2W4",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkPP-B-o6LjUVeSFKMQiuolpO1WtgS1_wHjTlSgiWoXjuf9qMv");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=8ZqqXYeWg_E",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGCRqSkPqfc9HTSH6bINEnwZyrRo7yTO3-UCeWkqN-ASVv3yaFew");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=VNNLwdBI7Gk",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfImD6u8WwM2U5Kbg20HgGFp4uDFiPldDjdxOXWsnyfXNpFyF9xg");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=NBwhYP_F6-8",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZTr9_1lbEkfB27PbkoYCxP0_1s9OMOzJlkw4VtL2bI7mMNannww");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=vu_9haT1HLQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZoMCJonixr6e4qPVyoS6k_7-ghJTvopF64x_ZIRBA7QeDLOHeww");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=rVlHgR2EiDE",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5p8eR0JYcJypzMK2Mpqk7ylUveU7HZsr6HAiYKEIMFkLS2O-D_g");
        a = new NewsFeed("","",v);
        albumList.add(a);


        //--------

      


        Collections.shuffle(albumList);

    }


    private void Neutral() {
        String[] images = new String[]{
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTl3uIyi3YHi7q2d8jaPIL_4radYqu1suomWoT6OmqpsZrK7_TWUQ",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQglmj7y-gk0KnUQN6XlsnJK5hLQZf9IG1yJ2UDILuJGZFc3X5D",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAVxmZvlelUrq_UI_YoAdEppRnMe9i7ku8Fy1_idkIpsa3poDs",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKZmr7iFCrSqDcDAQsOZ1x4M-WXmF_gcB6piJgnySWOyGdD2_5Pg",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRzCBBQyKfmwhf1r6S3_AkLRc7ytyb6ClPnXI5OwZss-hOBweCK",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7n1lHauU2CSimLtSxx6K9GPpmtmEpUWjjiIEBXqm9MsHpQg-j",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRK07Nch5OQhxk7OcJz3VmDirnES6pIzsnPVAjW3y29zbg5uX4cYg",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZ6Tt_jvM_8HMiCO8KR2nzjaCHs_Q-euKHMqQEBLm3XxKFiHPZ2Q",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStPpyNcfo68ZDrvGN3br3c1NS-KVP7EBURu-QkQ4pXhy_GFPdq",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRckUJKt530SUonjdfptpzQJJrYMY6Bp0MuIFXQlMy5lBLOj-8B0Q",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuz_WjAwmu74ZKOIOAIVkZu83WEtvxmWg_PGaRnH7rXfUepZ3d",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ19qFwkI1Vg9Jq-2bWcAcGIHMNZA61xGfQL8lRIVrC2M0GqYAWfg",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQa0ZyuJ1mFKbZ1iJrqE83rhYDHELF5HpeIB-AckyG4Drohfct1JQ",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRa1xxS7JCpik7M0PPAHjKZMKYA7qhgoyoNF6GwpAbz2D30yDjrXg",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGdV7N-kugasJD31bGqRabZ87rO67mfr_Z7YnitOVSQd9TCz3V",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSf_p53VZDB_Zj-fBS70Qde397jICDjZZ37gUpcjlPB7YWSgnGw",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdYzCEKYFTZUBVO_MRCy8on_eBf2QeF8ygZcCcoMwVOudhSIF3",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvm0IOe6qkxCPdc1Kbp3n_1NFICQjghq4Xofc2z2p-s0WyepTGpw",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzllKQuqImNcEqWyjP1Vkzjzx-Xi2bT_qZ2pFNPJcgIzHI2xO_iw",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRB0bxeQetu3PHJZ8jucr5W506Xs_99dL9c4YoqbjLeXoYcvIKt",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUBTgZFPjw-TzMvaXpxKIpgT4zBoMUvcMS2AYb5FQgWqUctl_C",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQv6qAVPbB6Ld2XCkHZj2WA4HW-pzSEQc5Hh9XQmWBucuTHKqVzeg",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTr1aHDRGHPzYzXBqcKUvVqOFyd1pO-nmNa8LeoPhbV_M6dNSleOA",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqO35LLvbQ6I7GkuyfXq1rErEGu1vRNiM5Hz5-AciyvDV2HIV5",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeN87WEpYKxYdV--c3a2nXQMTsYz2crzBKK79A93BPTjeMeDVI",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZyovaKjyEuu8-3NF9VMMAkZEE2pgHS1hZjuvG5qh0mvb4X5dw",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT0RkGoHgBbRRtU5h2zJ_hNZjrhD_e7nflbFbgiQRsfal-Oz1zVA",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrenLJgYPtmEozZcM8-UVCn9HvatTYlMLDsLgDYeZ-9PGMSpPzeg",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQio_-toL2bQXWtOjMkK-6plS8cEid6jo8FeQYKfcI1yDptkl2",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYNsVL12WBq36MIi1w14PIovPVR2PiZ6Zf8he3zTvf_FNovbsE",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkQtSeNjt1P-nk6AuOEILrJQFxyDYEhDhUrZDn-ckXdgMrZaRx",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTK3j9PxUPLI7fpeTBDI0kyo0kEm-8oOmPpXn79Vsky5670tikkgQ",
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfjF4WPMl8HTVDbIGp_ljoxEx-01WSZniIf7V5AySJjgcXHV0YgA",
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
       

        //To add videos
        Video v = new Video("https://www.youtube.com/watch?v=PF48IFkHXgI",
                "http://www.quertime.com/wp-content/uploads/2012/02/top_12_most_funny_and_hilarious_youtube_videos.jpg");
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
        
        v = new Video("https://www.youtube.com/watch?v=s3Xal6NxRZw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAbU9bwhSJ4RhI1FvjmDMUnT6u0ZT-8fPGaTTrNpYAAtCtQBUQPA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=6ftv4rH8kig",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTduIHMildjzxI85i3UtX8pV24UM6QimuEOTPh5mzUxqpQGpDPXzA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=3jRiRHwL7xM",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8aZ2xjzWJ6O45_8eU10PANGLZvHhhEP6lzWOgyrnhpvDj7G34SA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=JO_Enq9wG5k",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRL2O13Haqn8OQpw9M5TFiAxSuIhnCp8aB6BlzHhXJ8a3wo1L7dBw");
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

        a = new NewsFeed("", images[36], null);
        albumList.add(a);

        a = new NewsFeed("", images[37], null);
        albumList.add(a);

        a = new NewsFeed("", images[38], null);
        albumList.add(a);

        a = new NewsFeed("", images[39], null);
        albumList.add(a);        

        a = new NewsFeed("", images[40], null);
        albumList.add(a);

        a = new NewsFeed("", images[41], null);
        albumList.add(a);

        a = new NewsFeed("", images[42], null);
        albumList.add(a);

        a = new NewsFeed("", images[43], null);
        albumList.add(a);        

        a = new NewsFeed("", images[44], null);
        albumList.add(a);

        a = new NewsFeed("", images[45], null);
        albumList.add(a);

        a = new NewsFeed("", images[46], null);
        albumList.add(a);

        a = new NewsFeed("", images[47], null);
        albumList.add(a);



        Collections.shuffle(albumList);
    }


    private void Fear() {
        String[] images = new String[]{
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-34Dt3WdpP5CeGe456Lk3p00Cx7kYaKHURhxDlFAtZ2jLQ_MezA",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7dOf-PmiBHs1--5SAhT3IQ0uf9fduAPA5zORTpu-mT1hRDVUH",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUBqs64WR92jGuWDuN7I3_OGIfKU_ljSrv3XrjdvC_UIi-9j4p",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzwzRkQVQ0MB7rvjPDngg9rWP_ed4YRkimpKgTC9rSD3GH8a1Ofg",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRicKORE3O1QmYQpHQy_t3eIjTR8xY8n0r7p9ePWqw-gAki5ZwP",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTyhhBmhn-4J7bsHBNMWF5zQYIUKU75zIasvOq9nWeUR3szVmX5Kw",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHTHlPEnrh1-OHbnn8pVDnj3J6REGK23GucXHf8eEPj8YLEgLqcQ",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQe779m8ZYp9hjp2ZbwektAVFENN-sECsjjTnS2l9zdvdoqiuA0",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIPa8Vyygr4Peknek0L81F_JJJeZrU5rkoDxbPKzVp4pz-w9obNA",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOyJ61myuiO68iMNV1TlorYX-Bm2U8QUhnVyv9YXe5Zdr8r5uu",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHHiIxkhkO0QO593gAeq4SUjU2nBCYfBTerOsARg1dDbJJhxGy",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZLUC2J-Y-iyx0mKi17xehVkv1FG9I8PO1mx0UQeT8Jt2s531r9Q",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYIr6TGChqy9EQLei7ccyxdO0EOTPIrnzyn-3E0WjdbKhd2Ap4rQ",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFnV9I7SwS0WFbUcZjTyngBzllkBYESEYvdOUuf_8ciDPxQsaR",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNSovcutpQVTkHKqfN8K3MRdRZt4-mB8EyW7ISnOxxOyff-wTHMw",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2XmR06we43sbhz-0GMhgEEwkPKYwf08nNzvpOuRyNmfZVYRJkYw",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOc1onvP_JA-Zl9XuulyQbmWgUAASwORNcyNVuqKF3v7h7rN52",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZlIMEODXDwTbVvz47WrwBWv_71i_Gck2Rb64UBnhBo4qyLQ4WTQ",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRC7HyEs2ssRaLVOMxwAMoFBuH2MYj60YnnkTLTg-gHw8utY4b1",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFl5wzX18yWBesQ-yAS_U9ZEu7SH1e7hyJ0fonK3HF_2AbR28G",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQdd7m9ib_v3-IaoSrLSLy_J_fBmsQMc5lWrIM5JmtjCwheEE1L",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTLPP1dmojomI1uak9ZxRWnnh9UP3JpRF3siNUiz2jdAVWubpq2ZA",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQboTdneBKCFTsjhfs3pBi4Qp62LKf5P7yRx5yHF8oxPq7ZtiF5",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPi5he2ehooGA8LV_3OK1ism8-RWZGprJ7yynlWgILBeaKNPUp",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT1XG10sJfDl0rsFcUBikv6zmrkOzBnOez-sczx1gym7YHTIHusw",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-qVfoiKrnTmjrxnI6zm2gNNHNRC6TujGNkPsLCveFuYnpcVuw",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ52G4J6GGvPlEcP-z2vB5GT0r5_SCqbv2n6Mng__sSpwvk1MRj",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmRrD3Z43fAy0-Kg5WMq80NOM-V_xPh07OKMLSdt4qB1xpxYaQ",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTco4gJ43Bu7iPGO0UQA4XrDxINYlOohUvm7dP9l9jmmoHcqb5M",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCvDNd8lxcikcyUa1LyR0JtLSe7iToXxoJrDJSo0yoYE77GhkY",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjvo5mT9dgZVKn8yw0BH-cWilSJPR83LNR13Hl4nBmXkPse2dK8A",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqN92ducRyhpVnFfEKA-HAAnyDhgnrlbx0UwklMHX0euImv9awBw",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVrwQKk5VTb7382RACzqPScVTWYqKZ9bGlMiRieirDLmlu_9w8Zw",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREY2z3A_CN1g8tB0K1xQVEyc67kUCRo3GpuMMRYZmTtkVbLgABPg",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-bRuMUNfqxRTtqMNxoJurOqjVCV55FWVfXzQhDMdUrzhESaiM",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJvI5rch1mK4_nTbg6r8LkjwMOBRTt2WqAVeY8tlwKZ_IK7aN5",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQX9PwXdrdDcTUgzn25erf3_OsXyxLejX5OwO9ZzDtNZYgAhFH_",
              "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsD_r_XOcdZgKl_jGVSUPNDOJDgE26MCR9RoMigLMeSPCQOzao"
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

        a = new NewsFeed("", images[36], null);
        albumList.add(a);

        //To add videos
        Video v = new Video("https://www.youtube.com/watch?v=SUEK9Sab4Vs",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSRHruuhqzoRTHJY34meQWy3AIh9qcw31NicD1roI2Bdb-kf3fMg");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=mxl2l-QBD0s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRb203eLUknGIfwmgvg_p7iPHPFoDg-oo-KNoDWmhVAM46nP3Hv5Q");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=-FyVetL1MEw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQFionTj-mWgZ2nWJ1ow9wNnqopWQjU1mBxXvQ3v9rvBm16FR6VSw");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=rBwQZv3_OXE",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgbBAqiss3iaUfvSI1CCbRMW1Kzvbz89GsLmz8UAjfDWCrwRaGQA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=ezIgMfFT2IU",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTD5_kDyb3vcGy6h8y4hbt-cbtz2An6k-YbGaY7inxP0NtIHgYd");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=ubSWWqDpldE",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOyJ61myuiO68iMNV1TlorYX-Bm2U8QUhnVyv9YXe5Zdr8r5uu");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=_LqA9hOpCPk",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2rRyH_snr249k_IXmlJolkKMUr6HVAyYcNU-z8owWv6hIMIJddA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=mBjaYVKgV_w",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOCAkE8EJ4uzsWpUOxGNA6TphvGbcga4s_YMiwJReLc6KiMXP8tQ");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=GDjwfFmXwfE",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQcMoNnVtVuv36zd5nQGL6qoYUu6qvYsSPAmofDntYFc0wMahr");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=68ciKK1afDQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyrJpjYpNMBsx8-ovvAM2PPa5gRXYw6WF-FJ_4s9S6PN83qu2D8w");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=khv-vJKxJS4",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5fX8zQfHqaImnb930iRfGX1ggBMgqlaH31EdDkOrm3wW8OxJw");
        a = new NewsFeed("","",v);
        albumList.add(a);


        //--------



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

       
       v = new Video("https://www.youtube.com/watch?v=ZuMQlAYcB2g",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTo2usHo38dUkqssr7nE3GgdbHtk6xZ2_nF8w0NMoaLx4lWOmxNQA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=lGP1YFE5s4M",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtji9eyhpFirGScumiTSeDRuSFPPeqzonbTbWKJU7eygCDgjk");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=0QnKHfWgaao",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtji9eyhpFirGScumiTSeDRuSFPPeqzonbTbWKJU7eygCDgjk");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=hoIWtgQ3Wz4",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5eMq73DnD69mMJZ6KnmfmE9oXmxb1BvNn24T2grSKypviG8Sd");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=ARM42-eorzE",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRezfYmSILD5pwAeOf3aOLVsfYR4NMtv-2spgLp-Z6eDaDAeK-S");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=dCq1hFWSOwo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdWfN9WJ5-H76O7muCyjVD9-lKp1pIXtyAQiKs10U8xYPnzD9Z");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=0mqFlu0ZE7Q",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOuDE2iYsk2gHDqe5YySyQpSjyfi4tewgaHkOwsjIzSlKW1xW1MQ");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=QFH747sK200",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4K69ibbLleGhm_5UMIGU_3BkkDbRfPihOEbkOB1DP9HJdvm30");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=j9dLVJgT79M",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpxCc0s7sXStuCg_kbgQMpR3JFSLYBFsEmtOERdhKPIsR-wDRJ");
        a = new NewsFeed("","",v);
        albumList.add(a);

  

        Collections.shuffle(albumList);
    }


    private void Contempt() {
        String[] images = new String[]{
               "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSoL5yEUqD2vDKtfsBcDhoCh4qFNZptLWbaX7JJAAclqnPTiD_zyw",
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
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8R0hy8xmkKySGQxu3x3OvfGT0DgAlJvmIx0i0QPgl9m3KAthL",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFlO5L0SamOJgEMYcAqWQBaLfdPS-IxwxtGB-cNo_Sp72BgIZ5sQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQu4Llh1GNqsK17qZMXkJrkLi4CKs25PUZQ0BdWwuRFYDs-iEEv",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYBeKyKTkIoHn8wZorVLKWoQYgveU0oACWkP1e-6RQtLwSe3AXpw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpVp6EQeTEKN5FBQIdw7qQu8F3tAc56OF9iaYlWpIaxpqftgmJzA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRy2BGKZYsS-zEi00jK9Lp20zuvtOanyNjwKhRGwEk5uN1zK31NVg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5ydyVeK4nfo5OYxvXDTKF8ajPvKb_40xD2bkRYuvjfydPLawy",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdgwy6ZFPGDTW0UUtc8AQ5JzfW4eH9LdcDfcBhpZ3Vnsp39xPo7w",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnWffxfYrMk3WTntaU9-0_IvhtAYTQ9N4pPYAWEhnjjO0dmfw2Sw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTr9TNl93eJFG0DojSADZ0CHdGKUVVdtnMunC1T60tt7VlTqf4FRA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKlIB8bpc0wS8Em-qcYBFaafuT-GeOgYr7ABt0_UXXb0tOxN-YLg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNDn2xyPh--xjMnSvCHRVSAJQVoz6FfYO45gIos1_5AJvw4KEtqQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQD_cxDYoGuX2uCuNd1fgT3bnVC4GY7P5Y1AYC-1D5yiBuC_BCSgw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQvKzKqTH6aj9RwQGim51l86RkK_1C2PvPY0ZqRIF_g7aLlbkx1Ow",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4HSg04bVu1SceYZF9iWm2zJw5HxC5VT3Hiay_dwqI_G8g9DW34w",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQU_X_nqJUJ3icT-DCxVovQpE57mQT_AB8W7QTrGqYuaftm513gTw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtBu44x_9zrLy53OEoMKtwSkl5Ro7OLoPfY6361z3jNX6MIyc",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-D8dOXsOxeD7anlnzTRUYNxPsd7gs2MLvBgIklWKLPQlyLB0kmg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQGal2dFGUS4n5VVV2-1IsY0YfrF0cSz1OmIAYexFlPJdxdoEVGoQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAorD-aWqW5nZfAQg9VnKaRtXkylKl5s0Vmexben_WYajzhWsoWw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRS03nnvUYJ4J8JiqZ7RYKpBQ4hxdh_eq2WjJ2BYbqAtY9MfB1oHQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLxU61tnxJpcVpVhX-zS7dEthbsHikHqVfUMqWcnHBgr6jGacIxg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnTKP2juXnN8pSy9oJN5dixMUSwSP9JJFf43uuTjkoQ2aM9DAB",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzl6A-ND8wpb2rxNx4Jt2j-lP25b9gi0sN-YGl4MqhKi_3Jkdw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkCekXSFstav87kB8FB3yKfdl40s8k6SW9iyMF6yr4H7qJFKBu",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTH1qZh6SZUhMm97qDMslsZPXbKWyc5LbVDdDRmtRZTi7Li-e_m",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4VMJruVfWO2t5T8GQxsFrmgm_6bSx-iFfW_6h7WSRCKHugb-Q",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUs2d8IjroLbVdX5_DGLHuy5Rdwa2rx7QTHxNTwCflxfoXdqeEqA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPQD_nfy-lUzK3sfU_etzPT2mv1Ezx-FNjB9b3vDIRPdS4ryi0",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTCJ-UK9iakM-t7MG78ICsThN0RSdO7AvSl0JeLDc34RVk_fK9",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8sDFGujgSB253i92ZAXU6Khk62b0InpSQr4UkQLeN2HY5_MZZ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmAtFV-fT9OisOtAJlpvWc4XEulQiP9jqaJshlgQBN8GTXNWgydA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSl6C_wgZlUpNnFG4lJIm8DFMZryr6uVEo6UXmZeitKLPVZFBODOQ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROIbn2I1bY0wVlaMUWMtbc1ppkoWPoDkswEeBPvFC6ron3j7qRBw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRl70EsuKxG28x_uR7KGj6WUpSX5_5BO1myClBliMelSxSKpfrP"


   
              

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

        a = new NewsFeed("", images[36], null);
        albumList.add(a);

        a = new NewsFeed("", images[37], null);
        albumList.add(a);

        a = new NewsFeed("", images[38], null);
        albumList.add(a);

        a = new NewsFeed("", images[39], null);
        albumList.add(a);

        a = new NewsFeed("", images[40], null);
        albumList.add(a);

        a = new NewsFeed("", images[41], null);
        albumList.add(a);

        a = new NewsFeed("", images[42], null);
        albumList.add(a);

        a = new NewsFeed("", images[43], null);
        albumList.add(a);

        a = new NewsFeed("", images[44], null);
        albumList.add(a);

        a = new NewsFeed("", images[45], null);
        albumList.add(a);

        a = new NewsFeed("", images[46], null);
        albumList.add(a);

        a = new NewsFeed("", images[47], null);
        albumList.add(a);

        a = new NewsFeed("", images[48], null);
        albumList.add(a);

        a = new NewsFeed("", images[49], null);
        albumList.add(a);

        a = new NewsFeed("", images[50], null);
        albumList.add(a);

        a = new NewsFeed("", images[51], null);
        albumList.add(a);

        a = new NewsFeed("", images[52], null);
        albumList.add(a);

        a = new NewsFeed("", images[53], null);
        albumList.add(a);

        a = new NewsFeed("", images[54], null);
        albumList.add(a);

        a = new NewsFeed("", images[55], null);
        albumList.add(a);

        a = new NewsFeed("", images[56], null);
        albumList.add(a);

        a = new NewsFeed("", images[57], null);
        albumList.add(a);

        a = new NewsFeed("", images[58], null);
        albumList.add(a);

        a = new NewsFeed("", images[59], null);
        albumList.add(a);

        a = new NewsFeed("", images[60], null);
        albumList.add(a);



        //To add videos
        Video v = new Video("https://www.youtube.com/watch?v=6VOXlXMaJhU",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-2EFJfZk12vF3_erH4VoKujzTyNW63Yrelv9Si4PR88ztDybJ");
        a = new NewsFeed("","",v);
        albumList.add(a);
        
        v = new Video("https://www.youtube.com/watch?v=xctvXwngaw0",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxby-NKCyuRruIGXELOZlbNqMb2cTBYPxSA2vq5-9luU6z1u4F");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=4FJ9ssSc8E8",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqFRXf2sFwEkaw1i80SquiV6Su7W73ljtxX50mFlnhZlfArCI6NA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=L8UT0iVne24",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAcrDnrTyjQczWLRg9cgL5sTojlyIbrlfZKdaMrQdsrOSksGBa");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=e98rX6tEaXA",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfXv71RMzRpB-jvz3lcIn7vT19HtFwt-HvgKzagLeeKHSO9cWi");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=QlWIXoH8p1s",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3HveCnMJl65e5pD-2zIdLLjOlHYnJMN39Axt7Dr8Ojw24F2SVGA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=L8UT0iVne24",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQx10tFHSBfKS-g_7XA7Q_KqghPrGilxE33UV03u291wmiVGp_l");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=EykWcFEtFqo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfspF1QfELvcZhhF45vFCYxBTLti1TOrjnT6VmtNfOQtmuo59mog");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=_mLn99CQubI",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ42UhxUZJzAnw7dNlDndrFFWafbAMoNpFrom2-RF7Lpgje97TT");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=V6xLYt265ZM",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEnJzO5p3wY-16nLd_CeC0N_qHMjb6z53pjiaX-JewJpT-EKAv4Q");
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







        //--------



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

        v = new Video("https://www.youtube.com/watch?v=o-ajSt2FcT0",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3UEQeBoI9LZVrkU-6Lv24JtaAVnGwE87BCf-_GLMM4GITKh4nEg");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=ZuMQlAYcB2g",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTo2usHo38dUkqssr7nE3GgdbHtk6xZ2_nF8w0NMoaLx4lWOmxNQA");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=lGP1YFE5s4M",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtji9eyhpFirGScumiTSeDRuSFPPeqzonbTbWKJU7eygCDgjk");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=0QnKHfWgaao",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtji9eyhpFirGScumiTSeDRuSFPPeqzonbTbWKJU7eygCDgjk");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=hoIWtgQ3Wz4",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5eMq73DnD69mMJZ6KnmfmE9oXmxb1BvNn24T2grSKypviG8Sd");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=ARM42-eorzE",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRezfYmSILD5pwAeOf3aOLVsfYR4NMtv-2spgLp-Z6eDaDAeK-S");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=dCq1hFWSOwo",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdWfN9WJ5-H76O7muCyjVD9-lKp1pIXtyAQiKs10U8xYPnzD9Z");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=0mqFlu0ZE7Q",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOuDE2iYsk2gHDqe5YySyQpSjyfi4tewgaHkOwsjIzSlKW1xW1MQ");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=QFH747sK200",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4K69ibbLleGhm_5UMIGU_3BkkDbRfPihOEbkOB1DP9HJdvm30");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=j9dLVJgT79M",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpxCc0s7sXStuCg_kbgQMpR3JFSLYBFsEmtOERdhKPIsR-wDRJ");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=EaQ4pAhf0nw",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRwaSbHdZSZ5DtnmwxhtY0ByDU-Xl5T64iwdN2dLony1yBh3h04");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=6f0sFCGBW_k",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzxHQWqmN0dSNFE6PCLP6Q6oKEIHU0xiyPNGjXkVtfxv0FlSyX");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=gxBERAhEU7w",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSONHwVM4xJ9gS7D7uXeF4zqODqKBix7SbpyC8oc9cWXcSoYROT");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=ZHtF2-toQis",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSm3GPWitoI4icXN8Iryl0E_rzWDyXukfcvaE2IZee2nqVEsVNa");
        a = new NewsFeed("","",v);
        albumList.add(a);

        v = new Video("https://www.youtube.com/watch?v=BWED8Gz4JvQ",
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
