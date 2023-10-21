package edu.aed.cap16bicicleta;

import uni.aed.model.Bicicleta;

public class SimpleLinkedList {    
    BNodo head;

    public void addFirst(Bicicleta data) {
        BNodo newNodo = new BNodo(data);
        newNodo.next = head;
        head = newNodo;
    }

    public void addLast(Bicicleta data) {
        BNodo newNodo = new BNodo(data);

        if (head == null) {
            head = newNodo;
            return;
        }

        BNodo current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNodo;
    }

    public void remove(Bicicleta data) {
        if (head == null) {
            return;
        }
         
        if (((Comparable)head.data).compareTo( data)==0) {
            head = head.next;
            return;
        }

        BNodo current = head;
        
        while (current.next != null && (((Comparable)current.next.data).compareTo( data)!=0)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    
    public void clear() {
        head = null; // Elimina todas las referencias, los nodos serán recolectados por el recolector de basura.
    }

    public void printList() {
        BNodo current = head;

        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }
    
    public String toString( )  {
        String lista="";
        BNodo current = head;

        while (current != null) {
            if (lista.length()==0)
                lista="" + current.data.toString();
            else
                lista=lista  + "->" + current.data.toString();
            current = current.next;
        }
        
        return lista;
    }
}