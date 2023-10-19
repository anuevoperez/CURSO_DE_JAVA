public class _04_PrimitivosBooleanos {

    public static void main(String[] args) {

        // Declaración de la variable booleana. Es binaria y representa dos valores: true o false;
        boolean isUpper;

        // Declaración e inicialización de dos variables enteras.
        int n1 = 45346;
        int n2 = 22214;

        // Asignación del resultado de la comparación a la variable booleana.
        isUpper = n1 > n2;

        // Impresión del resultado.
        System.out.println("Es " + n1 + " mayor que " + n2 + " = " + isUpper);

        // También podemos asignar una operación directamente a un boolean.

        boolean operation = 4-2 == 1;
        System.out.println("Operación: " + operation);
    }
}
