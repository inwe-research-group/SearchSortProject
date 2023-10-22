package uni.aed.drozdek.cap4stack;

import java.util.Scanner;

public class Cap4Stack {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);                
        int opcion=1;		
	String Rpta="S";				
	String SEPARADOR="\n";	                
	do			
	{
            System.out.print("Estructura de Datos de Tipo Pila - OPERACIONES DEL SISTEMA"+SEPARADOR+
                "1.- Pila con ArrayList "+SEPARADOR+
                "2.- Pila con LinkedList "+SEPARADOR+                     
                "4.- Salir "+SEPARADOR+"Elija una opcion:");
            opcion =scr.nextInt();
            switch (opcion)
            {
		case 1 -> {testArrayStackTDA();}
                case 2 -> {testLinkedStackTDA();}                                
                case 4 -> {break;}
                default -> {break;}
            }	
            System.out.print("Para continuar pulsa S; Para finalizar pulse N: ");
            Rpta=scr.next().toUpperCase();			
        }while(Rpta.equals("S")==true);	
    }
    
    public static void testArrayStackTDA(){
        ArrayStack arrayStack = new ArrayStack(4);        
        System.out.println(arrayStack.peek());
        arrayStack.push(4);
        arrayStack.push(3);
        arrayStack.push(2);
        arrayStack.push(1);
        arrayStack.push(0);
        System.out.println("*Despues de ingresar elementos en la Pila*");        
        System.out.println(arrayStack.toString());
        
        arrayStack.pop();
        System.out.println("*Despues de eliminar un elemento de la Pila*"); 
        System.out.println(arrayStack.toString());
        
        System.out.println("El elemento top en la pila es: "+ arrayStack.peek());
        
        System.out.println("*Limpiando la Pila*");
        arrayStack.clear();        
        System.out.println(arrayStack.toString());
    }
     public static void testLinkedStackTDA(){
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push();
        linkedListStack.push();
        linkedListStack.push();
        
        System.out.println("*Despues de ingresar elementos en la Pila*");        
        System.out.println(linkedListStack.toString());
        
        linkedListStack.pop();
        System.out.println("*Despues de eliminar un elemento de la Pila*"); 
        System.out.println(linkedListStack.toString());
        
        System.out.println("El elemento top en la pila es: "+ linkedListStack.peek());
        
        System.out.println("*Limpiando la Pila*");
        linkedListStack.clear();        
        System.out.println(linkedListStack.toString());
    }
}
