package com.company.test02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public static void main(String[] args) {
        //创建主人对象
        Master master = new Master();
        //创建狗对象
        Pet dog = new Dog();
        //主人喂狗
        master.feed(dog);
        //创建猫对象
        Pet cat =new Cat();
        //主人喂猫
        master.feed(cat);


    }
}
