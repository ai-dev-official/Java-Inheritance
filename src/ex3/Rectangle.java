package ex3;

public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double l, double w)
    {
        this.length = l;
        this.width = w;
    }

    public double area()
    {
        return (length * width);
    }
    public double perimeter()
    {
        return (2 * ( length + width ));
    }
}
