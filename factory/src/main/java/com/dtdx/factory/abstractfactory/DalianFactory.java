package com.dtdx.factory.abstractfactory;

import com.dtdx.factory.pizza.*;

/**
 * @ClassName DalianFactory
 * @Description TODO
 * @Author huawei
 * @Date 2019/4/14 14:24
 * @Version 1.0
 **/
public class DalianFactory implements AbstractFactory {

    /**
     * 生产披萨
     * @param ordertype
     * @return
     */
    public Pizza createPizza(String ordertype) {
        if("durian".equals(ordertype)) {
            return new DurianPizza();
        }else if("beef".equals(ordertype)){
            return new BeefPizza();
        }
        return null;
    }

    /**
     * 生产饮料
     * @param ordertype
     * @return
     */
    public Drink createDrink(String ordertype) {
        if("baishi".equals(ordertype)) {
            return new BaishiDrink();
        }else if("coca_cola".equals(ordertype)){
            return new CocaColaDrink();
        }
        return null;
    }
}
