package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import java.util.Map;

public class MapFactory {
    public static Map<String, String> createMap(int type) {
        if (type == 1) {
            return new HashMap<String, String>();
        } else if (type == 2) {
            return new TreeMap<String, String>();
        } else if (type == 3) {
            return new LinkedHashMap<String, String>();
        } else {
            return null;
        }
    }
}
