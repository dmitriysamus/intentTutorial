package com.demo.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    private TextView textViewReceivedMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        textViewReceivedMessage = findViewById(R.id.textViewReceivedMessage);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViewReceivedMessage.setText(msg);
    }
}