/*
 * This code demonstrates how to avoid variable scope issues
 * and adds the example of a (global) constant in Java
 */
public class MethodDemoNicer
{
	public static final double GST = 0.09;

	/**
		calculates net price using the GST global constant defined on line #7 of this class.
		@param price double containing the price before GST
		@return net price
	*/
	public static double calculateGST(double price)
	{
		double priceIncludingGST = price + (price * GST);
		return priceIncludingGST;
	}

	/** calculates net price given a custom, specific GST, overriding the method that uses the GST constant.
		@param price double containing the price before GST
		@param gst double containing a specific gst, not the global constant from this class (GST)
		@return net price
	*/
	public static double calculateGST(double price, double gst)
	{
		double priceIncludingGST = price + (price * gst);
		return priceIncludingGST;
	}

	// MAIN METHOD //
	public static void main (String[] args)
	{
		double price = 1234;
		System.out.println("Prevailing GST   = $" + GST );
		System.out.println("Price before GST = $" + price );
		System.out.println(">>> Net Price    = $" +
			calculateGST(price) );
		System.out.printf (">>> Net Price    = $%,.2f",
			calculateGST(price) );
	}
}

