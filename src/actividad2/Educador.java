package actividad2;

/**
 * ============================================================================
 *  TU TURNO — el tercer caso
 * ============================================================================
 *
 *  Un Educador publica tutoriales y cursos. Según el enunciado:
 *    - puede PROMOCIONAR herramientas y productos -> IPromocion
 *    - puede MODERAR -> IModeracion
 *
 *  Notá que es el único de los tres que NO colabora (no implementa
 *  IColaboracion). Eso es intencional: cada tipo tiene su combinación.
 *
 *  ---------------------------------------------------------------------------
 *  PREGUNTA DE COMPRENSIÓN:
 *  Los tres tipos comparten atributos (seguidores, energia...) pero cada uno
 *  implementa un conjunto DISTINTO de interfaces.
 *  ¿Por qué esos atributos van en la clase abstracta y las habilidades van
 *  en interfaces? ¿Qué pasaría si pusiéramos hacerFeat() dentro de Creador?
 *  ---------------------------------------------------------------------------
 */
public class Educador extends Creador implements IPromocion, IModeracion {

    // TODO 🟢 [1] Constante con el costo de energía de publicar un curso.

    public Educador(String nombreUsuario) {
        super(nombreUsuario);
    }

    /**
     * TODO 🔴 [2] Implementá la publicación de un tutorial o curso.
     *   Misma regla de burnout que los demás. Efecto distinto al de los otros.
     */
    @Override
    public void publicarContenido() {
        System.out.println("  [TODO: implementar publicarContenido() de Educador]");
    }

    /**
     * TODO 🟡 [3] Implementá la promoción (contrato IPromocion).
     *   Recorré el arreglo de audiencia y aplicá el efecto a cada creador.
     *   Pista: mirá cómo lo resolvió Gamer.anunciarProducto() y adaptalo.
     */
    @Override
    public void anunciarProducto(Creador[] audiencia) {
        System.out.println("  [TODO: implementar anunciarProducto() de Educador]");
    }

    /**
     * TODO 🟡 [4] Implementá la moderación (contrato IModeracion).
     */
    @Override
    public void bloquearHaters(Creador objetivo) {
        System.out.println("  [TODO: implementar bloquearHaters() de Educador]");
    }
}
