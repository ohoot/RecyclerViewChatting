package com.example.joo.recyclerviewchatting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recyclerView;
    EditText editMsg;
    Button btn;
    RadioGroup radioGroup;
    ChattingAdapter mAdapter;

    int[] btnRes = {
            R.id.btnSend,
            R.id.btnClear
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        editMsg = (EditText) findViewById(R.id.editText);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        mAdapter = new ChattingAdapter();
        setBtnListener(btnRes);
    }

    private void setBtnListener(int[] btnRes) {
        for (int i : btnRes) {
            btn = (Button) findViewById(btnRes[i]);
            btn.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSend) {
            String message;
            int iconId;
            switch (radioGroup.getCheckedRadioButtonId()) {
                case R.id.radioCharles :
                    message = editMsg.getText().toString();
                    iconId = R.drawable.charles;
                    ReceiveData rd = new ReceiveData(message, iconId);
                    mAdapter.add(rd);
                    break;
                case R.id.radioJohn :
                    message = editMsg.getText().toString();
                    iconId = R.drawable.johnson;
                    SendData sd = new SendData(message, iconId);
                    mAdapter.add(sd);
                    break;
                case  R.id.radioDate :
                    DateData dd = new DateData((new Date().toString()));
                    mAdapter.add(dd);
                    break;
            }
            editMsg.setText("");
        } else if (v.getId() == R.id.btnClear) {

        }
    }
}
