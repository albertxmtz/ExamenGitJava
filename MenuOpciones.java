package examenEntornos;

import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Contar palabras en una frase");
            System.out.println("3. Contar ocurrencias de una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Funcionalidad no implementada aún.");
                    break;
                case 2:
                    System.out.println("Funcionalidad no implementada aún.");
                    break;
                case 3:
                    System.out.println("Funcionalidad no implementada aún.");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
