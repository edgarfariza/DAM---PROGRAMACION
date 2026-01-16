public class BaseMarte {
    public static void main (String[]args){

        // CONSTANTES. REQUISITOS DE ENTRADA A LA BASE DE MARTE
        final int ANIO_ACTUAL = 2050;
        final int EDAD_MINIMA = 18;
        final String CLAVE_MAESTRA = "ELON";

        // DATOS GENERADOS POR EL SISTEMA

        String nombreUsuario = " cApitaN_kIrK ";
        String password = "Enterprise_123";
        int anioNacimiento = 2035;
        String codigoIntroducido = "elon";

        // PROCESO DE LIMPIEZA DE LOS DATOS INTRODUCIDOS

        nombreUsuario = nombreUsuario.trim().toUpperCase();
        System.out.println(nombreUsuario);

        // CALCULO DE LA EDAD DEL USUARIO

        int edadUsuario = ANIO_ACTUAL - anioNacimiento;
        System.out.println(edadUsuario);

        // CALCULO DEL NIVEL DE SEGURIDAD

        int nivelSeguridad = (int) (Math.pow(edadUsuario,2) / 100);

        System.out.println(nivelSeguridad);

        // VERIFICACION DE DATOS DE LA CONTRASENA

        boolean esPasswordSegura = ((password.length() >= 10)&&(password.contains("_")));
        System.out.println(esPasswordSegura);
        boolean esMayorDeEdad = (edadUsuario >= EDAD_MINIMA);
        System.out.println(esMayorDeEdad);
        boolean esClaveMaestra = (codigoIntroducido.equalsIgnoreCase(CLAVE_MAESTRA));
        System.out.println(esClaveMaestra);

        // VERIFICACION DE LOS REQUISITOS EXIGIDOS. ACCESO CONCEDIDO SI A)MAYOR DE EDAD Y CONTRASENA SEGURA O B) CLAVE MAESTRA

        boolean accesoConcedido = ((esMayorDeEdad && esPasswordSegura)||(esClaveMaestra));
        System.out.println(accesoConcedido);

        // SALIDA EN PANTALLA

        System.out.println("-------SISTEMA DE VERIFICACION DE ENTRADA EN MARTE-------");
        System.out.println(String.format("NOMBRE DE USUARIO : %s",nombreUsuario));
        System.out.println(String.format("EDAD : %d NIVEL DE SEGURIDAD : %d",edadUsuario,nivelSeguridad));
        System.out.println(String.format("CONTRASENIA CORRECTA : %s",esPasswordSegura));
        System.out.println(String.format("MAYOR DE EDAD : %s",esMayorDeEdad));
        System.out.println(String.format("CLAVE MAESTRA : %s",esClaveMaestra));
        System.out.println("-------SISTEMA DE VERIFICACION DE ENTRADA EN MARTE-------");
        System.out.println(String.format("ACCESO CONCEDIDO: %s",accesoConcedido));
    }
}
