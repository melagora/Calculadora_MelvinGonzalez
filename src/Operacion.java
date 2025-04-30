/**
 * La clase Operacion representa una operación aritmética específica (como suma,
 * resta, etc.).
 * Contiene el nombre de la operación en minúsculas para mantener consistencia
 * al procesarla.
 */
public class Operacion {

    // Atributo que almacena el nombre de la operación (e.g., "suma", "resta")
    private String nombre;

    /**
     * Constructor que inicializa la operación con un nombre dado.
     * El nombre se convierte a minúsculas para evitar problemas de comparación.
     */
    public Operacion(String nombre) {
        this.nombre = nombre.toLowerCase(); // Se normaliza a minúsculas
    }

    /**
     * Método para obtener el nombre de la operación.
     */
    public String getNombre() {
        return nombre;
    }
}
