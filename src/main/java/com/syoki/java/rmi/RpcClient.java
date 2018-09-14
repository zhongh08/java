package com.syoki.java.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RpcClient {
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        IBusiness business = (IBusiness) Naming.lookup("rmi://localhost:8868/Business");
        System.out.println(business.echo("xingoo"));
    }
}
