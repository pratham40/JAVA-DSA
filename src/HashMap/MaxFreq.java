package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MaxFreq {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,4};
        Map<Integer,Integer> mp = new HashMap<>();
        for(int el:arr){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            }
            else{
                mp.put(el,mp.get(el)+1);
            }
        }
        System.out.println(mp.entrySet());
        int mxFreq=0;
        for(var e:mp.entrySet()){
            if(e.getValue()>mxFreq){
                mxFreq=e.getValue();
            }
        }
        System.out.println(mxFreq);
    }
}
