/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements RMIInterface {

     private static final long serialVersionUID = 1L;

     protected Server() throws RemoteException {

	  super();

     }

     @Override
     public float caculator(int km) throws RemoteException {
	  return (float) (km * 0.621371);
     }

     public static void start(ServerRMI serverUI) {

	  try {
//	       System.setProperty("java.rmi.server.hostname", "127.0.0.1");
	       Naming.rebind("//localhost:9999/server", new Server());
	       System.err.println("Server ready");
	       serverUI.getTxtArea().append("Server is running...");

	  } catch (Exception e) {
	       serverUI.getTxtArea().append("Server exception: " + e.toString());
	       e.printStackTrace();

	  }

     }
//
//     public static void main(String[] args) {
//
//	  try {
//
//	       Naming.rebind("//localhost/MyServer", new Server());
//	       System.err.println("Server ready");
//
//	  } catch (Exception e) {
//
//	       System.err.println("Server exception: " + e.toString());
//	       e.printStackTrace();
//
//	  }
//
//     }

}
