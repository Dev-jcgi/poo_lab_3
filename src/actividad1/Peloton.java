package actividad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ============================================================================
 *  TU TURNO — generar TODAS las combinaciones y mezclarlas
 * ============================================================================
 *
 *  Al construir un Pelotón debe quedar armada automáticamente la lista con
 *  todas las combinaciones posibles de especialidad × rango.
 *
 *  Son 4 especialidades × 4 rangos = 16 soldados.
 *
 *  ---------------------------------------------------------------------------
 *  PREGUNTA DE COMPRENSIÓN:
 *  ¿Qué devuelve exactamente Especialidad.values()? ¿De qué tipo es?
 *  ¿Por qué te conviene recorrerlo en vez de escribir las 16 combinaciones
 *  a mano? (pista: pensá qué pasa si mañana agregan la especialidad ARTILLERIA)
 *  ---------------------------------------------------------------------------
 */
public class Peloton {

    private final List<Soldado> soldados = new ArrayList<>();
    private final Random random = new Random();

    /**
     * TODO 🟡 [1] Generá todas las combinaciones posibles.
     *
     *   Estructura sugerida: un for-each ANIDADO dentro de otro.
     *
     *       for (Especialidad e : Especialidad.values()) {
     *           for (Rango r : ... ) {
     *               soldados.add( ... );
     *           }
     *       }
     *
     * TODO 🟢 [2] Después de generarlos, mezclalos llamando a mezclarPeloton().
     */
    public Peloton() {

    }

    /**
     * TODO 🟢 [3] Mezclá la lista para que el orden sea aleatorio.
     *
     *   Pista: la clase Collections ya tiene un método que hace exactamente
     *   esto en una línea. Buscalo en la documentación de java.util.Collections.
     */
    public void mezclarPeloton() {

    }

    /**
     * TODO 🟡 [4] Devolvé un soldado al azar de la lista.
     *
     *   Pista: random.nextInt(n) devuelve un entero entre 0 y n-1.
     *   ¿Qué valor le tenés que pasar como n para no salirte de la lista?
     */
    public Soldado obtenerSoldadoAleatorio() {
        return null;
    }

    /** Ya resuelto: te sirve para verificar que generaste los 16. */
    public int cantidadSoldados() {
        return soldados.size();
    }
}
