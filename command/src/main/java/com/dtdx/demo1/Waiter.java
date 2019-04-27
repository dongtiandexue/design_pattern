package com.dtdx.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Waiter
 * @Description TODO
 * @Date 2019/4/27 16:15
 * @Version 1.0
 **/
public class Waiter {

    private List<Command> command = new ArrayList<Command>();

    /**
     * 新增订单
     *
     * @param command
     */
    public void addOrder(Command command) {
        this.command.add(command);
    }

    /**
     * 修改订单
     * @param command
     */
    public void delOrder(Command command){
        this.command.remove(command);
    }

    /**
     * 通知后厨烤肉
     */
    public void msg() {
        for (Command com : command) {
            com.excute();
        }
    }
}
