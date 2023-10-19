public class _05_Bucles_indeterminados_do_while {

    public static void main(String[] args) {

        /*
            En este ejemplo:

            - contador se inicializa en 1.
            - El bucle do-while siempre se ejecutará al menos una vez, ya que la condición se evalúa después de ejecutar el bloque de código.
            - En cada iteración, se imprime el valor del contador y luego se incrementa (contador++).
            - La condición while (contador < 0) se evalúa después de ejecutar el bloque de código. En este caso, el bucle se detendrá después de la primera iteración, ya que la condición es falsa (contador < 0).
         */

        int contador = 1;

        do {
            System.out.println("Número: " + contador);
            contador++;
        } while (contador < 0);
    }
}
