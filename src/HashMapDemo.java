import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
//        map.put('A',65);
//        map.put('B',66);
//        map.put('C',67);
//        map.put('D',68);
//        map.put('E',69);
//        map.put('F',70);
//        map.put(null,555);
//        System.out.println(map);
//        System.out.println(map.containsKey('A'));

//        for (char a: map.keySet()){
//            System.out.println(a + " "+map.get(a));
//        }

        char[] a = {'A','B','C','A','B','C','D','E','A','F'};
        for (char c : a) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        System.out.println(map);



    }
}
