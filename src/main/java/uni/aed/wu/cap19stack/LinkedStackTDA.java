package uni.aed.wu.cap19stack;
import uni.aed.linkedlistTDA.Nodo;

public class LinkedStackTDA<E> implements StackTDA<E> {
    private Nodo topPila;
    private int contador;
    
    public LinkedStackTDA() {
        clear();
    }
    public void clear(){
        topPila=null;
        contador=0;
    }
    public boolean isEmpty(){
        return (contador==0);
    }
    public E peek()throws StackEmptyExceptionTDA{
        if(isEmpty())
            throw  new StackEmptyExceptionTDA();
        else
            return (E)topPila.getData();
    }
    public E pop()throws StackEmptyExceptionTDA{
        if(isEmpty())
            throw  new StackEmptyExceptionTDA();
        else{
            contador--;
            E temp=(E)topPila.getData();
            topPila=topPila.getNext();
            return temp;
        }
    }
    public void push(E elementos){
        Nodo newTope=new Nodo(elementos);
        newTope.setNext(topPila);
        topPila=newTope;
        contador++;
    }
    public int size(){
        return contador;
    }
    
    @Override
    public String toString(){
        String result="";
        Nodo current = topPila;

        while (current != null) {
            if (result.length()==0)
                result="" + current.getData();
            else
                result=result  + "->" + current.getData();
            current = current.getNext();
        }
        
        return result;
    }    
}
