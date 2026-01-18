import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class NewStructuresExercises {
    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.

        Integer[] listaClase = new Integer[5];
        listaClase[0] = 2;
        listaClase[1] = 7;
        listaClase[2] = 5;
        listaClase[3] = 8;
        listaClase[4] = 2;
        System.out.println("Listaclase tiene " + listaClase.length + " valores");

        String[] listaBachillerato = {"Jose","Eva","Edgar"};
        System.out.println(listaBachillerato.length);
        System.out.println(Arrays.toString(listaBachillerato));


        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.

        System.out.println(listaClase[0]);
        listaClase[0] = 3;
        System.out.println(listaClase[0]);

        // 3. Crea un ArrayList vacío.
        var listaEso = new ArrayList<String>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        // .add .remove .get (.getFirst .getLast) .set .size .contains .clear

        listaEso.add("Eva");
        listaEso.add("Edgar");
        listaEso.add("Borja");
        listaEso.add("Curro");
        System.out.println(listaEso);
        listaEso.remove(0);
        System.out.println(listaEso);
        listaEso.remove("Edgar");
        System.out.println(listaEso);

        // 5. Crea un HashSet con 2 valores diferentes.
        var listaConductores = new HashSet<String>();
        listaConductores.add("Lewis Hamilton");
        listaConductores.add("Enzo Ferrari");
        System.out.println(listaConductores);


        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        listaConductores.add("Lewis Hamilton");
        System.out.println(listaConductores);
        listaConductores.add("Jozef Kalinski");
        System.out.println(listaConductores);


        // 7. Elimina uno de los elementos del HashSet.
        listaConductores.remove("Lewis Hamilton");
        System.out.println(listaConductores);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var agendaTelefono = new HashMap<String,Integer>();
        agendaTelefono.put("Edgar",6002323);
        agendaTelefono.put("Sofia",62352345);
        agendaTelefono.put("Carla",6434234);
        System.out.println(agendaTelefono);

        // 9. Modifica uno de los contactos y elimina otro.
        agendaTelefono.put("Edgar",64444444);
        System.out.println(agendaTelefono);
        agendaTelefono.remove("Edgar");
        System.out.println(agendaTelefono);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

        System.out.println(Arrays.toString(listaClase));
        ArrayList<Integer> listaNueva = new ArrayList<>(Arrays.asList(listaClase));
        System.out.println(listaNueva);

        HashSet<Integer> listaSet = new HashSet<>(listaNueva);
        System.out.println(listaSet);
        listaSet.add(2);
        listaSet.add(7);
        listaSet.add(9);
        System.out.println(listaSet);





    }
}