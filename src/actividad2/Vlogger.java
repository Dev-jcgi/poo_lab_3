package actividad2;

/**
 * ============================================================================
 *  TU TURNO — replicá el patrón de Gamer.java
 * ============================================================================
 *
 *  Un Vlogger publica viajes y estilo de vida. Según el enunciado:
 *    - puede COLABORAR con otros creadores  -> IColaboracion
 *    - puede MODERAR los comentarios negativos -> IModeracion
 *
 *  Ojo que las interfaces NO son las mismas que las del Gamer. Compará:
 *      Gamer   -> IColaboracion, IPromocion
 *      Vlogger -> IColaboracion, IModeracion
 *
 *  Las firmas ya están puestas para que el proyecto compile. Falta el CÓMO.
 *
 *  ---------------------------------------------------------------------------
 *  PREGUNTA DE COMPRENSIÓN:
 *  ¿Podría un Vlogger llamar a anunciarProducto()? ¿Por qué sí o por qué no?
 *  ---------------------------------------------------------------------------
 */
public class Vlogger extends Creador implements IColaboracion, IModeracion {

    // Un vlog de viaje requiere menos energía que un stream largo:
    // edición en campo, tomas varias, pero no transmisión en vivo continua.
    private static final int COSTO_ENERGIA_VLOG = 20;

    public Vlogger(String nombreUsuario) {
        super(nombreUsuario);
    }

    /** Publica un vlog de viaje o estilo de vida. */
    @Override
    public void publicarContenido() {
        if (energia < COSTO_ENERGIA_VLOG) {
            System.out.println("  Influencer agotado, estado burnout y no puede publicar");
            return;
        }
        energia -= COSTO_ENERGIA_VLOG;
        popularidad += 12;
        System.out.println("  " + nombreUsuario + " publica un vlog desde su último destino.");
        System.out.println("  (+12 popularidad, -" + COSTO_ENERGIA_VLOG + " energia)");
    }

    /** Colabora con otro creador en un vlog conjunto de viajes. */
    @Override
    public void hacerFeat(Creador otro) {
        otro.setPopularidad(otro.getPopularidad() + 8);
        this.popularidad += 6;
        System.out.println("  " + nombreUsuario + " graba un vlog conjunto con " + otro.getNombreUsuario());
        System.out.println("  (" + otro.getNombreUsuario() + " +8 popularidad, " + nombreUsuario + " +6)");
    }

    /**
     * Bloquea haters del objetivo, protegiendo su popularidad.
     * Decisión de diseño: le restaura una pequeña cantidad de popularidad
     * simulando que los comentarios negativos ya no impactan.
     */
    @Override
    public void bloquearHaters(Creador objetivo) {
        objetivo.setPopularidad(objetivo.getPopularidad() + 5);
        System.out.println("  " + nombreUsuario + " bloquea haters de @" + objetivo.getNombreUsuario());
        System.out.println("  (@" + objetivo.getNombreUsuario() + " +5 popularidad por moderación)");
    }
}
