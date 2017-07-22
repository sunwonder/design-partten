package com.otg.jason.nullobject;

/**
 * Created by jason.guan on 2017/7/22
 */
public class ConcreteBook implements Book{
    private int ID;
    private String name;
    private String author;

    // 构造函数
    public ConcreteBook(int ID, String name, String author) {
        this.ID = ID;
        this.name = name;
        this.author = author;
    }

    /**
     *
     * Description About show:

     * 展示图书的相关信息
     *
     * @version V1.0
     */
    public void show() {
        System.out.println(ID + "**" + name + "**" + author);
    }
    public boolean isNull(){
        return false;
    }
}