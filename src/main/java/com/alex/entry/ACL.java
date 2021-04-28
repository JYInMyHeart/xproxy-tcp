package com.alex.entry;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;

public class ACL {
    boolean enable;
    List<String> allow;
    List<String> deny;
    List<InetAddress> allowNet;
    List<InetAddress> denyNet;
}
