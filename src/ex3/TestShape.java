package ex3;

public class TestShape {
    public static void main(String[] args) {
        //create circle and Rectangle objects
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(2.5);
        Rectangle r1 = new Rectangle(3.0, 4.0);
        Rectangle r2 = new Rectangle(2.0, 2.0);


        System.out.println(" Total area of both rectangles is " + (r1.area() + r2.area()));
        System.out.printf(" Total perimeter of both circles is %.2f%n" , (c1.perimeter() + c2.perimeter()));
        //Either of the following 2 lines can be used to display the number of Circle objects created
        System.out.println( " Total number of Circle objects created is " + c1.getCount());
        //The following line of code will only work if circleCount is not private
        System.out.println( " Total number of Circle objects created is " + Circle.circleCount);
    }
}
