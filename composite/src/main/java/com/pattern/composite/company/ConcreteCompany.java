package com.pattern.composite.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteCompany
 * @Description TODO
 * @Date 2019/7/7 15:44
 * @Version 1.0
 **/
public class ConcreteCompany extends Company {

  private List<Company> childCompanys = new ArrayList<Company>();

  public ConcreteCompany(String name) {
    super(name);
  }

  void add(Company company) {
    childCompanys.add(company);

  }

  void remove(Company company) {
    childCompanys.remove(company);
  }

  void display(int depth) {
    for (int i = 0; i < depth; i++) {
      System.out.print("-");
    }
    System.out.println(name);
    childCompanys.forEach(company -> company.display(depth + 2));
  }

}
