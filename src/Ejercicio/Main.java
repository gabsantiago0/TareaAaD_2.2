package Ejercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean on = true;
        System.out.println("Programa de Gestión Rural");


        while (on) {
            System.out.println("Elige una opción:\n" +
                    "1. Crear\n" +
                    "2. Modificar\n" +
                    "3. Eliminar\n" +
                    "4. Consultar\n" +
                    "5. Salir\n");

            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:

                    System.out.println("Elige una opción para CREAR:\n" +
                            "1. GRANJERO\n" +
                            "2. CONSTRUCCIÓN\n" +
                            "3. TRACTOR\n");

                    opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion) {
                        case 1:
                            System.out.println("CREA un nuevo GRANJERO: ");
                            OperacionesBasicasGranja.crearGranjero(deConsolaAgregarGranjero());
                          if (OperacionesBasicasGranja.crearGranjero(deConsolaAgregarGranjero())){
                              System.out.println("El granjero ha sido creado.");
                          } else  {
                              System.out.println("El granjero no se ha podido crear.");
                          }
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                    }
                    break;

                case 2:
                    System.out.println("Elige una opción para MODIFICAR:\n" +
                            "1. GRANJERO\n" +
                            "2. CONSTRUCCIÓN\n" +
                            "3. TRACTOR\n");

                    opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion) {
                        case 1:
                            System.out.println("b");
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                    }

                    break;

                case 3:
                    System.out.println("Elige una opción para MODIFICAR:\n" +
                            "1. GRANJERO\n" +
                            "2. CONSTRUCCIÓN\n" +
                            "3. TRACTOR\n");

                    opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion) {
                        case 1:
                            System.out.println("c");
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                    }
                    break;

                case 4:
                    System.out.println("Elige una opción para MODIFICAR:\n" +
                            "1. GRANJERO\n" +
                            "2. CONSTRUCCIÓN\n" +
                            "3. TRACTOR\n");

                    opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                    }
                    break;

                case 5:
                    on = false;
                    break;
            }
        }
    }

    private static Granjero deConsolaAgregarGranjero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un ID númerico:");
        int id = scanner.nextInt();
        System.out.println("Introduce un NOMBRE:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce una DESCRIPCION: ");
        String descripcion = scanner.nextLine();
        System.out.println("Introduce una cantidad de DINERO: ");
        int dinero = scanner.nextInt();
        System.out.println("Introduce una cantidad de PUNTOS: ");
        int puntos = scanner.nextInt();
        System.out.println("Introduce un NIVEL: ");
        int nivel = scanner.nextInt();

        return new Granjero(id,nombre,descripcion,dinero,puntos,nivel);
    }

}
