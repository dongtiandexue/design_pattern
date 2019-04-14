package com.dtdx.factory.pizza;

/**
 * @ClassName Pizza
 * @Description 披萨抽象类
 * @Author huawei
 * @Date 2019/4/14 12:48
 * @Version 1.0
 **/
public abstract class Pizza {

    protected String name;

    /**
     * 准备原料：具体由子类实现
     */
    public abstract void prepare();

    /**
     * 烤制
     */
    public void bake(){
        System.out.println(name + " baking;");
    }

    /**
     * 切块
     */
    public void cut(){
        System.out.println(name + " cutting;");
    }

    /**
     * 装箱
     */
    public void box(){
        System.out.println(name + " boxing");
    }

    public void setName(String name){
        this.name = name;
    }
}
