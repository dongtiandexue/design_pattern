package com.dtdx.singleton.demo4;

/**
 * @ClassName Singleton
 * @Description 认为式线程安全的懒汉式（其实还是有问题）
 * @Author huawei
 * @Date 2019/4/14 9:54
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
    private Singleton() {
    }

    /**
     * 提供静态方法获取该实例
     *
     * @return
     */
    public static Singleton getInstance() {

        //判断该实例是否已经创建
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
