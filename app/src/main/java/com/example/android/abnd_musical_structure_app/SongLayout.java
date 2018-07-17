package com.example.android.abnd_musical_structure_app;

/**
 * Created by Akanksha_Rajwar on 16-07-2018.
 */

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.widget.RelativeLayout;


public class SongLayout extends AppCompatActivity {
    RelativeLayout outerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_layout);

        outerLayout=(RelativeLayout)findViewById(R.id.relLayout);

        Bitmap image = BitmapFactory.decodeResource(getResources(),
                R.drawable.like);
        Palette.from(image).generate(new Palette.PaletteAsyncListener() {
            public void onGenerated(Palette palette) {
                Palette.Swatch vibrantSwatch = palette.getVibrantSwatch();
                if (vibrantSwatch != null) {
                    outerLayout.setBackgroundColor(vibrantSwatch.getRgb());

                }
            }
        });

    }
}


