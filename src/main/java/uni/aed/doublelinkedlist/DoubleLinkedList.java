package uni.aed.doublelinkedlist;

public class DoubleLinkedList {
    Nodo head;
    Nodo ultimo;
    
    public void addFirst(int data){
        Nodo newNodo=new Nodo(data);
        if(head==null){
            head=newNodo;
            ultimo=newNodo;
        }else{
            newNodo.next=head;
            head.prev=newNodo;
            head=newNodo;
        }
    }
    public void addLast(int data){
        Nodo newNodo=new Nodo(data);
        if(ultimo==null){
            head=newNodo;
            ultimo=newNodo;            
        }else{
            newNodo.prev =ultimo;
            ultimo.next=newNodo;
            ultimo=newNodo;            
        }
    }
    public void remove(int valor){
        Nodo actual =head;
        while(actual!=null && actual.data!=valor){
            actual=actual.next;
        }
        if(actual!=null){
            if(actual==head){
                head=head.next;
                if(head!=null)
                    head.prev=null;
                else
                    ultimo=null;                
            }else if(actual==ultimo){
                ultimo=actual.prev;
                ultimo.next=null;
            }else{
                actual.prev.next=actual.next;
                actual.next.prev=actual.prev;
            }
        }
    }
    
    public void clear(){
        head=null;
        ultimo=null;
    }
    
    public Nodo get(int index) {
        if (index < 0) {
            return null;
        }

        Nodo temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                return null;
            }
            temp = temp.next;
        }

        return temp;
    }
    
    public int size() {
        int contador = 0;
        Nodo temp = head;
        while (temp != null) {
            contador++;
            temp = temp.next;
        }
        return contador;
    }
    
    public void set(int index, Nodo nodo) {
        if (index < 0) {
            return;
        }

        Nodo temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                return;
            }
            temp = temp.next;
        }

        if (temp != null) {
            temp.data = nodo.data;
        }
    }

    
    public String toString(){
        Nodo actual=head;
        String lista="";
        while(actual!=null){
            if(actual.prev==null)
                lista="null<-"+actual.data+"->"+actual.next.data;
            else if(actual.next==null)
                lista=lista+"||"+actual.prev.data+"<-"+
                        actual.data+"->null";
            else
                lista=lista+"||"+actual.prev.data+"<-"+actual.data+"->"+
                        actual.next.data;
            actual=actual.next;
        }
        return lista;
    }
    
    public void restriccion() {        
        int currentIndex = size() - 1;        
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            
            if (get(currentIndex).data <= get(parentIndex).data)
                break;            
            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
        }
    }
    
    public void sort() {
        restriccion();
        int n = size();
        
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
        
        if (leftChild < n && get(leftChild).data > get(largest).data)
            largest = leftChild;
        
        if (rightChild < n && get(rightChild).data > get(largest).data)
            largest = rightChild;
        
        if (largest != i) {
            swap(i, largest);
            heapify(n, largest);
        }
    }
    
    private void swap(int i, int j) {        
        Nodo temp = new Nodo (get(i).data);   
        set(i, get(j));
        set(j, temp);
    }
    
}
