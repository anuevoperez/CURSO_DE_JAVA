public class _03_Comparar_Strings {

    public static void main(String[] args) {

        // Con el operador "==", se comparan valores por referencia.
        String nombre1 = "Mike";
        String nombre2 = "Stam";

        String n1 = "4";
        int n2 = 4;

        // Chequear si son el mismo objeto.
        System.out.println("¿Son el mismo objeto? " + (nombre1 == nombre2));

        /*
           Chequear si tienen el mismo valor. El metodo ".equals" se utiliza para comparar cadenas y
           el resultado da false. Ya que n1 es una cadena de texto y n2 es un Integer. Para que fuera
           exactamente igual habría que utilizar un método de reconversión de int a string, pero eso ya
           lo veremos más adelante.
         */
        System.out.println("¿Tienen el mismo valor? " + n1.equals(n2));

    }

}
