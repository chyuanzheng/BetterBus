package com.example.administrator.betterbus.handler;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/10/23.
 */

public class BetterBus  {
    static HashMap<String,CyzSubject> mapHolder = new HashMap<>();

    static public BetterSubject register(String busId){
        if (mapHolder.containsKey(busId)){
            throw new RuntimeException();
        }
        CyzSubject result = new CyzSubject();
        mapHolder.put(busId,result);
        return result;
    }
    static  public BetterSubject getIMessage(String busId){
        return mapHolder.get(busId);
    }
    static public void unRegister(String busId){
        if (!mapHolder.containsKey(busId)){
            throw new RuntimeException();
        }
        CyzSubject bus = mapHolder.get(busId);
        bus.clear();
        mapHolder.remove(busId);
    }


}
