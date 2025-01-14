/*
 * This demonstrates variable scope and
 * example of a (global) constant in Java
 */
public class MethodDemo
{
	public static final double GST = 0.09;
	
	public static double calculateGST(double price, double gst)
	{
		System.out.println("\tPrevailing GST = " + GST);
		System.out.println("\tparameter variable-in = " + price);
		price = price + (price * gst);
		System.out.println("\tparameter variable-post processing = " + price);
		return price;
	}
	
	public static void main (String[] args)
	{
		double price = 100;
		System.out.println("Prevailing GST = " + GST);
		System.out.println("price variable before method call = " + price);
		System.out.println( ">>> Price incl. GST = " + calculateGST(price, GST) );
		System.out.println("price variable after method call = " + price);
		
	}
}

