/*
 * CHAPTER 11 - OOP Fraction
 * DO NOT USE AI, Generate Code, Encapsulate Fields or
 * any code automation option for these OOP chapters of the worksheets
 * (chapters 11~14)
 */

/* TO DO: ************************************************\
 * simplify, add, toDecimal METHODS
 * for an additional challenge, you may want to write
 * a method to create a fraction from a decimal number ???
 *********************************************************/

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() { } // empty constructor

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator != 0) {
            this.denominator = denominator;
        }
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    // inputs two integers and sets them as num and den of the fraction object
    public void enter() {
        Scanner input = new Scanner(System.in); // Scanner for input
        System.out.print("Enter fraction in a/b format: ");
        String fractionString = input.next();
        input.close(); // when we are done inputting
        // Changes slash to space for parsing with Scanner (line below)
        fractionString = fractionString.replace("/", " ");
        // Scanner for parsing a String and extracting 2 integers
        Scanner parse = new Scanner(fractionString);
        numerator   = parse.nextInt();
        denominator = parse.nextInt();
        parse.close(); // when we are done parsing
        //this.simplify(); // <<< uncomment after you complete problem 11.2
    }

    // HL recursive version - GCD to help simplify and add fractions
    private static int GCD(int a, int b) {
        if (a == 0)
            return b;
        return GCD(b % a, a);
    }

    // calculate the GCD  to help simplify and add fractions
    // SL version (iterative -- while loop)
    private static int gcd(int n, int m) {
        int gcd;
        if ( n == m )
            gcd = n;
        else {
            while (n != m) {
                if ( n < m )
                    m = m - n;
                else
                    n = n - m;
            }
        }
        return n;
    }

    // this replaces the print method
    public String toString() {
        return numerator + "/" + denominator;
    }
}
