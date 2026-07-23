package actividad2;

/**
 * INTERFAZ — ya resuelta.
 *
 * A diferencia de IColaboracion (que afecta a UNO), esta afecta a VARIOS
 * creadores a la vez: recibe un arreglo como audiencia.
 */
public interface IPromocion {

    /** Impacta a toda una audiencia, incrementando su energía o popularidad. */
    void anunciarProducto(Creador[] audiencia);
}
