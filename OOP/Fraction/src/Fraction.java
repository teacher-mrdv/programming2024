public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    // this replaces the print method
    public String toString() {
        return numerator + "/" + denominator;
    }
}
