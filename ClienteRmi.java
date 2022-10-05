
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinig
 */
public class ClienteRmi {
        public static void main (String[] args){
            try {
                ICalculadora stub =(ICalculadora)Naming.lookup("rmi://localhost:1099/calculadora");
                System.out.println(stub.somarNumeros(5,5));
                System.out.println(stub.subtrairNumeros(5,5));
                System.out.println(stub.dividirNumeros(5,5));
                System.out.println(stub.multiplicarNumeros(5,5));

                
                
            } catch (NotBoundException |MalformedURLException|RemoteException ex) {
                Logger.getLogger(ClienteRmi.class.getName()).log(Level.SEVERE, null, ex);
                Logger.getLogger(ClienteRmi.class.getName()).log(Level.SEVERE, null, ex);
                Logger.getLogger(ClienteRmi.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }

}
