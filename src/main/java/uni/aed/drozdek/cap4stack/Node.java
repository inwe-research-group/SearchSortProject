package uni.aed.drozdek.cap4stack;

public class Node {
    protected int data;
    protected Node next;
    protected Node ()
    {
        data = 0;
        next = null;
    }
    protected Node (int startingData)
    {
        data = startingData;
        next = null;
    }

    protected Node (Node startingNext)
    {
        data = 0;
        next = startingNext;
    }
    protected Node (int startingData, Node nextNode)
    {
        data = startingData;
        next = nextNode;
    }
    public String toString ()
    {
        String s = new String ();
        s = s + data;
        return s;
    }
}
