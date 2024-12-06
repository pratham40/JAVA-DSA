package Recursion;

public class HCF {

    static int longDivisionApproach(int x,int y){
        while (x%y!=0 ){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    static int bruteForce(int x, int y){
        for (int i = Math.max(x,y) ; i >0; i--) {
            if (x%i==0 &&  y%i==0){
                return i;
            }
        }
        return 0;
    }

    static int euclidAlgorithm(int x,int y){
        if (y==0){
            return x;
        }
        return euclidAlgorithm(y,x%y);
    }

    public static void main(String[] args) {
        int x=15;
        int y=24;
        System.out.println(bruteForce(x,y));
        System.out.println(longDivisionApproach(x,y));
//        By Recursion
        System.out.println(euclidAlgorithm(x,y));
        /* LCM *GCD = x*y */
        System.out.println((x*y)/euclidAlgorithm(x,y));
    }
}
