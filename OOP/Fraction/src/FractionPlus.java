/*
 * CHAPTER 11 - OOP Fraction - improved version
 * DO NOT USE AI, Generate Code, Encapsulate Fields or
 * any code automation option for these OOP chapters of the worksheets
 * (chapters 11~14)
 */
import java.util.Scanner;

public class FractionPlus {
    private int numerator;
    private int denominator;

    public FractionPlus(int numerator, int denominator) {
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
    public static FractionPlus enter() {
        int num = 0;
        int den = 0;
        Scanner input = new Scanner(System.in); // Scanner for input
        boolean error;
        do {
            error = false;
            System.out.print("Enter fraction (in a/b format): ");
            String fractionString = input.next();
            // Changes slash to space for parsing with Scanner (line below)
            fractionString = fractionString.replace("/", " ");
            // Scanner for parsing a String and extracting 2 integers
            try {
                Scanner parse = new Scanner(fractionString);
                num = parse.nextInt();
                den = parse.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                error = true;
            }
        } while(!error);
        FractionPlus inputFraction = new FractionPlus(num, den);
        return inputFraction;
    }

    // HL recursive version - GCD to help simplify and add fractions
    // SL iterative method removed as only 1 method is needed
    private static int GCD(int a, int b) {
        if (a == 0)
            return b;
        return GCD(b % a, a);
    }

    /*public boolean equals(FractionPlus two) {
        return this.toDecimal() == two.toDecimal();
    }
    */
    // this replaces the print method
    public String toString() {
        return numerator + "/" + denominator;
    }
}
