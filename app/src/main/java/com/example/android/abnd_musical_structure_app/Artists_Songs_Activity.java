package com.example.android.abnd_musical_structure_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Akanksha_Rajwar on 20-07-2018.
 */

public class Artists_Songs_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_songs);


        String songTitle = getIntent().getStringExtra("titleTake");
        String artist = getIntent().getStringExtra("artistTake");
        Integer imgRes = getIntent().getIntExtra("imageResTake", 0);


        ArrayList<SongCard> songPlayList = new ArrayList<SongCard>();

        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));
        songPlayList.add(new SongCard(songTitle, artist, R.drawable.play));


        SongAdapter adapter = new SongAdapter(this, songPlayList);

        ListView listView = (ListView) findViewById(R.id.artist_playlist);

        ImageView arttistThumb = (ImageView) findViewById(R.id.artist_Thumbnail);
        arttistThumb.setImageResource(imgRes);

        listView.setAdapter(adapter);
    }
}
