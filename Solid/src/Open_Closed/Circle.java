package Open_Closed;

public class Circle implements Shape{
    private double radius;

    // getters/setters …
    @Override
    public double getArea() {
        return (radius * radius * Math.PI);
    }
}
