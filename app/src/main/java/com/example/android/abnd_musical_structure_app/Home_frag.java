package com.example.android.abnd_musical_structure_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Akanksha_Rajwar on 17-07-2018.
 */

/*public class Home_frag extends Fragment {


    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.home_fragment,container,false);

        ArrayList<SongCard> songPlayList = new ArrayList<>();

        songPlayList.add(new SongCard("Secrets", "Jacob Lee",R.drawable.play));
        songPlayList.add(new SongCard("Born To Be Yours", "Imagine Dragons",R.drawable.play));
        songPlayList.add(new SongCard("Lonely Together", "Avicii",R.drawable.play));
        songPlayList.add(new SongCard("Remind Me To Forget", "Kygo",R.drawable.play));
        songPlayList.add(new SongCard("Move To Miami", "Enrique Iglesias",R.drawable.play));
        songPlayList.add(new SongCard("Broken Arrows", "Avicii",R.drawable.play));
        songPlayList.add(new SongCard("The Way I am", "Charlie Puth",R.drawable.play));
        songPlayList.add(new SongCard("Entertainer", "Zayn Malik",R.drawable.play));
        songPlayList.add(new SongCard("Wolves", "Selena Gomez",R.drawable.play));
        songPlayList.add(new SongCard("Chasing Cars", "Snow Patrol",R.drawable.play));
        songPlayList.add(new SongCard("Dusk Till Dawn", "Zayn Malik",R.drawable.play));
        songPlayList.add(new SongCard("Everybody hates me", "The Chainsmokers",R.drawable.play));
        songPlayList.add(new SongCard("Bad at Love", "Halsey",R.drawable.play));
        songPlayList.add(new SongCard("Young Dumb Broke", "DJ Khaleed",R.drawable.play));

        SongAdapterCard adapter = new SongAdapterCard(getActivity(), songPlayList);
        //listView1 = (ListView) getView().findViewById(R.id.trendingList);
        ListView listView1 = view.findViewById(R.id.trendingList);

        listView1.setAdapter(adapter);
        return view;
    }
}
*/