package com.dtdx.demo1;

/**
 * @ClassName Main
 * @Description TODO
 * @Date 2019/4/27 16:18
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {

        //创建烤肉师傅对象
        Barbecuer barbecuer = new Barbecuer();

        //创建烤鸡翅对象
        BakeChickenWingCommand chickenWingCommand = new BakeChickenWingCommand(barbecuer);

        //创建烤羊肉串对象
        BakeMuttonCommand muttonCommand = new BakeMuttonCommand(barbecuer);

        //创建服务员小姐姐对象
        Waiter girl = new Waiter();

        //客户下单
        girl.addOrder(chickenWingCommand);
        girl.addOrder(muttonCommand);
        girl.msg();
    }
}
