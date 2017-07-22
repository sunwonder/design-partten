package com.otg.jason;

/**
 * Created by jason.guan on 2017/7/22
 */
public class Circle extends Shape{
    private String color;
    public Circle(String color){
        this.color = color;
    }

    public void draw() {
        System.out.println("画了一个" + color +"的圆形");
    }

}
