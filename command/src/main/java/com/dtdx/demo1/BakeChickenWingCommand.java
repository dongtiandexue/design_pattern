package com.dtdx.demo1;

/**
 * @ClassName BakeChickenWingCommand
 * @Description 具体的实现：烤鸡翅
 * @Date 2019/4/27 16:14
 * @Version 1.0
 **/
public class BakeChickenWingCommand implements Command {

    public Barbecuer barbecuer;

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    public void excute() {
        this.barbecuer.BakkeChickenWing();
    }
}
