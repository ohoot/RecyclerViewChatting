package com.example.joo.recyclerviewchatting;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Joo on 2016-01-25.
 */
public class DateViewHolder extends RecyclerView.ViewHolder {
    TextView textDate;

    public DateViewHolder(View itemView) {
        super(itemView);
        textDate = (TextView) itemView.findViewById(R.id.textDate);
    }

    public void setView (DateData data) {
        textDate.setText(data.message);
    }
}
