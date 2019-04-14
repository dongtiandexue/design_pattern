package com.dtdx.singleton.demo3;

/**
 * @ClassName Main
 * @Description TODO
 * @Author huawei
 * @Date 2019/4/14 9:49
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
//        Singleton demo1 = Singleton.getInstance();
//        Singleton demo2 = Singleton.getInstance();
//        System.out.println(demo1);
//        System.out.println(demo2);

        for (int i = 0; i < 10; i++) {
            new Thread(() ->{
                for (int i1 = 0; i1 < 10; i1++) {
                    Singleton demo = Singleton.getInstance();
                    System.out.println(demo);
                }
            }).start();
        }
    }
}
