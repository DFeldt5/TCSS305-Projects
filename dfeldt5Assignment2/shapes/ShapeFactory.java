/*
Assignment 2 - Shapes
TCSS 305A
 */

package shapes;

/**
 * Provides methods to create and return Shape objects.
 *
 * @author  Dustin Feldt
 * @version 16 October 2023
 */
public final class ShapeFactory {


    /**
     * Deliberately unused constructor.
     */
    private ShapeFactory() { }

    /**
     * Calls the Circle class constructor with the given radius.
     *
     * @param theRadius the value to be used as radius
     * @return          a Circle object with the given radius
     */
    public static Circle createCircle(final double theRadius) {
        return new Circle(theRadius);
    }

    /**
     * Calls the Square class constructor with the given side length.
     *
     * @param theSideLength the value to be used as side length
     * @return              a Square object with the given side length
     */
    public static Square createSquare(final double theSideLength) {
        return new Square(theSideLength);
    }

    /**
     * Calls the Triangle class constructor with the given base and height.
     *
     * @param theBase   the value to be used as side length
     * @param theHeight the value to be used as height
     * @return          a Triangle object with the given base and height
     */
    public static Triangle createTriangle(final double theBase, final double theHeight) {
        return new Triangle(theBase, theHeight);
    }

    /**
     * Calls the Rectangle class constructor with the given length and width.
     *
     * @param theWidth  the value to be used as width
     * @param theLength the value to be used as length
     * @return          a Rectangle object with the given width and length
     */
    public static Rectangle createRectangle(final double theWidth, final double theLength) {
        return new Rectangle(theWidth, theLength);
    }
}
