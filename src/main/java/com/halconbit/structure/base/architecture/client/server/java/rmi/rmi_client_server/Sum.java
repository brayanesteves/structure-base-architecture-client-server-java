package com.halconbit.structure.base.architecture.client.server.java.rmi.rmi_client_server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author brayan
 */
public interface Sum extends Remote {
    public String sum(String a, String b) throws RemoteException;
}
