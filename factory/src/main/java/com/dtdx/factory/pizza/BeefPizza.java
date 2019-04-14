package com.dtdx.factory.pizza;

/**
 * @ClassName BeefPizza
 * @Description 牛肉披萨
 * @Author huawei
 * @Date 2019/4/14 12:53
 * @Version 1.0
 **/
public class BeefPizza extends Pizza{

    @Override
    public void prepare() {

        super.setName("牛肉披萨");
        System.out.println(name + " prepare;");
    }
}
