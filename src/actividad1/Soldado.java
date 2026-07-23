package actividad1;

/**
 * ============================================================================
 *  TU TURNO — el objetivo acá es la INMUTABILIDAD
 * ============================================================================
 *
 *  Un Soldado se crea con una especialidad y un rango, y a partir de ahí
 *  su estado NO puede cambiar nunca más. No lleva setters. Punto.
 *
 *  Una clase inmutable se logra con tres decisiones combinadas:
 *    a) atributos privados
 *    b) atributos que no se puedan reasignar después del constructor
 *    c) ningún método que modifique el estado (o sea: sin setters)
 *
 *  ---------------------------------------------------------------------------
 *  PREGUNTA DE COMPRENSIÓN:
 *  Si Soldado tuviera un setRango(), ¿qué problema podría aparecer en medio
 *  de la simulación del duelo? Pensá en qué pasaría si dos partes del
 *  programa comparten el mismo objeto Soldado.
 *  ---------------------------------------------------------------------------
 */
public class Soldado {

    // TODO 🟡 [1] Declará los dos atributos: especialidad y rango.
    //             ¿Qué modificador garantiza que no se puedan reasignar?


    /**
     * TODO 🟢 [2] Asigná los parámetros a los atributos.
     */
    public Soldado(Especialidad especialidad, Rango rango) {

    }

    /**
     * TODO 🟢 [3] Devolvé la especialidad real (hoy devuelve null).
     */
    public Especialidad getEspecialidad() {
        return null;
    }

    /**
     * TODO 🟢 [4] Devolvé el rango real (hoy devuelve null).
     */
    public Rango getRango() {
        return null;
    }

    /**
     * TODO 🟡 [5] Devolvé el texto con el formato del enunciado.
     *
     *   Esperado:  "CAPITAN INGENIERO"
     *
     *   Pista: sobre una constante de enum podés llamar a name() para
     *   obtener su nombre como String. También podrías usar getSigla().
     */
    @Override
    public String toString() {
        return "[TODO: completar toString() de Soldado]";
    }
}
