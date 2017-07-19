package com.otg.jason.dynamic;

/**
 * Created by jason.guan on 2017/7/15.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Service service = new UserServiceImpl();
        Service serviceProxy = (Service)new MyInvocatioHandler(service).getProxy();
        serviceProxy.add();
    }
}
