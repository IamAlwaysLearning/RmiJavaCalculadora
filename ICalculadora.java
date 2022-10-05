
import java.rmi.Remote;
import java.rmi.RemoteException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinig
 */
public interface ICalculadora extends Remote {
    int somarNumeros(int a, int b)throws RemoteException;
    int subtrairNumeros(int a, int b)throws RemoteException;
    int dividirNumeros(int a, int b)throws RemoteException;
    int multiplicarNumeros(int a, int b)throws RemoteException;

}
