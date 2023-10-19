public class _07_Bucles_determinados_forEach {

    public static void main(String[] args) {

        /*
            Para el bucle forEach, tenemos que hacer una pequeña introducción en los Arrays:

            - Los Arrays son estructuras de datos que permiten almacenar multiples valores del mismo tipo bajo un solo nombre.
            - Cada elemento del array tiene un indice que indica su posición empezando desde 0.
            - Los Arrays tienen una longitud fija que se establece cuando se crean y no puede cambiar durante la ejecución del programa.

            Veremos más sobre los Arrays en el siguiente módulo.
         */

        // Sintaxis de los arrays de una dimensión:

        int[] numeros = {1, 2, 3, 4, 5};

        // Sintaxis del bucle for-each:
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }

        /*
            En este ejemplo:

            - int[] numeros = {1, 2, 3, 4, 5};: Se declara e inicializa un array de números.
            - for (int numero : numeros) { ... }: Esta es la sintaxis del bucle for-each. La variable numero toma el valor de cada elemento del array en cada iteración del bucle.

             Este tipo de bucle es útil cuando trabajamos con colecciones de elementos, como arrays o listas, y queremos iterar sobre cada elemento sin preocuparnos por los índices
             o la longitud del array.
         */
    }

}
