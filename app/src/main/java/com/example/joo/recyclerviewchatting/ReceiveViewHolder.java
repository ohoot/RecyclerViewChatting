package com.example.joo.recyclerviewchatting;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Joo on 2016-01-25.
 */
public class ReceiveViewHolder extends RecyclerView.ViewHolder {
    ImageView imageCharles;
    TextView  textCharles;

    public ReceiveViewHolder(View itemView) {
        super(itemView);
        imageCharles = (ImageView) itemView.findViewById(R.id.imageCharles);
        textCharles  = (TextView)  itemView.findViewById(R.id.textCharles);
    }

    public void setView (ReceiveData data) {
        imageCharles.setImageResource(data.iconId);
        textCharles.setText(data.message);
    }
}
