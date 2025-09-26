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
        int num = one.numerator * two.denominator;
        int den = one.denominator * two.numerator;
        this.numerator   = num;
        this.denominator = den;
    }

    // fraction1.add(fraction2) -> new Fraction with the sum
    // this is fraction1 in the code below and two is fraction2
    public Fraction add(Fraction two) {
        int num = this.numerator * two.denominator;
        int den = this.denominator * two.numerator;
        Fraction result = new Fraction(num, den);
        return result;
    }

    // this replaces the print method
    public String toString() {
        return numerator + "/" + denominator;
    }
}
