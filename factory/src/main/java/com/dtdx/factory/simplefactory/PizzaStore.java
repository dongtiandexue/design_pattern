package com.dtdx.factory.simplefactory;

/**
 * @ClassName PizzaStore
 * @Description 披萨店
 * @Author huawei
 * @Date 2019/4/14 13:04
 * @Version 1.0
 **/
public class PizzaStore {

    public static void main(String[] args) {
        OrderPizza pizza = new OrderPizza(new SimpleFactory());
    }
}
