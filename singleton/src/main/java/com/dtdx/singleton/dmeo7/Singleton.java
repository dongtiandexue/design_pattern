package com.dtdx.singleton.dmeo7;

import java.io.Serializable;

/**
 * @ClassName Singleton
 * @Description 线程安全的懒汉式
 * @Author huawei
 * @Date 2019/4/14 9:54
 * @Version 1.0
 **/
public class Singleton implements Serializable {

    /**
     * 定义属性
     */
    private static volatile Singleton instance = null;

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

    /**
     * 解决反序列化问题
     *
     * @return
     */
    private Object readResolve() {
        return instance;
    }
}
