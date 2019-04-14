package com.dtdx.factory.original;

import com.dtdx.factory.pizza.BeefPizza;
import com.dtdx.factory.pizza.Pizza;
import com.dtdx.factory.pizza.SeafoodPizza;
import com.dtdx.factory.pizza.SuperPizza;

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

    public OrderPizza(){
        Pizza pizza = null;
        String ordertype;

        do {
            ordertype = gettype();
            if(ordertype.equals("beef")) {
                pizza = new BeefPizza();
            }else if(ordertype.equals("super")){
                pizza = new SuperPizza();
            }else if(ordertype.equals("seafood")){
                pizza = new SeafoodPizza();
            }else {
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
