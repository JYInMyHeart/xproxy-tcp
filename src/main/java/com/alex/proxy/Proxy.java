package com.alex.proxy;

import com.alex.entry.Backend;
import com.alex.entry.FixedTarget;
import com.alex.entry.TargetInfo;

import java.nio.channels.ServerSocketChannel;
import java.util.Collections;
import java.util.Map;

public abstract class Proxy {
    private Map<String, FixedTarget> targets;
    public abstract ServerSocketChannel listen(String netType, String addr);
    private Backend backend;

    public final static String TCP = "tcp";
    public final static String HTTP = "http";


    public void addRoute(String listenPort, String dest){
        FixedTarget fixedTarget = targets.get(listenPort);
        if(fixedTarget != null){
            fixedTarget.addRoute(dest);
        }else {
            addTarget(listenPort, dest);
        }
    }

    private void addTarget(String listenPort, String dest) {
        TargetInfo targetInfo = new TargetInfo(listenPort, "middleware", "rr");
        FixedTarget fixedTarget = new FixedTarget(targetInfo);
        targets.put(listenPort, fixedTarget);
        targetInfo.getRoutes_addr().add(dest);


    }


}
