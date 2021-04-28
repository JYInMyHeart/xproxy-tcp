package com.alex.entry;

public interface Route {
    handleConn(Conn conn);
    handleConnWithretry(Conn conn, int retry);
}
