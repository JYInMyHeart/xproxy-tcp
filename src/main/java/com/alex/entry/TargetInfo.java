package com.alex.entry;

import java.util.List;

public class TargetInfo {
    private String port;
    private String proxy_service_name;
    private String tenant_name;
    ACL acl;
    String balance_strategy;
    List<String> routes_addr;
    int max_connection;
    int retry;
    String proto;
    String tls_crt;
    String tls_key;
}
