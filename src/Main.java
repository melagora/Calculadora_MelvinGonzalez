import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal que ejecuta una calculadora de operaciones matemáticas.
 * Permite al usuario seleccionar entre varias operaciones matemáticas
 * como suma, resta, multiplicación, división, potencia y raíz cuadrada.
 * 
 * El programa utiliza un bucle para permitir múltiples operaciones
 * hasta que el usuario decida salir seleccionando la opción correspondiente.
 * 
 * Excepciones manejadas:
 * - NumberFormatException: Cuando el usuario ingresa un valor no numérico.
 * - InputMismatchException: Cuando el formato de entrada es inválido.
 * - ArithmeticException: Para errores matemáticos como división por cero.
 * - UnsupportedOperationException: Para operaciones no soportadas.
 * 
 * Métodos:
 * - main: Punto de entrada del programa.
 * - pedirNumero: Solicita al usuario un número real y valida la entrada.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("");
        System.out.println("Bienvenido a la calculadora de operaciones matemáticas.");

        // Bucle principal que permite seguir operando hasta que se elija la opción
        // "Salir"
        while (true) {
            // Menú de operaciones disponibles
            System.out.println("\nPor favor, seleccione una operación a realizar.");
            System.out.println("\n1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Salir");
            System.out.print("\nOpción: ");

            int opcion;

            try {
                // Se intenta leer la opción ingresada
                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion == 7) {
                    // Si elige salir, se finaliza el programa
                    System.out.println("\nSaliendo de la calculadora...");
                    break;
                }

                // Se declaran variables para la operación y los números involucrados
                Operacion operacion = new Operacion("ninguna");
                Numero n1, n2;
                double resultado;

                // Se selecciona la operación correspondiente
                switch (opcion) {
                    case 1:
                        operacion = new Operacion("suma");
                        n1 = new Numero(pedirNumero(scanner, "Ingrese el primer número: "));
                        n2 = new Numero(pedirNumero(scanner, "Ingrese el segundo número: "));
                        resultado = calculadora.realizarOperacion(operacion, n1, n2);
                        break;
                    case 2:
                        operacion = new Operacion("resta");
                        n1 = new Numero(pedirNumero(scanner, "Ingrese el primer número: "));
                        n2 = new Numero(pedirNumero(scanner, "Ingrese el segundo número: "));
                        resultado = calculadora.realizarOperacion(operacion, n1, n2);
                        break;
                    case 3:
                        operacion = new Operacion("multiplicacion");
                        n1 = new Numero(pedirNumero(scanner, "Ingrese el primer número: "));
                        n2 = new Numero(pedirNumero(scanner, "Ingrese el segundo número: "));
                        resultado = calculadora.realizarOperacion(operacion, n1, n2);
                        break;
                    case 4:
                        operacion = new Operacion("division");
                        n1 = new Numero(pedirNumero(scanner, "Ingrese el dividendo: "));
                        n2 = new Numero(pedirNumero(scanner, "Ingrese el divisor: "));
                        resultado = calculadora.realizarOperacion(operacion, n1, n2);
                        break;
                    case 5:
                        operacion = new Operacion("potencia");
                        n1 = new Numero(pedirNumero(scanner, "Ingrese la base: "));
                        n2 = new Numero(pedirNumero(scanner, "Ingrese el exponente: "));
                        resultado = calculadora.realizarOperacion(operacion, n1, n2);
                        break;
                    case 6:
                        operacion = new Operacion("raiz cuadrada");
                        n1 = new Numero(pedirNumero(scanner, "Ingrese el número: "));
                        resultado = calculadora.raizCuadrada(n1);
                        break;
                    default:
                        // Si la opción no es válida, se notifica al usuario
                        System.out.println("Opción no válida.");
                        continue;
                }

                // Se muestran el tipo de operación y su resultado
                System.out.println("");
                System.out.println("Operación seleccionada: " + operacion.getNombre());
                System.out.println("Resultado: " + resultado);

            } catch (NumberFormatException e) {
                // Manejo de error si se ingresa texto u otro valor no numérico
                System.out.println("Error: Ingrese solo números válidos.");
            } catch (InputMismatchException e) {
                // Manejo de error por mal uso del scanner
                System.out.println("Error: Formato inválido de entrada.");
                scanner.nextLine(); // Limpiar el buffer para evitar bucle infinito
            } catch (ArithmeticException | UnsupportedOperationException e) {
                // Errores matemáticos o de operaciones no soportadas
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Se cierra el scanner al finalizar
        scanner.close();
    }

    /**
     * Solicita al usuario un número real (double) y repite hasta que la entrada sea
     * válida.
     */
    private static double pedirNumero(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Intente nuevamente con un número real.");
            }
        }
    }
}
