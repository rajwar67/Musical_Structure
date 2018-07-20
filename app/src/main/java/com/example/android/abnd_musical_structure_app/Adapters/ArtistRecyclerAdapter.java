package com.example.android.abnd_musical_structure_app.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.abnd_musical_structure_app.Artists_Songs_Activity;
import com.example.android.abnd_musical_structure_app.R;
import com.example.android.abnd_musical_structure_app.SongCard;
import com.example.android.abnd_musical_structure_app.SongLayout;

import java.util.List;

/**
 * Created by Akanksha_Rajwar on 19-07-2018.
 */

public class ArtistRecyclerAdapter extends RecyclerView.Adapter<ArtistRecyclerAdapter.SongViewHolder> {

    private Context context;
    private List<SongCard> songCardList;

    public ArtistRecyclerAdapter(Context context, List<SongCard> songCardList) {
        this.context = context;
        this.songCardList = songCardList;
    }

    public class SongViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        private LinearLayout parentLayout;

        public SongViewHolder(View view) {
            super(view);
            //Add this please
            //to display artist thumbnails and name in home fragment
            imageView = view.findViewById(R.id.singerThumbnail);
            textView = view.findViewById(R.id.singerName);
            //Layout for displaying playlist of artist
            parentLayout = view.findViewById(R.id.layout_Artist);
        }
    }

    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.artists_layout, parent, false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, final int position) {
        final SongCard songCard = songCardList.get(position);

        holder.textView.setText(songCard.getSongTitle());
        holder.imageView.setImageResource(songCard.getImageRes());
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Artists_Songs_Activity.class);
                intent.putExtra("titleTake", songCard.getSongTitle());
                intent.putExtra("artistTake", songCard.getArtist());
                intent.putExtra("imageResTake",songCard.getImageRes());

                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return songCardList.size();
    }
}
