package com.alex.entry;

import java.nio.channels.ServerSocketChannel;
import java.util.ArrayList;
import java.util.List;

public class FixedTarget {
    private TargetInfo info;
    private List<String> routes;
    private boolean stopACME;
    private Balance balance;
    private ServerSocketChannel limitListener;

    public FixedTarget() {
    }

    public FixedTarget(TargetInfo targetInfo) {
        this.info = targetInfo;
    }

    public TargetInfo getInfo() {
        return info;
    }

    public void setInfo(TargetInfo info) {
        this.info = info;
    }

    public List<String> getRoutes() {
        return routes;
    }

    public void setRoutes(List<String> routes) {
        this.routes = routes;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public ServerSocketChannel getLimitListener() {
        return limitListener;
    }

    public void setLimitListener(ServerSocketChannel limitListener) {
        this.limitListener = limitListener;
    }

    public FixedTarget(TargetInfo info, Balance balance,
                       ServerSocketChannel limitListener) {
        this.info = info;
        this.routes = new ArrayList<>();
        this.stopACME = false;
        this.balance = balance;
        this.limitListener = limitListener;
    }

    public void addRoute(String dest) {
        routes.add(dest);
    }
}
