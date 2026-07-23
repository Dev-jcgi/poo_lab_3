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
     * TODO 🔴 [1] Hacé que cada creador ejecute las acciones que SÍ puede hacer.
     *
     *   Todos pueden publicar. Pero además:
     *     - si el creador sabe colaborar  -> que haga un feat con otro
     *     - si sabe promocionar           -> que anuncie a la audiencia
     *     - si sabe moderar               -> que bloquee haters de alguien
     *
     *   El problema: el parámetro es de tipo Creador, así que en tiempo de
     *   compilación NO sabés si tiene esas habilidades.
     *
     *   Pista: investigá el operador  instanceof  y el casteo de tipos.
     *
     *       if (creador instanceof IColaboracion) {
     *           IColaboracion colaborador = (IColaboracion) creador;
     *           ...
     *       }
     *
     *   PREGUNTA: ¿por qué NO alcanza con escribir creador.hacerFeat(otro)
     *   directamente? Probalo y mirá el error del compilador.
     */
    public static void gestionarAgenda(Creador creador) {
        creador.publicarContenido();

        // TODO 🔴 Agregá acá las acciones según las interfaces que implemente.
    }

    /**
     * TODO 🔴 [2] Elegí al azar a quiénes les llega la promoción.
     *
     *   Pasos sugeridos:
     *     a) armá una lista con los creadores que NO son el promotor
     *     b) elegí al azar cuántos serán impactados (entre 1 y esa cantidad)
     *     c) seleccioná ese subconjunto al azar
     *     d) convertilo a Creador[] y pasáselo a promotor.anunciarProducto(...)
     *
     *   Pista para (d): unaLista.toArray(new Creador[0])
     */
    public static void simularEventoPromocion(IPromocion promotor) {
        System.out.println("  [TODO: implementar simularEventoPromocion()]");
    }
}
