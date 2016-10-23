package com.example.administrator.betterbus.handler;

/**
 * Created by Administrator on 2016/10/23.
 */

import android.os.Message;

public  interface BetterSubject {
     void subscibe(ICyzBus bus);
     void post(Message msg);
}
