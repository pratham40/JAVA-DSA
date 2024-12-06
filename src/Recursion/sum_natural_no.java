package Recursion;

public class sum_natural_no {

    static void print_n_natural_no(int n) {
        if (n==1){
            System.out.println(n);
            return;
        }
//        System.out.println(n);  reverse
        print_n_natural_no(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n=5;
//        int sum=0;
//        System.out.println(sum_n_natural_no(n));
//        print_n_natural_no(n);
        System.out.println(sum_n_natural_no(n));
    }



    private static int sum_n_natural_no(int n) {
        if (n==1){
            return 1;
        }
        int sum=n+sum_n_natural_no(n-1);  // Recurrence relation
        return sum;
    }
}
