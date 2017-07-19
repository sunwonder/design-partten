package com.otg.jason.design;

/**
 * Created by jason.guan on 2017/4/21.
 */
/*     单例  懒汉式单例类  */
public final class LazySingleton{

    private static LazySingleton mInstance = null;

    private LazySingleton() {}  // 私有的默认构造器，保证外界无法直接实例化

    /**
     * 静态工厂方法，返还此类的唯一事例
     */
    public synchronized static LazySingleton getInstance(){
        if (mInstance == null){
            mInstance = new LazySingleton();
        }
        return mInstance;
    }
}
