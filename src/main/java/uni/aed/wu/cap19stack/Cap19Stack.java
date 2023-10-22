package uni.aed.wu.cap19stack;

import java.util.Scanner;

public class Cap19Stack {

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
                "3.- Pila con List "+SEPARADOR+     
                "4.- Salir "+SEPARADOR+"Elija una opcion:");
            opcion =scr.nextInt();
            switch (opcion)
            {
		case 1 -> {testArrayStackTDA();}
                case 2 -> {testLinkedStackTDA();}                
                case 3 -> {testListStackTDA();}                
                case 4 -> {break;}
                default -> {break;}
            }	
            System.out.print("Para continuar pulsa S; Para finalizar pulse N: ");
            Rpta=scr.next().toUpperCase();			
        }while(Rpta.equals("S")==true);	
    }
    
    public static void testArrayStackTDA(){
        ArrayStackTDA<String> pila = new ArrayStackTDA<>();
        pila.push("Jose");
        pila.push("Pedro");
        pila.push("Sandro");
        
        System.out.println("*Despues de ingresar elementos en la Pila*");
        System.out.println(pila.toString());
        
        System.out.println("El numero de elementos en la pila es: "+ pila.size());
        System.out.println("El elemento top en la pila es: "+ pila.peek());
        System.out.println(pila.toString());
        
        pila.pop();
        System.out.println("*Despues de eliminar un elemento de la Pila*");
        System.out.println("El numero de elementos en la pila es: "+ pila.size());
        System.out.println("El elemento top en la pila es: "+ pila.peek());
        System.out.println(pila.toString());
        
        pila.clear();
        System.out.println("*Limpiando la Pila*");
        System.out.println("El numero de elementos en la pila es: "+ pila.size());
        System.out.println(pila.toString());
    }
     public static void testLinkedStackTDA(){
        StackTDA<String> pila = new LinkedStackTDA<>();
        pila.push("Jose");
        pila.push("Pedro");
        pila.push("Sandro");
        
        System.out.println("*Despues de ingresar elementos en la Pila*");
        System.out.println(pila.toString());
        System.out.println("El numero de elementos en la pila es: "+ pila.size());
        System.out.println("El elemento top en la pila es: "+ pila.peek());
        System.out.println(pila.toString());
        
        pila.pop();
        System.out.println("*Despues de eliminar un elemento de la Pila*");
        System.out.println("El numero de elementos en la pila es: "+ pila.size());
        System.out.println("El elemento top en la pila es: "+ pila.peek());
        System.out.println(pila.toString());
        
        pila.clear();
        System.out.println("*Limpiando la Pila*");
        System.out.println("El numero de elementos en la pila es: "+ pila.size());        
        System.out.println(pila.toString());    
    }
     
     public static void testListStackTDA(){
        StackTDA<String> pila = new ListStackTDA<>();
        pila.push("Jose");
        pila.push("Pedro");
        pila.push("Sandro");
        
        System.out.println("*Despues de ingresar elementos en la Pila*");
        System.out.println(pila.toString()); 
        System.out.println("El numero de elementos en la pila es: "+ pila.size());
        System.out.println("El elemento top en la pila es: "+ pila.peek());
        System.out.println(pila.toString()); 
        
        pila.pop();
        System.out.println("*Despues de eliminar un elemento de la Pila*");
        System.out.println("El numero de elementos en la pila es: "+ pila.size());
        System.out.println("El elemento top en la pila es: "+ pila.peek());
        System.out.println(pila.toString()); 
        
        pila.clear();
        System.out.println("*Limpiando la Pila*");
        System.out.println("El numero de elementos en la pila es: "+ pila.size());        
        System.out.println(pila.toString());      
    } 
}
