public class OperatorsExercises {
    public static void main(String[]args){
        System.out.println("A continuacion los ejercicios del tema de operadores");

        // 1. Crea una variable con el resultado de cada operación aritmética.

        int a = 1+1;
        System.out.println(a);
        int b = 1-1;
        System.out.println(b);
        int c = 1*1;
        System.out.println(c);
        int d = 1/1;
        System.out.println(d);
        int e = 7%2;
        System.out.println(e);

        // 2. Crea una variable para cada tipo de operación de asignación.
        //Ejemplo con la vida de un personaje en un videojuego. Inicia con 100 de vida

        int vida = 100;

        // coges un power up de vida

        vida += 50;
        System.out.println(vida);

        // te ataca un enemigo

        vida-= 50;
        System.out.println(vida);

        // power up de vida

        vida*= 1.5;
        System.out.println(vida);

        //dano enemigo especial;

        vida/= 1.25;
        System.out.println(vida);

        // calculamos si la vida es par o impar

        vida%= 2;
        System.out.println(vida);

        // 3. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

        System.out.println(vida >= 100);
        System.out.println(vida ==120);
        System.out.println(vida < -500);

        // 4. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println();

        System.out.println(vida);
        System.out.println(vida < 100);
        System.out.println(vida > -5);
        System.out.println(vida == 0);

        // 5. Utiliza el operador lógico and.

        System.out.println( vida==100 && vida>100);

        // 6. Utiliza el operador lógico or.

        System.out.println(vida==100 || vida<100);

        // 7. Combina ambos operadores lógicos.
        System.out.println((vida==100 && vida>100) || (vida==100 || vida>100));

        // 8. Añade alguna negación.

        System.out.println(!(vida==100));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        int u = 10;
        u= ++u - u++;

        System.out.println(u);

        int p = 5;
        p= p-- - p;
        System.out.println(p);

        int t = 20;
        t= t++ + t;
        System.out.println(t);

        // 10. Combina operadores aritméticos, de comparación y lógicos.

        t = 10 + 2;
        System.out.println(!((t+5)>2 || t>2 ));













    }
}
