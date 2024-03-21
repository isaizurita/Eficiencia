public class Cola {
    private Nodo<Integer> primero;
    private Nodo<Integer> ultimo;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
    }

    public void enqueue(int dato) {
        Nodo<Integer> nuevo = new Nodo<>(dato);
        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    public int dequeue() {
        if (primero != null) {
            int dato = primero.dato;
            Nodo<Integer> aux = primero;
            primero = primero.siguiente;
            if (primero == null) {
                ultimo = null;
            }
            aux.siguiente = null;
            return dato;
        } else {
            return -1;
        }
    }

    public int consultar(int dato) {
        if (primero == null) {
            return -1;
        } else {
            return primero.dato;
        }
    }


    public boolean isEmpty() {
        return primero == null;
    }
}