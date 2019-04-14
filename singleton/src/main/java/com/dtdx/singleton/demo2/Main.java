package com.dtdx.singleton.demo2;

import com.dtdx.singleton.demo1.Singleton;

/**
 * @ClassName Main
 * @Description TODO
 * @Author huawei
 * @Date 2019/4/14 9:32
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        StaticInnerClassSingleton demo1 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton demo2 = StaticInnerClassSingleton.getInstance();

        if(demo1 == demo2) {
            System.out.println("是同一个实例");
        }

    }
}
