package com.dtdx.factory.pizza;

/**
 * @ClassName SeafoodPizza
 * @Description TODO
 * @Author huawei
 * @Date 2019/4/14 12:57
 * @Version 1.0
 **/
public class SeafoodPizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("海鲜披萨");
        System.out.println(name + " prepare;");
    }
}
