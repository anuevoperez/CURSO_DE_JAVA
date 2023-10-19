public class _02_Logicos_relacionales_booleanos {

    public static void main(String[] args) {

        int a = 8;
        int b = 4;
        int c = 3;

        // >: Mayor que.
        boolean esMayorQue = a > b;
        System.out.println("¿" + a + " es mayor que " + b + "? : " + esMayorQue);

        // <: Menor que.
        boolean esMenorQue = a < b;
        System.out.println("¿" + a + " es menor que " + b + "? : " + esMenorQue);

        // >=: Mayor o igual que.
        boolean esMayorOIgualQue = a >= b;
        System.out.println("¿" + a + " es mayor o igual que " + b + "? : " + esMayorOIgualQue);

        // <=: Menor o igual que.
        boolean esMenorOIgualQue = a <= b;
        System.out.println("¿" + a + " es menor o igual que " + b + "? : " + esMenorOIgualQue);

        // ==: Igual que.
        boolean esIgualQue = (a == b);
        System.out.println("¿" + a + " es igual que " + b + "? : " + esIgualQue);

        // !=: Diferente de.
        boolean esDiferenteDe = (a != b);
        System.out.println("¿" + a + " es diferente de " + b + "? : " + esDiferenteDe);

        // &&: AND lógico.
        boolean andLogico = ((a > b) && (a > c));
        System.out.println(a + " es mayor que " + b + " y " + a + " es mayor que " + c + ": " + andLogico);

        // ||: OR lógico.
        boolean orLogico = ((b > a) || (a > c));
        System.out.println(b + " es mayor que " + a + " o " + a + " es mayor que " + c + ": " + orLogico);
    }

}
