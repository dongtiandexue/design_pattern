package com.pattern.composite.file;

/**
 * @ClassName Filer
 * @Description 文件节点
 * @Date 2019/7/7 16:07
 * @Version 1.0
 **/
public class Filer extends Node {

  public Filer(String name) {
    super(name);
  }

  @Override
  void display() {
    System.out.println(name);
  }
}
