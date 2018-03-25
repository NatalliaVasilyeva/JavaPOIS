/*
 * Develop a program for calculating how much cost 1 kilogram of candy and 1 kilogram of gelatin,
 * and how many times chocolate candies are more expensive than gelatin,
 * if you know that X kg of candy costs A rubles, and U kg of gelatin costs B rubles
 */
package lab4C.lab4C16;

/**
 *
 * @author Natallia Vasilyeva BSU, group 1709v1, 08.03.18
 */
public class calculateCostsOfSweets {

    public static double findCostSweet(double a, double c) {
        return c / a;

    }

    public static double findCostGElatins(double d, double b) {
        return b / d;

    }

    public static double findDifferenceBetweenCosts(double a, double c, double d, double b) {
        double costOf1KgSweet = c / a;
        double costOf1KgGelatins = b / d;
        return costOf1KgSweet / costOf1KgGelatins;

    }
}
