package com.pattern.composite.company;

/**
 * @ClassName Company
 * @Description 组合对象中的对象声明接口
 * @Date 2019/7/7 15:40
 * @Version 1.0
 **/
public abstract class Company {

  protected String name;

  public Company(String name) {
    this.name = name;
  }

  /**
   * 增加
   */
  abstract void add(Company company);

  /**
   * 移除
   */
  abstract void remove(Company company);

  /**
   * 打印
   */
  abstract void display(int depth);

}
