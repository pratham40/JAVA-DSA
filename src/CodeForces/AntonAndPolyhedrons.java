package CodeForces;

import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.next();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Tetrahedron")){
                sum+=4;
            } else if (arr[i].equals("Cube")) {
                sum+=6;
            } else if (arr[i].equals("Octahedron")) {
                sum+=8;
            } else if (arr[i].equals("Dodecahedron")) {
                sum+=12;
            } else {
                sum+=20;
            }
        }
        System.out.println(sum);
    }
}
