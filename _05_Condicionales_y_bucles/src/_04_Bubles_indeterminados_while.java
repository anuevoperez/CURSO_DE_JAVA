public class _04_Bubles_indeterminados_while {

    public static void main(String[] args) {

        /*
            En este ejemplo:

            - contador se inicializa en 1.
            - El bucle while se ejecutará mientras la condición contador <= 5 sea verdadera.
            - En cada iteración, se imprime el valor del contador y luego se incrementa (contador++).
            - Cuando contador llega a 6, la condición se vuelve falsa y el bucle se detiene.
         */

        int contador = 1;

        while (contador <= 5) {
            System.out.println("Número: " + contador);
            contador++;
        }
    }

}
