package com.halconbit.structure.base.architecture.client.server.java.rpc.rpc_client;

import com.halconbit.structure.base.architecture.client.server.java.rpc.rpc_client.Util.Variables;
import javax.swing.JOptionPane;
import org.apache.xmlrpc.WebServer;

/**
 *
 * @author brayan
 */
public class Server {
    
    static Variables variables = new Variables();
    
    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Init server");
            // Init server
            WebServer server = new WebServer(variables.PORT);
            
            Sum sum = new Sum();
            
            /**
             * Name server: serverHalconBitRPC
             */
            server.addHandler(variables.NAME_SERVER, sum);
            server.start();
            
            JOptionPane.showMessageDialog(null, "Server Online " + variables.NAME_SERVER);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
}
