package com.otg.jason.template;

/**
 * Created by jason.guan on 2017/7/18.
 */
public class ConcreteTemplate extends AbstractTemplate{
    //基本方法的实现
    @Override
    public void abstractMethod() {
        //业务相关的代码
        System.out.println("abstractMethod实现方式1");
    }
    //重写父类的方法
    @Override
    public void hookMethod() {
        //业务相关的代码
        System.out.println("hookMethod 实现方式2");
    }
}
