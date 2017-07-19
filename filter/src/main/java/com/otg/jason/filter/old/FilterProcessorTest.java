package com.otg.jason.filter.old;

/**
 * Created by jason.guan on 2017/7/16.
 */
public class FilterProcessorTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String msg = "<html>，敏感信息，大家可以看见吗";
        FilterProcessor filterProcessor = new FilterProcessor();
        filterProcessor.setMsg(msg);
        String result = filterProcessor.process();
        System.out.println(result);
    }

}
