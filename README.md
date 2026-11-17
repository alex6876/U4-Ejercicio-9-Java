Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Cotizador de Envíos y Logística de Carga (Clases Abstractas, Herencia y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 📦 Simulación de Cotizador de Envíos y Logística (Clases Abstractas y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema logístico de cotización de fletes, implementando una arquitectura basada en clases abstractas y herencia para administrar distintos operadores de transporte (correo tradicional, envíos express aéreos y transporte marítimo) con reglas especializadas para el cálculo de tarifas basadas en peso, distancia y recargos fijos. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la utilización de constructores mediante `super`, la implementación obligatoria de contratos en clases abstractas (`abstract`), la sobrescritura polimórfica de comportamiento (`@Override`), y la inyección de dependencias en componentes controladores en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base abstracta, sus respectivas subclases especializadas, un componente cotizador y un punto de ejecución:

* **`Transportista` (Clase Abstracta)**: Centraliza los atributos y comportamientos comunes de cualquier operador logístico.
* **Atributos protegidos (`protected`)**: `nombre` y `tarifaBase`, permitiendo que las clases hijas accedan directamente a los parámetros de identificación y costos fijos de la compañía.
* **Constructor**: Inicializa el nombre comercial del transportista y su tarifa base operativa.
* **Métodos operativos**:
* `abstract double calcularCostoEnvio(double pesoKg, double distanciaKm)`: Método abstracto que obliga de forma contractual a cada modalidad de transporte a implementar su propio algoritmo de tarificación.
* `getNombre()`: Getter público para consultar de forma encapsulada el nombre del transportista desde el componente cotizador.




* **`CorreoTradicional`**: Extiende de `Transportista` para modelar servicios postales terrestres estándar.
* **Sobrescritura (`@Override`)**:
* `calcularCostoEnvio(...)`: Computa la tarifa integrando la base fija, un costo moderado por kilogramo ($100/kg) y un factor por kilómetro recorrido ($2/km).




* **`EnvioExpressAereo`**: Extiende de `Transportista` para modelar envíos aéreos de alta velocidad y prioridad.
* **Sobrescritura (`@Override`)**:
* `calcularCostoEnvio(...)`: Aplica tarifas diferenciales elevadas tanto por peso ($250/kg) como por distancia ($8/km) debido a la urgencia y costos operativos del transporte aéreo.




* **`TransporteMaritimo`**: Extiende de `Transportista` para modelar cargas portuarias masivas a larga distancia.
* **Sobrescritura (`@Override`)**:
* `calcularCostoEnvio(...)`: Calcula el flete utilizando costos reducidos por kilogramo ($80/kg) y distancia ($1.5/km) optimizados para gran volumen.




* **`CotizadorEnvios`**: Componente controlador encargado de gestionar el procesamiento de presupuestos.
* **Método operativo**: `cotizar(Transportista transportista, double pesoKg, double distanciaKm)`: Recibe de forma polimórfica cualquier operador de transporte, invoca dinámicamente el cálculo de su tarifa e imprime por consola un reporte detallado con los datos del envío y el costo final.


* **`Main`**: Punto de entrada del programa. Instancia un transportista de correo tradicional, uno aéreo (DHL) y uno marítimo (Maersk), define parámetros estándar de peso (10 kg) y distancia (1000 km), instancia el objeto `CotizadorEnvios` y ejecuta la cotización secuencial de las tres alternativas por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Contrato Estricto de Tarificación:** Mediante el uso de la clase abstracta `Transportista`, el sistema garantiza que cualquier nueva compañía o método de transporte que se incorpore en el futuro implemente de manera obligatoria la fórmula matemática de su flete.
2. **Desacoplamiento y Polimorfismo:** La clase `CotizadorEnvios` opera de manera completamente agnóstica respecto a las subclases concretas; interactúa exclusivamente con el tipo base abstracta, aplicando resolución dinámica en tiempo de ejecución.
3. **Estandarización de Reportes:** El sistema unifica la presentación visual de las cotizaciones imprimiendo de manera uniforme el nombre del transportista, el peso del paquete, la distancia y el costo total calculado.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
===== COTIZACION DE ENVIOS =====
Transportistat: Correo Argentino
Peso del paquete: 10.0 kg
Distancia: 1000.0 km
Costo del envio: $3500.0
------------------------------
Transportistat: DHL Express
Peso del paquete: 10.0 kg
Distancia: 1000.0 km
Costo del envio: $11000.0
------------------------------
Transportistat: Maersk
Peso del paquete: 10.0 kg
Distancia: 1000.0 km
Costo del envio: $4500.0
------------------------------

```

---

## 🚀 Conceptos de Programación Aplicados

* **Abstracción y Polimorfismo Logístico:** Modelado unificado de operadores de transporte heterogéneos mediante contratos en clases abstractas y ligadura dinámica.
* **Separación de Responsabilidades:** Clara división entre las reglas internas de cálculo de cada transportista, el componente cotizador (`CotizadorEnvios`) y la inicialización cliente (`Main`).
* **Diseño Extensible (OCP):** Capacidad absoluta para incorporar nuevos métodos de envío al sistema corporativo (como transporte ferroviario o motomensajería) simplemente extendiendo la clase abstracta, sin modificar el código del cotizador.
