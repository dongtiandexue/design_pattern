package com.dtdx.factory.abstractfactory;

import com.dtdx.factory.pizza.Drink;
import com.dtdx.factory.pizza.Pizza;

public interface AbstractFactory {

    Pizza createPizza(String ordertype);

    Drink createDrink(String ordertype);

}
