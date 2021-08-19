package categories.structural.Adapter;

/**
 * The test class AdapterJunitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Circle  implements Shape {

    @Override
    public void draw() {
    System.out.println("Drawing Circle");
    }

    @Override
    public void resize() {
    System.out.println("Resizing Circle");
    }

    @Override
    public String description() {
    return "Circle object";
    }

    @Override
    public boolean isHide() {
    return false;
    }

}
