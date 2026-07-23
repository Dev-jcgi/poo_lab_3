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

    // Cada constante llama al constructor con su nivel de autoridad.
    CABO(1),
    SARGENTO(2),
    TENIENTE(3),
    CAPITAN(4);   // <-- punto y coma OBLIGATORIO

    private final int nivelAutoridad;

    // Constructor implícitamente privado.
    Rango(int nivelAutoridad) {
        this.nivelAutoridad = nivelAutoridad;
    }

    public int getNivelAutoridad() {
        return nivelAutoridad;
    }
}
