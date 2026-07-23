package actividad1;

/**
 * ============================================================================
 *  TU TURNO — la lógica del duelo
 * ============================================================================
 *
 *  Esta clase ya trae armada la estructura de la simulación y el diagnóstico
 *  de avance. Lo que falta es el criterio para decidir quién gana.
 *
 *  Salida esperada del enunciado:
 *
 *      Soldado 1:  CABO INFANTERIA
 *      Soldado 2:  CAPITAN INGENIERO
 *      Ganador Soldado 2
 *
 *  ---------------------------------------------------------------------------
 *  PREGUNTA DE COMPRENSIÓN:
 *  Para comparar los rangos, ¿por qué usamos getNivelAutoridad() y no
 *  comparamos directamente las constantes con == ? ¿Y qué pasaría si
 *  usáramos ordinal() en su lugar? (investigá qué hace ordinal() y qué
 *  riesgo tiene apoyarse en él)
 *  ---------------------------------------------------------------------------
 */
public class MainActividad1 {

    private static final int CANTIDAD_DUELOS = 3;

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println(" SIMULADOR DE DESPLIEGUE TACTICO");
        System.out.println("=========================================\n");

        Peloton peloton = new Peloton();

        // --- Diagnóstico de avance: te avisa qué falta ---
        if (peloton.cantidadSoldados() == 0) {
            System.out.println("[TODO] El peloton esta vacio.");
            System.out.println("       Implementa el constructor de Peloton para generar");
            System.out.println("       las 16 combinaciones (4 especialidades x 4 rangos).\n");
            return;
        }
        System.out.println("Pelotón generado con " + peloton.cantidadSoldados() + " soldados.");
        if (peloton.cantidadSoldados() != 16) {
            System.out.println("[AVISO] Se esperaban 16. Revisá tus bucles anidados.\n");
        } else {
            System.out.println();
        }

        // --- Simulación de duelos ---
        for (int i = 1; i <= CANTIDAD_DUELOS; i++) {
            System.out.println("----- Duelo " + i + " -----");
            Soldado s1 = peloton.obtenerSoldadoAleatorio();
            Soldado s2 = peloton.obtenerSoldadoAleatorio();

            if (s1 == null || s2 == null) {
                System.out.println("[TODO] obtenerSoldadoAleatorio() todavía devuelve null.\n");
                return;
            }
            simularDuelo(s1, s2);
            System.out.println();
        }
    }

    /**
     * Implementa el criterio del duelo.
     *
     * Reglas del enunciado:
     *   - Gana el soldado con MAYOR nivel de autoridad en su rango.
     *   - Si ambos tienen el mismo rango => "Empate".
     */
    public static void simularDuelo(Soldado s1, Soldado s2) {
        System.out.println(" Soldado 1:  " + s1);
        System.out.println(" Soldado 2:  " + s2);

        int nivel1 = s1.getRango().getNivelAutoridad();
        int nivel2 = s2.getRango().getNivelAutoridad();

        if (nivel1 > nivel2) {
            System.out.println(" Ganador Soldado 1");
        } else if (nivel2 > nivel1) {
            System.out.println(" Ganador Soldado 2");
        } else {
            System.out.println(" Empate");
        }
    }
}
