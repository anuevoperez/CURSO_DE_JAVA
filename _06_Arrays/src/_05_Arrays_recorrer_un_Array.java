public class _05_Arrays_recorrer_un_Array {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        numeros[0] = 17;
        numeros[1] = 22;
        numeros[2] = 5;
        numeros[3] = 89;
        numeros[4] = 74;

        for (int i = 0; i < 5; i++) {
            System.out.println("Valor del índice " + i + " - " + numeros[i]);
        }
    }

}