package HashMap.Assignment;

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (var key:map.keySet()){
            if (map.get(key)>n/2){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}