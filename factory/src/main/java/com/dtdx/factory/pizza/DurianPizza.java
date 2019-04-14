package com.dtdx.factory.pizza;

/**
 * @ClassName DurianPizza
 * @Description TODO
 * @Author huawei
 * @Date 2019/4/14 14:00
 * @Version 1.0
 **/
public class DurianPizza extends Pizza {

    @Override
    public void prepare() {

        super.setName("榴莲披萨");
        System.out.println(name + " prepare;");
    }
}
