public class Arrays {
    public static void main(String[]args){


         // LOS ARRAYS O ARREGLOS SON ESTRUCTURAS DE DATOS QUE ALMACENAN MULTIPLES VALORES DEL MISMO TIPO. MISMO TIPO DE VARIABLE.
        // CONJUNTO DE DATOS DEL MISMO TIPO INDEXADOS A NIVEL DE SECUENCIA. PODEMOS ACCEDER A ELLOS A TRAVES DE UN INDICE
        //VOY A TENER UN LISTADO DE DATOS Y LE VOY A DECIR, QUIERO ACCEDER AL DATO QUE ESTA EN X POSICION

        //DECLARACION Y CREACION DE ARRAYS

        int [] numbers = new int[3];
        System.out.println(numbers);

        String [] names = {"Edgar", "Felipe", "Edgarfaca"};
        System.out.println(names);

        // ACCESO A LOS DATOS
        System.out.println(names [1]);
        System.out.println(numbers [2]);

        System.out.println(((new String [3]) [0]));

        // MODIFICACION DE DATOS
        numbers [0] = 25;
        numbers [1] = 2;
        System.out.println(numbers [0]);
        System.out.println(numbers [1]);

        // numbers [3] = 2; ERROR PORQUE EL TAMAnO DEL ARRAY ES 3

        //names [3] = "edgar";  lo mismo

        System.out.println(names [2]);
        names [2] = "edgarfariza@gmail.com";
        System.out.println(names [2]);

        // EN LOS ARRAYS NO EXISTE LA ELIMINACION, YA HEMOS RESERVADO EL ESPACIO. QUE PUEDO HACER, LIMPIARLO
        // LE DOY EL VALOR NULL Y ENTIENDO QUE NO TIENE VALOR.

        System.out.println(names.length);
        names [2] = null;
        System.out.println(names [2]);
        System.out.println(names.length);

        //LA LONGITUD DE LOS ARRAYS ES SIEMPRE 3, NO SE PUEDE MODIFICAR AUNQUE LE DE EL VALOR NULL.
        //RESUMEN= ESTRUCTURA QUE ALMACENA UNA SERIE DE DATOS INDEXADOS Y EN ORDEN QUE NO SE PUEDE MODIFICAR.

        // PARA DATOS PRIMITIVOS ESTABLECEMOS 0, PARA OBJETOS STRING ES NULL

        boolean [] booleans = new boolean[5];
        System.out.println(booleans [2]);

        //EJEMPLOS CREACION ARRAYS

        int [] coches = new int[5];
        coches[2] = 50;
        System.out.println(coches[2]);

        String [] alumnosClase = {"Pepe","Juan","Hector"};
        System.out.println(alumnosClase[2]);

        String [] alumnosBachillerato = new String[2];
        System.out.println(alumnosBachillerato[1]);

        int [] idPedidos = {1,2,3,4,5,6};
        System.out.println(idPedidos[0]);

        int[] alumnosClase1 = new int [2];
        System.out.println(alumnosClase1[1]);
        int[] alumnosClase2 = {1,2};
        System.out.println(alumnosClase2[0]);















    }

}
