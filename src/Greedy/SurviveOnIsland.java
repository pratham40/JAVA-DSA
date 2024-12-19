package Greedy;

public class SurviveOnIsland {
    public static void main(String[] args) {
        int s=10; // survive
        int n=16; // max unit of food buy
        int m=2; // unit of food required each day

        int total_food_required=s*m;
        double res=0;
        if (m>n || (7*m)>(6*n)) {
            res=-1;
        }else {
            res=(int)Math.ceil((double) total_food_required /n);
        }
        System.out.println(res);
    }
}
