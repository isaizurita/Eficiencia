public class Pila {
    private Nodo<Integer> tope;
    private Nodo<Integer> cima;

    public Pila() {
        this.tope = null;
    }

    public void push(int dato) {
        Nodo<Integer> nuevo = new Nodo<>(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public int pop() {
        if (tope != null) {
            int dato = tope.dato;
            Nodo<Integer> aux = tope;
            tope = tope.siguiente;
            aux.siguiente = null;
            return dato;
        } else {
            return -1;
        }
    }

    public int consultar(int dato) {
        if (cima == null) {
            return -1;
        } else {
            return cima.dato;
        }
    }

    public boolean isEmpty() {
        return tope == null;
    }
}
