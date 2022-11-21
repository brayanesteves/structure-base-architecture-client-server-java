package com.halconbit.structure.base.architecture.client.server.java.rpc.rpc_client;

/**
 *
 * @author brayan
 */
public class Sum {
    public String sum(String a, String b) {
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
}
