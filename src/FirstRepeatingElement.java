import java.util.ArrayList;
import java.util.HashMap;

public class FirstRepeatingElement {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer integer : A) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }
        for(int val:map.keySet()){
            if(map.get(val)>1){
                return val;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;
        list.sort(null);
    }
}
