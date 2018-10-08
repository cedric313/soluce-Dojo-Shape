import junit.framework.*;
import org.junit.Assert;
import org.junit.Test;

public class ShapeTest extends TestCase {

    @Test
    public void testRectangle() {
    
        double width = 4.;
        double height = 2.;
        Rectangle rectangle = new Rectangle(width, height);
        assertEquals(8., rectangle.area());
    }

    @Test
    public void testSquare() {
    
        double side = 4.;
        Square square = new Square(side);
        assertEquals(16., square.area());
    }

    @Test
    public void testTriangle() {
    
        double base = 4.;
        double height = 4.;
        Triangle triangle = new Triangle(base, height);
        assertEquals(8., triangle.area());
    }

    @Test
    public void testCircle() {
    
	    double radius = 1.954410048;
        Circle circle = new Circle(radius);
        assertEquals(12, Math.round(circle.area()));
    }
}
