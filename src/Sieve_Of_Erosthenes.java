public class Sieve_Of_Erosthenes {
    public static void main(String[] args) {
        int[] arr=new int[101];   // 0 prime  1 not prime
        for (int i=2;i<10;i++){
            if (arr[i]==0){
                for (int j=i*i;j<100;j+=i){
                    arr[j]=1;
                }
            }
        }
//        Time complexity O(NLogLogN)
//        Space Complexity O(N)

        for (int i = 0; i < 100; i++) {
            if (arr[i]==0){
                System.out.println(i+" ");
            }
        }
    }
}
