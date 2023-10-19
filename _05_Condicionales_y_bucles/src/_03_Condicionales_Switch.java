public class _03_Condicionales_Switch {

    public static void main(String[] args) {

        int numeroDia = 4;

        String nombreDia;

        switch (numeroDia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número inválido";
                break;
        }

        System.out.println("El número " + numeroDia + " corresponde al " + nombreDia + ".");
    }
}

