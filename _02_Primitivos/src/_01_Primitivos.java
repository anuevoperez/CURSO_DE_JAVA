public class _01_Primitivos {

    public static void main(String[] args) {

        // Rango del byte: Valores entre -128 y 127.
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("Valor mínimo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor máximo de un byte: " + Byte.MIN_VALUE);

        System.out.println("\n");

        // Rango del short: Valores entre -32768 y 32767.
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("Valor mínimo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor máximo de un short: " + Short.MIN_VALUE);

        System.out.println("\n");

        // Rango del int: Valores entre -2147483648 y 2147483647.
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("Valor mínimo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor máximo de un int: " + Integer.MIN_VALUE);

        System.out.println("\n");

        // Rango del long: Valores entre -2147483648 y 2147483647.
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("Valor mínimo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor máximo de un long: " + Long.MIN_VALUE);

        System.out.println("\n");

        // Tipo de dato nuevo: var.

        // Rango del var: El mismo que el del integer en valores por defecto.
        var numeroVar = 2147483647;

        // Lo importante es que puede manejarse como cualquier tipo de dato, puede incluso ser un long.
        var numeroVarLong = 9223372036854775807L;
    }
}