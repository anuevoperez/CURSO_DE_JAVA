public class _03_Incremento_decremento {

    public static void main(String[] args) {

        int a = 5;

        // ++: Incremento.
        System.out.println("Incremento:");
        System.out.println("El valor de a es: " + a);
        a++;
        System.out.println("El valor de a ahora es: " + a + "\n");

        // Reseteamos su valor.
        a = 5;

        // --: Decremento.
        System.out.println("Decremento:");
        System.out.println("El valor de a es: " + a);
        a--;
        System.out.println("El valor de a ahora es: " + a + "\n");

        // Reseteamos su valor.
        a = 5;

        // += nº: Incremento especifico.
        System.out.println("Incremento específico:");
        System.out.println("El valor de a es: " + a);
        a+=3;
        System.out.println("El valor de a ahora es: " + a + "\n");

        // Reseteamos su valor.
        a = 5;

        // += nº: Decremento especifico.
        System.out.println("Decremento específico:");
        System.out.println("El valor de a es: " + a);
        a-=3;
        System.out.println("El valor de a ahora es: " + a + "\n");
    }

}
