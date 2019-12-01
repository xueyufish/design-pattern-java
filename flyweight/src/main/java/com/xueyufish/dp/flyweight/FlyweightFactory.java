
package com.xueyufish.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xueyufish
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> flyweights = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
            return flyweight;
        }
    }

    public static int size() {
        return flyweights.size();
    }

}
