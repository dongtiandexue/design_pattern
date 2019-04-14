package com.dtdx.factory.pizza;

/**
 * @ClassName SuperPizza
 * @Description 超级至尊披萨
 * @Author huawei
 * @Date 2019/4/14 12:56
 * @Version 1.0
 **/
public class SuperPizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("超级至尊披萨");
        System.out.println(name + " prepare;");
    }
}
