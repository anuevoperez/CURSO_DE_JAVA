public class _04_Metodos_de_la_clase_String {

    public static void main(String[] args) {

        String oracion = "La mayor aventura es la que nos espera. Hoy y mañana aún no se han dicho.";
        String $oracion = "Ser o no ser, esa es la cuestión";

        // Método length(): Se almacena en una variable de tipo int y saca la longitud de caracteres de una cadena.
        System.out.println("--------------------------------------");
        System.out.println("Método length():");
        int longitud = oracion.length();
        System.out.println("¿Longitud de la primera oración? - " + longitud);

        // Método equals(): Compara si ambas cadenas son iguales por valor.
        System.out.println("--------------------------------------");
        System.out.println("Método equals():");
        boolean isEquals = oracion.equals($oracion);
        System.out.println("¿Las cadenas son iguales? - " + isEquals);

        // Método equalsIgnoreCase(): Compara si ambas cadenas son iguales independientemente de mayúsculas y minúsculas.
        System.out.println("--------------------------------------");
        System.out.println("Método equalsIgnoreCase():");
        String nombre = "Harry";
        String $nombre = "haRRy";
        boolean isEqualsIC = nombre.equalsIgnoreCase($nombre);
        System.out.println("¿Las cadenas son iguales? - " + isEqualsIC);

        /* Método compareTo(): Compara contra la cadena del argumento, devolviendo:
            - Un valor negativo si la cadena es anterior a b.
            - 0 si la cadena es igual a b.
            - Un valor positivo si la cadena es posterior a b.
        */

        System.out.println("--------------------------------------");
        System.out.println("Método compareTo():");
        String fruta1 = "Platano";
        String fruta2 = "Fresa";
        String fruta3 = "Platano";

        int compare = fruta1.compareTo(fruta2);
        System.out.println(compare);

        int $compare = fruta1.compareTo(fruta3);
        System.out.println($compare);

        // Método trim(): Crea un nuevo objetivo eliminando los espacios en blanco que pudieran existir al principio o al final;
        System.out.println("--------------------------------------");
        System.out.println("Método trim():");
        String mes = "   Enero   ";
        String $trim = mes.trim();
        System.out.println("Eliminando los espacios en blanco, ahora es " + $trim);

        // Método charAt(): Extrae un carácter en la posición indicada.
        System.out.println("--------------------------------------");
        System.out.println("Método charAt():");
        String cadena = "aaaaaaaaaaaabaaaaaa";
        char caracter = cadena.charAt(12);
        System.out.println("En la posición número 12 se encuentra el caracter: " + caracter);

        // Método substring(): Extrae la cadena entre las posiciones a y b. O desde una posición a.
        System.out.println("--------------------------------------");
        System.out.println("Método substring():");
        String subcadena = oracion.substring(24);
        String $subcadena = oracion.substring(0, 24);
        System.out.println($subcadena);
        System.out.println(subcadena);

        // Método concat(): Cancatena dos cadenas de texto en una.
        System.out.println("--------------------------------------");
        System.out.println("Método concat():");
        String frase = "Sam tiene aerofobia.";
        String $frase = " Por ende, no puede viajar en avión";
        System.out.println(frase);
        System.out.println($frase);
        String frase_Completa = frase.concat($frase);
        System.out.println("Oración concatenada: " + frase_Completa);
    }
}