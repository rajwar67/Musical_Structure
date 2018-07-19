package com.example.android.abnd_musical_structure_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Akanksha_Rajwar on 15-07-2018.
 * songCard created for storing 2 states(string values) together as an object
 * so it could be fetched at once
 */


public class SongCard {

    private String msongTitle;
    private String mArtist;
    private int mImageRes;

    public SongCard(String songTitle, String artist, int imageRes) {
        msongTitle = songTitle;
        mArtist = artist;
        mImageRes = imageRes;
    }

    public String getSongTitle() {
        return msongTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public int getImageRes() {
        return mImageRes;
    }
}
