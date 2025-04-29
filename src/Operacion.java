/**
 * La clase Operacion representa una operación con un nombre asociado.
 * Proporciona métodos para obtener el nombre de la operación en minúsculas.
 */

public class Operacion {
    private String nombre;

    public Operacion(String nombre) {
        this.nombre = nombre.toLowerCase();
    }

    public String getNombre() {
        return nombre;
    }
}
