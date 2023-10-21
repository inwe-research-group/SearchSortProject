package uni.aed.ordenamiento;
import java.util.Scanner;
/** 
 * Clase que realiza Entrada de datos en el array, Invoca metodos de ordenamiento por burbuja,insercion,seleccion
 * Array de Ej. para las pruebas de func. del metodo de o.burbuja: X={10, 40, 20, 30, 50}
 * Array de Ej. para las pruebas de func. del metodo de o.insercion: 5,14,24,39,43,65,84,45
 * Array de Ej. para las pruebas de func. del metodo de o.seleccion: 320,96,16,90,120,80,200,64 
 * Array de Ej. para las pruebas de func. del metodo de o.shell: 6,1,5,2,3,4,0 *  
 * Array de Ej. para las pruebas de func. del metodo de o.quicksort:N=12 {50,30,20,80,90,70,95,85,10,15,75,25} *  
 * Array de Ej. para las pruebas de func. del metodo de o.mergesort: 8,3,13,6,2,14,5,9,10,1,7,12,4 *  
 * Array de Ej. para las pruebas de func. del metodo de o.heapsort:N=9 {90, 84, 44, 77, 12, 5, 38, 17, 23 }
 * {90, 44, 84, 12, 77, 23, 38, 5, 17} *  
 * @author 20231.uni.fc.cc.aed
 */
public class Cap11Ordenamiento {

    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        int opcion=1;		
	String Rpta="S";				
	String SEPARADOR="\n";	        
        Integer[] X = null;        
        do			
	{	
            System.out.print("Métodos de Ordenamiento - Metodo de Carga de Datos en el Array"+SEPARADOR+
                "1.- Manual "+SEPARADOR+
                "2.- Aleatorio "+SEPARADOR+                
                "3.- Salir "+SEPARADOR+"Elija una opcion:");
            opcion =scr.nextInt();
            switch (opcion)
            {
		case 1 -> {X=CargaManual(); MenuMetodosOrdenamiento(X);}
                case 2 -> {X=CargaAleatoria(); MenuMetodosOrdenamiento(X);}                
		case 3 -> {break;}                
                default -> {break;}
            }	            
            System.out.print("Para continuar con el proceso de Carga del Array pulsa S; Para finalizar pulse N: ");
            Rpta=scr.next().toUpperCase();			
        }while(Rpta.equals("S")==true);	
        
    }
    private static Integer[] CargaManual()
    {   Scanner scr =new Scanner(System.in);         
        System.out.print("Ingrese el tamaño N del Array= ");
        int N=scr.nextInt();
        Integer[] X=new Integer[N];        
        for(int i=0;i<X.length;i++)
        {
            System.out.print("Ingrese el valor de X["+i+"]= ");
            X[i]=scr.nextInt();                
        }     
        return X;
    }
            
    private static Integer[] CargaAleatoria()
    {   Scanner scr =new Scanner(System.in);         
        System.out.print("Ingrese el tamaño N del Array= ");
        int N=scr.nextInt();
        Integer[] X=new Integer[N];        
        for(int i=0;i<X.length;i++)
        {
            X[i]=random(0, X.length-1);                
        }   
        return X;
    }
    private static int random(int low, int high) {
        return (int) Math.floor(Math.random() * (high - low + 1))
                      + low;
    }
    
    private static void MenuMetodosOrdenamiento(Integer[] X)
    {   Scanner scr =new Scanner(System.in);
        int opcion=1;		
	String Rpta="S";
        String SEPARADOR="\n";
        Integer[] Y=null;
        Ordenamiento o = new Ordenamiento();	
        if (X.length==0) return; else Y=X.clone();
        do			
        {	
            X=Y.clone();
            System.out.println("-------Array Inicial--------");
            imprimir(X);
            System.out.print("Métodos de Ordenamiento - OPERACIONES DEL SISTEMA"+SEPARADOR+
                "1.- O.Burbuja1 "+SEPARADOR+
                "2.- O.Burbuja2 "+SEPARADOR+
                "3.- O.Burbuja3 "+SEPARADOR+
                "4.- O.Wu.Burbuja "+SEPARADOR+
                "5.- O.Insercion "+SEPARADOR+
                "6.- O.Insercion Binaria "+SEPARADOR+
                "7.- O.Seleccion4c "+SEPARADOR+
                "8.- O.Wu.Seleccion "+SEPARADOR+
                "9.- O.ShellSort "+SEPARADOR+ 
                "10.- O.QuickSort "+SEPARADOR+
                "11.- O.MergeSort "+SEPARADOR+
                "12.- O.HeapSort "+SEPARADOR+
                "13.- Imprimir"+SEPARADOR+
                "14.- Salir "+SEPARADOR+"Elija una opcion:");
            opcion =scr.nextInt();
            switch (opcion)
            {
                case 1 -> {imprimir(o.burbuja(X));}
//                case 1 -> {imprimir(o.burbuja1(X));}
//                case 2 -> {imprimir(o.burbuja2(X));}
//                case 3 -> {imprimir(o.burbuja3(X));}
//                case 4 -> {imprimir(o.WuBubbleSort(X));}
                case 5 -> {imprimir(o.insercion(X));}
                case 6 -> {imprimir(o.insercionBinaria(X));}
                case 7 -> {imprimir(o.seleccion4c(X));}
//                case 8 -> {imprimir(o.WuSelectionSort(X));}
                case 9 -> {imprimir(o.ShellSort(X));}
                case 10 -> {imprimir(o.CallQuickSort(X));}
                case 11 -> {imprimir(o.CallMergeSort(X));}
                case 12 -> {imprimir(o.HeapSort(X));}
                case 13 -> {break;}
                case 14 -> {break;}
                default -> {break;}
            }	
            System.out.print("Para continuar con otros metodos de Ordenamiento pulsa S; Para finalizar pulse N: ");
            Rpta=scr.next().toUpperCase();			
        }while(Rpta.equals("S")==true);	
    }
    
    private static void imprimir(Integer[] X)
    {
        //Salida
        for(int i=0;i<X.length;i++)
            System.out.println("X["+i+"]= " + X[i]);
    }
}
