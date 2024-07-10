package LiskovSubstitution;

public class test {
    public void testRectangleArea() throws Exception {
        Shape rectangle = new Rectangle(10, 5);
        assertEquals(50, rectangle.area());
    }
    public void testSquareArea() throws Exception {
        Shape square = new Square(5);
        assertEquals(25, square.area());
    }
}
