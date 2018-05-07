package com.xueyufish.dp.singleton;

/**
 * @author xueyufish
 *
 * Created at 2018-03-26
 */

public enum EnumSingleton {

  RESOURCE;

  private Resource resource;

  EnumSingleton() {
    resource = new Resource();
  }

  public Resource getResource() {
    return resource;
  }
}

class Resource {

}