// Chapter 11 of Java worksheets
public class FractionTest {
    public static void main(String[] args) {
        Fraction f = new Fraction(1, 3);

        System.out.println(f);
        f.print();
        // post-data hiding, the line below stop working
        //System.out.println("num = " + f.numerator + " den = " + f.denominator);
        f.setNumerator(2); f.setDenominator(4);
        System.out.println(f.getNumerator() + "\n-\n" + f.getDenominator());
        Fraction g = new Fraction(); // this requires an empty constructor
        g.enter();
        System.out.println(g);
    }
}
