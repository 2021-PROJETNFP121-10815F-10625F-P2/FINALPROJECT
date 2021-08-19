package categories.structural.Decorator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DecorateUnitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DecorateUnitTest
{
    /**
     * Default constructor for test class DecorateUnitTest
     */
    public DecorateUnitTest()
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
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape greenRectangle = new GreenShapeDecorator(new Rectangle());

        System.out.println("A circle");
        circle.draw();

        System.out.println("A red Circle");
        redCircle.draw();

        System.out.println("A green Rectangle");
        greenRectangle.draw();
    }
}
