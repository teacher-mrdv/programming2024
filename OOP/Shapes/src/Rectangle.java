public class Rectangle extends Shape
{
    private double length;
    private double width;

    public Rectangle(String name, double length, double width)
    {
        super(name); // this.setName(name);
        this.length = Math.abs(length);
        this.width = Math.abs(width);
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = Math.abs(length);
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = Math.abs(width);
    }

    public double getArea()
    {
        return this.length * this.width;
    }

    public double getPerimeter()
    {
        return (this.length + this.width) * 2;
    }

    @Override
    public String toString()
    {
        String output = super.toString();
        output = output + "\tLength: " + this.length;
        output = output + "\tWidth: " + this.width;
        output = output + String.format("\tArea: %,.3f", this.getArea() );
        output = output + String.format("\tPerimeter: %,.3f", this.getPerimeter());
        return output;
    }

    public boolean equals(Rectangle two)
    {
        return (this.getArea() == two.getArea() && this.getPerimeter() == two.getPerimeter());
    }

    public double compareTo(Rectangle two)
    {
        return this.getArea() - two.getArea();
    }

}
