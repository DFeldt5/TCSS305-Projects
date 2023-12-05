/*
Assignment 2 - Shapes
TCSS 305A
 */

package shapes;

import java.util.Objects;

/**
 * Defines the Rectangle shape with a length and width, and provides
 * methods for acquiring those fields as well as the name, area, and hashCode.
 *
 * @author  Dustin Feldt
 * @version 16 October 2023
 */
public final class Rectangle extends AbstractShape {

    /**
     * The width of this Rectangle.
     */
    private final double myWidth;

    /**
     * The length of this rectangle.
     */
    private final double myLength;

    /**
     * Package level constructor that verifies the passed values and
     * throws an exception if they are zero or less.
     *
     * @param theWidth  the width of this rectangle
     * @param theLength the length of this rectangle
     */
    /* package */ Rectangle(final double theWidth, final double theLength) {
        super();
        if (theWidth <= 0 || theLength <= 0) {
            throw new IllegalArgumentException(theWidth + " or " + theLength
                    + " is not valid. Values must be greater than 0.");
        } else {
            myWidth = theWidth;
            myLength = theLength;
        }
    }
    /**
     * Calculates the area of this rectangle.
     *
     * @return  the area as a double
     */
    @Override
    public double area() {
        return myWidth * myLength;
    }

    /**
     * Provides the type of shape this is.
     *
     * @return  this shape's name as a String
     */
    @Override
    public String name() {
        return "Rectangle";
    }

    /**
     * Fetches this rectangle's width.
     *
     * @return  the width as a double
     */
    public double getWidth() {
        return myWidth;
    }

    /**
     * Fetches this rectangle's length.
     *
     * @return  the length as a double
     */
    public double getLength() {
        return myLength;
    }

    /**
     * Overrides the hashCode method from Object and assigns
     * a hashCode based on the name, width, and length of the rectangle.
     *
     * @return  an int representing the shape
     */
    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.name(), myWidth, myLength});
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
