package com.example.joo.recyclerviewchatting;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Joo on 2016-01-25.
 */
public class ChattingAdapter extends RecyclerView.Adapter<SendViewHolder> {
    ArrayList<ChattingData> items = new ArrayList<ChattingData>();

    public static final int VIEW_TYPE_CHARLES = 0;
    public static final int VIEW_TYPE_JOHN = 0;
    public static final int VIEW_TYPE_DATE = 0;

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public SendViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view;
        switch (viewType) {
            case VIEW_TYPE_CHARLES:
        }

        return null;
    }

    @Override
    public void onBindViewHolder(SendViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void add(ChattingData data) {
        items.add(data);
        notifyDataSetChanged();
    }
}
