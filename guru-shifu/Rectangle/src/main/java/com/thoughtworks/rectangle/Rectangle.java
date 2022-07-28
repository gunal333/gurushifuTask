package  com.thoughtworks.rectangle;

public class Rectangle{
    private final double length;
    private final double breadth;
    Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    double perimeter()
    {
        return (length+breadth)*2;
    }
    double area()
    {
        return breadth*length;
    }
}