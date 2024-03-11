package com.MapFiles;

import java.io.IOException;
import java.util.TreeMap;

public class TreeMapImplementation extends MapsImplementations {

    TreeMap<String, String> treeMap = new TreeMap<>();

    // Constructor
    public TreeMapImplementation() throws IOException {
        super();
        Map = treeMap;
    }

    public void countAll() {
        System.out.println("La cantidad de cartas disponibles en tu colección es: " + treeMap.size());

        for (String key : treeMap.keySet()) {
            System.out.println("Nombre: " + key );
            System.out.println("Nombre: " + key + " Tipo: " + treeMap.get(key));
        }
    }
}
