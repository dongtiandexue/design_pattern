package com.dtdx.factory.abstractfactory;

import com.dtdx.factory.pizza.Drink;
import com.dtdx.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description 不使用工厂模式实现pizza下单功能
 * @Author huawei
 * @Date 2019/4/14 12:47
 * @Version 1.0
 **/
public class OrderPizza {

    AbstractFactory factory;

    public OrderPizza(AbstractFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbstractFactory factory) {
        Pizza pizza = null;
        Drink drink = null;
        String pizza_order;
        String drink_order;

        this.factory = factory;

        do {
            System.out.println("请输入披萨名称:");
            pizza_order = gettype();
            //披萨
            pizza = factory.createPizza(pizza_order);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }

            //饮料
            System.out.println("请输入饮料名称:");
            drink_order = gettype();
            drink = factory.createDrink(drink_order);

        }while (true);
    }

    /**
     * 获取输入
     * @return
     */
    private String gettype() {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String readLine = reader.readLine();
            return readLine;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
