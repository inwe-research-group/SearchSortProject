package uni.aed.wu.cap19stack;

import uni.aed.listTDA.IteratorTDA;
import uni.aed.listTDA.NoSuchElementException;

public class ArrayStackTDA<E> implements StackTDA<E> {
    private static final int TAM_DEFINIDO=25;
    private E[] elementos;
    private int contador;
    
    public ArrayStackTDA() {
        this(TAM_DEFINIDO);
    }

    public ArrayStackTDA(int tamanio) {        
        if(tamanio<=0){
            throw new IllegalArgumentException("Capacidad inicial debe ser positiva");
        }
        elementos=(E[])new Object[tamanio];
        contador=0;                    
    }
    
    public void clear(){
        for (int i=0;i<contador;i++){
            elementos[i]=null;
        }
        contador=0;
    }
    
    public boolean isEmpty(){
        return contador==0;
    }
    
    public E peek() throws StackEmptyExceptionTDA{
        if (isEmpty())
            throw new StackEmptyExceptionTDA();
        else
            return (E)elementos[contador-1];    
    }
    
    public E pop()throws StackEmptyExceptionTDA{
        if (isEmpty())
            throw new StackEmptyExceptionTDA();
        else{
            contador--;
            E item=elementos[contador];
            elementos[contador]=null;
            return item;
        }
    }
    public void push(E item){
        if(contador==elementos.length)
            expande();
        elementos[contador++]=item;
    }
    public int size(){
        return contador;
    }
    private void expande(){
        int nuevaLongitud=(int)(1.5*elementos.length);
        E[] temp=(E[])new Object[nuevaLongitud];
        for(int i=0;i<elementos.length;i++)        
            temp[i]=elementos[i];
        elementos=temp;        
    }
    
    @Override
    public String toString(){
        String result="";
        int current=size() - 1;
        while (current >= 0)
        {
            if (result.trim().length()==0)
                result= elementos[current].toString();
            else
                result= result +"\n"+ elementos[current].toString();
            current--;
        }
        return result;
    }
}
