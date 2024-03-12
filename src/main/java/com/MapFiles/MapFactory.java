package com.MapFiles;

import java.io.IOException;

public class MapFactory {

    public static MapsImplementations createMapImplementation(int type) {
    try {
        switch (type) {
            case 1:
                return new HashMapImplementation();
            case 2:
                return new TreeMapImplementation();
            case 3:
                return new LinkedHashMapImplementation();
            default:
                throw new IllegalArgumentException("Invalid map implementation type: " + type);
        }
    } catch (IOException e) {
        e.printStackTrace(); 
        return null; 
    }
}

}