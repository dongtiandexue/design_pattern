package com.dtdx.factory.simplefactory;

import com.dtdx.factory.pizza.BeefPizza;
import com.dtdx.factory.pizza.Pizza;
import com.dtdx.factory.pizza.SeafoodPizza;
import com.dtdx.factory.pizza.SuperPizza;

/**
 * @ClassName SimpleFactory
 * @Description pizza订单工厂
 * @Author huawei
 * @Date 2019/4/14 13:09
 * @Version 1.0
 **/
public class SimpleFactory {

    /**
     * 使用订单工厂创建pizza
     * @param ordertype
     * @return
     */
    public Pizza createPizza(String ordertype) {
        Pizza pizza = null;
        if(ordertype.equals("beef")) {
            pizza = new BeefPizza();
        }else if(ordertype.equals("super")){
            pizza = new SuperPizza();
        }else if(ordertype.equals("seafood")){
            pizza = new SeafoodPizza();
        }
        return pizza;
    }
}
