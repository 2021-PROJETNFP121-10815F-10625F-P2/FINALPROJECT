package categories.creational.Abstract_factory;
/**
 * Rectangle is concrete classes implementing the Shape interface..
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape::Rectangle");
    }
    
    
    public void getArea()
    {
        System.out.println("Shape::Rectangle, The formula is: A = L × W where A is the area, L is the length, W is the width");
    }
    
    public String areaFormula()
    {
        return "L × W";
    }
}
