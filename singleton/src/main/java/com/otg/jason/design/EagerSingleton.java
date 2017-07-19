package com.otg.jason.design;

/*     单例  饿汉式单例类
 * Created by jason.guan on 2017/4/21.
1.某个类只能有一个实例
2.它必须自行创建这个事例  静态变量 m_instance()会被初始化，此时类的私有构造器会被调用
3.它必须自行向整个系统提供这个事例
*/

public class EagerSingleton{
    private static final EagerSingleton mInstance = new EagerSingleton();


    private EagerSingleton() {}   // 私有的默认构造器，保证外界无法直接实例化

    /*
    * 静态工厂方法
    */
    public static EagerSingleton getInstance(){
        return mInstance;
    }
}