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
        this.simplify();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        this.simplify(); // optional, but to keep the fraction simplified
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator != 0) {
            this.denominator = denominator;
            simplify(); // this. is optional here
            // optional, but to keep the fraction simplified
        }
    }

    // toString() is a better alternative to this
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    // inputs two integers and sets them as num and den of the fraction object
    // this is normally written in the test class, though.
    public void enter() {
        Scanner input = new Scanner(System.in); // Scanner for input
        System.out.print("Enter fraction in a/b format: ");
        String fractionString = input.nextLine();
        // Changes slash to space for parsing with Scanner (line below)
        fractionString = fractionString.replace("/", " ");
        // Scanner for parsing a String and extracting 2 integers
        Scanner parse = new Scanner(fractionString);
        numerator   = parse.nextInt();
        denominator = parse.nextInt();
        this.simplify();
    }

    public void simplify() {
        int gcd = gcdSL(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    // HL recursive version - GCD to help simplify and add fractions
    private static int gcdHL(int a, int b) {
        if (a == 0)
            return b;
        return gcdHL(b % a, a);
    }

    // calculate the GCD  to help simplify and add fractions
    // SL version (iterative -- while loop)
    private static int gcdSL(int n, int m) {
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

    // sumFraction.add(fraction1, fraction2)
    // adds fraction1 and fraction2 and places the result in sumFraction
    // this stands for sumFraction in the code below
    public void add(Fraction one, Fraction two) {
        int n = one.numerator * two.denominator;
        int m = one.denominator * two.numerator;
        this.numerator   = n + m;
        this.denominator = one.denominator * two.denominator;
        this.simplify();
    }

    // fraction1.add(fraction2) -> new Fraction with the sum
    // this is fraction1 in the code below and two is fraction2
    public Fraction add(Fraction two) {
        int n = this.numerator * two.denominator;
        int m = this.denominator * two.numerator;
        Fraction result = new Fraction(n + m,
                this.denominator*two.denominator);
        return result;
    }

    // this replaces the print method
    public String toString() {
        return numerator + "/" + denominator;
    }

    public double toDecimal() {
        return (double)numerator / denominator;
    }

    public boolean equals(Fraction two) {
        return this.toDecimal() == two.toDecimal();
    }
}
