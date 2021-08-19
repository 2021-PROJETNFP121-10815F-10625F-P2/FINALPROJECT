package categories.creational.Abstract_factory;
/**
 * Red is concrete classes implementing the Color interface..
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Color::Red");
    }
}
