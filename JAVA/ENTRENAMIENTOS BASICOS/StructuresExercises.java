import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class StructuresExercises {
    public static void main(String[] args) {
        // 1. Crea un Array con 5 valores e imprime su longitud.
        //MANERA RUDIMENTARIA, DECLARAMOS EL ARRAY Y LUEGO ANADIMOS VALOR UNO POR UNO

        String[] listaAlumnos = new String [5];
        listaAlumnos[0] = "Edgar";
        listaAlumnos[1] = "Plaka";
        listaAlumnos[2] = "Borja";
        listaAlumnos[3] = "Eva";
        listaAlumnos[4] = "Natacha";
        System.out.println(listaAlumnos.length);
        System.out.println(Arrays.toString(listaAlumnos));

        //MANERA MAS SIMPLE SABIENDO YA TODOS LOS DATOS QUE VAMOS A INTRODUCIR.
        String[] listaClase = {"Edgar","Plaka","Borja","Eva","Natacha"};
        System.out.println(Arrays.toString(listaClase));

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(listaClase[0]);
        listaClase[0] = "Jose Antonio";
        System.out.println(listaClase[0]);

        // 3. Crea un ArrayList vacío.
        var listaPrimeroA = new ArrayList<String>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        listaPrimeroA.add("Alvaro");
        listaPrimeroA.add("Josele");
        listaPrimeroA.add("Perico");
        listaPrimeroA.add("Miguel");
        System.out.println(listaPrimeroA);
        listaPrimeroA.remove(0);
        System.out.println(listaPrimeroA);

        // 5. Crea un HashSet con 2 valores diferentes.
        var listaProfesores = new HashSet<String>();
        listaProfesores.add("Mateo");
        listaProfesores.add("Josefina");
        System.out.println(listaProfesores);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        listaProfesores.add("Mateo");
        listaProfesores.add("Carla");
        System.out.println(listaProfesores);

        // 7. Elimina uno de los elementos del HashSet.
        listaProfesores.remove("Mateo");
        System.out.println(listaProfesores);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var usuarioTelefono = new HashMap<String,Integer>();
        usuarioTelefono.put("Edgar",60922222);
        usuarioTelefono.put("Eva",60923213);
        usuarioTelefono.put("Pedro",609232321);
        System.out.println(usuarioTelefono);

        // 9. Modifica uno de los contactos y elimina otro.
        usuarioTelefono.remove("Pedro");
        System.out.println(usuarioTelefono);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

        String[] listaSalones = {"Dormitorio","Cocina","Salon"};
        System.out.println("Array Original" + Arrays.toString(listaSalones));
        //LA DIFERENCIA ENTRE UN ARRAY Y UN ARRAY LIST ES QUE EL PRIMERO TIENE UN TAMANO DEFINIDO, EN EL SEGUNDO PUEDO ANADIR

        ArrayList<String> miLista = new ArrayList<String>(Arrays.asList(listaSalones));
        HashSet<String> miSet = new HashSet<String>(miLista);

        var miMapa = new HashMap<String,String>();
        miMapa.put("Dormitorio","Dormitorio");
        miMapa.put("Cocina","Cocina");
        miMapa.put("Salon","Salon");
        System.out.println(miMapa);









    }
}

