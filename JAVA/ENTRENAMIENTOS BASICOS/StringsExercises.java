public class StringsExercises {
    public static void main(String[]args){

        // 1. Concatena dos cadenas de texto.

        String nombre = "Edgar";
        String apellido = "Felipe";
        System.out.println(nombre + " " + apellido);

        // 2. Muestra la longitud de una cadena de texto.

        System.out.println(nombre.length());


        // 3. Muestra el primer y último carácter de un string.

        System.out.println(nombre.charAt(0) + " " + nombre.charAt(4));

        // Solo para este ejemplo en concreto, porque se el nombre. Mejor asegurar con el metodo de abajo

        System.out.println(apellido.charAt(apellido.length()-1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(apellido.toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        System.out.println(nombre.contains("ar"));

        // 6. Formatea un string con un entero.

        int edad = 25;

        System.out.println(String.format("Hola me llamo %s, mi apellido es %s y tengo %d anios",nombre,apellido,edad));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println("   Edgar Ariza  ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("      Edgar Ariza    ".replace(" ","-"));

        // 9. Comprueba si dos strings son iguales.
        System.out.println(apellido.equals(nombre));

        // 10. Comprueba si dos strings tienen la misma longitud.

        System.out.println((nombre.length()) == (apellido.length()));





    }
}
