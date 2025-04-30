/**
 * La clase Calculadora proporciona métodos para realizar operaciones
 * matemáticas básicas y avanzadas, como suma, resta, multiplicación, división,
 * potencia y cálculo de la raíz cuadrada.
 */
public class Calculadora {

    /**
     * Realiza una operación matemática entre dos números reales, de acuerdo
     * al tipo especificado por la instancia de la clase Operacion.
     */
    public double realizarOperacion(Operacion operacion, Numero n1, Numero n2) {
        switch (operacion.getNombre()) {
            case "suma":
                return n1.getValor() + n2.getValor(); // Suma
            case "resta":
                return n1.getValor() - n2.getValor(); // Resta
            case "multiplicacion":
                return n1.getValor() * n2.getValor(); // Multiplicación
            case "division":
                if (n2.getValor() == 0) {
                    // Validación para evitar división por cero
                    throw new ArithmeticException("No se puede dividir por cero.");
                }
                return n1.getValor() / n2.getValor(); // División
            case "potencia":
                return Math.pow(n1.getValor(), n2.getValor()); // Potenciación
            default:
                // En caso de operación no reconocida
                throw new UnsupportedOperationException("Operación no soportada.");
        }
    }

    /**
     * Calcula la raíz cuadrada de un número.
     */
    public double raizCuadrada(Numero numero) {
        if (numero.getValor() < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero.getValor());
    }
}
