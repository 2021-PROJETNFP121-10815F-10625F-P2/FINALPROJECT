package categories.structural.Decorator;

/**
 * Abstract ShapeDecorator class implementing the Shape interface.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
