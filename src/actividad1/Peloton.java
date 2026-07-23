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
     * Genera todas las combinaciones posibles de especialidad × rango
     * y luego mezcla el pelotón para simular variación.
     */
    public Peloton() {
        for (Especialidad e : Especialidad.values()) {
            for (Rango r : Rango.values()) {
                soldados.add(new Soldado(e, r));
            }
        }
        mezclarPeloton();
    }

    /**
     * Mezcla la lista de soldados aleatoriamente.
     * Collections.shuffle(...) reordena los elementos en su lugar.
     */
    public void mezclarPeloton() {
        Collections.shuffle(soldados, random);
    }

    /**
     * Devuelve un soldado al azar de la lista.
     * nextInt(soldados.size()) devuelve un índice válido entre 0 y size-1.
     */
    public Soldado obtenerSoldadoAleatorio() {
        return soldados.get(random.nextInt(soldados.size()));
    }

    /** Ya resuelto: te sirve para verificar que generaste los 16. */
    public int cantidadSoldados() {
        return soldados.size();
    }
}
