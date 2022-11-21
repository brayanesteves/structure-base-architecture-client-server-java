package com.halconbit.structure.base.architecture.client.server.java.rmi.rmi_client_server;

import java.rmi.Remote;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author brayan
 */
public class Server {
    
    public static void main(String[] args) {
        try {
            Registry registry = java.rmi.registry.LocateRegistry.createRegistry(1099);
            registry.rebind("Sum", (Remote) new Rmi());
            JOptionPane.showMessageDialog(null, "Server Online.");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Server Offline.");
        }
        
    }
    
}
