package Heap;

import java.util.ArrayList;
import java.util.List;

public class HeapSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(20);
        list.add(10);
        list.add(50);
        list.add(60);
        System.out.println(list);
        heapify(list);
        System.out.println(list);
    }
    public static void heapify(List<Integer> list){ // build heap
        int firstNonLeafNode = (list.size()-1)/2;
        for (int i = firstNonLeafNode; i >=0; i--) {
            push_down_minheap(list,i);
        }

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

    private static void swap(List<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i,heap.get(j));
        heap.set(j,temp);
    }


}
