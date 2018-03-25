/*
 * check that a,b,c is different
 */
package lab4;

/**
 *
 * @author Natali
 */
public class lab4A1 {

    public static void main(String[] args) {

        double a = 15.1;
        double b = 20.4;
        double c = -17.6;

        boolean result = Logik.check(a, b, c);

        System.out.println("a= " + a + "; b= " + b + "; c= " + c);

        System.out.println("result: " + result);

    }
}
