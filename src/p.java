import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i=0;
        int j=s.length()-1;

        while(i<=j){
            if (!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            } else if (!Character.isLetterOrDigit((s.charAt(j)))) {
                j--;
            }
            else {
                if (Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                    System.out.println(false);
                }
                i++;
                j--;
            }
        }
        System.out.println(true);
    }
}
