/**
 * La clase Calculadora proporciona métodos para realizar operaciones
 * matemáticas
 * básicas y avanzadas, como suma, resta, multiplicación, división, potencia y
 * cálculo de la raíz cuadrada.
 */

public class Calculadora {

    public double realizarOperacion(Operacion operacion, Numero n1, Numero n2) {
        switch (operacion.getNombre()) {
            case "suma":
                return n1.getValor() + n2.getValor();
            case "resta":
                return n1.getValor() - n2.getValor();
            case "multiplicacion":
                return n1.getValor() * n2.getValor();
            case "division":
                if (n2.getValor() == 0) {
                    throw new ArithmeticException("No se puede dividir por cero.");
                }
                return n1.getValor() / n2.getValor();
            case "potencia":
                return Math.pow(n1.getValor(), n2.getValor());
            default:
                throw new UnsupportedOperationException("Operación no soportada.");
        }
    }

    public double raizCuadrada(Numero numero) {
        if (numero.getValor() < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero.getValor());
    }
}
