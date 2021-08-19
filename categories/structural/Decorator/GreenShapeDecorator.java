package categories.structural.Decorator;

/**
 * GreenShapeDecorator to decorate Shape objects.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GreenShapeDecorator extends ShapeDecorator {

    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setGreenBorder(decoratedShape);
    }

    private void setGreenBorder(Shape decoratedShape) {
        System.out.println("Border Color: Green");
    }
}
