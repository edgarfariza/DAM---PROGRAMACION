import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
public class EntrenamientosPapel {
    public static void main(String[]args) {
        System.out.println("Crea un Array");
        System.out.println("Primer metodo");
        // PRIMERO DECLARO EL ARRAY Y LUEGO ANIADO LOS DATOS

        String[] listaClase = new String[3];
        System.out.println(listaClase.length);
        listaClase[0] = "Pepe";
        listaClase[1] = "Jose";
        listaClase[2] = "Carlos";
        //MUESTRO EN PANTALLA EL ARRAY
        System.out.println(Arrays.toString(listaClase));

        System.out.println("Segundo metodo");
        //DECLARAMOS EL ARRAY DIRECTAMENTE CON LOS VALORES

        String[] listaClase1 = {"Pepe","Jose","Carlos"};
        System.out.println(Arrays.toString(listaClase1  ));

                System.out.println("Creacion de un List");
                var listaClase2 = new ArrayList<String>();
        System.out.println(listaClase2.size());
                listaClase2.add ("Jose");
                listaClase2.add ("Pepe");
                listaClase2.add ("Carlos");
                System.out.println(listaClase2);
        System.out.println(listaClase2.size());

                // CREAR UN MAP Y ANADIR DATOS

        var notasClase = new HashMap<String,Integer>();
        notasClase.put("Edgar",10);
        System.out.println(notasClase);
        notasClase.put("Eva",5);
        System.out.println(notasClase);
        System.out.println(notasClase.get("Eva"));
        notasClase.replace("Edgar",7);
        System.out.println(notasClase);
        System.out.println(notasClase.containsKey("Edgar"));








            }





    }






