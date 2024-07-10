package Open_Closed;

public class Rectangle implements Shape{
    private double length;
    private double height;

    @Override
    public double getArea() {
        return (length * height);
    }

    // getters/setters …

}
