package com.example.joo.recyclerviewchatting;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Joo on 2016-01-25.
 */
public class ChattingAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<ChattingData> items = new ArrayList<ChattingData>();

    public static final int VIEW_TYPE_CHARLES = 0;
    public static final int VIEW_TYPE_JOHN = 1;
    public static final int VIEW_TYPE_DATE = 2;

    @Override
    public int getItemViewType(int position) {
        ChattingData data = items.get(position);
        if (data instanceof ReceiveData) return VIEW_TYPE_CHARLES;
        else if (data instanceof SendData) return VIEW_TYPE_JOHN;
        else return VIEW_TYPE_DATE;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view;
        switch (viewType) {
            case VIEW_TYPE_CHARLES :
                view = inflater.inflate(R.layout.view_receive, parent, false);
                return new ReceiveViewHolder(view);
            case  VIEW_TYPE_JOHN :
                view = inflater.inflate(R.layout.view_send, parent, false);
                return new SendViewHolder(view);
            case VIEW_TYPE_DATE :
                view = inflater.inflate(R.layout.view_date, parent, false);
                return new DateViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case VIEW_TYPE_CHARLES :
                ((ReceiveViewHolder) holder).setView((ReceiveData)items.get(position));
                break;
            case VIEW_TYPE_JOHN :
                ((SendViewHolder) holder).setView((SendData)items.get(position));
                break;
            case VIEW_TYPE_DATE :
                ((DateViewHolder) holder).setView((DateData)items.get(position));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void add(ChattingData data) {
        items.add(data);
        notifyDataSetChanged();
    }

    public void clear() {
        items.clear();
        notifyDataSetChanged();
    }
}
