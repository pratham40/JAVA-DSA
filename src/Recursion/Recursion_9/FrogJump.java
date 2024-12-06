package Recursion.Recursion_9;

public class FrogJump {
    static int frogJump(int[] height,int index){
        if (index==height.length-1){
            return 0;
        }
        int smallCase1=Math.abs(height[index]-height[index+1])+frogJump(height,index+1);
        if (index==height.length-2){
            return smallCase1;
        }
        int smallCase2=Math.abs(height[index]-height[index+2])+frogJump(height,index+2);

        return Math.min(smallCase1,smallCase2);
    }
    public static void main(String[] args) {
        int[] h={10,30,40,20};
        System.out.println(frogJump(h,0));
    }
}
