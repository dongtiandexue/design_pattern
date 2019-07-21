package com.pattern.proxy.demo1;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Printer
 * @Description TODO
 * @Date 2019/7/21 23:00
 * @Version 1.0
 **/
public class Printer implements Printable {

  private String name;

  public Printer(String name){
    this.name = name;
    heavyWork();
    System.out.println("生成打印机实例成功。。。");
  }

  private void heavyWork() {
    System.out.println("本人："+name);
    try {
      TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void setPrinterName(String name) {
    this.name = name;
  }

  public String getrPrinterName() {
    return name;
  }

  public void print(String word) {
    System.out.println("打印机"+name+"正在打印...");
    System.out.println(word);
    System.out.println("打印完成！");
  }
}
