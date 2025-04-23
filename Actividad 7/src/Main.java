import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Números del 1 al 100 con while -----");
        mostrarConWhile();

        System.out.println("\n----- Números del 1 al 100 con for -----");
        mostrarConFor();

        System.out.println("\n----- Números del 1 al 100 divisibles entre 2 y 3 -----");
        mostrarDivisibles();

        System.out.println("\n----- Validar número mayor o igual a cero -----");
        validarNumero();
    }

    // Método 1: Usando bucle while
    public static void mostrarConWhile() {
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
    }

    // Método 2: Usando bucle for
    public static void mostrarConFor() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    // Método 3: Mostrar los números del 1 al 100 divisibles entre 2 y 3
    public static void mostrarDivisibles() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Método 4: Leer un número y validar que sea mayor o igual a cero
    public static void validarNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número mayor o igual a 0: ");
            numero = scanner.nextInt();
        } while (numero < 0);

        System.out.println("¡Gracias! El número ingresado es: " + numero);
        scanner.close();
    }
}
