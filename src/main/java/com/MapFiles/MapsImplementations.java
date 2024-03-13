package com.MapFiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


import com.FileReader.TextFileCardReader;

public abstract class MapsImplementations {

    public Map<String, String> Map;

    public Map<String, String> cards;

    public MapsImplementations() throws IOException {
        TextFileCardReader textFileCardReader = new TextFileCardReader();
        this.cards = textFileCardReader.readCards("src\\main\\java\\com\\FileReader\\cards_desc.txt");
    }

    public void addCard(String key) {
        if (cards.containsKey(key)) {
            Map.put(key, cards.get(key));
            System.out.println("La carta '" + key + "' ha sido agregada al mazo");
        } else {
            System.out.println("La carta no existe");
        }
    }

    public String getCardType(String key) {

        if (Map.size() == 0) {
            System.out.println("No hay cartas en el mazo");
            return null;
        }
        return Map.get(key);
    }

    public void countCollection(Map<String, String> MapToUse) {
        System.out.println("La cantidad de cartas disponibles  es: " + MapToUse.size());

        for (String key : MapToUse.keySet()) {
            System.out.println("-----------------------------------------------");
            System.out.println("Nombre: " + key);
            System.out.println("Tipo: " + MapToUse.get(key));
        }
    }

    public void getUniqueValues() {
        Set<String> hashValues = new HashSet<String>(cards.values());
        ArrayList<String> uniqueValues = new ArrayList<String>(hashValues);

        System.out.println("Hay " + uniqueValues.size() + " tipos de carta en la colección disponible:");
        for (String value : uniqueValues) {
            System.out.println(value);
        }

    
    }
    

}
