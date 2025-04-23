import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numero1 = 0;
        float numero2 = 0;
        boolean entradaValida = false;

        // Solicita y valida los dos números
        while (!entradaValida) {
            try {
                System.out.print("Ingresa el primer número: ");
                numero1 = Float.parseFloat(scanner.nextLine());

                System.out.print("Ingresa el segundo número: ");
                numero2 = Float.parseFloat(scanner.nextLine());

                entradaValida = true; // si no ocurre excepción, los datos son válidos
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingresa números válidos.");
            }
        }

        // Muestra opciones de operaciones
        System.out.println("\nSelecciona la operación que deseas realizar:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Elevar al cuadrado (del primer número)");
        System.out.print("Escribe el número de la opción: ");
        int opcion = scanner.nextInt();

        float resultado;

        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;
            case 5:
                resultado = (float) Math.pow(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}
