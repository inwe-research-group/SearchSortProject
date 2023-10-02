package uni.aed.linkedlist;

public class ListaEnlazada {    
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