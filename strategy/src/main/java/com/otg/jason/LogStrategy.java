package com.otg.jason;

/**
 * Created by jason.guan on 2017/7/19.
 * 日志记录策略的接口
 */
public interface LogStrategy {
    /**
     * 记录日志
     * @param msg 需记录的日志信息
     */
    public void log(String msg);
}
