public class _06_Arrays_multidimensionales {

    public static void main(String[] args) {

        // Array bidimensional de nombres.
        String[][] nombres = {
                {"Juan", "María", "Pedro"},
                {"Luisa", "Carlos", "Ana"},
                {"Miguel", "Elena", "Javier"}
        };

        // Imprimir todos los nombres en el array bidimensional.
        System.out.println("Array bidimensional de nombres:");
        imprimirNombres(nombres);

        // Buscar un nombre específico en el Array.
        String nombreBuscado = "Elena";
        buscarNombre(nombres, nombreBuscado);
    }

    // Método para imprimir todos los nombres en el array bidimensional.
    private static void imprimirNombres(String[][] nombres) {
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + " ");
            }
            System.out.println();  // Salto de línea después de imprimir cada fila.
        }
    }

    // Método para buscar un nombre específico en el array bidimensional.
    private static void buscarNombre(String[][] nombres, String nombreBuscado) {
        boolean encontrado = false;
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                if (nombres[i][j].equals(nombreBuscado)) {
                    System.out.println("¡Encontrado! " + nombreBuscado + " está en la posición [" + i + "][" + j + "]");
                    encontrado = true;
                    break;  // Salir del bucle interno si el nombre ya fue encontrado.
                }
            }
            if (encontrado) {
                break;  // Salir del bucle externo si el nombre ya fue encontrado.
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró " + nombreBuscado + " en el array.");
        }
    }
}


