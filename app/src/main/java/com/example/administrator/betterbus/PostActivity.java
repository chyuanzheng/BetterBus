package com.example.administrator.betterbus;

import android.os.Bundle;
import android.os.Message;
import android.view.View;

import com.example.administrator.betterbus.handler.BetterBus;
import com.example.administrator.betterbus.handler.BetterSubject;


public class PostActivity extends BaseActivity {
    private BetterSubject subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        subject = BetterBus.getSubject("MainActivity");
        findViewById(R.id.betterBusPost).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                betterBusPost();
            }
        });


    }

    private void betterBusPost() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Message msg = new Message();
                msg.obj = "fadfafdafdaf";
                subject.post(msg);
            }
        }).start();

    }
}
