package actividad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ============================================================================
 *  TU TURNO — orquestar la simulación
 * ============================================================================
 *
 *  El main ya trae armado el flujo general y el registro de creadores.
 *  Lo que falta son los dos métodos del final.
 *
 *  ---------------------------------------------------------------------------
 *  PREGUNTA DE COMPRENSIÓN (la más importante de la actividad):
 *  Mirá el tipo del parámetro de simularEventoPromocion(): es IPromocion,
 *  no Creador ni Gamer.
 *  ¿Por qué conviene declararlo así? ¿Qué gano al pedir "algo que sepa
 *  promocionar" en vez de pedir "un Gamer"?
 *  ---------------------------------------------------------------------------
 */
public class MainActividad2 {

    private static final List<Creador> creadores = new ArrayList<>();
    private static final Random random = new Random();

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println(" RED SOCIAL DE CREADORES DE CONTENIDO");
        System.out.println("=========================================\n");

        // --- 1. Registro de talentos (ya resuelto) ---
        registrarCreador(new Gamer("ShadowPlay"));
        registrarCreador(new Vlogger("NomadaLu"));
        registrarCreador(new Educador("ProfeJava"));
        registrarCreador(new Gamer("PixelQueen"));

        System.out.println("--- Plantel registrado ---");
        for (Creador c : creadores) {
            c.mostrarPerfil();
        }

        // --- 2. Agenda: cada uno hace su acción ---
        System.out.println("\n--- Gestion de agenda ---");
        for (Creador c : creadores) {
            System.out.println("\n@" + c.getNombreUsuario() + ":");
            gestionarAgenda(c);
        }

        // --- 3. Evento de promoción ---
        System.out.println("\n--- Evento de promocion ---");
        Creador promotor = creadores.get(0);
        if (promotor instanceof IPromocion) {
            simularEventoPromocion((IPromocion) promotor);
        }

        System.out.println("\n--- Estado final ---");
        for (Creador c : creadores) {
            c.mostrarPerfil();
        }
    }

    /** Ya resuelto. */
    public static void registrarCreador(Creador creador) {
        creadores.add(creador);
    }

    /**
     * Hace que cada creador ejecute las acciones que SÍ puede hacer.
     *
     * Todos pueden publicar. Además se usa instanceof para saber si el
     * creador implementa alguna habilidad especial, y se lo castea a la
     * interfaz correspondiente (no a la clase concreta) para invocarla.
     */
    public static void gestionarAgenda(Creador creador) {
        creador.publicarContenido();

        // Si sabe colaborar, hace un feat con el primer creador distinto a él.
        if (creador instanceof IColaboracion) {
            IColaboracion colaborador = (IColaboracion) creador;
            Creador otro = buscarOtro(creador);
            if (otro != null) {
                colaborador.hacerFeat(otro);
            }
        }

        // Si sabe promocionar, anuncia a toda la audiencia (usado también en agenda).
        if (creador instanceof IPromocion) {
            IPromocion promotor = (IPromocion) creador;
            Creador[] audiencia = creadores.stream()
                    .filter(c -> c != creador)
                    .toArray(Creador[]::new);
            if (audiencia.length > 0) {
                promotor.anunciarProducto(audiencia);
            }
        }

        // Si sabe moderar, bloquea haters de un creador distinto a él.
        if (creador instanceof IModeracion) {
            IModeracion moderador = (IModeracion) creador;
            Creador objetivo = buscarOtro(creador);
            if (objetivo != null) {
                moderador.bloquearHaters(objetivo);
            }
        }
    }

    /** Busca un creador distinto al dado, o null si no hay nadie más. */
    private static Creador buscarOtro(Creador creador) {
        for (Creador c : creadores) {
            if (c != creador) {
                return c;
            }
        }
        return null;
    }

    /**
     * Elegí al azar a quiénes les llega la promoción, excluyendo al promotor.
     *
     * Pasos:
     *   a) armar una lista con los creadores que NO son el promotor
     *   b) elegir al azar cuántos serán impactados (entre 1 y esa cantidad)
     *   c) seleccionar ese subconjunto al azar
     *   d) convertirlo a Creador[] y pasárselo al promotor
     */
    public static void simularEventoPromocion(IPromocion promotor) {
        // Convertimos el promotor a Creador para poder comparar identidad.
        Creador promotorComoCreador = (Creador) promotor;

        List<Creador> posibles = new ArrayList<>();
        for (Creador c : creadores) {
            if (c != promotorComoCreador) {
                posibles.add(c);
            }
        }

        if (posibles.isEmpty()) {
            System.out.println("  No hay suficientes creadores para la promoción.");
            return;
        }

        // Elegimos al azar cuántos impactar: de 1 a todos los disponibles.
        int cantidad = 1 + random.nextInt(posibles.size());

        // Mezclamos y tomamos los primeros 'cantidad'.
        Collections.shuffle(posibles, random);
        List<Creador> impactados = posibles.subList(0, cantidad);

        // Convertimos a arreglo y lanzamos la promoción.
        Creador[] audiencia = impactados.toArray(new Creador[0]);
        promotor.anunciarProducto(audiencia);
    }
}
