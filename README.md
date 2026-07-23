# Plantilla de Actividades 1 y 2
### Enum type · Clases abstractas · Interfaces

Proyecto Java **que ya compila y ejecuta tal como está**. Tu tarea es
completar los `TODO` marcados en el código.

## Cómo empezar

1. Abrí la carpeta en IntelliJ IDEA (`File → Open` → seleccioná esta carpeta).
2. Abrí `guia/guia-actividades.html` con doble clic: es tu checklist de trabajo.
3. **Ejecutá antes de escribir nada**, para ver el punto de partida:

```bash
mkdir out
javac -d out -encoding UTF-8 $(find src -name "*.java")

java -cp out actividad1.MainActividad1
java -cp out actividad2.MainActividad2
```

Vas a ver mensajes `[TODO]` señalando qué falta. Cada vez que resolvés algo,
volvé a ejecutar: un mensaje menos es progreso visible.

## Cómo está armada

Por cada concepto hay **una clase ya resuelta** que sirve de modelo, y otra
vacía donde replicás el patrón. No copies: leé la resuelta, entendé por qué
está escrita así, y después escribí la tuya.

| Archivo | Estado |
|---|---|
| `actividad1/Especialidad.java` | ✅ **Resuelto** — modelo de enum con constructor |
| `actividad1/Rango.java` | ⬜ Completar (replicá el patrón de Especialidad) |
| `actividad1/Soldado.java` | ⬜ Completar (inmutabilidad) |
| `actividad1/Peloton.java` | ⬜ Completar (combinaciones + aleatoriedad) |
| `actividad1/MainActividad1.java` | ⬜ Completar (lógica del duelo) |
| `actividad2/Creador.java` | 🟨 Parcial — clase abstracta, falta un método |
| `actividad2/I*.java` (3 archivos) | ✅ **Resueltos** — los contratos |
| `actividad2/Gamer.java` | ✅ **Resuelto** — modelo de herencia + 2 interfaces |
| `actividad2/Vlogger.java` | ⬜ Completar |
| `actividad2/Educador.java` | ⬜ Completar |
| `actividad2/MainActividad2.java` | ⬜ Completar (polimorfismo) |

## Semáforo de los TODO

| Marca | Significa |
|---|---|
| 🟢 | Mecánico: ya sabés hacerlo, es teclear |
| 🟡 | Requiere entender el concepto |
| 🔴 | Decisión de diseño tuya — documentala con un comentario |

## Antes de entregar

- [ ] El proyecto compila sin errores
- [ ] No queda ningún `[TODO:` en la salida por consola
- [ ] Las tres subclases de `Creador` tienen implementaciones **distintas**
- [ ] Comentaste tus decisiones de diseño (los 🔴)
- [ ] Podés responder las preguntas de comprensión de la guía

Ese último punto no es opcional: la entrega puede ir acompañada de una
**defensa oral**. Las preguntas están en la guía y en los comentarios del
código, así que no hay sorpresa. Si tu programa funciona pero no podés
explicar por qué escribiste una línea, esa línea no suma puntaje.

Los criterios completos están en `RUBRICA.md`.
