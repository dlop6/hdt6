package com;

public interface MapMethods {
    public void put(String key, String value);

    public String get(String key);

    public void countAll();

    public void countCollection();

    public <T> void sortAll(T key);

    public <T> void sortCollection(T key);

}


