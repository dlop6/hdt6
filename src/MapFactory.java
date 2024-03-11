package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapFactory {
    public static <K, V> Map<K, V> createMap(int type) {
        if (type == 1) {
            return new HashMap<>();
        } else if (type == 2) {
            return new TreeMap<>();
        } else if (type == 3) {
            return new LinkedHashMap<>();
        } else {
            return null;
        }
    }
}