package actividad2;

/**
 * INTERFAZ — ya resuelta. Es un CONTRATO, no una implementación.
 *
 * Solo declara QUÉ se puede hacer. El CÓMO lo define cada clase que la
 * implemente: un Gamer no colabora igual que un Vlogger.
 *
 * Ojo: los métodos de una interfaz son public y abstract por defecto.
 * No hace falta escribirlo.
 */
public interface IColaboracion {

    /** Potencia a un compañero creador (le sube popularidad, energía, etc.). */
    void hacerFeat(Creador otro);
}
