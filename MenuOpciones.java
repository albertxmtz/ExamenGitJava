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
<<<<<<< Updated upstream
                    System.out.println("Funcionalidad no implementada aún.");
=======
                    System.out.print("Ingrese la primera palabra: ");
                    String palabra1 = scanner.nextLine();
                    System.out.print("Ingrese la segunda palabra: ");
                    String palabra2 = scanner.nextLine();
                    System.out.println("Resultado: " + palabra1 + palabra2); }
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
                    break;
                case 2:
                    System.out.print("Ingrese una frase: ");
                    String frase = scanner.nextLine();
                    System.out.print("Ingrese una letra: ");
                    char letra = scanner.nextLine().charAt(0);
                    int contador = 0;
                    break;
                case 3:
                    System.out.println("Funcionalidad no implementada aún.");
                    break;
                case 4:
                    salir = true;
                    System.out.print("¿Está seguro de que desea salir? (S/N): ");
                    String respuesta = scanner.nextLine().trim().toUpperCase();
                    return respuesta.equals("S");

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
