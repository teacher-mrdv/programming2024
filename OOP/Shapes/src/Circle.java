                             public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(String name, double radius) {
        super(name); // this.setName(name);
        this.radius = Math.abs(radius); // this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.abs(radius);
    } // if(radius < 0) radius = -1*radius;

    public double getArea() {
        return PI * (radius * radius);
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        String output = super.toString(); // this.getName()
        output = output + "\tRadius: " + this.radius;
        output = output + String.format("\tArea: %,.3f", this.getArea()); // equivalent to System.out.printf("\tArea: %,.3f", this.getArea());
        output = output + String.format("\tCircumference: %,.3f", this.getPerimeter());
        return output;
    }

    public boolean equals(Circle two) {
        return (this.getArea() == two.getArea() && this.getPerimeter() == two.getPerimeter());
    }

    public double compareTo(Circle two) {
        return this.getArea() - two.getArea();
    }
}
