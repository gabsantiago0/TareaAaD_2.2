package Ejercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        System.out.println("Programa de Gestión Rural");


        while (bandera) {
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
                            if (OperacionesBasicasGranja.crearGranjero(deConsolaAgregarGranjero())) {
                                System.out.println("El granjero ha sido creado correctamente.");
                            } else {
                                System.out.println("El granjero no se ha podido crear.");
                            }
                            break;
                        case 2:
                            System.out.println("CREA una nueva CONSTRUCCION: ");
                            OperacionesBasicasGranja.crearConstruccion(deConsolaAgregarConstruccion());
                            if (OperacionesBasicasGranja.crearGranjero(deConsolaAgregarGranjero())) {
                                System.out.println("La CONSTRUCCIÓN ha sido creada correctamente.");
                            } else {
                                System.out.println("La CONSTRUCCIÓN no se ha podido crear.");
                            }
                            break;
                        case 3:
                            System.out.println("CREA un nuevo TRACTOR: ");
                            OperacionesBasicasGranja.crearTractor(deConsolaAgregarTractor());
                            if (OperacionesBasicasGranja.crearTractor(deConsolaAgregarTractor())) {
                                System.out.println("El TRACTOR ha sido creado correctamente.");
                            } else {
                                System.out.println("El tractor no se ha podido crear.");
                            }
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
                            System.out.println("MODIFICA un GRANJERO: ");
                            OperacionesBasicasGranja.modificarGranjero(deConsolaAgregarGranjero());
                            if (OperacionesBasicasGranja.modificarGranjero(deConsolaAgregarGranjero())) {
                                System.out.println("El GRANJERO ha sido MODIFICADO correctamente.");
                            } else {
                                System.out.println("El GRANJERO no ha sido MODIFICADO correctamente.");
                            }
                            break;
                        case 2:
                            System.out.println("MODIFICA una CONSTRUCCIÓN: ");
                            OperacionesBasicasGranja.modificarConstrucion(deConsolaAgregarConstruccion());
                            if (OperacionesBasicasGranja.modificarConstrucion(deConsolaAgregarConstruccion())) {
                                System.out.println("La CONSTRUCCIÓN ha sido MODIFICADO correctamente.");
                            } else {
                                System.out.println("La CONSTRUCCIÓN no ha sido MODIFICADO correctamente.");
                            }
                            break;
                        case 3:
                            System.out.println("MODIFICA un TRACTOR: ");
                            OperacionesBasicasGranja.modificarTractor(deConsolaAgregarTractor());
                            if (OperacionesBasicasGranja.modificarTractor(deConsolaAgregarTractor())) {
                                System.out.println("El TRACTOR ha sido MODIFICADO correctamente.");
                            } else {
                                System.out.println("El TRACTOR no ha sido MODIFICADO correctamente.");
                            }
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Elige una opción para ELIMINAR:\n" +
                            "1. GRANJERO\n" +
                            "2. CONSTRUCCIÓN\n" +
                            "3. TRACTOR\n");

                    opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion) {
                        case 1:
                            System.out.println("ELIMINA un GRANJERO: ");
                            OperacionesBasicasGranja.eliminarGranjero(deConsolaAgregarGranjero());
                            if (OperacionesBasicasGranja.eliminarGranjero(deConsolaAgregarGranjero())) {
                                System.out.println("El GRANJERO ha sido ELIMINADO correctamente.");
                            } else {
                                System.out.println("El GRANJERO no ha sido ELIMINADO correctamente.");
                            }
                            break;
                        case 2:
                            System.out.println("ELIMINA una CONSTRUCCIÓN: ");
                            OperacionesBasicasGranja.eliminarConstruccion(deConsolaAgregarConstruccion());
                            if (OperacionesBasicasGranja.eliminarConstruccion(deConsolaAgregarConstruccion())) {
                                System.out.println("La CONSTRUCCIÓN ha sido ELIMINADO correctamente.");
                            } else {
                                System.out.println("La CONSTRUCCIÓN no ha sido ELIMINADO correctamente.");
                            }
                            break;
                        case 3:
                            System.out.println("ELIMINA un TRACTOR: ");
                            OperacionesBasicasGranja.eliminarTractor(deConsolaAgregarTractor());
                            if (OperacionesBasicasGranja.eliminarTractor(deConsolaAgregarTractor())) {
                                System.out.println("El TRACTOR ha sido ELIMINA correctamente.");
                            } else {
                                System.out.println("El TRACTOR no ha sido ELIMINA correctamente.");
                            }
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Elige una opción para CONSULTAR:\n" +
                            "1. GRANJERO\n" +
                            "2. CONSTRUCCIÓN\n" +
                            "3. TRACTOR\n");

                    opcion = Integer.parseInt(sc.nextLine());
                    switch (opcion) {
                        case 1:
                            System.out.println("CONSULTA un GRANJERO: ");
                            System.out.println("Introduce el ID del GRANJERO: ");
                            int id_G = sc.nextInt();
                            OperacionesBasicasGranja.datosDeUnGranjero(id_G);
                        case 2:
                            System.out.println("CONSULTA una CONSTRUCCIÓN: ");
                            System.out.println("Introduce el ID de la CONSTRUCCIÓN: ");
                            int id_C = sc.nextInt();
                            OperacionesBasicasGranja.datosDeUnaConstruccion(id_C);
                            break;
                        case 3:
                            System.out.println("CONSULTA un TRACTOR: ");
                            System.out.println("Introduce el ID del TRACTOR: ");
                            int id_T = sc.nextInt();
                            //OperacionesBasicasGranja.datosDeUnTractor(id_T);
                            break;
                    }
                    break;

                case 5:
                    bandera = false;
                    break;
            }
        }
    }

    //METODOS PARA AÑANDIR:

    //Metodo que te pide una serie de parametros y construye un Granjero
    private static Granjero deConsolaAgregarGranjero() {
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

        return new Granjero(id, nombre, descripcion, dinero, puntos, nivel);
    }

    private static Construccion deConsolaAgregarConstruccion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un ID númerico:");
        int id = scanner.nextInt();

        System.out.println("Introduce un NOMBRE:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce un PRECIO");
        int precio = scanner.nextInt();

        System.out.println("Introduce el ID DEL GRANJERO:");
        int id_Granjero = scanner.nextInt();


        return new Construccion(id, nombre, precio, id_Granjero);
    }

    private static Tractor deConsolaAgregarTractor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un ID númerico:");
        int id = scanner.nextInt();

        System.out.println("Introduce el TIPO DE TRACTOR:");
        TipoTractor tipo = TipoTractor.valueOf(scanner.nextLine());

        System.out.println("Introduce una VELOCIDAD:");
        int velocidad = scanner.nextInt();

        System.out.println("Introduce un PRECIO DE VENTA:");
        float precio_venta = scanner.nextFloat();

        System.out.println("Introduce la fecha de la PRÓXIMA COSECHA:");
        String proxima_coesacha = scanner.nextLine();

        System.out.println("Introduce la ID DE LA CONSTRUCCIÓN:");
        int id_construccion = scanner.nextInt();


        return new Tractor(id, tipo, velocidad, precio_venta, proxima_coesacha, id_construccion);
    }

}