package com.dtdx.factory.simplefactory;

import com.dtdx.factory.pizza.BeefPizza;
import com.dtdx.factory.pizza.Pizza;
import com.dtdx.factory.pizza.SeafoodPizza;
import com.dtdx.factory.pizza.SuperPizza;

/**
 * @ClassName EnumFactory
 * @Description TODO
 * @Author huawei
 * @Date 2019/4/14 13:30
 * @Version 1.0
 **/
public enum EnumFactory {

    BEEF(new BeefPizza(),"beef"),
    SEAFOOD(new SeafoodPizza(),"seafood"),
    SUPER(new SuperPizza(),"super");

    private Pizza pizza;
    private String ordertype;

    private EnumFactory(Pizza pizza,String ordertype){
        this.pizza = pizza;
        this.ordertype = ordertype;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    /**
     * 普通静态方法获取Pizza实例
     * @param ordertype
     * @return
     */
    public static Pizza createPizza(String ordertype){
        for (EnumFactory value : EnumFactory.values()) {
            if(value.getOrdertype().equals(ordertype)) {
                return value.getPizza();
            }
        }
        return null;

    }

}
