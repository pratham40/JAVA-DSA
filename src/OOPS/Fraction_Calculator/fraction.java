package OOPS.Fraction_Calculator;

public class fraction {
    int numerator;
    int denominator;
    fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }
    public void simplify(){
        int hcf=GCD(numerator,denominator);
        numerator/=hcf;
        denominator/=hcf;
    }

    private int GCD(int numerator, int denominator) {
        int min=Math.min(numerator,denominator);
        for (int i = min; i >=1 ; i--) {
            if (numerator%i==0 && denominator%i==0){
                return i;
            }
        }
        return 1;
    }

    fraction add(fraction f1, fraction f2){
       int  num=f1.numerator* f2.denominator+f2.numerator*f1.denominator;
        int den=f1.denominator*f2.denominator;
        fraction f3 =new fraction(num,den);
        return f3;
    }

    fraction multiply(fraction f1, fraction f2){
        int  num=f1.numerator*f2.numerator;
        int den=f1.denominator*f2.denominator;
        fraction f3 =new fraction(num,den);
        return f3;
    }

    fraction subtract(fraction f1, fraction f2){
        int  num=f1.numerator* f2.denominator-f2.numerator*f1.denominator;
        int den=f1.denominator*f2.denominator;
        fraction f3 =new fraction(num,den);
        return f3;
    }


    fraction divide(fraction f1, fraction f2){
        int  num=f1.numerator* f2.denominator;
        int den=f1.denominator*f2.numerator;
        fraction f3 =new fraction(num,den);
        return f3;
    }


}
