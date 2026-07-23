package actividad2;

/**
 * ============================================================================
 *  CLASE MODELO — ESTA YA ESTÁ RESUELTA. ESTUDIALA ANTES DE SEGUIR.
 * ============================================================================
 *
 *  Es el ejemplo de "hereda de una clase abstracta + implementa DOS interfaces".
 *  Vas a replicar este patrón en Vlogger y en Educador.
 *
 *  Leé con atención la línea de la declaración:
 *
 *      class Gamer extends Creador implements IColaboracion, IPromocion
 *              └── UNA sola clase ──┘        └── VARIAS interfaces ──┘
 *
 *  Java NO permite heredar de dos clases, pero SÍ implementar todas las
 *  interfaces que quieras. Esa es la forma en que Java resuelve lo que en
 *  otros lenguajes sería "herencia múltiple".
 *
 *  Fijate también que hay TRES métodos con @Override y vienen de lugares
 *  distintos:
 *    - publicarContenido()  viene de la clase abstracta Creador
 *    - hacerFeat()          viene de la interfaz IColaboracion
 *    - anunciarProducto()   viene de la interfaz IPromocion
 *
 *  ---------------------------------------------------------------------------
 *  EXPERIMENTO CONTROLADO (hacelo, es rápido):
 *  Comentá el método anunciarProducto() y compilá. ¿Qué error aparece?
 *  Eso es exactamente lo que significa que una interfaz sea un "contrato":
 *  el compilador te obliga a cumplirlo entero. Después descomentalo.
 *  ---------------------------------------------------------------------------
 */
public class Gamer extends Creador implements IColaboracion, IPromocion {

    private static final int COSTO_ENERGIA_STREAM = 25;

    public Gamer(String nombreUsuario) {
        super(nombreUsuario);   // llama al constructor de Creador
    }

    /** Implementación del método ABSTRACTO heredado de Creador. */
    @Override
    public void publicarContenido() {
        if (energia < COSTO_ENERGIA_STREAM) {
            System.out.println("  Influencer agotado, estado burnout y no puede publicar");
            return;
        }
        energia -= COSTO_ENERGIA_STREAM;
        popularidad += 15;
        System.out.println("  " + nombreUsuario + " transmite en vivo 3 horas de gameplay.");
        System.out.println("  (+15 popularidad, -" + COSTO_ENERGIA_STREAM + " energia)");
    }

    /** Implementación del contrato IColaboracion. */
    @Override
    public void hacerFeat(Creador otro) {
        otro.modificarPopularidad(10);
        this.modificarPopularidad(5);
        System.out.println("  " + nombreUsuario + " juega en co-op con " + otro.getNombreUsuario());
        System.out.println("  (" + otro.getNombreUsuario() + " +10 popularidad, " + nombreUsuario + " +5)");
    }

    /** Implementación del contrato IPromocion. */
    @Override
    public void anunciarProducto(Creador[] audiencia) {
        System.out.println("  " + nombreUsuario + " promociona una marca de perifericos:");
        for (Creador c : audiencia) {
            c.modificarEnergia(10);
            System.out.println("    -> impacta a @" + c.getNombreUsuario() + " (+10 energia)");
        }
    }
}
