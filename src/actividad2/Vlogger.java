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

    // TODO 🟢 [1] Definí una constante con el costo de energía de publicar.
    //             Elegí vos el valor y justificalo en un comentario.

    public Vlogger(String nombreUsuario) {
        super(nombreUsuario);
    }

    /**
     * TODO 🔴 [2] Implementá la publicación de un vlog.
     *
     *   Debe respetar la regla común:
     *     - si no alcanza la energía, imprimir exactamente:
     *       "  Influencer agotado, estado burnout y no puede publicar"
     *     - si alcanza: descontar energía, sumar popularidad e informar
     *       por consola qué pasó.
     *
     *   Que NO sea idéntico al del Gamer: un vlog de viaje no es un stream.
     */
    @Override
    public void publicarContenido() {
        System.out.println("  [TODO: implementar publicarContenido() de Vlogger]");
    }

    /**
     * TODO 🟡 [3] Implementá la colaboración (contrato IColaboracion).
     *   Pensá qué efecto tiene un vlog conjunto sobre el otro creador.
     */
    @Override
    public void hacerFeat(Creador otro) {
        System.out.println("  [TODO: implementar hacerFeat() de Vlogger]");
    }

    /**
     * TODO 🟡 [4] Implementá la moderación (contrato IModeracion).
     *   Debe PROTEGER al objetivo: por ejemplo, evitar que su popularidad
     *   baje, o recuperarle parte de lo perdido. La regla la definís vos.
     */
    @Override
    public void bloquearHaters(Creador objetivo) {
        System.out.println("  [TODO: implementar bloquearHaters() de Vlogger]");
    }
}
