package OOPS;

import java.util.Arrays;

public class arrayList {

   public static class Arraylist<I extends Number> {
        int[] arr= new int[5];
        int index=0;
        public void add(int ele){
            if (index==arr.length){
                arr= Arrays.copyOf(arr,arr.length*2);
            }

            arr[index]=ele;
            index++;
        }

        public int size(){
            return index;
        }

        public void set(int index,int element){
            if (index>arr.length){
                arr= Arrays.copyOf(arr,index+1);
            }
            arr[index]=element;
        }

        public int get(int index){
            return arr[index];
        }
    }

    public static void main(String[] args) {
        Arraylist<Number> arr = new Arraylist<Number>();
        arr.add(2);
        arr.add(4);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(4);
        arr.add(3);
        System.out.println(arr.size());
        arr.set(20,12);
        System.out.println(arr.size());

        System.out.println(arr.get(20));
    }
}
