# 🧮 Calculadora Matemática en Java (POO)

Este proyecto implementa una **calculadora de operaciones matemáticas** utilizando los principios de **Programación Orientada a Objetos (POO)** en Java. El programa permite realizar operaciones básicas y avanzadas, con manejo de excepciones para garantizar su robustez.

## 📁 Estructura del Proyecto


## 🧠 Clases y Funcionalidad

- **Main**: Clase principal que gestiona la interacción con el usuario, muestra el menú y controla el flujo del programa.
- **Calculadora**: Contiene la lógica para realizar las operaciones aritméticas (suma, resta, multiplicación, división, potencia y raíz cuadrada).
- **Operacion**: Representa una operación matemática específica y normaliza su nombre.
- **Numero**: Representa un número real como objeto, permitiendo encapsulamiento.

## 🧪 Casos de Prueba

### ✅ Operaciones Básicas

| Entrada                           | Salida Esperada           |
|----------------------------------|----------------------------|
| Opción: 1 <br> Números: 3, 5     | Resultado: 8.0            |
| Opción: 2 <br> Números: 10, 4    | Resultado: 6.0            |
| Opción: 3 <br> Números: 6, 7     | Resultado: 42.0           |
| Opción: 4 <br> Números: 20, 4    | Resultado: 5.0            |

### 🧮 Operaciones Complejas

| Entrada                              | Salida Esperada         |
|-------------------------------------|--------------------------|
| Opción: 5 <br> Base: 2, Exponente: 3 | Resultado: 8.0          |
| Opción: 6 <br> Número: 16            | Resultado: 4.0          |

### ⚠️ Manejo de Excepciones

| Escenario                            | Mensaje Esperado                                     |
|--------------------------------------|------------------------------------------------------|
| División por 0                       | Error: No se puede dividir por cero.                |
| Entrada no numérica (letra)          | Error: Ingrese solo números válidos.                |
| Raíz cuadrada de número negativo     | Error: No se puede calcular la raíz cuadrada de un número negativo. |
| Opción no válida del menú            | Opción no válida.                                   |

## 🧑‍💻 Cómo Ejecutar el Programa

### 1. Compilar

```bash
javac *.java

