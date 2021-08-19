package categories.creational.Abstract_factory;
/**
 * Square is concrete classes implementing the Shape interface..
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape::Square");
    }
    
    
    public void getArea()
    {
        System.out.println("Shape::Square, The formula is: A = L × L where L is one side of the square");
    }
    
    public String areaFormula()
    {
        return "L2";
    }
}
