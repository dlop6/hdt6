package com;

import java.io.IOException;
import java.util.Map;

import com.MapFiles.MapFactory;
import com.MapFiles.MapsImplementations;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PruebaLinked {private MapsImplementations hashMapImplementation;

    @Before
    public void setUp() throws IOException {
        // Creamos una instancia de LinkedHashmapImplementation utilizando MapFactory
        hashMapImplementation = MapFactory.createMapImplementation(3);
    }
    
    @Test
    public void testGetUniqueValues() {
        // Agregamos algunas cartas
        hashMapImplementation.addCard("Carta2");
        hashMapImplementation.addCard("Carta3");
        hashMapImplementation.addCard("Carta4");
        
        // Obtenemos los valores únicos (tipos de cartas)
        hashMapImplementation.getUniqueValues();
        
        // Verificamos que la cantidad de valores únicos sea la esperada
        Map<String, String> cards = hashMapImplementation.cards;
        assertTrue(cards.containsValue("Monstruo"));
        assertTrue(cards.containsValue("Hechizo"));
        assertTrue(cards.containsValue("Trampa"));
    }
    }