package uni.aed.wu.cap19stack;

public interface StackTDA<E> {
    public void clear();
    public boolean isEmpty();
    public E peek() throws StackEmptyExceptionTDA;
    public E pop() throws StackEmptyExceptionTDA;
    public void push(E elemento);
    public int size();    
}
