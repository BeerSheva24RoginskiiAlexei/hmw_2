package telran.introduction;

public class Calculations {
    public static int sum (int a, int b) {
        int res= a+b;
        return res;
    }
    public static int multiply (int a, int b) {
        int res= a*b;
        return res;
    }

    public static int divide (int a, int b) {
        int res= a/b;
        return res;
    }
    public static int subtract (int a, int b) {
        int res= a-b;
        return res;
    }

    public static int sumOfDigits (int a) {
        int res= 0;
        while (a>0) {
            res+= a%10;
            a/=10;
        }
        return res;
    }

    public static int maxDigits (int a) {
        int res= 0;
        while (a>0) {
            res= Math.max(res, a%10);
            a/=10;
        }
        return res;
    }

    public static boolean isDividedOn(int number, int dividor) {
        if (number%dividor==0) return true;
        else return false;
    }
}
