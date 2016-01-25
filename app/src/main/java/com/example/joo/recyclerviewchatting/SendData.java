package com.example.joo.recyclerviewchatting;

/**
 * Created by Joo on 2016-01-25.
 */
public class SendData implements ChattingData {
    String message;
    int iconId;

    public SendData() {}

    public SendData(String message, int iconId) {
        this.message = message;
        this.iconId = iconId;
    }
}
