package com.example.android.abnd_musical_structure_app;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.android.abnd_musical_structure_app.Adapters.ArtistRecyclerAdapter;
import com.example.android.abnd_musical_structure_app.Adapters.SongRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragRecycler extends Fragment {


    private RecyclerView mRecyclerView;
    private RecyclerView mRecyclerView1;
    private RecyclerView mRecyclerViewA;
    private RecyclerView mRecyclerView2;
    private SongRecyclerAdapter recyclerAdapter;
    private SongRecyclerAdapter recyclerAdapter1;
    private ArtistRecyclerAdapter recyclerAdapterA;
    private ArtistRecyclerAdapter recyclerAdapter2;
    private List<SongCard> songCardList;
    private List<SongCard> songCardList1;
    private List<SongCard> songCardListA;
    private List<SongCard> songCardList2;


    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home_frag_recycler, container, false);

        mRecyclerView = view.findViewById(R.id.recycle);
        songCardList = new ArrayList<>();
        recyclerAdapter = new SongRecyclerAdapter(this.getActivity(), songCardList);

        //final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(recyclerAdapter);

       // SnapHelper snapHelper = new LinearSnapHelper();
        //snapHelper.attachToRecyclerView(mRecyclerView);

        //populateList();

        //*************************** L A T E S T . E N G L I S H *****************

        mRecyclerView1 = view.findViewById(R.id.recycle1);
        songCardList1 = new ArrayList<>();
        recyclerAdapter1 = new SongRecyclerAdapter(this.getActivity(), songCardList1);

        //final LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity());
        //layoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView1.setLayoutManager(layoutManager1);
        mRecyclerView1.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView1.setHasFixedSize(true);
        mRecyclerView1.setAdapter(recyclerAdapter1);

        SnapHelper snapHelper1 = new LinearSnapHelper();
        snapHelper1.attachToRecyclerView(mRecyclerView1);





        //*********************** L A T E S T . E N G L I S H . E N D ************************


        //************************ A R T I S T S  .  R E C O M M E N D E D ****************

        mRecyclerViewA = view.findViewById(R.id.recycleA);
        songCardListA = new ArrayList<>();
        recyclerAdapterA = new ArtistRecyclerAdapter(this.getActivity(), songCardListA);

        //final LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity());
        //layoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        RecyclerView.LayoutManager layoutManagerA = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerViewA.setLayoutManager(layoutManagerA);
        mRecyclerViewA.setItemAnimator(new DefaultItemAnimator());
        mRecyclerViewA.setHasFixedSize(true);
        mRecyclerViewA.setAdapter(recyclerAdapterA);

        SnapHelper snapHelperA = new LinearSnapHelper();
        snapHelperA.attachToRecyclerView(mRecyclerViewA);


        //************************ A R T I S T S .  E N D ********************************

        //************************ A R T I S T S  .  TOP ****************

        mRecyclerView2 = view.findViewById(R.id.recycle2);
        songCardList2 = new ArrayList<>();
        recyclerAdapter2 = new ArtistRecyclerAdapter(this.getActivity(), songCardList2);

        //final LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity());
        //layoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView2.setLayoutManager(layoutManager2);
        mRecyclerView2.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView2.setHasFixedSize(true);
        mRecyclerView2.setAdapter(recyclerAdapter2);
        SnapHelper snapHelper2 = new LinearSnapHelper();
        snapHelper2.attachToRecyclerView(mRecyclerView2);


        //************************ A R T I S T S .  E N D ********************************

        populateListArtist();
        populateList();
        populateList1();
        populateList2();


        //************************************* P a s s ****************************






        //*************************************P A S S ***************************



        return view;
    }

    private void populateListArtist(){
        songCardListA.add(new SongCard("Miley Cyrus", "Kygo",R.drawable.miley));
        songCardListA.add(new SongCard("Marshmello", "Jacob Lee",R.drawable.artist1));
        songCardListA.add(new SongCard("Taylor Swift", "Imagine Dragons",R.drawable.taylor));
        songCardListA.add(new SongCard("Katy Perry", "Avicii",R.drawable.katy));
        songCardListA.add(new SongCard("Chainsmokers", "Avicii",R.drawable.chain));
        songCardListA.add(new SongCard("Bebe Rexha", "Charlie Puth",R.drawable.rexha));
        songCardListA.add(new SongCard("Alan Walker", "Zayn Malik",R.drawable.alan));
        songCardListA.add(new SongCard("Nick Jonas", "Enrique Iglesias",R.drawable.nick));

    }

    private void populateList(){
        songCardList.add(new SongCard("Dusk Till Dawn", "Zayn Malik",R.drawable.icon9));
        songCardList.add(new SongCard("Move To Miami", "Enrique Iglesias",R.drawable.icon7));
        songCardList.add(new SongCard("Lonely Together", "Avicii",R.drawable.icon4));
        songCardList.add(new SongCard("Secrets", "Jacob Lee",R.drawable.icon1));
        songCardList.add(new SongCard("Born To Be Yours", "Imagine Dragons",R.drawable.icon3));
        songCardList.add(new SongCard("Remind Me To Forget", "Kygo",R.drawable.icon5));
        songCardList.add(new SongCard("Broken Arrows", "Avicii",R.drawable.icon6));
        songCardList.add(new SongCard("The Way I am", "Charlie Puth",R.drawable.icon8));
        songCardList.add(new SongCard("Entertainer", "Zayn Malik",R.drawable.icon12));
        songCardList.add(new SongCard("Wolves", "Selena Gomez",R.drawable.icon10));
        //songCardList.add(new SongCard("Chasing Cars", "Snow Patrol",R.drawable.play));
        songCardList.add(new SongCard("Everybody hates me", "The Chainsmokers",R.drawable.chain));
        songCardList.add(new SongCard("Bad at Love", "Halsey",R.drawable.icon11));

    }

    private void populateList1(){
        songCardList1.add(new SongCard("Natural", "Imagine Dragons",R.drawable.trending1));
        songCardList1.add(new SongCard("Dancing Alone", "Charlie Puth",R.drawable.trending7));
        songCardList1.add(new SongCard("EatSide", "Zayn Malik",R.drawable.trending6));
        songCardList1.add(new SongCard("Happy Now", "Imagine Dragons",R.drawable.trending2));
        songCardList1.add(new SongCard("Jump Suit", "Avicii",R.drawable.trending3));
        songCardList1.add(new SongCard("Magenta Riddim", "Kygo",R.drawable.trending4));
        songCardList1.add(new SongCard("Sun in our eyes", "Enrique Iglesias",R.drawable.trending5));

    }

    private void populateList2(){
        songCardList2.add(new SongCard("Entertainer", "Zayn Malik",R.drawable.icon12));
        songCardList2.add(new SongCard("The Way I am", "Charlie Puth",R.drawable.icon8));
        songCardList2.add(new SongCard("Magenta Riddim", "Kygo",R.drawable.trending4));
        songCardList2.add(new SongCard("Jump Suit", "Avicii",R.drawable.trending3));
        songCardList2.add(new SongCard("Wolves", "Selena Gomez",R.drawable.icon10));
        songCardList2.add(new SongCard("Everybody hates me", "The Chainsmokers",R.drawable.chain));
        songCardList2.add(new SongCard("Sun in our eyes", "Enrique Iglesias",R.drawable.trending5));
        songCardList2.add(new SongCard("Wolves", "Selena Gomez",R.drawable.icon10));
        songCardList2.add(new SongCard("Bad at Love", "Halsey",R.drawable.icon11));
        songCardList2.add(new SongCard("Move To Miami", "Enrique Iglesias",R.drawable.icon7));
        songCardList2.add(new SongCard("Dusk Till Dawn", "Zayn Malik",R.drawable.icon9));
    }
}