package com.syoki.java.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RpcServer {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
        IBusiness business = new BusinessImpl();
        LocateRegistry.createRegistry(8868);
        Naming.bind("rmi://localhost:8868/Business",business);
        System.out.println("Hello, RMI Server!");
    }
}
