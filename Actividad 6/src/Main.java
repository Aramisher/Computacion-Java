public class Main {
    public static class Alumno {

        // Atributos
        private String nombre;
        private double[] calificaciones;

        // Constructor
        public Alumno(String nombre, double[] calificaciones) {
            this.nombre = nombre;
            this.calificaciones = calificaciones;
        }

        // Método para calcular el promedio
        public double calcularPromedio() {
            double suma = 0;
            for (double calificacion : calificaciones) {
                suma += calificacion;
            }
            return suma / calificaciones.length;
        }

        // Método para obtener la calificación final
        public char obtenerCalificacionFinal(double promedio) {
            if (promedio <= 50) {
                return 'F';
            } else if (promedio <= 60) {
                return 'E';
            } else if (promedio <= 70) {
                return 'D';
            } else if (promedio <= 80) {
                return 'C';
            } else if (promedio <= 90) {
                return 'B';
            } else {
                return 'A';
            }
        }

        // Método para imprimir los resultados
        public void imprimirResultados() {
            double promedio = calcularPromedio();
            char calificacionFinal = obtenerCalificacionFinal(promedio);

            System.out.println("Nombre del estudiante: " + nombre);
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
            }
            System.out.println("Promedio: " + promedio);
            System.out.println("Calificación: " + calificacionFinal);
        }

        // Método principal para probar la clase
        public static void main(String[] args) {
            double[] notas = {55, 50, 60, 58, 52};
            Alumno alumno = new Alumno("Juan Pérez", notas);
            alumno.imprimirResultados();
        }
    }

}