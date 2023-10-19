public class _01_Aritmeticos {

    public static void main(String[] args) {

        // Los operadores aritméticos son:

        int a=6;
        int b=2;

        // +: Suma.
        int suma = a+b;

        // -: Resta.
        int resta = a-b;

        // *: Multiplicación.
        int multiplicacion = a*b;

        // /: División.
        int division = a/b;

        // %: Operador de Módulo.
        int modulo = a % b;

        // Resultados:
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
        System.out.println("La resta de " + a + " y " + b + " es: " + resta);
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + multiplicacion);
        System.out.println("La división de " + a + " y " + b + " es: " + division);
        System.out.println("El resto de la división de " + a + " entre " + b + " es: " + modulo);
    }
}
