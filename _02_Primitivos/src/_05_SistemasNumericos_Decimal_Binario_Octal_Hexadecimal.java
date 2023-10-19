public class _05_SistemasNumericos_Decimal_Binario_Octal_Hexadecimal {

    public static void main(String[] args) {

        // Sistema decimal.
        int numeroDecimal = 500;
        System.out.println("Número decimal de 500 = " + numeroDecimal
        );

        // Representación binaria de 500
        int binario = 0b111110100;
        System.out.println("Número binario de 500 = " + Integer.toBinaryString(binario));

        // Representación octal de 500
        int octal = 764;
        System.out.println("Número octal de 500 = " + Integer.toOctalString(octal));

        // Representación hexadecimal de 500
        int hexadecimal = 0x1F4;
        System.out.println("Número hexadecimal de 500 = " + Integer.toHexString(hexadecimal));
    }
}
