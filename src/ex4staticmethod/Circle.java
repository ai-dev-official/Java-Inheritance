package ex4staticmethod;

public class Circle extends Shape {
    private static int circleCount =0;
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
        circleCount++;
    }
    public double area()
    {
        return (Math.PI * radius * radius);
    }
    public double perimeter()
    {
        return (Math.PI * radius * 2);
    }
    public int getCount()
    {
        return circleCount;
    }
    public static int getCircleCount(){
        return circleCount;
    }
}
