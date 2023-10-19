public class _04_Arrays_longitud_del_Array {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        numeros[0] = 17;
        numeros[1] = 22;
        numeros[2] = 5;
        numeros[3] = 89;
        numeros[4] = 74;

        // Podemos obtener la longitud de un Array con el método length().

        int longitud = numeros.length;
        System.out.println("La longitud del Array es: " + longitud);

    }

}
