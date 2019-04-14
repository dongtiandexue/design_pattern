package com.dtdx.singleton.demo2;

/**
 * @ClassName StaticInnerClassSingleton
 * @Description 静态内部类的方式创建单例
 * @Author huawei
 * @Date 2019/4/14 9:36
 * @Version 1.0
 **/
public class StaticInnerClassSingleton {

    /**
     * 私有化构造方法
     */
    private StaticInnerClassSingleton(){}

    /**
     * 通过内部类获取该对象的实例
     */
    private static class SingletonHolder{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    /**
     * 提供静态方法获取该实例
     * @return
     */
    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
