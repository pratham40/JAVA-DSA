package HeapAndPriorityQueue;

import java.util.Arrays;

public class Implementation {
    int heapSize;
    int[] heap;
    int capacity;
    public Implementation(int[] arr){
        heap=arr;
        heapSize=arr.length;
        capacity=arr.length;
    }
    public void buildTree(){
        // N/2 -> N-1 Leaf Node
        // 0 -> N/2-1

        for (int index = heapSize-1; index >=0 ; index--) {
            heapify(index);
        }
    }
    public void swap(int i,int j){
        int temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }

//    Max heapify
    public void heapify(int idx){
        int largest=idx;
        int lci=2*idx+1;
        int rci=2*idx+2;
        if (lci<heapSize && heap[lci]>heap[idx]){
            largest=lci;
        }
        if(rci<heapSize && heap[rci]>heap[largest]){
            largest=rci;
        }
        if(largest!=idx){
            swap(idx,largest);
            heapify(largest);
        }
    }

    public int extractMax(){
        if (heapSize==0){
            System.err.print("Heap is empty");
            return Integer.MIN_VALUE;
        }
        int max=heap[0];
        heap[0]=heap[heapSize-1];
        heapSize--;
        heapify(0);
        return max;
    }

    public void increaseKey(int idx,int newValue){
        if (idx>=heapSize || idx<0 || heap[idx]>=newValue){
            System.err.println("Wrong operation");
            return;
        }
        heap[idx]=newValue;
        while (idx>0 ){
            int pi=(int)Math.ceil(idx/2.0)-1;
            if (heap[idx]>heap[pi]){
                swap(idx,pi);
                idx=pi;
            }
        }
    }


    public void decreaseKey(int idx,int newValue){
        if (idx>=heapSize || idx<0 || heap[idx]<=newValue){
            System.err.println("Wrong operation");
            return;
        }
        heap[idx]=newValue;
        heapify(idx);
    }

    public void insert(int newValue){
        if (heapSize+1>=capacity){
            increaseCapacity();
        }
        heapSize++;
        heap[heapSize-1]=newValue;
        int idx=heapSize-1;
        while (idx>0 ){
            int pi=(int)Math.ceil(idx/2.0)-1;
            if (heap[idx]>heap[pi]){
                swap(idx,pi);
                idx=pi;
            }
        }
    }

     public void increaseCapacity() {
        capacity*=2;
        int[] newHeap=new int[capacity];
        for (int i = 0; i < heapSize; i++) {
            newHeap[i]=heap[i];
        }
        heap=newHeap;
    }

    public int[] heapSort(){
        buildTree();
        int size=heapSize;
        for (int i = 0; i < size-1; i++) {
            extractMaxAndStore();
        }
        return heap;
    }

    private void extractMaxAndStore() {
        if (heapSize==0){
            System.err.print("Heap is empty");
            return;
        }
        int max=heap[0];
        heap[0]=heap[heapSize-1];
        heap[heapSize-1]=max;
        heapSize--;
        heapify(0);
    }

    public void printTree(){
        for (int i = 0; i < heapSize; i++) {
            System.out.print(heap[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,5,20,6,11};
        Implementation heap = new Implementation(arr);
//        heap.buildTree();
//        heap.printTree();
//        System.out.println(heap.extractMax());
//        heap.printTree();
//        heap.increaseKey(4,25);
//        heap.decreaseKey(0,1);
//        heap.insert(21);
//        heap.printTree();
        System.out.println(Arrays.toString(heap.heapSort()));
    }
}
