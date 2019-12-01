
package com.xueyufish.dp.flyweight;

import java.util.stream.Stream;

/**
 * @author xueyufish
 */

public class Client {

    public static void main(String[] args) {
        new Client().test();
    }

    void test() {
        Stream.of("1", "1", "2", "2", "3").forEach(key -> {
            Flyweight flyweight = FlyweightFactory.getFlyweight(key);
            flyweight.operation("test: " + key);
        });

        System.out.println("size: " + FlyweightFactory.size());
    }

}
