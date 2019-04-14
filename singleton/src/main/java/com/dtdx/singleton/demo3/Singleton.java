package com.dtdx.singleton.demo3;

/**
 * @ClassName Singleton
 * @Description 懒汉式创建单例
 * @Author huawei
 * @Date 2019/4/14 9:46
 * @Version 1.0
 **/
public class Singleton {

    /**
     * 定义属性
     */
    private static Singleton instance = null;

    /**
     * 私有化构造方法
     */
    private Singleton(){}

    /**
     * 提供静态方法获取该实例
     * @return
     */
    public static Singleton getInstance(){

        //判断该实例是否已经创建
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
