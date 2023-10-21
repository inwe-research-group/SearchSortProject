package uni.aed.simplelinkedlist;

public class SimpleLinkedList {    
    Nodo head;

    public void addFirst(int data) {
        Nodo newNodo = new Nodo(data);
        newNodo.next = head;
        head = newNodo;
    }

    public void addLast(int data) {
        Nodo newNodo = new Nodo(data);

        if (head == null) {
            head = newNodo;
            return;
        }

        Nodo current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNodo;
    }

    public void remove(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Nodo current = head;

        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    
    public void clear() {
        head = null; // Elimina todas las referencias, los nodos serán recolectados por el recolector de basura.
    }
    
    public int size() {
        int contador = 0;
        Nodo temp = head;
        while (temp != null) {
            contador++;
            temp = temp.next;
        }
        return contador;
    }
    
     public Nodo get(int index) {
        if (index < 0) {
            return null;
        }

        Nodo temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                return null;
            }
            temp = temp.next;
        }

        return temp;
    }

    public void printList() {
        Nodo current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    public String toString( )  {
        String lista="";
        Nodo current = head;

        while (current != null) {
            if (lista.length()==0)
                lista="" + current.data;
            else
                lista=lista  + "->" + current.data;
            current = current.next;
        }
        
        return lista;
    }
}