public class SistemaAdjudicacionBecas {
    public static void main(String[]args){
        /*
        SISTEMA DE ADJUDICACION DE BECAS SIMPLE, SE PROPONEN UNOS DATOS CUALQUIERA Y EL SISTEMA DA EN PANTALLA LOS DATOS Y SI
         EL USUARIO TIENE DERECHO A BECA
         */

        final double notaMinima = 5.0;
        final double notaExcelenciaAcademica = 9.0;
        final double rentaMaximaPermitida = 30000.500;

        // HEMOS DEFINIDO LAS CONSTANTES PARA PODER ACCEDER A LA BECA.

        double notaAlumnoA = 10.0;
        double rentaAlumnoA = 27500.250;
        String condicionEspecial = "Familia Numerosa";
        boolean tieneExcelenciaAcademica = (notaAlumnoA >= notaExcelenciaAcademica);
        boolean esFamiliaNumerosa = true;


        // ESTABLECEMOS LOS DATOS DEL ALUMNO.

        //VAMOS A ESTABLECER LOS CRITERIOS PARA QUE SE CONCEDA LA NOTA. VIA A POR NOTA. VIA B POR EXCELENCIA VIA C CONDICION ESPECIAL

        boolean obtieneBeca = (((notaAlumnoA >= notaMinima)&&(rentaAlumnoA<=rentaMaximaPermitida))||(tieneExcelenciaAcademica)||(esFamiliaNumerosa));

        System.out.println("---SISTEMA DE CONCESION DE BECAS---");
        System.out.println("---NOTA DEL ALUMNO: " + notaAlumnoA + "---");
        System.out.println("---RENTA DEL ALUMNNO:" + rentaAlumnoA + " EUROS---");
        System.out.println("---CONDICION ESPECIAL:" + condicionEspecial + "---");
        System.out.println("---OBTIENE BECA: " + obtieneBeca);

    }
}