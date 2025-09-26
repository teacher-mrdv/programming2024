// Chapter 11 of Java worksheets
public class FractionTest {
    public static void main(String[] args) {
        // testing of essential contructors and methods
        Fraction f = new Fraction(3, 4);
        System.out.println(f);
        f.print();
        // post-data hiding, the line below stop working
        //System.out.println("num = " + f.numerator + " den = " + f.denominator);
        f.setNumerator(2); f.setDenominator(4);
        System.out.println(f.getNumerator() + "\n-\n" + f.getDenominator());
        //f.simplify();        System.out.println(f);
        Fraction g = new Fraction(); // this requires an empty constructor
        g.enter();
        System.out.print(g);
        // testing of add, simplify, toDecimal methods
        // g.simplify();
        //System.out.println(" simplified = " + g);
        System.out.println("\nAdding two fractions:");
        f.enter();
        g.enter();
        System.out.println(f + " + " + g + " = " + f.add(g) );

        Fraction sum = new Fraction();
        sum.add(f, g);
        System.out.println(sum);

        //FractionPlus y = FractionPlus.enter(); // easier! Check the FractionPlus class
        //FractionPlus z = FractionPlus.enter();
        //System.out.println( y + " == " + z + " ? " + y.equals(z) );
    }
}
