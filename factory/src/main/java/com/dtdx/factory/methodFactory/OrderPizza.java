package com.dtdx.factory.methodFactory;

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
public abstract class OrderPizza {


    public OrderPizza() {
        Pizza pizza = null;
        String ordertype;

        do {
            ordertype = gettype();
            pizza = createPizza(ordertype);
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
     * 创建pizza由子类具体实现
     * @param ordertype
     * @return
     */
    abstract Pizza createPizza(String ordertype);

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
