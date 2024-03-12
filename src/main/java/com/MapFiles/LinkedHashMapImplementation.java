package com.MapFiles;

import java.io.IOException;
import java.util.LinkedHashMap;

public class LinkedHashMapImplementation extends MapsImplementations {

    private LinkedHashMap<String, String> linkedHashMap;

    public LinkedHashMapImplementation() throws IOException {
        super();
        linkedHashMap = new LinkedHashMap<>();
        Map = linkedHashMap;
    }

    public void countAll() {
        System.out.println("La cantidad de cartas disponibles en tu colección es: " + linkedHashMap.size());

        for (String key : linkedHashMap.keySet()) {
            System.out.println("-----------------------------------------------");
            System.out.println("Nombre: " + key);
            System.out.println("Tipo: " + linkedHashMap.get(key));
        }
    }
}
