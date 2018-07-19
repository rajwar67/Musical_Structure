package com.example.android.abnd_musical_structure_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by Akanksha_Rajwar on 17-07-2018.
 */

public class Favourites_Frag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.favs_fragment,container,false);

        final ArrayList<SongCard> songPlayList = new ArrayList<SongCard>();

        songPlayList.add(new SongCard("Secrets", "Jacob Lee",R.drawable.icon1));
        songPlayList.add(new SongCard("Born To Be Yours", "Imagine Dragons",R.drawable.icon3));
        songPlayList.add(new SongCard("Lonely Together", "Avicii",R.drawable.icon4));
        songPlayList.add(new SongCard("Remind Me To Forget", "Kygo",R.drawable.icon5));
        songPlayList.add(new SongCard("Move To Miami", "Enrique Iglesias",R.drawable.icon7));
        songPlayList.add(new SongCard("Broken Arrows", "Avicii",R.drawable.icon6));
        songPlayList.add(new SongCard("The Way I am", "Charlie Puth",R.drawable.icon8));
        songPlayList.add(new SongCard("Entertainer", "Zayn Malik",R.drawable.icon12));
        songPlayList.add(new SongCard("Wolves", "Selena Gomez",R.drawable.icon10));
        songPlayList.add(new SongCard("Chasing Cars", "Snow Patrol",R.drawable.icon2));
        songPlayList.add(new SongCard("Dusk Till Dawn", "Zayn Malik",R.drawable.icon9));
        songPlayList.add(new SongCard("Everybody hates me", "The Chainsmokers",R.drawable.chain));
        songPlayList.add(new SongCard("Bad at Love", "Halsey",R.drawable.icon11));
        songPlayList.add(new SongCard("Young Dumb Broke", "DJ Khaleed",R.drawable.play));
        songPlayList.add(new SongCard("Born To Be Yours", "Imagine Dragons",R.drawable.play));
        songPlayList.add(new SongCard("Lonely Together", "Avicii",R.drawable.play));
        songPlayList.add(new SongCard("Broken Arrows", "Avicii",R.drawable.play));
        songPlayList.add(new SongCard("The Way I am", "Charlie Puth",R.drawable.play));
        songPlayList.add(new SongCard("Entertainer", "Zayn Malik",R.drawable.play));
        songPlayList.add(new SongCard("Wolves", "Selena Gomez",R.drawable.play));


        SongAdapter adapter = new SongAdapter(getContext(), songPlayList);

        final ListView listView = (ListView) view.findViewById(R.id.list);

        listView.setAdapter(adapter);

        //*********************************passing values *************************


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub

                // Getting listview click value into String variable.
                String songTitlePass = songPlayList.get(position).getSongTitle();
                String songArtistPass = songPlayList.get(position).getArtist();
                int imgResPass=songPlayList.get(position).getImageRes();

                Intent intent = new Intent(getActivity(), SongLayout.class);

                // Sending value to another activity using intent.
                intent.putExtra("titleTake", songTitlePass);
                intent.putExtra("artistTake", songArtistPass);
                intent.putExtra("imageResTake",imgResPass);

                startActivity(intent);

            }
        });

        //******************************************************
        return view;
    }


    }


