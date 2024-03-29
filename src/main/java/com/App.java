package com;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.MapFiles.MapFactory;
import com.MapFiles.MapsImplementations;

public class App {

    public static MapsImplementations map;
    public static boolean isRunning = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a tu colección de cartas!");
        System.out.println("Elige el tipo de mapa que deseas utilizar:");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");

        int type = scanner.nextInt();

        switch (type) {
            case 1:
                System.out.println("Has seleccionado HashMap");
                map = MapFactory.createMapImplementation(type);
                break;
            case 2:
                System.out.println("Has seleccionado TreeMap");
                map = MapFactory.createMapImplementation(type);
                break;
            case 3:
                System.out.println("Has seleccionado LinkedHashMap");
                map = MapFactory.createMapImplementation(type);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        while (isRunning) {
            System.out.println("-------------------------------------------------");
            System.out.println("Elige una opción:");
            System.out.println("1. Agregar carta de las cartas disponibles");
            System.out.println("2. Ver tipos de carta de la colección disponible");
            System.out.println("3. Mostrar nombre, tipo y cantidad de cartas de mi colección");
            System.out.println("4. Mostrar nombre, tipo y cantidad de cartas de mi colección ordenadas por tipo");
            System.out.println("5. Mostrar nombre, tipo y cantidad de cartas de todas las cartas disponibles");
            System.out.println("6. Mostrar nombre y tipo de todas las cartas disponibles ordenadas por tipo");
            System.out.println("7. Salir");
            try {
                int option = scanner.nextInt();
                scanner.nextLine(); 

                switch (option) {
                    case 1:
                        System.out.println("Ingresa el nombre de la carta:");
                        String name = scanner.nextLine();
                        map.addCard(name);
                        break;
                    case 2:
                        System.out.println("Tipos de carta de la colección disponible:");
                        map.getUniqueValues();
                        
                        break;
                    case 3:
                        System.out.println("Nombre, tipo y cantidad de cartas de mi colección:");
                        map.countCollection(map.Map);
                        break;
                    case 4:
                        System.out.println("Nombre, tipo y cantidad de cartas de mi colección ordenadas por tipo:");
                        // TODO: Implement logic to display name, type, and quantity of cards in the collection sorted by type
                        break;
                    case 5:
                        System.out.println("Nombre, tipo y cantidad de cartas de todas las cartas disponibles:");
                        map.countCollection(map.cards);
                        break;
                    case 6:
                        System.out.println("Nombre y tipo de todas las cartas disponibles ordenadas por tipo:");
                        // TODO: Implement logic to display name and type of all available cards sorted by type
                        break;
                    case 7:
                        System.out.println("Adiós!");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción no válida");
                scanner.nextLine(); // Clear the input buffer
            }
        }
    }
}
