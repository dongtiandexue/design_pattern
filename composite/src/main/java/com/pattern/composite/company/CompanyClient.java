package com.pattern.composite.company;


/**
 * @ClassName CompanyClient
 * @Description TODO
 * @Date 2019/7/7 15:57
 * @Version 1.0
 **/
public class CompanyClient {

  public static void main(String[] args) {
    ConcreteCompany root = new ConcreteCompany("北京总公司");
    root.add(new Department("总公司人力资源部"));
    root.add(new Department("总公司人力财务部"));

    ConcreteCompany huadong = new ConcreteCompany("上海华东分公司");
    huadong.add(new Department("华东分公司人力资源部"));
    huadong.add(new Department("华东分公司人力财务部"));
    root.add(huadong);

    ConcreteCompany nanjing = new ConcreteCompany("南京办事处");
    nanjing.add(new Department("南京办事处人力资源部"));
    nanjing.add(new Department("南京办事处人力财务部"));
    huadong.add(nanjing);

    ConcreteCompany suzhou = new ConcreteCompany("苏州办事处");
    suzhou.add(new Department("苏州办事处人力资源部"));
    suzhou.add(new Department("苏州办事处人力财务部"));
    huadong.add(suzhou);

    System.out.println("=======组织结构图=======");
    root.display(1);

  }

}
