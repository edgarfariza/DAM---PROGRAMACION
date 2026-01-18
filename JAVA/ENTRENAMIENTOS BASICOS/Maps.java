import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

public class Maps {
    public static void main(String[] args) {

        // LA DIFERENCIA ES QUE LOS MAPAS SON PARES DE VALORES. NO TENEMOS QUE ACABAR DICIENDO CUAL ES EL TIPO DE DATO
        HashMap<String,String> names = new HashMap<>();
        var numbers = new HashMap<Integer,String>();

        //TAMANO

        System.out.println(names.size());

        // ANADIR ELEMENTOS

        names.put("Pepe","Ariza");
        names.put("Edgar","Santos");
        names.put("Jorge","Gomez");

        System.out.println(names.size());
        System.out.println(names);

        // SI REPITO UN VALOR COMO PRIMERO, ELIMINA EL PREVIO INTRODUCIDO.
        // SE ORDENAN ALEATORIAMENTE.

        //ACCESO A LOS ELEMENTOS. NO CONOCEMOS EL INDICE, NO ACCEDEMOS POR INDICE ACCEDEMOS POR CLAVE.

        System.out.println(names.get("Pepe"));

        // SI INTENTO ACCEDER A UNA CLAVE QUE NO EXISTE ME VA A RETORNAR NULL. ES UNA FORMA DE VER SI EXISTE
        System.out.println(names.get("Dev"));

        //VERIFICAR ELEMENTOS. COMPROBAR SI EXISTE A TRAVES DE LA KEY O EL VALUE.

        System.out.println(names.containsKey("Pepe"));
        System.out.println(names.containsValue("Ariza"));

        //ELIMINAR ELEMENTOS. AL ELIMINAR SOLO LA KEY NOS DEVUELVE EL VALOR ASOCIADO.

        System.out.println(names.remove("Pepe"));

        // PARA ELIMINAR ALGO DE MANERA MUY CONCRETA PUEDO USAR LA KEY Y EL VALOR, NO ES COMUN.
        System.out.println(names.remove("Edgar","Santos"));
        System.out.println(names);

        //LIMPIAR HASHMAP

        names.clear();
        System.out.println(names);

        // MODIFICACION DE ELEMENTOS. ACTUALIZACION DE DATOS. EL DATO NUEVO MACHACA AL ANTERIOR.

        names.put("EDGAR","EDGAR@GMAIL.COM");
        System.out.println(names);
        names.put("EDGAR","EDGARFARIZA@GMAIL.COM");
        System.out.println(names);
        //MODIFICAR SOLO SI EL VALOR YA EXISTE CON ANTERIORIDAD.
        names.put("FELIPE","FELIPE@GMAIL.COM");
        names.replace("Moure","EDGUITA");

        //ANADE EL VALOR SOLO SI NO EXISTE

        names.putIfAbsent("Moure","EDGUITA");
        System.out.println(names);

        //OTRAS OPERACIONES
        //COMPROBAR SI UN MAPA ESTA VACIO
        System.out.println(names.isEmpty());
        //IMPRIMIR SOLO LOS VALORES
        var values = names.values();
        System.out.println(names.values());


        var diccionario = new HashMap<String,String>();
        HashMap<String,String> dicciondario = new HashMap<>();

        //DECLARACION


    }
}
