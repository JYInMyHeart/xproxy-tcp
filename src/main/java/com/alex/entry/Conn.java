package com.alex.entry;

import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SocketChannel;

public abstract class Conn {
    String hostname;
    byte[] peeked;
    SocketChannel channel;
    abstract void close();



}