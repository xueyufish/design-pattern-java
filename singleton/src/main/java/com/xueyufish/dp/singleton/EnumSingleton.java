
package com.xueyufish.dp.singleton;

/**
 * 枚举方式
 *
 * @author xueyufish
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