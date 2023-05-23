package com.runboot.test.day02;
//访问实例变量和调用成员方法
public class Putty02 {
    int puttyAge;
    public Putty02(String name){
        System.out.println("名字是："+name);
    }
    public void setAge(int age){
        puttyAge=age;
    }
    public int getAge(){
        System.out.println("年龄是："+puttyAge);
        return puttyAge;
    }
    public static void mainputty02(String[] args){
        /*创建对象*/
        Putty02 myputty = new Putty02("amy");
        /*通过方法来设定age*/
        myputty.setAge(2);
        /*调用另一个方法来获取age*/
        myputty.getAge();
        /*或者*/
        System.out.println("变量值："+myputty.puttyAge);
    }

}
