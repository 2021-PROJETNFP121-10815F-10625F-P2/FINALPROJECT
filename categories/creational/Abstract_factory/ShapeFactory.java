package categories.creational.Abstract_factory;
/**
 * Create Factory classes ShapeFactory extending AbstractFactory to generate object of concrete class based on given information.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {

        if ("Circle".equalsIgnoreCase(shape)) {
            return new Circle();
        }
        else if ("Rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        }
        else if ("Square".equalsIgnoreCase(shape)) {
            return new Square();
        }

        return null;
    }

    @Override
    Color getColor(String color) {

        return null;
    }
}
