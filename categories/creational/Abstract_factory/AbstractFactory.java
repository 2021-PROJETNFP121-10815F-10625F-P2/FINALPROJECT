package categories.creational.Abstract_factory;
/**
 * An Abstract class to get factories for Circle, Rectangle and Square Shape Objects and for Red, Blue and Green Color Object...
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public abstract class AbstractFactory {

    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
