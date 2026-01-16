public class Conditionals {
    public static void main(String[]args){

        //CONDICIONALES SI PASA ESTO HAZ ESTO Y SI NO NO...


        // SENTENCIA IF

        var age = 18;

        if (age > 18){
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("Feliz mayoria de edad");
        } else {
            System.out.println("El usuario es menor de edad");

        }
        //EJEMPLO

        int temperatura = 18;
        if (temperatura <= 10) {
            System.out.println("Que frio chaval ponte algo");
        }
            else if(temperatura<=25){
                System.out.println("Se esta perita");
            } else {
                System.out.println("Pa la playica nino");
            }


        // OTRO EJEMPLO. SISTEMA DE NOTAS

        int nota = 2;

        if (nota>5) {
            System.out.println("APROBADO");
        } else if (nota == 5){
            System.out.println("APROBADO POR LOS PELOS");
        }
         else {
            System.out.println("SUSPENSO");
        }


           //SENTENCIA SWITCH. SIRVE PARA ACABAR REVISANDO EL VALOR DE UNA VARIABLE CON UNA CONDICION
           // AL CONTRARIO QUE EL IF QUE UNA VEZ QUE CAE EN UNA CONDICION YA NO BAJA, ESTA SIGUE
           // HAY QUE ACABAR ROMPIENDO LA EJECUCION SIEMPRE QUE SE CUMPLE EL DATO QUE QUEREMOS ESTABLECER EN EL IF.
        var day = 4;

        switch(day) {
            case 1:
            System.out.println("Lunes");
            break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;

            default:
                System.out.println("No es lunes martes ni miercoles");


        }



    }
}
