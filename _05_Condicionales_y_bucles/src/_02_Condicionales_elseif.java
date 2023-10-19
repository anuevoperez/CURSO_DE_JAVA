public class _02_Condicionales_elseif {

    public static void main(String[] args) {

        int edad = -7;

        if(edad > 0) {

            if(edad <= 18) {
                System.out.println("Es un niño");
            } else if (edad >= 18 && edad <=65) {
                System.out.println("Está en edad laborable");
            } else {
                System.out.println("Está jubilado");
            }

        } else {
            System.out.println("Aún no ha nacido");
        }
    }
}
