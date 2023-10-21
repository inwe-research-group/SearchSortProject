package uni.aed.doublelinkedlist;

import java.util.Scanner;

public class TestHeapSortDoubleLinkedList {
     public static void main(String[] args) {
        heapsort1();
//        ListaDobleEnlazada lista =new ListaDobleEnlazada();
//        Scanner escaner=new Scanner(System.in);
//        int num;
//        System.out.println("Ingrese los valores numericos a la lista enlazada: ");
//        num=escaner.nextInt();
//        lista.insertar(num);
//        while(true){
//            num=escaner.nextInt();
//            if(num<=0) break;                            
//            lista.insertar(num);              
//        }
//        System.out.println(lista.size());
//        lista.imprimirNodos();
    }
     
    public static void heapsort1(){
        DoubleLinkedList heapSort = new DoubleLinkedList();
        
        heapSort.addLast(7);
        heapSort.addLast(10);
        heapSort.addLast(5);
        heapSort.addLast(3);
        heapSort.addLast(8);
        System.out.println("Original List:");
        System.out.println(heapSort.toString());
        
        heapSort.sort();
        
        System.out.println("Orden List:");
        System.out.println(heapSort.toString());
        
//        heapSort.sort();
//        
//        System.out.println("Sorted List:");
//        heapSort.printSorted();
    }
}
