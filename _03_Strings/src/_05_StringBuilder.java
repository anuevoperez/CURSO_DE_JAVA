public class _05_StringBuilder {

    public static void main(String[] args) {

        /*
            StringBuilder es una clase en Java que pertenece al paquete java.lang y se encuentra en el paquete java.lang.StringBuilder.
            Esta clase se utiliza para crear y manipular cadenas de caracteres de manera eficiente.
            A diferencia de la clase String, que es inmutable (es decir, una vez que se crea un objeto String, no se puede modificar),
            StringBuilder proporciona una forma de construir cadenas de caracteres de manera mutable, lo que significa que se pueden realizar
            cambios en el contenido sin necesidad de crear nuevos objetos.
         */

        // Variables
        String firstName = "John";
        String lastName = "Doe";
        int age = 30;

        // Construir la cadena utilizando StringBuilder
        StringBuilder personInfo = new StringBuilder("Person: ");
        personInfo.append("Name: ");
        personInfo.append(firstName).append(" ").append(lastName);
        personInfo.append(", Age: ").append(age);

        // Imprimir la información de la persona.
        System.out.println(personInfo.toString());
    }
}