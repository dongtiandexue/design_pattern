package com.dtdx.factory.methodFactory;

import com.dtdx.factory.pizza.BeefPizza;
import com.dtdx.factory.pizza.DurianPizza;
import com.dtdx.factory.pizza.Pizza;

/**
 * @ClassName DalianOrderPizza
 * @Description 大连披萨店
 * @Author huawei
 * @Date 2019/4/14 13:57
 * @Version 1.0
 **/
public class DalianOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String ordertype) {

        if("durian".equals(ordertype)) {
            return new DurianPizza();
        }else if("beef".equals(ordertype)){
            return new BeefPizza();
        }
        return null;
    }
}
