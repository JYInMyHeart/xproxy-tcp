package com.alex.proxy;

import com.alex.entry.Backend;
import com.alex.entry.FixedTarget;

import java.nio.channels.ServerSocketChannel;
import java.util.Map;

public abstract class Proxy {
    private Map<String, FixedTarget> targets;
    public abstract ServerSocketChannel (String netType, String addr);
    private Backend backend;


}
