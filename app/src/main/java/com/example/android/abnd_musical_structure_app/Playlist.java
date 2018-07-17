package com.example.android.abnd_musical_structure_app;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;


/**
 * Created by Akanksha_Rajwar on 15-07-2018.
 */

public class Playlist extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);


        ArrayList<SongCard> songPlayList = new ArrayList<SongCard>();

        songPlayList.add(new SongCard("Secrets", "Jacob Lee",R.drawable.img));
        songPlayList.add(new SongCard("Born To Be Yours", "Imagine Dragons",R.drawable.img));
        songPlayList.add(new SongCard("Lonely Together", "Avicii",R.drawable.img));
        songPlayList.add(new SongCard("Remind Me To Forget", "Kygo",R.drawable.img));
        songPlayList.add(new SongCard("Move To Miami", "Enrique Iglesias",R.drawable.img));
        songPlayList.add(new SongCard("Broken Arrows", "Avicii",R.drawable.img));
        songPlayList.add(new SongCard("The Way I am", "Charlie Puth",R.drawable.img));
        songPlayList.add(new SongCard("Entertainer", "Zayn Malik",R.drawable.img));
        songPlayList.add(new SongCard("Wolves", "Selena Gomez",R.drawable.img));
        songPlayList.add(new SongCard("Chasing Cars", "Snow Patrol",R.drawable.img));
        songPlayList.add(new SongCard("Dusk Till Dawn", "Zayn Malik",R.drawable.img));
        songPlayList.add(new SongCard("Everybody hates me", "The Chainsmokers",R.drawable.img));
        songPlayList.add(new SongCard("Bad at Love", "Halsey",R.drawable.img));
        songPlayList.add(new SongCard("Young Dumb Broke", "DJ Khaleed",R.drawable.img));


        SongAdapter adapter = new SongAdapter(this, songPlayList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
