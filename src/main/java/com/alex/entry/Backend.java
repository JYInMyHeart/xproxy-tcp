package com.alex.entry;

import com.alex.util.Function3;

import java.util.List;


public interface Backend<T> {
    void pub(String key);
    void subscribe(String key);
    List<T> allTargets();
    boolean removeTarget(String port);
    boolean addTarget(TargetInfo info);
    boolean addRoute(String port, String dest);
    boolean removeRoute(String port, String dest);
    void registerCallback(Function3<String,String,String,Void> callbackFunc);
    void callback();

}
