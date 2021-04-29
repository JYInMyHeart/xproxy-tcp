package com.alex.entry;

import com.alex.proxy.Proxy;

import java.util.ArrayList;
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


    public TargetInfo(String port, String proxy_service_name, String balance_strategy) {
        this.port = port;
        this.proxy_service_name = proxy_service_name;
        this.balance_strategy = balance_strategy;
        routes_addr = new ArrayList<>();
        max_connection = 1;
        proto = Proxy.TCP;
    }

    public TargetInfo(String port, String proxy_service_name, String tenant_name, ACL acl,
                      String balance_strategy, List<String> routes_addr, int max_connection, int retry,
                      String proto, String tls_crt, String tls_key) {
        this.port = port;
        this.proxy_service_name = proxy_service_name;
        this.tenant_name = tenant_name;
        this.acl = acl;
        this.balance_strategy = balance_strategy;
        this.routes_addr = routes_addr;
        this.max_connection = max_connection;
        this.retry = retry;
        this.proto = proto;
        this.tls_crt = tls_crt;
        this.tls_key = tls_key;
    }

    public TargetInfo() {
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getProxy_service_name() {
        return proxy_service_name;
    }

    public void setProxy_service_name(String proxy_service_name) {
        this.proxy_service_name = proxy_service_name;
    }

    public String getTenant_name() {
        return tenant_name;
    }

    public void setTenant_name(String tenant_name) {
        this.tenant_name = tenant_name;
    }

    public ACL getAcl() {
        return acl;
    }

    public void setAcl(ACL acl) {
        this.acl = acl;
    }

    public String getBalance_strategy() {
        return balance_strategy;
    }

    public void setBalance_strategy(String balance_strategy) {
        this.balance_strategy = balance_strategy;
    }

    public List<String> getRoutes_addr() {
        return routes_addr;
    }

    public void setRoutes_addr(List<String> routes_addr) {
        this.routes_addr = routes_addr;
    }

    public int getMax_connection() {
        return max_connection;
    }

    public void setMax_connection(int max_connection) {
        this.max_connection = max_connection;
    }

    public int getRetry() {
        return retry;
    }

    public void setRetry(int retry) {
        this.retry = retry;
    }

    public String getProto() {
        return proto;
    }

    public void setProto(String proto) {
        this.proto = proto;
    }

    public String getTls_crt() {
        return tls_crt;
    }

    public void setTls_crt(String tls_crt) {
        this.tls_crt = tls_crt;
    }

    public String getTls_key() {
        return tls_key;
    }

    public void setTls_key(String tls_key) {
        this.tls_key = tls_key;
    }
}
