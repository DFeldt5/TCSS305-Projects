/*
Assignment 2 - Shapes
TCSS 305A
 */

package shapes;

import java.util.Objects;

/**
 * Defines the Triangle shape with a base and height, and provides
 * methods for acquiring those instances as well as the name, area, and hashCode.
 *
 * @author  Dustin Feldt
 * @version 16 October 2023
 */
public final class Triangle extends AbstractShape {

    /**
     * This triangle's base.
     */
    private final double myBase;

    /**
     * This triangle's height.
     */
    private final double myHeight;

    /**
     * Package level constructor that verifies the passed values and
     * throws an exception if they are zero or less.
     *
     * @param theBase   the width of this rectangle
     * @param theHeight the length of this rectangle
     */
    /* package */ Triangle(final double theBase, final double theHeight) {
        super();
        if (theBase <= 0 || theHeight <= 0) {
            throw new IllegalArgumentException(theBase + " or " + theHeight
                    + " is not valid. Values must be greater than 0.");
        } else {
            myBase = theBase;
            myHeight = theHeight;
        }
    }
    /**
     * Calculates the area of this triangle.
     *
     * @return the area as a double
     */
    @Override
    public double area() {
        return 0.5 * (myHeight * myBase);
    }

    /**
     * Provides the type of shape this is.
     *
     * @return this shape's name as a String
     */
    @Override
    public String name() {
        return "Triangle";
    }

    /**
     * Fetches this triangle's base.
     *
     * @return the base as a double
     */
    public double getBase() {
        return myBase;
    }

    /**
     * Fetches this triangle's height.
     *
     * @return the height as a double
     */
    public double getHeight() {
        return myHeight;
    }

    /**
     * Overrides the hashCode method from Object and assigns
     * a hashCode based on the name, base, and height of the triangle.
     *
     * @return an int representing the shape
     */
    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.name(), myBase, myHeight});
    }

    /**
     * Implements the equals method from AbstractShape.
     *
     * @param theOtherObject  the object to be compared
     * @return                True if equal, False if not
     */
    @Override
    public boolean equals(final Object theOtherObject) {
        return super.equals(theOtherObject);
    }
}
