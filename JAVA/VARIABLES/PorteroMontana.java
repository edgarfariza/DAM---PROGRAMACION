public class PorteroMontana {
    public static void main(String[]args){

        // Definicion de las constantes necesarias para poder acceder a la montana rusa.
        final double alturaMinima = 1.60;
        final int edadMinima = 16;
        final double precioEntrada = 15.0;

        //Introduccion de los datos simulados de una persona que quiere acceder

        double alturaUsuario = 1.55;
        int edad = 20;
        double dineroDisponible = 50.0;


        //Introducimos los booleanos para ver si cumple con los requisitos

        boolean cumpleAltura = (alturaUsuario >= alturaMinima);
        boolean cumpleEdad = (edad >= edadMinima);
        boolean tieneDineroSuficiente = (dineroDisponible >= precioEntrada);
        boolean entradaAprobada = ((alturaUsuario >= alturaMinima)&&(edad >= edadMinima)&&(dineroDisponible >= precioEntrada));

        //Analizamos los requisitos de entrada y damos el veredicto sobre si puede subir o no

        dineroDisponible -= precioEntrada;

        System.out.println("----INFORME SOBRE POSIBILIDAD DE ACCESO A LA MONTANA RUSA----");
        System.out.println("             ----   DATOS DEL VISITANTE --- ");
        System.out.println("       ALTURA:" + alturaUsuario +  "    EDAD>" + edad );
        System.out.println("----CUMPLE EL VISITANTE CON LOS REQUISITOS SOLICITADOS----");
        System.out.println("ALTURA MINIMA: " + cumpleAltura + "EDAD MINIMA: " + cumpleEdad + "DINERO DISPONIBLE: " + tieneDineroSuficiente );
        System.out.println("----PUEDE ENTRAR AL PARQUE : " + entradaAprobada + "----");
        System.out.println("DINERO RESTANTE DISPONIBLE: " + dineroDisponible);

        //EN REALIDAD EL DINERO DISPONIBLE ES FALSO, TENDRIAMOS EL MISMO QUE AL PRINCIPIO PERO AL NO USAR IF LO RESTAMOS SIEMPRE.










    }
}
