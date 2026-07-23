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

    // Publicar un tutorial o curso requiere preparación de material didáctico.
    private static final int COSTO_ENERGIA_CURSO = 22;

    public Educador(String nombreUsuario) {
        super(nombreUsuario);
    }

    /** Publica un tutorial o mini curso. */
    @Override
    public void publicarContenido() {
        if (energia < COSTO_ENERGIA_CURSO) {
            System.out.println("  Influencer agotado, estado burnout y no puede publicar");
            return;
        }
        energia -= COSTO_ENERGIA_CURSO;
        popularidad += 10;
        System.out.println("  " + nombreUsuario + " lanza un tutorial de programación.");
        System.out.println("  (+10 popularidad, -" + COSTO_ENERGIA_CURSO + " energia)");
    }

    /** Promociona una herramienta de aprendizaje a la audiencia. */
    @Override
    public void anunciarProducto(Creador[] audiencia) {
        System.out.println("  " + nombreUsuario + " recomienda una plataforma de cursos online:");
        for (Creador c : audiencia) {
            c.modificarPopularidad(8);
            System.out.println("    -> impacta a @" + c.getNombreUsuario() + " (+8 popularidad)");
        }
    }

    /**
     * Moderación educativa: protege al objetivo de haters y le otorga
     * algo de energía como representación de un ambiente más sano.
     */
    @Override
    public void bloquearHaters(Creador objetivo) {
        objetivo.modificarEnergia(10);
        System.out.println("  " + nombreUsuario + " activa moderación para @" + objetivo.getNombreUsuario());
        System.out.println("  (@" + objetivo.getNombreUsuario() + " +10 energia)");
    }
}
