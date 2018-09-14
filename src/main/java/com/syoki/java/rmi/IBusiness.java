package com.syoki.java.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IBusiness extends Remote {

    String echo(String message) throws RemoteException;

}
