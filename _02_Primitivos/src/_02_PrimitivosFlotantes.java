public class _02_PrimitivosFlotantes {

    public static void main(String[] args) {

        // Representa a un punto flotante, por ende, si le asignamos un valor de 1 va a indicar en la salida 1.0.
        float realFloat = 1;
        System.out.println("realFloat = " + realFloat);

        // Rango del float: Valores entre 3.4028235E38 y 1.4E-45.
        // Para utilizar float de forma directa, le asignamos la letra F.

        float numeroFlotante = 6.35F;
        System.out.println("Número flotante = " + numeroFlotante);
        System.out.println("Tipo float corresponde en byte a: " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a: " + Float.SIZE);
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE);

        System.out.println("\n");

        // Rango del double: Valores entre 3.7976931348623157E308 y 4.9E-324.
        double realDouble = 3.25225236264;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en byte a: " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a: " + Double.SIZE);
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE);

        System.out.println("\n");

        /* También podemos utilizar el var como punto flotante.
            - Con f lo representamos como un float.
            - Con d lo representamos con un double.
        */

        var varFlotante = 5.21421f;
        var varDouble = 3.414241d;

        System.out.println("varFlotante = " + varFlotante);
        System.out.println("varDouble = " + varDouble);
    }
}
