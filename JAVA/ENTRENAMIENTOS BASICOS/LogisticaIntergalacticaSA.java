import java.util.Scanner;
public class LogisticaIntergalacticaSA {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        //Programa que calcula el coste de envio de un paquete basandose en peso, planeta de destino y si es urgente.

        // Empezamos generando la pantalla para que el usuario introduzca los datos.
        System.out.print("---SERVICIO DE PAQUETERIA INTERGALACTICA SA---\n" +
                "INTRODUZCA EL ID DEL PAQUETE: ");
        int idPaquete = teclado.nextInt();
        System.out.print("INTRODUZCA EL PESO DEL PAQUETE (KG): ");
        double pesoPaquete = teclado.nextDouble();
        System.out.println("LISTA DE DESTINOS POSIBLES: \n" +
                "1. MARTE (TARIFA BASE NORMAL)\n" +
                "2. LUNA (TARIFA LOW COST)\n" +
                "3. JUPITER (TARIFA CARA POR DISTANCIA)");
        System.out.print("INTRODUZCA NUMERO DE DESTINO: ");
        int planetaDestino = teclado.nextInt();
        System.out.print("EL ENVIO ES PRIORITARIO? ESCRIBA TRUE O FALSE: ");
        boolean envioEsUrgente = teclado.nextBoolean();

        // Creamos las variables respectivas al precio, peso y si es urgente
        double tarifaEnvioBase;

        switch(planetaDestino){
            case 1:
                tarifaEnvioBase = 10;
                break;
            case 2:
                tarifaEnvioBase = 20;
                break;
            case 3:
                tarifaEnvioBase = 50;
                break;
            default:
                System.out.println("EL NUMERO DE PLANETA INTRODUCIDO NO ES VALIDO");
                return;
        }
        double impuestoPorPeso = 0;

        if (pesoPaquete <= 0){
            System.out.println("EL PRECIO NO PUEDE SER NEGATIVO O CERO");
            return;
        } else if (pesoPaquete < 5){
        } else if(pesoPaquete <= 20 ){
            impuestoPorPeso = 20;
        } else if (pesoPaquete > 20){
            impuestoPorPeso = 50;
        }

        System.out.println(String.format("El IMPUESTO POR PESO ES: %f EUROS",impuestoPorPeso));

        double impuestoPorEnvioUrgente = 1;
        if (envioEsUrgente){
            impuestoPorEnvioUrgente = 1.5;
        } else {
            impuestoPorEnvioUrgente = 1;
        }
        System.out.println(String.format("EL RECARGO POR ENVIO URGENTE ES %f SOBRE LA TARIFA BASE",impuestoPorEnvioUrgente));
        // LUCKY BONUS, SI EL ID DEL PAQUETE ES PAR ENTONCES TIENE 5 EUROS DE DESCUENTO.
        double descuentoLuckyBonus = 0;
        if ((idPaquete % 2) == 0) {
            System.out.println("ENHORABUENA LUCKY DAY, TU ID TERMINA EN PAR Y TIENES 5 EUROS DE DESCUENTO");
            descuentoLuckyBonus = 5;
        }
        double tarifaFinalEnvio = (tarifaEnvioBase+impuestoPorPeso)*impuestoPorEnvioUrgente - descuentoLuckyBonus;
        System.out.println(String.format("----CALCULANDO  COSTE FINAL DE SU ENVIO----\n" +
                "EL COSTE FINAL DE SU ENVIO ES %f: ",tarifaFinalEnvio));

    }
}
