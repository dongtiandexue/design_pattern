package com.pattern.composite.file;

import java.io.File;

/**
 * @ClassName FileClient
 * @Description TODO
 * @Date 2019/7/7 16:10
 * @Version 1.0
 **/
public class FileClient {

  private static final String FILE_PATH = "D:\\Downloads\\video";

  public static void main(String[] args) {
    Node noder = new Noder(FILE_PATH);
    try {
      createTree(noder);
    } catch (Exception e) {
      e.printStackTrace();
    }
    noder.display();

  }

  public static void createTree(Node node) throws Exception {
    File file = new File(node.name);
    File[] files = file.listFiles();
    for (File childFile : files) {
      if(childFile.isFile()){
        Filer filer = new Filer(childFile.getAbsolutePath());
        node.addNode(filer);
      }
      if(childFile.isDirectory()){
        Noder noder = new Noder(childFile.getAbsolutePath());
        node.addNode(node);
        createTree(noder);
      }
    }
  }

}
