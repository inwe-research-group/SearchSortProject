package uni.aed.linkedlist;

import java.util.Scanner;

public class TestListaEnlazada {
    public static void main(String[] args) {
        ListaEnlazada lista =new ListaEnlazada();
        Scanner escaner=new Scanner(System.in);
        int num;
        System.out.println("Ingrese los valores numericos a la lista enlazada: ");
        num=escaner.nextInt();
        lista.addLast(num);
        while(true){
            num=escaner.nextInt();
            if(num<=0) break;                
              lista.addLast(num);              
        }
        lista.printList();
        System.out.println("Ingrese el valor que desea eliminar de la lista enlazada: ");
        num=escaner.nextInt();
        lista.remove(num);
        lista.printList();
    }
}
