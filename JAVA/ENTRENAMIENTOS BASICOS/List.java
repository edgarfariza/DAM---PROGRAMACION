import java.sql.SQLOutput;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        // DECLARACION Y CREACION

        ArrayList<String> names = new ArrayList<>(); //NOTACION CLASICA
        var number = new ArrayList<Integer>(); // NOTACION MODERNA
        var nombres = new ArrayList<String>();

        nombres.add("Felipon");
        System.out.println(nombres.get(0));

        // TAMANO. POR DEFECTO ES 0

        System.out.println(names.size());

        // ANADIR ELEMENTOS

        names.add("Edgar");
        names.add("Felipe");
        names.add("Ariza");
        System.out.println(names.size());

        //ACCEDER A LOS ELEMNTOS. NO CONFUNDIR CON LOS ARRAYS. EN LISTS ES todo con .operacion
        // LOS ARRAYS SON ESTRUCTURAS QUE SE ORDENAN POR ORDEN DE LLEGADA

        System.out.println(names.get(0));
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(1));


        //MODIFICACION DE ELEMENTOS

        names.set(0,"Edguita");
        System.out.println(names.get(0));

        // ELIMINAR ELEMENTOS. CUANDO SE ELIMINA UN ELEMENTO, EL RESTO AVANZA UN PUESTO EN LA COLA. EJ ALGUIEN SE QUITA DE UNA FILA

        names.remove(1);
        System.out.println(names.get(1));

        // BUSCAR ELEMENTOS. PERO ENTERO, NO SOLO UNA PARTE

        System.out.println(names.contains("Edguita"));

        //LIMPIAR ARRAYLIST

        names.clear();
        // System.out.println(names.get(2)); // error porque ahora esta vacio
        System.out.println(names.size());

        // ARRAY TIENE UNA LISTA DE UTILIDADES MUY GRANDE ADDFIRST,ADDLAST,INDEXOF

        names.add("Edgar");
        names.add("Felipe");
        names.add("Ariza");

        System.out.println(names.indexOf("Ariza"));
        System.out.println(names);












    }
}
