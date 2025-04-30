/**
 * La clase Numero representa un número real utilizando un valor de tipo double.
 * Se utiliza para encapsular el valor numérico en objetos dentro de operaciones
 * matemáticas.
 */

public class Numero {

    // Atributo que almacena el valor del número
    private double valor;

    /**
     * Constructor que inicializa el número con un valor específico.
     */
    public Numero(double valor) {
        this.valor = valor;
    }

    /**
     * Método para obtener el valor del número.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Método para establecer un nuevo valor al número.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
