package uni.aed.doublelinkedlist1;

import java.util.Scanner;

public class TestDoubleLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList lista =new DoubleLinkedList();
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
        lista.printList1();
        System.out.println("Ingrese el valor que desea eliminar de la lista enlazada: ");
        num=escaner.nextInt();
        lista.remove(num);
        lista.printList1(); 
        
    }
    public void test1(){
        Scanner escaner=new Scanner(System.in);
        int num;
        Nodo inicio,prev,sig,actual;        
        inicio=new Nodo(0,null,null);        
        sig=inicio;      
        System.out.println("Ingrese los valores numericos a la lista enlazada: ");
        while(true){
            num=escaner.nextInt();
            if(num<=0) break;                
              sig.setSiguiente(new Nodo(num,null,null));
              prev=sig;
              sig=sig.getSiguiente();
              sig.setAnterior(prev);
              
        }
        inicio=inicio.getSiguiente(); 
        
        //Visualizando el contenido de la lista enlazada
        System.out.println("Visualizando el contenido de la lista enlazada: ");
        actual = inicio;
        while (actual != null) {
            if (actual.getAnterior().getValor()==0)                
                System.out.println("nodo: "+actual.getValor() + " nodo anterior: Ninguno, nodo siguiente: "+actual.getSiguiente().getValor());
            else if(actual.getSiguiente()==null)
                System.out.println("nodo: "+actual.getValor() + " nodo anterior: "+actual.getAnterior().getValor()+" nodo siguiente: fin");
            else    
                System.out.println("nodo: "+actual.getValor() + " nodo anterior: "+actual.getAnterior().getValor()+" nodo siguiente: "+actual.getSiguiente().getValor());
            actual = actual.getSiguiente();
        }
        
    }
    
}
