package com.PorTipo;

import com.MapFiles.MapsImplementations;
import java.io.IOException;
import java.util.Map;

public class sortByType extends MapsImplementations {

    public sortByType(Map<String, String> map) throws IOException {
        super();
        this.Map = map;
    }

    public void SorterType() {
        System.out.println("Cartas ordenadas por tipo:");

        // Iterar sobre las claves del mapa
        for (String key : Map.keySet()) {
            // Obtener el tipo de la carta
            String type = Map.get(key);
            
            // Imprimir la carta solo si el tipo es Monstruo, Hechizo o Trampa
            if (type.equalsIgnoreCase("Monstruo") || type.equalsIgnoreCase("Hechizo") || type.equalsIgnoreCase("Trampa")) {
                System.out.println("Nombre: " + key + " Tipo: " + type);
            }
        }
    }
    
    public void printCardsByType(String cardType) {
        System.out.println("Cartas ordenadas por tipo " + cardType + ":");
        
        for (String key : Map.keySet()) {
            String type = Map.get(key);
            if (type.equalsIgnoreCase(cardType)) {
                System.out.println("Nombre: " + key + " Tipo: " + type);
            }
        }
    }
}
