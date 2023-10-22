package uni.aed.wu.cap19stack;
import uni.aed.listTDA.ListTDA;
import uni.aed.linkedlistTDA.LinkedListTDA;


public class ListStackTDA<E> implements StackTDA<E>{
    private static final int FRENTE=0;
    private final ListTDA<E> lista;
    public ListStackTDA() {
        lista=new LinkedListTDA<>();
    }  
    
    @Override
    public void clear(){
        lista.clear();
    }
    @Override
    public boolean isEmpty(){
        return lista.isEmpty();
    }
    @Override
    public E peek() throws StackEmptyExceptionTDA{
        if(isEmpty())
           throw new StackEmptyExceptionTDA(); 
        else
            return lista.get(FRENTE);
    }
    @Override
    public E pop() throws StackEmptyExceptionTDA{
        if (isEmpty())
            throw new StackEmptyExceptionTDA(); 
        else
            return lista.delete(FRENTE);
    }
    @Override
    public void push(E elemento){
        lista.add(FRENTE, elemento);
    }
    @Override
    public int size(){
        return lista.size();
    }    
    @Override
    public String toString(){
        return lista.toString();
    }
}
