public class ConditionalsExercises {
    public static void main(String[]args){


        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).

        int edad = 17;
        if (edad > 18){
            System.out.println("USTED PUEDE VOTAR");
        } else if (edad == 18){
            System.out.println("USTED PUEDE VOTAR. ACABA DE CUMPLIR LA MAYORIA DE EDAD");
        } else {
            System.out.println("USTED NO PUEDE VOTAR");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        int numA = 7;
        int numB = 7;
        if (numA > numB ){
            System.out.println("El numA  es mayor que el numB");
        } else if (numA == numB){
            System.out.println("El numA y el numB son iguales");
        } else {
            System.out.println("El numB es mayor que el numA");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        int numC = -2;
        if (numC > 0){
            System.out.println("El numero es positivo");
        } else if(numC == 0){
            System.out.println("El numero es cero");
        } else {
            System.out.println("El numero es negativo");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        int numD = 9;
        if(((numD % 2) == 0)){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        int numE = 200;

        if ((numE >0)&&(numE<=100)){
            System.out.println(String.format("El numero %d esta dentro del rango 1-100",numE));
        } else {
            System.out.println(String.format("El numero %d esta fuera del rango 1-100",numE));
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        int dia = 7;
        switch(dia){
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            default:
                    System.out.println("Es Finde ole fiesta");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        int nota = 910;
                if(nota < 50){
                    System.out.println("Estas suspenso estudia mas");
                } else if((nota>=50)&&(nota<90)){
                    System.out.println("Aprobado");
                } else if((nota>=90)&&(nota<=100)){
                    System.out.println("Sobresaliente eres el mejor");
                } else{
                    System.out.println("La nota no es valida");
                }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        // En este ejemplo no lleva acompanante

        int edadCine = 5;
        boolean llevaAcompanante = false;

        if((edadCine>=15)||(llevaAcompanante)){
            System.out.println("ENTRADA PERMITIDA");
        } else{
            System.out.println("ENTRADA DENEGADA");
        }


        // 9. Crea un programa que diga si una letra es vocal o consonante.

        String letraIntroducida = "A";
        letraIntroducida = letraIntroducida.toLowerCase();
        switch(letraIntroducida){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("LA LETRA INTRODUCIDA ES UNA VOCAL");
                break;
            default:
                System.out.println("LA LETRA INTRODUCIDA ES UNA CONSONANTE");
        }
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        int a = 5;
        int b = 5;
        int c = 1;

        if((a>=b)&&(a>=c)){
            System.out.println(String.format("La variable mayor es %d",a));
        } else if((b>a)&&(b>c)){
            System.out.println(String.format("La variable mayor es %d",b));
        } else{
            System.out.println(String.format("La variable mayor es %d",c));
        }




    }
}
