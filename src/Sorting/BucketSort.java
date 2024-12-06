package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bucketSort(float[] arr) {
//        create bucket
        ArrayList<Float>[] bucket = new ArrayList[arr.length];
//        create empty bucket
        for (int i = 0; i < arr.length; i++) {
            bucket[i] = new ArrayList<>();
        }
//        add element
        for (int i = 0; i < arr.length; i++) {
            int bucketIndex = (int) arr[i] * arr.length;
            bucket[bucketIndex].add(arr[i]);
        }
//        Sort
        for (int i = 0; i < bucket.length; i++) {
            Collections.sort(bucket[i]);
        }
//        Merge
        int idx = 0;
        for (int i = 0; i < bucket.length; i++) {
            ArrayList<Float> currBucket = bucket[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[idx++] = currBucket.get(j);
            }
        }
    }
}
