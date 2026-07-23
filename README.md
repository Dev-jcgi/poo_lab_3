# Laboratorio 3 — Actividades 1 y 2
### Enum type · Clases abstractas · Interfaces

Este proyecto Java **ya compila y corre**, pero el estudiante debe completar varias clases e implementar la lógica que falta. A continuación se indica **qué debés hacer**, **en qué archivos** y **cómo probarlo**.

---

## 1. Cómo probar el proyecto

Abrí una terminal en la carpeta raíz y ejecutá:

```bash
mkdir out
javac -d out -encoding UTF-8 $(find src -name "*.java")

java -cp out actividad1.MainActividad1
java -cp out actividad2.MainActividad2
```

Cada vez que completes algo, volvé a correr estos comandos. Si hay `[TODO]` en la consola, significa que todavía falta trabajo.

---

## 2. Qué debés completar

### Actividad 1 — Simulador táctico militar

Objetivo: practicar `enum` con constructor, inmutabilidad, generación de combinaciones y lógica de comparación.

| Archivo | Qué debés hacer |
|---|---|
| `src/actividad1/Rango.java` | Agregar el **nivel de autoridad** a cada rango: `CABO=1`, `SARGENTO=2`, `TENIENTE=3`, `CAPITAN=4`. Replicá el patrón de `Especialidad.java` (constructor privado + atributo `final` + getter). |
| `src/actividad1/Soldado.java` | Hacer la clase **inmutable**: atributos `private final`, asignados solo en el constructor, sin setters. |
| `src/actividad1/Peloton.java` | Generar las **16 combinaciones** de especialidad × rango usando bucles sobre `Especialidad.values()` y `Rango.values()`, y mezclar la lista. |
| `src/actividad1/MainActividad1.java` | Implementar la lógica del duelo en `simularDuelo()`: compara los niveles de autoridad y muestra `Ganador Soldado 1`, `Ganador Soldado 2` o `Empate`. |

Salida esperada (ejemplo):

```
Soldado 1:  CABO INFANTERIA
Soldado 2:  CAPITAN INGENIERO
Ganador Soldado 2
```

### Actividad 2 — Red social de creadores

Objetivo: practicar clases abstractas, interfaces, polimorfismo y `instanceof` + casteo a interfaz.

| Archivo | Qué debés hacer |
|---|---|
| `src/actividad2/Vlogger.java` | Completar `publicarContenido()`, `hacerFeat()` y `bloquearHaters()`. Un vlogger colabora y modera. Que su implementación sea **distinta** a la de `Gamer` y `Educador`. |
| `src/actividad2/Educador.java` | Completar `publicarContenido()`, `anunciarProducto()` y `bloquearHaters()`. Un educador promociona y modera, pero **no colabora**. |
| `src/actividad2/MainActividad2.java` | Completar `gestionarAgenda()` y `simularEventoPromocion()`. Usá `instanceof` + casteo a la **interfaz**, no a la clase concreta. En la promoción, elegí un subconjunto aleatorio que **excluya al promotor**. |

Reglas importantes:

- Todo creador que publique sin energía suficiente debe mostrar exactamente:
  ```
  Influencer agotado, estado burnout y no puede publicar
  ```
- Cada subclase de `Creador` debe tener una implementación **distinta** de `publicarContenido()`.
- Las interfaces definen las habilidades; la clase abstracta define el estado común.

---

## 3. Archivos que ya están resueltos (usalos como modelo)

- `src/actividad1/Especialidad.java` — enum con constructor.
- `src/actividad2/Creador.java` — clase abstracta con atributos y métodos comunes.
- `src/actividad2/Gamer.java` — modelo de herencia + dos interfaces.
- `src/actividad2/IColaboracion.java`, `IModeracion.java`, `IPromocion.java` — contratos.

---

## 4. Qué entregar

Antes de dar por terminado el laboratorio, verificá esto:

- [ ] El proyecto compila sin errores (`javac` termina sin mensajes de error).
- [ ] No queda ningún `[TODO:` en la salida por consola.
- [ ] Las tres subclases de `Creador` (`Gamer`, `Vlogger`, `Educador`) tienen implementaciones **distintas**.
- [ ] Documentaste con comentarios las decisiones de diseño que te correspondan.
- [ ] Podés responder las preguntas de comprensión que aparecen en los comentarios del código.

Los criterios de evaluación completos están en `RUBRICA.md`.
