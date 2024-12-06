package Geek_For_Geek;

public class MajorityElement {
    static boolean isMajority(int[] arr,int candidate){
        int count=0;
        int n =arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==candidate){
                count++;
            }
        }
        return count > n / 2;
    }
    static int majorityElement(int a[], int size)
    {
        // your code here
        int candidate=-1;
        int vote=0;
        for (int i = 0; i < size; i++) {
            if (vote==0){
                candidate=a[i];
                vote=1;
            } else {
                if (a[i]==candidate){
                    vote++;
                }
                else{
                    vote--;
                }
            }
        }
        return isMajority(a,candidate)?candidate:-1;
    }
    public static void main(String[] args) {

        int[] A = {3,1,3,3,2};
        int N = A.length;
        System.out.println(majorityElement(A,N));
    }
}
