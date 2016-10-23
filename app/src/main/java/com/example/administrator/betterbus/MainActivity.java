package com.example.administrator.betterbus;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.betterbus.handler.BetterBus;
import com.example.administrator.betterbus.handler.BetterSubject;
import com.example.administrator.betterbus.handler.ICyzBus;

public class MainActivity extends BaseActivity {

    private BetterSubject subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subject = BetterBus.register("MainActivity");
        subject.subscibe(new ICyzBus() {
            @Override
            public void handleMessage(Message msg) {
                showText(msg.obj.toString());
            }
        });

        findViewById(R.id.startPostActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPostActivity();
            }
        });

    }

    private void startPostActivity() {
        startActivity(new Intent(this,PostActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BetterBus.unRegister("MainActivity");
    }
}
