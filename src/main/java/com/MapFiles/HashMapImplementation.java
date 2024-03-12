package com.MapFiles;

import java.io.IOException;
import java.util.HashMap;

public class HashMapImplementation extends MapsImplementations {

    private HashMap<String, String> hashMap = new HashMap<>();

    public HashMapImplementation() throws IOException {
        super();
        Map = hashMap;
    }

    public void countAll() {
        System.out.println("La cantidad de cartas disponibles en tu colección es: " + hashMap.size());

        for (String key : hashMap.keySet()) {
            System.out.println("Nombre: " + key);
            System.out.println("Tipo: " + hashMap.get(key));
        }
    }
}
