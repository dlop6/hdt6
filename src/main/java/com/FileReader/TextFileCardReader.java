package com.FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Implementación de lector de archivos
public class TextFileCardReader implements CardReader {
    @Override
    public Map<String, String> readCards(String filename) throws IOException {
        Map<String, String> cards = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Dividir la línea en partes utilizando el carácter '|' como delimitador
                String[] parts = line.split("\\|");
                if (parts.length == 2) {
                    // Almacenar el nombre de la carta como clave y su tipo como valor en el HashMap
                    String cardName = parts[0].trim();
                    String cardType = parts[1].trim();
                    cards.put(cardName, cardType);
                }
            }
        }
        return cards;
    }
}
