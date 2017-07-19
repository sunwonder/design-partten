package com.otg.jason;

/**
 * Created by jason.guan on 2017/7/19.
 * 把日志记录到文件
 */
public class FileLog implements LogStrategy{
    public void log(String msg) {
        System.out.println("现在把 '"+msg+"' 记录到文件中");
    }
}
