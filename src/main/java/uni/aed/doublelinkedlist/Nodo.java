package uni.aed.doublelinkedlist;

public class Nodo {
    private int elemento;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(int elemento, Nodo siguiente, Nodo anterior) {
        this.elemento = elemento;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Nodo(int elemento) {
        this.elemento = elemento;
        this.siguiente = null;
        this.anterior = null;
    }

    public void setValor(int elemento) {
        this.elemento = elemento;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public int getValor() {
        return elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }
    
    


    
}
