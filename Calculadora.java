
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinig
 */
public class Calculadora extends UnicastRemoteObject implements ICalculadora {
    
    protected Calculadora() throws RemoteException {
        super();
    
    }

    @Override
    public int somarNumeros(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public int subtrairNumeros(int a, int b) throws RemoteException {
        return a-b;

    }

    @Override
    public int dividirNumeros(int a, int b) throws RemoteException {
        return a/b;

    }

    @Override
    public int multiplicarNumeros(int a, int b) throws RemoteException {
       return a*b;

    }
    
    
}
