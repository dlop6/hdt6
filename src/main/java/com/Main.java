package com;

import java.util.Scanner;
import java.util.Map;

public class Main {

    public static Map<String, String> map;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a tu colección de cartas!");
        System.out.println("Elige el tipo de mapa  que deseas utilizar:");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");

        int type = scanner.nextInt();

        switch (type) {
            case 1:
                System.out.println("Has seleccionado HashMap");
                map = MapFactory.createMap(type);
                break;
            case 2:
                System.out.println("Has seleccionado TreeMap");
                map = MapFactory.createMap(type);
                break;
            case 3:
                System.out.println("Has seleccionado LinkedHashMap");
                map = MapFactory.createMap(type);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        System.out.println("Elige una opción:");
        System.out.println("1. Agregar carta de las cartas disponibles");
        System.out.println("2. Ver  tipoS de carta de la colección disponible");
        System.out.println("3. Mostrar nombre, tipo y cantidad de cartas de mi colección");
        System.out.println("4. Mostrar nombre, tipo y cantidad de cartas de mi colección ordenadas por tipo");
        System.out.println("5. Mostrar nombre, tipo y cantidad de cartas de todas las cartas disponibles");
        System.out.println("6. Mostrar nombre y tipo de todas las cartas disponibles ordenadas por tipo");
        System.out.println("7. Salir");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Ingresa el nombre de la carta:");
                String name = scanner.next();
                System.out.println("Ingresa el tipo de la carta:");
                String typeCard = scanner.next();
                map.put(name, typeCard);
                break;
            case 2:
                System.out.println("Tipo de carta de la colección disponible:");
                break;
            case 3:
                System.out.println("Nombre, tipo y cantidad de cartas de mi colección:");
                
                break;
            case 4:
                System.out.println("Nombre, tipo y cantidad de cartas de mi colección ordenadas por tipo:");
                break;
            case 5:
                System.out.println("Nombre, tipo y cantidad de cartas de todas las cartas disponibles:");
                break;
            case 6:
                System.out.println("Nombre y tipo de todas las cartas disponibles ordenadas por tipo:");
                break;
            case 7:
                System.out.println("Adiós!");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

}
