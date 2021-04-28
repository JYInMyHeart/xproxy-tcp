package com.alex.entry;

import java.nio.channels.ServerSocketChannel;
import java.util.List;

public class FixedTarget {
    TargetInfo info;
    List<String> routes;
    boolean stopACME;
    Balance balance;
    ServerSocketChannel limitListener;

}
