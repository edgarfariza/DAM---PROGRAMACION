package basic.c03_strings;

import java.sql.SQLOutput;

public class Strings {

    public static void main(String[]args){

        // Cadenas de texto

        String name = "Edgar";
        String surname = new String ("Ariza");

        //ES REDUNDANTE PUESTO QUE YA AL PONERLO ENTRE COMILLAS SABES QUE ES UN STRING

        //CONCATENACION. OPERACIONES BASICAS CON STRINGS

        System.out.println(name + " " + surname);

        //LENGTH HALLAR LA LONGITUD DE UN STRING

        System.out.println(name.length());

        //charAT obtener caracter de una posicion en concreto, en programacion empieza desde el 0 el primer valor

        System.out.println(name.charAt(1));

        // SI QUIERO EL ULTIMO CARACTER, CALCULO LA LONGITUD Y LE RESTO 1 PORQUE SE QUE EMPIEZO A CONTAR EN 0.
        System.out.println(name.charAt(name.length()-1));

        // SUBSTRING Obtener una subcadena

        System.out.println(name.substring(2));

        //SUBCADENA CON VALOR INICIAL Y FINAL PERO EL ULTIMO LO EXCLUYE

        System.out.println(name.substring(0,2));

        //Mayusculas y minusculas. No modifica el valor mas alla de el println

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Si lo quiero modificar tengo que modificar la variable

        name = name.toUpperCase();
        System.out.println(name);

        //CONTAINS. Comprobar si contiene algo, diferencia mayusculas. Buena practica es utilizarlo para comprobar que esta todo en mayuscula
        System.out.println("Hola, Java".contains("Edgar"));
        System.out.println("Hola, Java".toUpperCase().contains("Java"));

        //COMPARACION. Comparar el objeto y nos da un valor true false. Diferencia mayusculas y minusculas

        System.out.println(name.equals("EDGAR"));
        System.out.println(name.equals("Edgar"));

        // si queremos que no nos diferencie mayuscuelas

        System.out.println(name.equalsIgnoreCase("EdgAr"));

        // == vs .equals

        var a = "Edgar";
        var b = "Edgar";
        var c = new String("Edgar");

        System.out.println(a == b); //true
        System.out.println(a == c); // false. es un nuevo objeto

        // equals compara contenido, el == compara si son el mismo objeto. utilizar equals es buena practica
        System.out.println(a.equals(c));

        // Trim PARA LIMPIAR CADENAS DE TEXTO, ELIMINA ESPACIOS EN BLANCO AL PRINCIPIO Y AL FINAL
        System.out.println(" Hola, me llamo Edgar ".trim());

        // REPLACE QUIERO REEMPLAZAR CARACTERES O ELIMINANDO ESPACIOS. primer punto y coma target segundo punto y coma replacement

        System.out.println("Hola, me llamo Edgar".replace("Edgar","Edguita"));

        // Format. para cambiar valores que estan asociados a variables. Se va cogiendo valores por orden

        //%s	String	Texto (String)
        //%d	Decimal Integer	Enteros (int, long, byte)
        //%f	Floating point	Decimales (double, float)
        //Usa %.2f para precios o notas donde quieras cortar los decimales.

        var age = 26;
        System.out.println(String.format("Hola, %s. Tengo %d.",name,age));














    }
}
