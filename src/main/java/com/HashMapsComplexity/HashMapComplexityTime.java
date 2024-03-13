package com.HashMapsComplexity;

import java.util.HashMap;
import java.util.Map;

import com.FileReader.TextFileCardReader;
import com.MapFiles.MapFactory;
import com.MapFiles.MapsImplementations;

import java.io.IOException;

public class HashMapComplexityTime {

    MapsImplementations hashMap = MapFactory.createMapImplementation(1);
    ;

    public void  medirComplejidadTiempo(){
        TextFileCardReader textFileCardReader = new TextFileCardReader();
        
        try {
            hashMap.Map = textFileCardReader.readCards("src\\main\\java\\com\\FileReader\\cards_desc.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long startTime = System.nanoTime();
        for (Map.Entry<String, String> entry : hashMap.Map.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + " Tipo: " + entry.getValue());
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        double segundos = (double)duration / 1000000000.0;
        System.out.println("-----------------------------------------------")  ;
        System.out.println("Tiempo de ejecución de HashMap en nanosegundos: " + duration );
        System.out.println("Tiempo de ejecución de HashMap en segundos: " + segundos);
    }

    public static void main(String[] args) {
        HashMapComplexityTime hashMapComplexityTime = new HashMapComplexityTime();
        hashMapComplexityTime.medirComplejidadTiempo();
    }

    




    
}
