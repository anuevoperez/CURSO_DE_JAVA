public class _02_Concatenar_Strings {

    public static void main(String[] args) {

        // Los Strings se pueden concatenar con el operador +.
        String nombre = "Mike";
        String apellido = new String("Smith");

        // Para representar un espacio en la concatenación de Strings utilizamos las " " con el espacio entre ellas.
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
    }

}
