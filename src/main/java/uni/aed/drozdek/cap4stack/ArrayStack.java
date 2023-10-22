package uni.aed.drozdek.cap4stack;

public class ArrayStack {
    private int [] stack;
    private int topOfStack;
    private static final int DEFAULT_MAX_SIZE = 100;
    public ArrayStack ()
    {
        stack = new int[DEFAULT_MAX_SIZE];
        topOfStack = -1;
    }
    public ArrayStack (int maxSize)
    {
        stack = new int[maxSize];
        topOfStack = -1;
    }
        public boolean isFull ()
    {
        if (topOfStack >= (stack.length-1))
            return true;
        else
            return false;
    }

    public boolean isEmpty ()
    {
        if (topOfStack < 0)
            return true;
        else
            return false;
    }

    public void push (int newValue)
    {
        if (isFull() == true)
        {
            System.out.println("Stack is full, unable to add element");
            return;
        }
        topOfStack++;
        stack[topOfStack] = newValue;
    }

    public int peek ()
    {
        if (isEmpty() == false)
            return stack[topOfStack];
        else
            return -1;
    }

    public int pop ()
    {
        int top;
        if (isEmpty() == false)
        {
            top = stack[topOfStack];
            stack[topOfStack] = -1;
            topOfStack--;
        }
        else        
            top = -1;        
        return top;
    }

    public void clear ()
    {
        while (topOfStack >= 0)
        {
            stack[topOfStack] = -1;
            topOfStack--;
        }
    }
    @Override
    public String toString(){
        String result="";
        int current=topOfStack;
        while (current >= 0)
        {
            result= result +"\n"+ stack[current];
            current--;
        }
        return result;
    }
}
