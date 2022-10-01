import java.util.Scanner;

import static java.lang.System.*;

/**
 * Stephanie Byrd
 * 10/8/2022
 */
public class Lab006 {
    /**
     * create variables n and m to use for class
     */
    public int n;
    public int m;

    /**
     * constructor method
     * instance variable assigned
     */
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;


    }

    /**
     * m
     * method used in division
     * return boolean true or false;
     * false if n is not divisible by m;
     */
    public Boolean isDivisible() {
        if (this.n % this.m == 0) {
           System.out.println("If the n is divisible by  m integer . Result = " + true);
            return true;
        } else {
            System.out.println("If the n is not divisible by m integer . Result = " + false);
            return false;
        }
    }

    /**
     * static main method
     * prompts user for integers
     * local variables used
     */


    public static void main(String[] args) {

        var scanner = new Scanner(in);
        out.println(" Enter first integer: " );
        int n = scanner.nextInt();
        Scanner scanner2 = new Scanner(in);
        out.println(" Enter second integer: " );
        int m = scanner2.nextInt();

    }
}











