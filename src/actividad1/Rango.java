package actividad1;

/**
 * ============================================================================
 *  TU TURNO — replicá acá el patrón que viste en Especialidad.java
 * ============================================================================
 *
 *  Este enum representa la categoría militar y debe llevar asociado un
 *  NIVEL DE AUTORIDAD numérico, que es lo que después decidirá quién gana
 *  el duelo:  CABO=1, SARGENTO=2, TENIENTE=3, CAPITAN=4
 *
 *  Ahora mismo las constantes existen pero NO tienen su nivel: por eso el
 *  proyecto compila, pero getNivelAutoridad() devuelve siempre 0 y todos
 *  los duelos terminan en empate. Ese es tu primer síntoma a corregir.
 *
 *  ---------------------------------------------------------------------------
 *  PREGUNTA DE COMPRENSIÓN:
 *  ¿Por qué conviene guardar el nivel como atributo del enum, en vez de
 *  resolverlo con un switch gigante en la clase Main?
 *  ---------------------------------------------------------------------------
 */
public enum Rango {

    // TODO 🟢 [1] Agregá a cada constante su nivel de autoridad entre paréntesis.
    //             Ejemplo de la forma:  CABO(1),
    //             Y no te olvides del punto y coma al final de la última.
    CABO, SARGENTO, TENIENTE, CAPITAN;

    // TODO 🟡 [2] Declará el atributo que guarda el nivel.
    //             ¿Qué modificador impide que se pueda cambiar después?


    // TODO 🟡 [3] Escribí el constructor que recibe el nivel y lo asigna.
    //             Recordá: en un enum el constructor NO lleva "public".


    /**
     * TODO 🟢 [4] Hacé que devuelva el nivel real en vez del 0 fijo.
     */
    public int getNivelAutoridad() {
        return 0;
    }
}
