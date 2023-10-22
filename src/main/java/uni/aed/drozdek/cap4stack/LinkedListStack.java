package uni.aed.drozdek.cap4stack;

public class LinkedListStack {
    private Node topNode;
    private int currentDataValue = 10;
    public LinkedListStack ()
    {
        topNode = null;
    }
    public boolean isEmpty ()
    {
        if (topNode == null)
            return true;
        else
            return false;
    }

    public void push ()
    {
        Node temp = new Node (currentDataValue, topNode);
        currentDataValue += 10;
        topNode = temp;
    }
    public int peek ()
    {
        Node top;
        if (isEmpty() == false)
        {
            top = topNode;
            return top.data;
        }
        return -1;
    }

    public int pop ()
    {
        Node top;
        if (isEmpty() == false)
        {
            top = topNode;
            topNode = topNode.next;
            return top.data;
        }
        return -1;
    }

    public void clear ()
    {
        while (topNode != null)
             topNode = topNode.next;
    }    
    
    @Override
    public String toString(){
        String result="";
        Node current = topNode;

        while (current != null) {
            if (result.length()==0)
                result="" + current.data;
            else
                result=result  + "->" + current.data;
            current = current.next;
        }
        
        return result;
    }
}
