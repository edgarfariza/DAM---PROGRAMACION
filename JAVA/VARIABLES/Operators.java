import java.sql.SQLOutput;

public class Operators {
    public static void main(String[]args){

        //OPERADORES

        // Aritmeticos

        var a = 5;
        var b = 3;


        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // OPERADORES DE ASIGNACION

        a = b;
        System.out.println(b);

        a = b * 2;
        a += 1;

        System.out.println(a);
        a *= 1;
        System.out.println(a);
        a /= 1;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        // COMPARACION (Relacionales) Devuelven VERDADERO o FALSO.
        // ES A IGUAL A B?

        System.out.println(a == b);

        a = b;
        System.out.println(a == b);

        //A ES DISTINTO DE B?

        System.out.println(a!=b);

        // COMPARADORES DE SIGNO

        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        // OPERADORES LOGICOS

        //AND en ESPANOL Y LOS DOS TIENEN QUE SER VERDAD PARA QUE DE TRUE.

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // tres es mayor que 2 con lo cual true pero 5 no es igual a 2 con lo cual false. resultado falso

        System.out.println(3 > 2 && 5 == 2);

        // OR en ESPANOL O CON QUE UNO SEA TRUE YA ARROJA EL VALOR TRUE

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2);

        // NOT EN ESPANOL NO. IMPRIME LO CONTRARIO
        System.out.println(!true);
        System.out.println(!(3 > 2) || 5 == 2);


        //OPERADORES UNARIOS. OPERAN SOBRE UN SOLO OPERANDO. + -. AUTOINCREMENTAR B++ ++B --B B--.


        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(--b);
        System.out.println(b--);


        // EJEMPLO OPERADORES UNARIOS. IMPORTANTE, EN CADA DECLARACION UNARIA EL VALOR DE LAS VARIABLES CAMBIA

        int x = 5;
        int y = 2;
        int z = x++ + --y * x-- - y++;

        System.out.println("x:" +  x + " y:" + y + " z:" + z);
























    }
}
