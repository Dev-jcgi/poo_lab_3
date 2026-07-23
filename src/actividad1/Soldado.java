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

    // private final: no se pueden reasignar después del constructor.
    private final Especialidad especialidad;
    private final Rango rango;

    public Soldado(Especialidad especialidad, Rango rango) {
        this.especialidad = especialidad;
        this.rango = rango;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public Rango getRango() {
        return rango;
    }

    /**
     * Formato del enunciado: "RANGO ESPECIALIDAD".
     * name() devuelve el nombre de la constante del enum como String.
     */
    @Override
    public String toString() {
        return rango.name() + " " + especialidad.name();
    }
}
