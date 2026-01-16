import java.util.Scanner;
public class CalculadoraNomina {
    public static void main(String[]args){
        // Se pide al usuario que va a calcular su nomina sus datos
        Scanner teclado = new Scanner(System.in);
        System.out.print("------SISTEMA DE CALCULADORA DE NOMINA------\n INTRODUZCA SU SALARIO (EUROS): ");
        double salarioBrutoAnual = teclado.nextDouble();
        System.out.print("INTRODUZCA EL TIPO DE SU CONTRATO: \n" +
                "1. Contrato de practicas\n" +
                "2. Contrato temporal\n" +
                "3. Contrato indefinido\n" +
                "TIPO DE CONTRATO: ");
        int tipoDeContrato = teclado.nextInt();
        // Calculamos la retencion segun el salarioBrutoAnual. Contamos con que no nos van a dar salario negativos.
        double porcentajeRetencionAnual = 0;
        if ((salarioBrutoAnual <= 15000)&&(salarioBrutoAnual > 0)){
            porcentajeRetencionAnual= 1;
        } else if((salarioBrutoAnual > 15000)&&(salarioBrutoAnual <= 30000)) {
            porcentajeRetencionAnual = 0.85;
        }
          else if(salarioBrutoAnual > 30000){
            porcentajeRetencionAnual = 0.75;
        } else{
            System.out.println("EL SALARIO INTRODUCIDO NO ES VALIDO");
        }
          // Creamos la loogica mediante SWITCH para los bonus o penalizaciones segun el tipo de contrato
        double salarioBrutoAnualCalculo = salarioBrutoAnual;

        switch(tipoDeContrato) {

            case 1:
                porcentajeRetencionAnual += 0.05;
                salarioBrutoAnualCalculo += 100;
                salarioBrutoAnualCalculo *= porcentajeRetencionAnual;
                break;
            case 2:
                salarioBrutoAnualCalculo *= porcentajeRetencionAnual;
                break;
            case 3:
                salarioBrutoAnualCalculo += 500;
                salarioBrutoAnualCalculo *= porcentajeRetencionAnual;
                break;
            default:
                System.out.println("EL NUMERO DE CONTRATO INTRODUCIDO NO ES VALIDO");
                return;
        }
          double salarioNeto = salarioBrutoAnualCalculo;
          double salarioMensual = salarioNeto / 12;


          // Una vez establecidas las condiciones vamos a dar el resultado.

        System.out.println(String.format("--------PROCESANDO CALCULOS...--------\n" +
                "SU SUELDO NETO ANUAL ES: %f",salarioNeto) + " EUROS" );
        System.out.println(String.format( "SU SUELDO NETO ANUAL ES: %f",salarioMensual) + " EUROS" );

    }
}
