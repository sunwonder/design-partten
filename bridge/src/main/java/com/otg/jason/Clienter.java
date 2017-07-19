package com.otg.jason;

/**
 * Created by jason.guan on 2017/7/15.
 */
public class Clienter {
    public static void main(String[] args) {
        AreaA a = new AreaA2();
        a.qiao = new AreaB3();
        a.fromAreaA();
        a.qiao.targetAreaB();
    }
}
