package com.otg.jason.filter.old;

/**
 * Created by jason.guan on 2017/7/16.
 */
public class FilterProcessor {
    String msg;

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String process(){
        //process html tag
        String r = msg.replace("<", "[")
                .replace(">", "]");
        //process the sensitive words
        r=r.replace("敏感", "XXXX");


        return r;
    }
}