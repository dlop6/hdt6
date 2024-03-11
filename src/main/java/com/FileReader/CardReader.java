package com.FileReader;

import java.io.IOException;
import java.util.Map;

// Interfaz para el lector de archivos
public interface CardReader {
    Map<String, String> readCards(String filename) throws IOException;
}
