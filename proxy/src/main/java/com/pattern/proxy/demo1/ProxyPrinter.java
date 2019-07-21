package com.pattern.proxy.demo1;

/**
 * @ClassName ProxyPrinter
 * @Description TODO
 * @Date 2019/7/21 23:02
 * @Version 1.0
 **/
public class ProxyPrinter implements Printable {

  String name;

  Printer printer = null;

  public void setPrinterName(String name) {
    if (printer != null) {
      printer.setPrinterName(name);
    }
    this.name = name;
  }

  public String getrPrinterName() {
    return name;
  }

  public void print(String word) {
    check();
    printer.print(word);
  }

  private void check() {
    if (printer == null) {
      printer = new Printer(name);
    }
  }
}
