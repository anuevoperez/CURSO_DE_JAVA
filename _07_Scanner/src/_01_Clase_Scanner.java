// Importamos la clase Scanner del paquete java.util para permitir la entrada de datos desde la consola.
import java.util.Scanner;

public class _01_Clase_Scanner {

    public static void main(String[] args) {

        // Creamos una instancia de la clase Scanner para leer la entrada del usuario desde la consola.
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que introduzca su nombre y almacenamos la entrada en la variable 'nombre'.
        System.out.println("Introduzca su nombre");
        String nombre = scanner.nextLine();

        // Solicitamos al usuario que introduzca su año de nacimiento y almacenamos la entrada en 'añoNacimiento'.
        System.out.println("Introduzca su año de nacimiento");
        int añoNacimiento = scanner.nextInt();

        // Solicitamos al usuario que introduzca el año de consulta y almacenamos la entrada en 'añoConsulta'.
        System.out.println("Introduzca el año de la consulta");
        int añoConsulta = scanner.nextInt();

        // Mostramos un mensaje que incluye el nombre del usuario y calculamos su edad en el año de la consulta.
        System.out.println(nombre + ", en el año " + añoConsulta + " tendrá " + (añoConsulta - añoNacimiento) + " años.");

    }
}
