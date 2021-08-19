package categories.creational.Abstract_factory;
/**
 * Circle is concrete classes implementing the Shape interface..
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Circle implements Shape {


    @Override
    public void draw() {
        System.out.println("Shape::Circle");
    }
    
    
    public void getArea()
    {
        System.out.println("Shape::Circle, The formula is: π × r2 where r is the radius");
    }
    
    public String areaFormula()
    {
        return "π × r2";
    }
}
