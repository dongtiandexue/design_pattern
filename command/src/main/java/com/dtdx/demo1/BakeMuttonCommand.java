package com.dtdx.demo1;

/**
 * @ClassName BakeMuttonCommand
 * @Description 具体的实现：烤羊肉串
 * @Date 2019/4/27 16:13
 * @Version 1.0
 **/
public class BakeMuttonCommand implements Command {

    public Barbecuer barbecuer;

    public BakeMuttonCommand(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    public void excute() {
        barbecuer.BakeMutton();
    }
}
