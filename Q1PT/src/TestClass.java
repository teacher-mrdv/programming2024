public class TestClass
{
	
	public static void main (String[] args)
	{
		System.out.println("\nSquares");
		Square s1 = new Square("ABCD", 4);
		Square s2 = new Square("EFGH", 10);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Equals (T): " + s1.equals(s1));
		System.out.println("Equals (F): " + s1.equals(s2));
		System.out.println("compareTo : " + s1.compareTo(s2));

		System.out.println("\nRectangles");
		Rectangle r1 = new Rectangle("ABCD", 10, 5);
		Rectangle r2 = new Rectangle("EFGH", 3, 7);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("Equals (T): " + r1.equals(r1));
		System.out.println("Equals (F): " + r1.equals(r2));
		System.out.println("compareTo : " + r1.compareTo(r2));

		System.out.println("\nTriangles");
		Triangle t1 = new Triangle("ABC", 4, 1.4524,2,4,3);
		Triangle t2 = new Triangle("DEF", 5, 4.33, 5,5,5);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("Equals (T): " + t1.equals(t1));
		System.out.println("Equals (F): " + t1.equals(t2));
		System.out.println("compareTo : " + t1.compareTo(t2));

		System.out.println("\nCircles");
		Circle c1 = new Circle("C1", 3);
		Circle c2 = new Circle("C2", 1.7);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("Equals (T): " + c1.equals(c1));
		System.out.println("Equals (F): " + c1.equals(c2));
		System.out.println("compareTo : " + c1.compareTo(c2));
	}
}

