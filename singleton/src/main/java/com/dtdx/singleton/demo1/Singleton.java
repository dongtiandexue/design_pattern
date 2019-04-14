package com.dtdx.singleton.demo1;

/**
 * @ClassName Singleton
 * @Description 经典饿汉式创建单例
 * @Author huawei
 * @Date 2019/4/14 9:28
 * @Version 1.0
 **/
public class Singleton {

    /**
     * 在类内部实例化一个实例
     */
    private static Singleton INSTANCE = new Singleton();

    /**
     * 私有化构造方法
     */
    private Singleton(){}

    /**
     * 提供一个全局访问的静态方法，获取该实例
     * @return
     */
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
