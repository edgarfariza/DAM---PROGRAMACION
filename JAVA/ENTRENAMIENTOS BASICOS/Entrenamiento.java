import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Entrenamiento {
    public static void main(String[]args){

        String[] listaClase = {"Ed","Jorge"};
        //MOSTRAMOS LOS VALORES DE NUESTRO STRING
        System.out.println(Arrays.toString(listaClase));
        System.out.println(listaClase.length                                 );

        //VAMOS A CONVERTIRLO A LIST
        ArrayList<String> lista = new ArrayList(Arrays.asList(listaClase));
        lista.add ("Pepe");
        lista.add ("Eva");

        //OPERACIONES CON ArrayList

        //lista.add PARA ANADIR DATOS AL OBJETO.

        System.out.println(lista);

        // lista.remove PARA BORRAR DATOS DEL OBJETO

        lista.remove("Pepe");
        System.out.println(lista);

        // lista.contains PARA VER SI UN DATO EXISTE

        System.out.println(lista.contains("Eva"));

        //
        System.out.println(lista.size());

        lista.get(1);

        int[] listatota = new int[2];
        System.out.println(listatota);
        listatota [1] = 2;
        System.out.println(listatota[1]);
        System.out.println(listatota.length);
        System.out.println(Arrays.toString(listatota));

        String[] listatotas = {"Pepe"};
        System.out.println(Arrays.toString(listatotas));

        // ARRAY TO ARRAYLIST

        ArrayList<String> listatotasLISTA = new ArrayList<>(Arrays.asList(listatotas));
        System.out.println(listatotasLISTA);


        var manual = new ArrayList<>();

        HashSet<String> canicas = new HashSet<>();

        canicas.add("BOLA1");
        canicas.add("BOLA1");
        canicas.add("BOLA2");
        System.out.println(canicas.contains("BOLA1"));
        System.out.println(canicas);





    }


}
