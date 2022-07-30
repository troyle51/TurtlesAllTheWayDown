package PACKAGE_NAME;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {
    public static long factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n-1);
    }

    public static int gcd(int n1, int n2){
            if(n2 != 0){
                return gcd(n2, n1 % n2);
            } else {
                return n1;
            }
    }
}
