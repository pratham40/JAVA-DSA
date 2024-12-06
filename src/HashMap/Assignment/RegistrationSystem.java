package HashMap.Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
                System.out.println("OK");
            } else {
                System.out.println(arr[i] + map.get(arr[i]));
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
    }
}