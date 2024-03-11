package com;


import java.util.TreeMap;

public class TreeMapImplementation<K, V> implements  MapMethods {

    TreeMap<String, String> treeMap = new TreeMap<>();

    @Override
    public void put(String key, String value) {
        treeMap.put(key, value);

        throw new UnsupportedOperationException("Unimplemented method 'put'");
    }

    @Override
    public String get(String key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void countAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countAll'");
    }

    @Override
    public void countCollection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countCollection'");
    }

    @Override
    public <T> void sortAll(T key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortAll'");
    }

    @Override
    public <T> void sortCollection(T key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortCollection'");
    }

}