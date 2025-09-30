public class Square extends Shape
{
	private double side;
	
	public Square(String name, double side)
	{	super(name);
		this.side = Math.abs(side);
	}
	
	public double getSide()
	{	return this.side;
	}
	
	public void setSide(double side)
	{	this.side = Math.abs(side);
	}
	
	public String toString()
	{	String output = super.toString();
		output = output + "\tSide: " + this.side;
		output = output + String.format("\tArea: %,.3f", this.getArea() );
		output = output + String.format("\tPerimeter: %,.3f", this.getPerimeter());
		return output;
	}

	public double getArea()
	{
		return this.side * this.side;
	}

	public double getPerimeter()
	{
		return 4 * this.side;
	}

	public boolean equals(Square two)
	{
		return (this.getArea() == two.getArea() && this.getPerimeter() == two.getPerimeter());
	}

	public double compareTo(Square two)
	{
		return this.getArea() - two.getArea();
	}
}

