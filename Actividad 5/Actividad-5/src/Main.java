public class Main {
    public static void main(String[] args) {
        float op1;
        float op2;
        float op3;
        float op4;
        int valor1 = 10;
        int valor2 = 2;
        int valor3 = 7;

        op1 = valor1 + valor2 - valor3;
        op2 = valor1 * (valor2 - valor3);
        op3 = valor1 * valor2 * valor3;
        op4 = (valor3/valor1) + valor2;

        System.out.printf("""
            Primer valor = %d
            Segundo valor = %d
            Tercer valor = %d%n
            Primera operación = %.1f
            Segunda operación = %.1f
            Tercera operación = %.1f
            Cuarta operación = %.1f
            """, valor1, valor2, valor3, op1, op2, op3, op4);
    }
}