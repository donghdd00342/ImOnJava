package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class Client {

     private static RMIInterface look_up;
     
     public static float Caculating(int km)
	     throws MalformedURLException, RemoteException, NotBoundException {

	  look_up = (RMIInterface) Naming.lookup("//localhost:9999/server");

	  float response = look_up.caculator(km);
	  return response;
     }

//     public static void main(String[] args)
//	     throws MalformedURLException, RemoteException, NotBoundException {
//
//	  look_up = (RMIInterface) Naming.lookup("//localhost/MyServer");
//	  String txt = JOptionPane.showInputDialog("What is your name?");
//
//	  float response = look_up.caculator(1);
//	  JOptionPane.showMessageDialog(null, response);
//
//     }

}
