package Ejercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean on = true;
        System.out.println("Programa de Gestión Rural");


        while (on){
            System.out.println("Elige una opción:\n" +
                    "1. Crear\n" +
                    "2. Modificar\n" +
                    "3. Eliminar\n" +
                    "4. Consultar\n" +
                    "5. Salir\n");
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion){
                case 1:

                    System.out.println("Elige una opción para crear:\n" +
                            "1. GRANJERO\n" +
                            "2. CONSTRACCIÓN\n" +
                            "3. TRACTOR\n");

                    int opcion2 = Integer.parseInt(sc.nextLine());
                    switch (opcion2){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    on=false;
                    break;
            }
        }
    }
}
