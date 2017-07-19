package com.otg.jason;

/**
 * Created by jason.guan on 2017/7/19.
 */
public class LogContext {
    public static void log(String msg){
        LogStrategy strategy = new DbLog();
        try {
            strategy.log(msg);
        } catch (Exception e) {
            e.printStackTrace();
            strategy = new FileLog();
            strategy.log(msg);
        }


    }
}
