package com.otg.jason.cglib;


import org.junit.Test;

/**
 * Created by jason.guan on 2017/7/15.
 */
public class MyTest {

    @Test
    public void test(){
        //目标对象
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
