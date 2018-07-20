package com.example.android.abnd_musical_structure_app;

/**
 * Created by Akanksha_Rajwar on 16-07-2018.
 */

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.android.abnd_musical_structure_app.R.color.colorPrimary;


public class SongLayout extends AppCompatActivity {

    private ImageView imgView;
    private TextView tv;
    private Button buttonPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_layout);



        //tv.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        String songTitle = getIntent().getStringExtra("titleTake");
        String artist = getIntent().getStringExtra("artistTake");
        Integer imgRes = getIntent().getIntExtra("imageResTake", 0);

        imgView = (ImageView) findViewById(R.id.thumbnailBig);
        imgView.setImageResource(imgRes);

        WebView webView;
        webView = (WebView) findViewById(R.id.web);
        String summary = "<html><FONT color='#E53935' FACE='courier' SIZE=5><marquee behavior='scroll' direction='left' scrollamount=4>"
                + (songTitle + " by " + artist) + "</marquee></FONT></html>";

        webView.loadData(summary, "text/html", "utf-8");


    }

    public void playFun(View view) {

        buttonPlay = (Button) findViewById(R.id.play);
        if (buttonPlay.getBackground() == getResources().getDrawable(R.drawable.pause_button)) {
            buttonPlay.setBackground(getResources().getDrawable(R.drawable.play_button1));
        } else {
            buttonPlay.setBackground(getResources().getDrawable(R.drawable.pause_button));
        }
    }

    public void nextFun(View view)
    {
        TextView tv= (TextView)findViewById(R.id.info);
        imgView.setVisibility(View.INVISIBLE);
        tv.setVisibility(View.VISIBLE);
        tv.setText(" NEXT SONG WILL BE PLAYED.");
    }

    public void prevFun(View view)
    {
        tv= (TextView)findViewById(R.id.info);
        imgView.setVisibility(View.INVISIBLE);
        tv.setVisibility(View.VISIBLE);
        tv.setText(" PREVIOUS SONG WILL BE PLAYED.");


    }




}


