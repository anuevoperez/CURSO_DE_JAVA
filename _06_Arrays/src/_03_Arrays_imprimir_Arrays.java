import java.util.Arrays;

public class _03_Arrays_imprimir_Arrays {

    public static void main(String[] args) {

        int[] numeros = {17, 22, 5, 89, 74};

        // Imprimir los valores con el bucle for.
        System.out.println("\nImprimir con for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor en la posición " + i + ": " + numeros[i]);
        }

        // Imprimir el valor de un elemento en un índice específico.
        System.out.println("\nEn el índice 3 tenemos el valor: " + numeros[3]);

        // Imprimir directamente el array con Arrays.toString().
        System.out.println("\nImprimir el array completo con Arrays.toString():");
        System.out.println(Arrays.toString(numeros));

        // También puedes imprimir el array directamente, ya que println maneja automáticamente Arrays.
        System.out.println("\nImprimir el array completo directamente:");
        System.out.println(Arrays.toString(numeros));

        // Imprimir los valores con el bucle for-each.
        System.out.println("Imprimir con for-each:");
        int index = 0;
        for (int numero : numeros) {
            System.out.println("Valor en la posición " + index + ": " + numero);
            index++;
        }
    }
}
