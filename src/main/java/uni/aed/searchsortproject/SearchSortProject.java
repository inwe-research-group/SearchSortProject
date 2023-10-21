package uni.aed.searchsortproject;

import uni.aed.directorio.Directorio;
import uni.aed.directorio.DirectorioV1;
import uni.aed.gui.FrmAED;
import uni.aed.model.Persona;
import uni.aed.ordenamiento.SortObject;

public class SearchSortProject {

    public static void main(String[] args) {        
        FrmAED v=new FrmAED();
        v.setVisible(true);          
    }
    
    private static void Enteros(){
        Integer X[] = { 12, 11, 13, 5, 6, 7 };        
        //Integer X[] = {13, 5, 6, 7 };        +-
        Object Y[];
        SortObject ob = new SortObject();
        Y=ob.HeapSort(X);

        System.out.println("El Array ordenado es");
        for(int i=0;i<Y.length;i++)
            System.out.println("Y["+i+"]= " + Y[i]);
    }
    private static void Cadenas(){
        String X[] = { "Zamir", "Ana", "Pedro","Rosa" };                
        Object Y[];
        SortObject ob = new SortObject();
        Y=ob.HeapSort(X);

        System.out.println("El Array ordenado es");
        for(int i=0;i<Y.length;i++)
            System.out.println("Y["+i+"]= " + Y[i]);
    }
    
    private static void Personas(){
        Persona p1,p2,p3;
        Directorio ab = new DirectorioV1(3); 
        Object Y[];
        p1 = new Persona("Zamir",30,'M');
        ab.add(p1);
        p2 = new Persona("Juan",20,'M');
        ab.add(p2);
        p3 = new Persona("Beatriz",50,'F');
        ab.add(p3);
        
        Y=ab.sort(0);
        System.out.println("El Array ordenado es");
        for(int i=0;i<Y.length;i++)
            System.out.println("Y["+i+"]= " + Y[i].toString());
        
        /*
        for(Persona p: ab.getEntry())
            System.out.println(p.toString());*/
    }
    
    private static void Personas1(){
        Persona p1,p2,p3,p4;        
        Persona X[]=new Persona[4];        
        p1 = new Persona("Zamir",30,'M');
        X[0]=p1;
        p2 = new Persona("Juan",20,'M');
        X[1]=p2;
        p3 = new Persona("Beatriz",50,'F');
        X[2]=p3;
        p4 = new Persona("Ana",18,'F');
        X[3]=p4;
        
        X[0].setCompareAttribute(0);
        Object Y[];
        SortObject ob = new SortObject();
        Y=ob.HeapSort(X);
        
        System.out.println("El Array ordenado es");
        for(int i=0;i<Y.length;i++)
            System.out.println("Y["+i+"]= " + Y[i].toString());
    }
    private static void TestPersonaOrihuela(){
        Object p1,p2,p3,p4;        
        Object X[]=new Persona[4];        
        p1 = new Persona("Zamir",30,'M');
        X[0]=p1;
        p2 = new Persona("Juan",20,'M');
        X[1]=p2;
        p3 = new Persona("Beatriz",50,'F');
        X[2]=p3;
        p4 = new Persona("Ana",18,'F');
        X[3]=p4;
        
        //X[0].setCompareAttribute(0);
        Object Y[];
        SortObjectOrihuela ob = new SortObjectOrihuela();
        ob.iniciaDatos(X);
        ob.heapSort();
        Y=ob.getSortedArray();
        
        System.out.println("El Array ordenado es");
        for(int i=0;i<Y.length;i++)
            System.out.println("Y["+i+"]= " + Y[i].toString());
    }
    private static void TestIntegerOrihuela(){        
        Object X[]=new Integer[4];                
        X[0]=25;        
        X[1]=7;        
        X[2]=30;        
        X[3]=1;
        
        //X[0].setCompareAttribute(0);
        Object Y[];
        SortObjectOrihuela ob = new SortObjectOrihuela();
        ob.iniciaDatos(X);
        ob.heapSort();
        Y=ob.getSortedArray();
        
        System.out.println("El Array ordenado es");
        for(int i=0;i<Y.length;i++)
            System.out.println("Y["+i+"]= " + Y[i].toString());
    }
}
