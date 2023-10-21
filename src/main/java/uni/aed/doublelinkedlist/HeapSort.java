package uni.aed.doublelinkedlist;

public class HeapSort {
    private DoubleLinkedList heap;
    
    public HeapSort() {
        heap = new DoubleLinkedList();
    }
    
    public void add(int data) {
        Nodo newNodo = new Nodo(data);
        heap.addLast(newNodo.data);
        int currentIndex = heap.size() - 1;
        
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;            
            if (heap.get(currentIndex).data <= heap.get(parentIndex).data)
                break;            
            swap(currentIndex, parentIndex);            
            currentIndex = parentIndex;
        }
    }
    
    public void sort() {
        int n = heap.size();
        
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(n, i);
        
        for (int i = n - 1; i >= 0; i--) {
            swap(0, i);
            heapify(i, 0);
        }
    }
    
    private void heapify(int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        
        if (leftChild < n && heap.get(leftChild).data > heap.get(largest).data)
            largest = leftChild;
        
        if (rightChild < n && heap.get(rightChild).data > heap.get(largest).data)
            largest = rightChild;
        
        if (largest != i) {
            swap(i, largest);
            heapify(n, largest);
        }
    }
    
    private void swap(int i, int j) {
        Nodo temp = new Nodo (heap.get(i).data);        
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    
    public String toString(){
        return heap.toString();
    }
}
