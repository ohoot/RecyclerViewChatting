package com.example.joo.recyclerviewchatting;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Joo on 2016-01-25.
 */
public class SendViewHolder extends RecyclerView.ViewHolder {
    ImageView imageJohn;
    TextView  textJohn;

    public SendViewHolder(View itemView) {
        super(itemView);
        imageJohn = (ImageView) itemView.findViewById(R.id.imageJohn);
        textJohn  = (TextView)  itemView.findViewById(R.id.textJohn);
    }

    public void setView (SendData data) {
        imageJohn.setImageResource(data.iconId);
        textJohn.setText(data.message);
    }
}
