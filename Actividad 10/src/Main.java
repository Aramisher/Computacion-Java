import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);

            System.out.print("Ingresa el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.print("Ingresa la operación (+, -, *, /): ");
            String operacion = scanner.next();

            double resultado;

            switch (operacion) {
                case "+":
                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "/":
                    if (numero2 == 0) {
                        throw new ArithmeticException("No se puede dividir entre cero.");
                    }
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    throw new IllegalArgumentException("Operación inválida: " + operacion);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa solo números válidos.");
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner cerrado correctamente.");
            }
        }
    }
}
