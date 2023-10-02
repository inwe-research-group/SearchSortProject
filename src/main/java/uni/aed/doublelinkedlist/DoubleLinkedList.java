package uni.aed.doublelinkedlist;

public class DoubleLinkedList {
    Nodo primero;
    Nodo ultimo;

    public DoubleLinkedList() {
        this.primero = null;
        this.ultimo = null;
    }

    public void addFirst(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (primero == null) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(primero);
            primero.setAnterior(nuevoNodo);
            primero = nuevoNodo;
        }
    }

    public void addLast(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (ultimo == null) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    public void remove(int valor) {
        Nodo actual = primero;
        while (actual != null && actual.getValor() != valor) {
            actual = actual.getSiguiente();
        }
        if (actual != null) {
            if (actual == primero) {
                primero = actual.getSiguiente();
                if (primero != null) {
                    primero.setAnterior(null);
                } else {
                    ultimo = null;
                }
            } else if (actual == ultimo) {
                ultimo = actual.getAnterior();
                ultimo.setSiguiente(null);
            } else {
                actual.getAnterior().setSiguiente(actual.getSiguiente());
                actual.getSiguiente().setAnterior(actual.getAnterior());
            }
        }
    }
    
    public void clear() {
        primero = null; // Elimina todas las referencias, los nodos serán recolectados por el recolector de basura.
        ultimo = null;
    }
    
    public void printList() {
        Nodo actual = primero;
        while (actual != null) {
            System.out.print(actual.getValor() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }
    public void printList1(){
        Nodo actual = primero;
        while (actual != null) {
            if (actual.getAnterior()==null)                
                System.out.println("nodo: "+actual.getValor() + " nodo anterior: Ninguno, nodo siguiente: "+actual.getSiguiente().getValor());
            else if(actual.getSiguiente()==null)
                System.out.println("nodo: "+actual.getValor() + " nodo anterior: "+actual.getAnterior().getValor()+" nodo siguiente: fin");
            else    
                System.out.println("nodo: "+actual.getValor() + " nodo anterior: "+actual.getAnterior().getValor()+" nodo siguiente: "+actual.getSiguiente().getValor());
            actual = actual.getSiguiente();
        }
    }
    public String toString(){
        Nodo actual = primero;
        String lista="";
        while (actual != null) {
            if (actual.getAnterior()==null)
                lista="null <-"+actual.getValor() + "->"+actual.getSiguiente().getValor();                
            else if(actual.getSiguiente()==null)
                lista=lista + "||"+actual.getAnterior().getValor()+"<-"+actual.getValor() + "-> null";                
            else
                lista=lista + "||"+actual.getAnterior().getValor()+"<-"+actual.getValor() + "->"+actual.getSiguiente().getValor();
            actual = actual.getSiguiente();
        }
        return lista;
    }
}

