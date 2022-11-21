package com.halconbit.structure.base.architecture.client.server.java.rmi.rmi_client_server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author brayan
 */
public class Rmi extends UnicastRemoteObject implements Sum {
    
    public Rmi() throws RemoteException{}
    
    @Override
    public String sum(String a, String b) throws RemoteException {
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
    
}
