public class DataTypes {
    public static void main(String[]args){

        // TIPOS DE DATOS PRIMITIVOS
        // OTROS TIPOS DE DATOS float, long, byte

        int myInt = 37;
        System.out.println(myInt);

        double myDouble = 1.95;
        System.out.println(myDouble);

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java";
        System.out.println(myString);


        // SABER TIPO DE DATO EN TIEMPO DE EJECUCION.
        System.out.println(myString.getClass().getSimpleName());








    }
}
