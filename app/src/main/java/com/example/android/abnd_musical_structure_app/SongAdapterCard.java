package com.example.android.abnd_musical_structure_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Akanksha_Rajwar on 17-07-2018.
 */

public class SongAdapterCard extends ArrayAdapter<SongCard>{


        public SongAdapterCard(Context context, ArrayList<SongCard> songCards){
            super(context,0,songCards);

        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.song_card_view, parent, false);
            }
            SongCard currentWord = getItem(position);
            TextView artistTextView = (TextView) listItemView.findViewById(R.id.songTitle);
            artistTextView.setText(currentWord.getSongTitle());
            ImageView thumbnailView=(ImageView) listItemView.findViewById(R.id.thumbnail);
            thumbnailView.setImageResource(currentWord.getImageRes());

       /* // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());
*/
            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
            return listItemView;
        }
    }

