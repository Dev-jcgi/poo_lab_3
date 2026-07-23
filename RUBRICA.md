# Rúbrica de evaluación — Actividades 1 y 2
### Clases abstractas · Interfaces · Enum type

**Puntaje total: 100 puntos** (50 por actividad)

---

## Actividad 1 — Simulador táctico militar (50 pts)

| Criterio | 0 pts (no logrado) | 5 pts (en proceso) | 10 pts (logrado) |
|---|---|---|---|
| **Enum `Rango` con constructor** | Usa constantes sueltas, `int` o `String` en vez de enum | Declara el enum pero resuelve el nivel con `switch` o `ordinal()` | Enum con atributo `final`, constructor privado y getter |
| **Inmutabilidad de `Soldado`** | Atributos públicos o con setters | Atributos privados pero reasignables | Atributos `private final`, sin setters, asignados solo en el constructor |
| **Generación de combinaciones** | Crea soldados a mano o incompletos | Genera las 16 pero con listas literales | Doble bucle sobre `values()`; agregar una especialidad no obliga a tocar el código |
| **Lógica del duelo** | No compara o compara mal | Compara pero no contempla el empate | Usa `getNivelAutoridad()`, resuelve mayor/menor/empate correctamente |
| **Salida y formato** | No respeta el formato pedido | Formato aproximado | Coincide con el ejemplo del enunciado |

---

## Actividad 2 — Red social de creadores (50 pts)

| Criterio | 0 pts (no logrado) | 5 pts (en proceso) | 10 pts (logrado) |
|---|---|---|---|
| **Uso de clase abstracta** | `Creador` es concreta o se instancia | Es abstracta pero sin métodos abstractos reales | Es abstracta, con al menos un método abstracto y uno concreto heredado |
| **Implementación de interfaces** | Copia los métodos sin `implements` | Implementa pero repite el mismo código en las 3 clases | Cada clase implementa **su** combinación y con lógica propia y distinta |
| **Regla de burnout** | No la contempla | La contempla en una sola clase | Las tres subclases la respetan con el mensaje exacto |
| **Polimorfismo en `gestionarAgenda()`** | Usa `if` sobre el nombre de la clase o strings | Usa `instanceof` pero castea mal o repite código | Usa `instanceof` + casteo a la **interfaz**, no a la clase concreta |
| **Evento de promoción aleatorio** | Impacta a todos o a nadie | Elige al azar pero puede incluir al promotor | Selecciona un subconjunto aleatorio excluyendo al promotor |

---

## Defensa oral (condición de aprobación)

La entrega escrita **no basta por sí sola**: el estudiante debe poder responder
sobre su propio código. Las preguntas están embebidas como comentarios en la
plantilla, así que las conoce de antemano — no hay sorpresa, hay preparación.

Preguntas de referencia, una por concepto:

| Concepto | Pregunta |
|---|---|
| Enum | ¿Por qué el constructor de un enum no puede ser `public`? |
| Enum | ¿Qué riesgo tiene usar `ordinal()` en vez de un atributo propio? |
| Inmutabilidad | ¿Qué problema traería agregarle un `setRango()` a `Soldado`? |
| Clase abstracta | ¿Qué error da `new Creador("test")` y por qué está bien que falle? |
| Clase abstracta vs interfaz | ¿Por qué los atributos van en la clase abstracta y las habilidades en interfaces? |
| Interfaz | Si comentás un método de una interfaz implementada, ¿qué dice el compilador? |
| Polimorfismo | ¿Por qué `simularEventoPromocion` recibe `IPromocion` y no `Gamer`? |

**Criterio:** si no puede explicar **por qué** escribió una línea, esa línea no
suma puntaje aunque funcione.

---

## Penalizaciones

| Situación | Descuento |
|---|---|
| El proyecto no compila | −20 pts (se corrige sobre lo que compile) |
| Quedan `[TODO:` sin resolver en la salida | −5 pts por cada uno |
| Código sin comentar las decisiones de diseño propias | −10 pts |
| Las tres subclases tienen implementaciones idénticas (copy-paste) | −15 pts |

---

## Nota para el docente

El descuento por "implementaciones idénticas" es el que más discrimina la
comprensión real. Un estudiante que entendió el polimorfismo escribe tres
`publicarContenido()` distintos porque **entiende para qué existe el método
abstracto**. Uno que copió y pegó escribe tres iguales: el programa funciona,
pero el concepto no se aprendió.
