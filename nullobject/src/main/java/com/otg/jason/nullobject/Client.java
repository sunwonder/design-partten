package com.otg.jason.nullobject;

/**
 * Created by jason.guan on 2017/7/22
 */
public class Client {
    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();
        Book book = bookFactory.getBook(-1);
        book.show();
        if (book.isNull()) {
            //这里由客户端定制提醒代码
            System.out.println("兄弟，你输入的ID不符合规范吧。");
        }
    }
}
