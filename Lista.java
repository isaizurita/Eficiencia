public class Lista {
    private Nodo<Integer> primero;
    private Nodo<Integer> ultimo;

    public Lista() {
        this.primero = null;
        this.ultimo = null;
    }

    public void insertar(int dato) {
        Nodo<Integer> nuevo = new Nodo<>(dato);
        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public void eliminar() {
        if (primero != null) {
            Nodo<Integer> aux = primero;
            primero = primero.siguiente;
            if (primero == null) {
                ultimo = null;
            }
            aux.siguiente = null;
        }
    }

    public boolean buscar(int dato) {
        Nodo<Integer> actual = primero;
        while (actual != null) {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public int acceder(int posicion) {
        int i = 0;
        Nodo<Integer> actual = primero;
        while (actual != null && i < posicion) {
            actual = actual.siguiente;
            i++;
        }
        if (actual != null) {
            return actual.dato;
        } else {
            return -1;
        }
    }
}