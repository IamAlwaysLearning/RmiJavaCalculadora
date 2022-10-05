
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinig
 */
public class ServerRmi {
    public static void main (String[] args){
        
        try{
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/calculadora", new Calculadora());
            
            System.out.println("Server levantou !!!");
            
        }catch(RemoteException | MalformedURLException e){
            e.printStackTrace();
        }
    }
}
