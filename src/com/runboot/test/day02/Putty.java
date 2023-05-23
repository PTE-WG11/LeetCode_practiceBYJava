package com.runboot.test.day02;

public class Putty {
    public Putty(String name){
        //这个构造器仅有一个参数：name
        System.out.print("名字是："+name);
    }
    public static void mainputty(String[] args){
        Putty myputty = new Putty("tommy");
    }
}
