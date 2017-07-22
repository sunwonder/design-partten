package com.otg.jason.nullobject.old;

/**
 * Created by jason.guan on 2017/7/22
 */
public class Client {
    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();
        ConcreteBook book = null;
        for (int i= 1;i<4;i++) {
            book = bookFactory.getBook(i);
            book.show();
        }

    }
}
