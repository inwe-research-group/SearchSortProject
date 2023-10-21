package uni.aed.simplelinkedlist;

import java.util.Scanner;
import uni.aed.model.Bicicleta;

public class TestSimpleLinkedList {
    public static void main(String[] args) {
        
    }
    public static void testSimpleLinkedList(){
    SimpleLinkedList lista =new SimpleLinkedList();
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
