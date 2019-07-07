package com.pattern.composite.company;

/**
 * @ClassName Department
 * @Description 部门
 * @Date 2019/7/7 15:52
 * @Version 1.0
 **/
public class Department extends Company {

  public Department(String name) {
    super(name);
  }

  @Override
  void add(Company company) {

  }

  @Override
  void remove(Company company) {

  }

  @Override
  void display(int depth) {
    for (int i = 0; i < depth; i++) {
      System.out.print("-");
    }
    System.out.println(name);

  }
}
