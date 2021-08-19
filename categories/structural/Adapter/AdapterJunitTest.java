package categories.structural.Adapter;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AdapterJunitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AdapterJunitTest
{
    /**
     * Default constructor for test class AdapterJunitTest
     */
    public AdapterJunitTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void test_DrawingShape() {
            Shape rectangle = new Rectangle();
            Shape circle = new Circle();
            Shape triangle = new GeometricShapeObjectAdapter(new Triangle());

            System.out.println("Rectangle Drawing...");
            rectangle.draw();
            rectangle.resize();

            System.out.println("Circle Drawing...");
            circle.draw();
            circle.resize();

            System.out.println("Triangle Drawing...");
            triangle.draw();
            triangle.resize();
    }
}
