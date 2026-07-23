package actividad2;

/**
 * ============================================================================
 *  CLASE ABSTRACTA — parcialmente resuelta
 * ============================================================================
 *
 *  Contiene lo COMÚN a todos los creadores de contenido. No se puede
 *  instanciar: no existe "un creador genérico", existen Gamers, Vloggers
 *  y Educadores.
 *
 *  Fijate en la diferencia entre los dos tipos de método que tiene:
 *
 *   - mostrarPerfil() es CONCRETO: ya trae código y todas las subclases
 *     lo heredan tal cual, sin reescribirlo.
 *
 *   - publicarContenido() es ABSTRACTO: no tiene cuerpo. Cada subclase
 *     está OBLIGADA a implementarlo a su manera, porque un Gamer no
 *     publica igual que un Educador.
 *
 *  ---------------------------------------------------------------------------
 *  PREGUNTA DE COMPRENSIÓN:
 *  Probá escribir en el Main:  Creador c = new Creador("test");
 *  ¿Qué error te da el compilador? ¿Por qué tiene sentido que lo impida?
 *  ---------------------------------------------------------------------------
 */
public abstract class Creador {

    protected String nombreUsuario;
    protected int seguidores;
    protected int nivelCuenta;
    protected int energia;
    protected int popularidad;

    protected Creador(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.seguidores = 0;
        this.nivelCuenta = 1;
        this.energia = 100;
        this.popularidad = 0;
    }

    /**
     * MÉTODO ABSTRACTO: sin cuerpo. Cada subclase lo resuelve a su manera.
     *
     * Regla común que deben respetar todas las implementaciones:
     *   - aumenta la popularidad
     *   - consume energía
     *   - si no hay energía suficiente => "Influencer agotado, estado burnout
     *     y no puede publicar"
     */
    public abstract void publicarContenido();

    /**
     * Suma los nuevos seguidores y actualiza el nivel de la cuenta.
     *
     * Decisión de diseño: se asume que cada 1000 seguidores acumulados
     * suben un nivel. Como nivelCuenta empieza en 1, el nivel resultante
     * es 1 + seguidoresTotales / 1000.
     */
    public void ganarSeguidores(int nuevos) {
        if (nuevos < 0) {
            throw new IllegalArgumentException("No se pueden ganar seguidores negativos");
        }
        this.seguidores += nuevos;
        this.nivelCuenta = 1 + (this.seguidores / 1000);
    }

    /** YA RESUELTO — ejemplo de método concreto heredado por todas las subclases. */
    public void mostrarPerfil() {
        System.out.printf("  @%-12s | seguidores: %-6d | nivel: %d | energia: %3d | popularidad: %d%n",
                nombreUsuario, seguidores, nivelCuenta, energia, popularidad);
    }

    // --- Acceso al estado (ya resuelto) ---
    public String getNombreUsuario() { return nombreUsuario; }
    public int getEnergia() { return energia; }
    public void setEnergia(int energia) { this.energia = Math.max(0, energia); }
    public int getPopularidad() { return popularidad; }
    public void setPopularidad(int popularidad) { this.popularidad = popularidad; }
    public int getSeguidores() { return seguidores; }
    public int getNivelCuenta() { return nivelCuenta; }

    /** Aumenta (o disminuye) la popularidad encapsulando el cambio de estado. */
    public void aumentarPopularidad(int cantidad) {
        this.popularidad += cantidad;
    }

    /** Aumenta (o disminuye) la energía, sin permitir valores negativos. */
    public void aumentarEnergia(int cantidad) {
        this.energia = Math.max(0, this.energia + cantidad);
    }
}
