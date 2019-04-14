package com.dtdx.factory.pizza;

/**
 * @ClassName Drink
 * @Description TODO
 * @Author huawei
 * @Date 2019/4/14 14:14
 * @Version 1.0
 **/
public abstract class Drink {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void drink(){
        System.out.println(name + " drinking");
    }
}
