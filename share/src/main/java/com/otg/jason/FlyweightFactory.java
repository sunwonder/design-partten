package com.otg.jason;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jason.guan on 2017/7/22
 */
public class FlyweightFactory{
    static Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String key){
        Shape shape = shapes.get(key);
        //如果shape==null,表示不存在,则新建,并且保持到共享池中
        if(shape == null){
            System.out.println("创建了一个新对象:"+key);
            shape = new Circle(key);
            shapes.put(key, shape);
        }
        return shape;
    }

    public static int getSum(){
        return shapes.size();
    }
}
