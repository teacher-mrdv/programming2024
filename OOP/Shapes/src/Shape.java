public abstract class Shape
{
    private String name;

    public Shape(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    abstract double getPerimeter();
    // abstract means the method isn't defined here, but
    // IT HAS to be implemented in all the sub-classes of Shape.

    abstract double getArea();
    // ...Meaning any class that "extends Shape"
    // we use this because it doesn't make sense to define
    // these methods for a generic, "any  sort of shape" class

    public String toString()
    {   return "Shape: " + this.name +
            String.format("\tArea: %,.3f", this.getArea() ) +
            String.format("\tPerimeter: %,.3f", this.getPerimeter());
    }

}