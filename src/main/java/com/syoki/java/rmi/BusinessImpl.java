package com.syoki.java.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BusinessImpl extends UnicastRemoteObject implements IBusiness {

    public BusinessImpl() throws RemoteException {}

    @Override
    public String echo(String message) throws RemoteException {
        return "hello," + message;
    }
}
