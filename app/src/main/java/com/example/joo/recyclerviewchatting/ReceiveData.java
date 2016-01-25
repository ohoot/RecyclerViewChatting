package com.example.joo.recyclerviewchatting;

/**
 * Created by Joo on 2016-01-25.
 */
public class ReceiveData implements ChattingData{
    String message;
    int iconId;

    public ReceiveData() {}

    public ReceiveData(String message, int iconId) {
        this.message = message;
        this.iconId = iconId;
    }
}
