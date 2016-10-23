package com.example.administrator.betterbus.handler;

import android.os.Handler;
import android.os.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/23.
 */

public class CyzSubject implements BetterSubject {
    // private String  busId;
    private Handler handler;
    private List<ICyzBus> busList = new ArrayList<>();

    public CyzSubject() {
        handler = new Handler() {
            public void handleMessage(Message msg) {
                synchronized (this) {
                    for (ICyzBus bus : busList) {
                        bus.handleMessage(msg);
                    }
                }
            }
        };
    }

    @Override
    public void subscibe(ICyzBus bus) {

        synchronized (this) {
            if (busList.contains(bus))
                return;
            busList.add(bus);
        }

    }

    @Override
    public void post(Message msg) {
        handler.sendMessage(msg);
    }


    public void clear() {
        synchronized (this) {
            busList.clear();
        }
    }
}
