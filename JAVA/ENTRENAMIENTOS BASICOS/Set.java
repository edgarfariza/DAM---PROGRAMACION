import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        //TIPO DE ESTRUCTURA ESPECIAL QUE SOLO ALMACENA DATOS UNICOS(NO VA A PERMITIR DUPLICADOS)

        // DECLARACION Y CREACION

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();


        //TAMANO

        System.out.println(names.size());


        names.add("Edgar");
        names.add("Felipe");
        names.add("Ariza");
        names.add("edgarfaca");
        System.out.println(names.size());
        System.out.println(names);

        //DIFERENECIA ENTRE SETS Y LISTAS. LOS SETS GUARDA LOS ELEMENTOS DESORDENADOS. NO EXISTE ORDEN
        //SIRVE PARA ACCEDER A LOS DATOS DE MANERA RAPIDA. POR ESO LA SINTAXIS .get set NO FUNCIONA PORQUE NO ES CONSTANTE EL ORDEN

        // NO VOY A PODER MODIFICARLOS PORQUE NO SE DONDE ESTAN. SE USA PARA DATOS QUE NO VOY A TENER QUE MODIFICAR.
        // SIRVE PARA TRABAJAR CON ELLOS A NIVEL DE INSERCION.
        // BUSCA LOS DATOS MUCHO MAS RAPIDO QUE UN ARRAYLIST.

        System.out.println(names.contains("Edgar"));

        //ELIMINACION DE ELEMENTOS.
        names.remove("Edgar");
        System.out.println(names);
        System.out.println(names.contains("Edgar"));

        //NO PERMITE DUPLICAR DATOS. SON DATOS UNICOS.

        names.add("Edgar");
        names.add("Edgar");
        System.out.println(names);

        // CONJUNTOS. DEBEN SER DOS TIPOS DE DATOS IGUALES.

        // names.addAll(numbers); DA ERROR PORQUE ESTOY INTENTANDO JUNTAR INTEGER CON STRING.

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers.size());

        var countries = new HashSet<String>();

        countries.add("Espania");
        countries.add("Colombia");
        countries.add("Mexico");
        countries.add("Ariza");

        System.out.println(names);
        System.out.println(countries);

        names.addAll(countries);
       System.out.println(names);

       // ANADE TODOS LOS ELEMENTOS DE UNA LISTA A OTRA

        names.retainAll(countries);
        System.out.println(names);

        //UTILIZA EL SET ENTRE PARENTESIS COMO COLADOR. SOLO DEVUELVE LOS VALORES EN COMUN. INTERSECCION

        names.removeAll(countries);
        System.out.println(names);
        //RESTA TODO LO QUE ESTA EN LA OTRA LISTA

        HashSet<String> listasss = new HashSet<>();

        var listassffs = new HashSet<String>();










    }
}
