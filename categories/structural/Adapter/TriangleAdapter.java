package categories.structural.Adapter;

/**
 * TriangleAdapter class extending Triangle implementing the Shape interface.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TriangleAdapter extends Triangle implements Shape {

    public TriangleAdapter() {
        super();
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Triangle can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        return "Triangle object";
    }

    @Override
    public boolean isHide() {
        return false;
    }

}
