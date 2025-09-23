public class Fraction {
    private int numerator;
    private int denominator;

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

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    // HL recursive version
    private static int GCD(int a, int b) {
        if (a == 0)
            return b;
        return GCD(b % a, a);
    }

    // calculate the GCD to simplify a fraction
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
