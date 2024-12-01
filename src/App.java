public class App {
    public static void main(String[] args) throws Exception {
        // Clase genérica que almacena un valor de cualquier tipo
class Contenedor<T> {
    private T valor; // Variable genérica para almacenar el dato

    // Constructor para inicializar el valor
    public Contenedor(T valor) {
        this.valor = valor;
    }

    // Método para obtener el valor
    public T getValor() {
        return valor;
    }

    // Método para mostrar el tipo del valor almacenado
    public void mostrarTipo() {
        System.out.println("El tipo de T es: " + valor.getClass().getName());
    }
}

// Clase principal para probar el uso de la clase genérica

    
        // Crear un Contenedor para un número entero
        Contenedor<Integer> contenedorEntero = new Contenedor<>(10);
        contenedorEntero.mostrarTipo();
        System.out.println("Valor almacenado: " + contenedorEntero.getValor());

        // Crear un Contenedor para una cadena de texto
        Contenedor<String> contenedorTexto = new Contenedor<>("Hola, Mundo aun no se estructura de datos");
        contenedorTexto.mostrarTipo();
        System.out.println("Valor almacenado: " + contenedorTexto.getValor());
    }
}

    

