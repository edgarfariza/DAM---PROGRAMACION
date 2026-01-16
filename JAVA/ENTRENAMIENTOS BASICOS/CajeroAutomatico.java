public class CajeroAutomatico {
    public static void main(String[] args) {

        // 1. CONFIGURACIÓN DEL SISTEMA (Constantes y Saldo inicial)
        final int PIN_CORRECTO = 1234;
        final double LIMITE_DIARIO = 500.0;

        double saldo = 1000.0;

        // 2. DATOS DE ENTRADA (Simulación)
        // Probamos pidiendo 600 (más del límite) para ver qué pasa
        int pinUsuario = 1234;
        double cantidadSolicitada = 600.0;

        // 3. LÓGICA DE VALIDACIÓN (Calculamos las banderas)
        // ¿Coincide el pin?
        boolean esPinCorrecto = (pinUsuario == PIN_CORRECTO);

        // ¿Tengo más o igual dinero del que pido?
        boolean saldoSuficiente = (saldo >= cantidadSolicitada);

        // ¿Pido menos o igual al límite permitido?
        boolean dentroDelLimite = (cantidadSolicitada <= LIMITE_DIARIO);

        // 4. EL VEREDICTO FINAL (Operador &&)
        // Solo es true si las TRES condiciones anteriores son true
        boolean operacionAutorizada = esPinCorrecto && saldoSuficiente && dentroDelLimite;

        // 5. EJECUCIÓN (El cajero "tonto" sin IF)
        // Restamos el dinero siempre (limitación del ejercicio)
        saldo -= cantidadSolicitada;

        // 6. IMPRIMIR EL INFORME
        System.out.println("----- INFORME DE TRANSACCIÓN -----");
        System.out.println("Pin introducido: " + pinUsuario);
        System.out.println("Cantidad solicitada: " + cantidadSolicitada + "€");
        System.out.println(); // Salto de línea estético

        System.out.println("-- VALIDACIONES DE SEGURIDAD --");
        System.out.println("1. Pin Correcto: " + esPinCorrecto);
        System.out.println("2. Hay Fondos: " + saldoSuficiente);
        System.out.println("3. Respeta Límite Diario: " + dentroDelLimite);
        System.out.println();

        System.out.println("-- RESULTADO FINAL --");
        System.out.println("¿Operación Autorizada?: " + operacionAutorizada);
        System.out.println();

        System.out.println("Saldo restante en cuenta: " + saldo + "€");
        System.out.println("----------------------------------");
    }
}