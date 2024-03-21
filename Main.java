import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese número de elementos a insertar: ");
        int n = scanner.nextInt();
        scanner.close();

        // Lista
        Lista lista = new Lista();
        long startTimeListaInsertar = System.nanoTime();
        for (int i = 0; i < n; i++) {
            lista.insertar(i);
        }
        long endTimeListaInsertar = System.nanoTime();
        long tiempoListaInsertar = endTimeListaInsertar - startTimeListaInsertar;

        long startTimeListaAcceso = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            lista.acceder(random.nextInt(n));
            lista.buscar(random.nextInt(n));
        }
        long endTimeListaAcceso = System.nanoTime();
        long tiempoListaAcceso = endTimeListaAcceso - startTimeListaAcceso;

        long startTimeListaBusqueda = System.nanoTime();
       
        long endTimeListaBusqueda = System.nanoTime();
        long tiempoListaBusqueda = endTimeListaBusqueda - startTimeListaBusqueda;


        long startTimeListaEliminar = System.nanoTime();
        for (int i = 0; i < n; i++) {
            lista.eliminar();
        }
        long endTimeListaEliminar = System.nanoTime();
        long tiempoListaEliminar = endTimeListaEliminar - startTimeListaEliminar;

        // Pila
        Pila pila = new Pila();
        long startTimePilaInsertar = System.nanoTime();
        for (int i = 0; i < n; i++) {
            pila.push(i);
        }
        long endTimePilaInsertar = System.nanoTime();
        long tiempoPilaInsertar = endTimePilaInsertar - startTimePilaInsertar;

        long startTimePilaBuscar = System.nanoTime();
        for (int i = 0; i < n; i++) {
            pila.consultar(random.nextInt(n));
        }
        long endTimePilaBuscar = System.nanoTime();
        long tiempoPilaBuscar = endTimePilaBuscar - startTimePilaBuscar;

        long startTimePilaEliminar = System.nanoTime();
        for (int i = 0; i < n; i++) {
            pila.pop();
        }

        long endTimePilaEliminar = System.nanoTime();
        long tiempoPilaEliminar = endTimePilaEliminar - startTimePilaEliminar;

        // Cola
        Cola cola = new Cola();
        long startTimeColaInsertar = System.nanoTime();
        for (int i = 0; i < n; i++) {
            cola.enqueue(i);
        }
        long endTimeColaInsertar = System.nanoTime();
        long tiempoColaInsertar = endTimeColaInsertar - startTimeColaInsertar;

        long startTimeColaEliminar = System.nanoTime();

        for (int i = 0; i < n; i++) {
            cola.dequeue();
        }
        long endTimeColaEliminar = System.nanoTime();
        long tiempoColaEliminar = endTimeColaEliminar - startTimeColaEliminar;

        long startTimeColaBuscar = System.nanoTime();
        for (int i = 0; i < n; i++) {
            cola.consultar(random.nextInt(n));
        }
        long endTimeColaBuscar = System.nanoTime();
        long tiempoColaBuscar = endTimeColaBuscar - startTimeColaBuscar;

        // Mostrar resultados
        System.out.println("Tiempo Lista Insertar: " + tiempoListaInsertar + " nanosegundos");
        System.out.println("Tiempo Lista Eliminar: " + tiempoListaEliminar + " nanosegundos");
        System.out.println("Tiempo Lista Acceso: " + tiempoListaAcceso + " nanosegundos");
        System.out.println("Tiempo Lista Búsqueda: " + tiempoListaBusqueda + " nanosegundos\n");

        System.out.println("Tiempo Pila Insertar: " + tiempoPilaInsertar + " nanosegundos");
        System.out.println("Tiempo Pila Eliminar: " + tiempoPilaEliminar + " nanosegundos");
        System.out.println("Tiempo Pila Búsqueda: " + tiempoPilaBuscar + " nanosegundos\n");

        System.out.println("Tiempo Cola Insertar: " + tiempoColaInsertar + " nanosegundos");
        System.out.println("Tiempo Cola Eliminar: " + tiempoColaEliminar + " nanosegundos");
        System.out.println("Tiempo Cola Búsqueda: " + tiempoColaBuscar + " nanosegundos\n");

        
    }
}
