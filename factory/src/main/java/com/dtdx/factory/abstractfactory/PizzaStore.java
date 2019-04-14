package com.dtdx.factory.abstractfactory;

/**
 * @ClassName PizzaStore
 * @Description TODO
 * @Author huawei
 * @Date 2019/4/14 14:26
 * @Version 1.0
 **/
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza pizza = new OrderPizza(new DalianFactory());
    }
}
