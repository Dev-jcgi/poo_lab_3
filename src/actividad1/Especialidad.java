package actividad1;

/**
 * ============================================================================
 *  CLASE MODELO — ESTA YA ESTÁ RESUELTA. ESTUDIALA ANTES DE SEGUIR.
 * ============================================================================
 *
 *  Es el ejemplo de "enum con constructor y atributo propio".
 *  Tu tarea será replicar este mismo patrón en Rango.java.
 *
 *  Fijate en TRES detalles que casi siempre se pasan por alto:
 *
 *  1. El PUNTO Y COMA después de la última constante (línea de FRANCOTIRADOR).
 *     Es obligatorio cuando el enum tiene algo más que constantes.
 *
 *  2. El constructor NO lleva "public". En un enum el constructor es
 *     implícitamente privado: nadie puede escribir new Especialidad(...).
 *     Las únicas instancias que existirán son las 4 declaradas arriba.
 *
 *  3. El atributo es "final": una vez construida la constante, su sigla
 *     no cambia nunca. Un enum es inmutable por diseño.
 *
 *  ---------------------------------------------------------------------------
 *  PREGUNTA DE COMPRENSIÓN (puede caer en la defensa oral):
 *  ¿Qué error te daría el compilador si intentaras escribir
 *  "new Especialidad("XYZ")" desde otra clase? ¿Por qué es bueno que falle?
 *  ---------------------------------------------------------------------------
 */
public enum Especialidad {

    // Cada constante llama al constructor con su propio argumento.
    INFANTERIA("INF"),
    MEDICO("MED"),
    INGENIERO("ING"),
    FRANCOTIRADOR("FRA");   // <-- punto y coma OBLIGATORIO

    private final String sigla;

    // Constructor implícitamente privado.
    Especialidad(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
}
