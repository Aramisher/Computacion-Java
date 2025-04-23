import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 4: Pedir cuántos estudiantes desea almacenar
        System.out.print("¿Cuántos estudiantes deseas registrar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Paso 5: Crear el arreglo de objetos Estudiante
        Estudiante[] estudiantes = new Estudiante[cantidad];

        // Paso 4 (continuación): Llenar el arreglo
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            estudiantes[i] = new Estudiante(nombre, edad);
        }

        // Paso 6: Mostrar la información de los estudiantes
        System.out.println("\nLista de estudiantes registrados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println("Edad: " + estudiantes[i].getEdad());
        }

        scanner.close();
    }
}

// Paso 1 y 2: Clase Estudiante con constructor
class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Paso 3: Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
