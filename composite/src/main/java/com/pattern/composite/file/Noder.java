package com.pattern.composite.file;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Noder
 * @Description TODO
 * @Date 2019/7/7 16:08
 * @Version 1.0
 **/
public class Noder extends Node {

  private List<Node> childNodes = new ArrayList<>();

  public Noder(String name) {
    super(name);
  }

  @Override
  void addNode(Node node) throws Exception {
    childNodes.add(node);
  }

  @Override
  void display() {
    System.out.println(name);
    for (Node childNode : childNodes) {
      childNode.display();
    }
  }
}
