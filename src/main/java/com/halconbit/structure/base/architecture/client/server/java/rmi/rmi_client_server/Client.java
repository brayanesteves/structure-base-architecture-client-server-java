package com.halconbit.structure.base.architecture.client.server.java.rmi.rmi_client_server;

import java.rmi.Naming;
import java.util.Vector;
import javax.swing.JOptionPane;
import org.apache.xmlrpc.XmlRpcClient;

/**
 *
 * @author brayan
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
            
        String x = "";
        String y = "";
        
        try {
            Sum s = (Sum) Naming.lookup("//:1912.168.1.12/Sum");            
            
            while(true) {
                String menu = JOptionPane.showInputDialog(null, "Sum two number\n" 
                + "1. Sum\n"
                + "2. Exit\n", "Client - Server [RPC]", JOptionPane.DEFAULT_OPTION);
                
                switch (menu) {
                    case "1":
                        x  = JOptionPane.showInputDialog(null, "Enter first number", JOptionPane.QUESTION_MESSAGE);
                        y  = JOptionPane.showInputDialog(null, "Enter second number", JOptionPane.QUESTION_MESSAGE);
                        
                        JOptionPane.showMessageDialog(null, "Server Online.");
                        
                        break;
                        
                    case "2":
                        JOptionPane.showMessageDialog(null, "Exit", null, JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                        break;
                    default:
                        
                        throw new AssertionError();
                }
            }
        } catch(Exception e) {
            
        }
    }
    
}
