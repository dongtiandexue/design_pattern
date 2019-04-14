package com.dtdx.factory.simplefactory;

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

    SimpleFactory pizzaFactory;

    public OrderPizza(SimpleFactory pizzaFactory) {
        setFactory(pizzaFactory);
    }

    private void setFactory(SimpleFactory pizzaFactory) {
        Pizza pizza = null;
        String ordertype;

        this.pizzaFactory = pizzaFactory;

        do {
            ordertype = gettype();
//            pizza = pizzaFactory.createPizza(ordertype);
            pizza = EnumFactory.createPizza(ordertype);
            if(pizza == null){
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    /**
     * 获取输入
     * @return
     */
    private String gettype() {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String readLine = reader.readLine();
            return readLine;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
