package com.pattern.proxy.demo1;

/**
 * @ClassName Main
 * @Description TODO
 * @Date 2019/7/21 23:05
 * @Version 1.0
 **/
public class Main {



  public static void main(String[] args) {
    Printable proxy = new ProxyPrinter();
    proxy.setPrinterName("hp");
    System.out.println("此时代理的名字为："+proxy.getrPrinterName());
    System.out.println("===遇到了代理处理不了的工作，通知服务器处理===");
    proxy.print("hello,world!");
    proxy.setPrinterName("jianeng");
    System.out.println("此时代理的名字为："+proxy.getrPrinterName());
    proxy.print("hello,myself!");

  }


}
