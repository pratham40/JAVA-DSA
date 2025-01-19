package Heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(20);
        list.add(10);
        list.add(50);
        list.add(60);

//        int ele = 70;
//        insert_in_MinHeap(list, ele);
//        System.out.println(list);
//        insert_in_MaxHeap(list, ele);
//        System.out.println(list);

        // Delete the root element from the MinHeap
//        deletion_in_min_heap(list);
//        System.out.println(list);
        deletion_in_max_heap(list);
        System.out.println(list);
    }

    private static void deletion_in_max_heap(List<Integer> heap) {
        swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);
        push_down_maxheap(heap,0);
    }

    private static void push_down_maxheap(List<Integer> heap, int idx) {
        int largest = idx;
        int lci = 2*idx+1;
        int rci = 2*idx+2;
        if (lci<heap.size() && heap.get(lci)>heap.get(largest)){
            largest=lci;
        }
        if (rci<heap.size() && heap.get(rci)>heap.get(largest)){
            largest=rci;
        }
        if (largest!=idx){
            swap(heap,idx,largest);
            push_down_maxheap(heap,largest);
        }
    }

    private static void deletion_in_min_heap(List<Integer> heap) {
        // Swap the root element with the last element
        swap(heap, 0, heap.size() - 1);

        // Remove the last element
        heap.remove(heap.size() - 1);

        // Restore the heap property
        push_down_minheap(heap, 0);
    }

    private static void push_down_minheap(List<Integer> heap, int idx) {
        int n = heap.size();
        int smallestIdx = idx;
        int lci = 2 * idx + 1; // Left child index
        int rci = 2 * idx + 2; // Right child index

        // Check left child
        if (lci < n && heap.get(lci) < heap.get(smallestIdx)) {
            smallestIdx = lci;
        }

        // Check right child
        if (rci < n && heap.get(rci) < heap.get(smallestIdx)) {
            smallestIdx = rci;
        }

        // If smallest is not the current node, swap and recurse
        if (smallestIdx != idx) {
            swap(heap, idx, smallestIdx);
            push_down_minheap(heap, smallestIdx);
        }
    }

    public static void insert_in_MinHeap(List<Integer> heap, int ele) {
        // Add the element at the end
        heap.add(ele);

        // Push up to restore MinHeap property
        int idx = heap.size() - 1;
        push_up_in_minheap(heap, idx);
    }

    public static void insert_in_MaxHeap(List<Integer> heap, int ele) {
        // Add the element at the end
        heap.add(ele);

        // Push up to restore MaxHeap property
        int idx = heap.size() - 1;
        push_up_in_maxheap(heap, idx);
    }

    private static void push_up_in_maxheap(List<Integer> heap, int idx) {
        int parentIdx = (idx - 1) / 2;

        // Base condition: if idx is root or parent is greater than or equal to child
        if (idx == 0 || heap.get(parentIdx) >= heap.get(idx)) {
            return;
        }

        // Swap with parent
        swap(heap, idx, parentIdx);

        // Recursive call for parent
        push_up_in_maxheap(heap, parentIdx);
    }

    private static void push_up_in_minheap(List<Integer> heap, int idx) {
        int parentIdx = (idx - 1) / 2;

        // Base condition: if idx is root or parent is less than or equal to child
        if (idx == 0 || heap.get(parentIdx) <= heap.get(idx)) {
            return;
        }

        // Swap with parent
        swap(heap, idx, parentIdx);

        // Recursive call FOR parent
        push_up_in_minheap(heap, parentIdx);
    }

    private static void swap(List<Integer> heap, int i, int j) {
        // Swap two elements in the heap
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
