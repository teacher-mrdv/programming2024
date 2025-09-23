// Chapter 11 of Java worksheets
public class FractionTest {
    public static void main(String[] args) {
        Fraction f = new Fraction(1, 3);

        System.out.println(f);
        f.print();
        //System.out.println("num = " + f.numerator);
        //        " den = " + f.denominator);
        System.out.println("num = " +  f.getNumerator());
    }
}
