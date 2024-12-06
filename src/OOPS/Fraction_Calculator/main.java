package OOPS.Fraction_Calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter numerator 1");
        System.out.println("enter denominator 1");
        fraction f1 =new fraction(sc.nextInt(), sc.nextInt());

        System.out.println("Fraction 1 = "+f1.numerator+"/"+f1.denominator);
        System.out.println("enter numerator 2");
        System.out.println("enter denominator 2");
        fraction f2=new fraction(sc.nextInt(),sc.nextInt());

        System.out.println("Fraction 2 = "+f2.numerator+"/"+ f2.denominator);
/*******************************************Operations***********************************/

        fraction f3 = f2.add(f1,f2);
         System.out.println("Addition = "+f3.numerator+"/"+f3.denominator);

         fraction f4 =f2.multiply(f1,f2);
        System.out.println("Multiplication = "+f4.numerator+"/"+f4.denominator);

        fraction f5 = f2.subtract(f1,f2);
        System.out.println("Subtraction = "+f5.numerator+"/"+f5.denominator);

        fraction f6 = f2.divide(f1,f2);
        System.out.println("Division = "+f6.numerator+"/"+f6.denominator);
    }
}
