
package com.halconbit.structure.base.architecture.client.server.java.rpc.rpc_server;

import com.halconbit.structure.base.architecture.client.server.java.rpc.rpc_server.Util.Variables;
import java.util.Vector;
import javax.swing.JOptionPane;
import org.apache.xmlrpc.XmlRpcClient;

/**
 *
 * @author brayan
 */
public class Client {
    
    static Variables variables = new Variables();
    public static void main(String[] args) {
        String x = "";
        String y = "";
        Object response;
        
        try {
            XmlRpcClient client = new XmlRpcClient(variables.URL);
            Vector<String> params = new Vector<String>();
            JOptionPane.showMessageDialog(null, "Client connect successful. " + client.getURL());
            
            while(true) {
                String menu = JOptionPane.showInputDialog(null, "Sum two number\n" 
                + "1. Sum\n"
                + "2. Exit\n", "Client - Server [RPC]", JOptionPane.DEFAULT_OPTION);
                
                switch (menu) {
                    case "1":
                        x  = JOptionPane.showInputDialog(null, "Enter first number", JOptionPane.QUESTION_MESSAGE);
                        y  = JOptionPane.showInputDialog(null, "Enter second number", JOptionPane.QUESTION_MESSAGE);
                        
                        params.addElement(x);
                        params.addElement(y);
                        
                        response = client.execute(variables.NAME_SERVER+".sum", params);
                        
                        JOptionPane.showMessageDialog(null, "Sum is: " + response);
                        
                        params.clear();
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
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
}
