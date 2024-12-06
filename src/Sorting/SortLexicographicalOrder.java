package Sorting;
import java.util.ArrayList;
import java.util.Arrays;

public class SortLexicographicalOrder {
    public static void main(String[] args) {
        String[] fruits = {"kiwi","apple","papaya","mango"};
        System.out.println(Arrays.toString(sortedLexicographical(fruits)));
    }

    private static String[] sortedLexicographical(String[] fruits) {
        for (int i = 0; i < fruits.length-1; i++) {
            int min_index=i;
            for (int j = i+1; j < fruits.length; j++) {
                if (fruits[j].compareTo(fruits[min_index])<0){
                    min_index=j;
                }
            }

            String temp = fruits[i];
            fruits[i]=fruits[min_index];
            fruits[min_index]=temp;
        }
        return fruits;
    }
}
