package com.dtdx.factory.methodFactory;

import com.dtdx.factory.pizza.*;

/**
 * @ClassName ShanghaiOrderPizza
 * @Description 上海披萨店
 * @Author huawei
 * @Date 2019/4/14 14:03
 * @Version 1.0
 **/
public class ShanghaiOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String ordertype) {
        if("super".equals(ordertype)) {
            return new SuperPizza();
        }else if("seafood".equals(ordertype)){
            return new SeafoodPizza();
        }
        return null;
    }
}
