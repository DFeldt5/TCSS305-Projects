/*
Assignment 2 - Shapes
TCSS 305A
 */

package shapes;

import java.util.Objects;

/**
 * Defines the Square shape with a side length and provides
 * methods for acquiring that field as well as the name, area, and hashCode.
 *
 * @author  Dustin Feldt
 * @version 16 October 2023
 */
public final class Square extends AbstractShape {

    /**
     * The side length of this square.
     */
    private final double mySideLength;

    /**
     * Package level constructor that verifies the passed value and
     * throws an exception if it is zero or less.
     *
     * @param theSideLength the side length of this square
     */
    /* package */ Square(final double theSideLength) {
        super();
        if (theSideLength <= 0) {
            throw new IllegalArgumentException(theSideLength
                    + " is not valid. Side length must be greater than 0.");
        } else {
            mySideLength = theSideLength;
        }
    }

    /**
     * Calculates the area of this square.
     *
     * @return the area as a double
     */
    @Override
    public double area() {
        return mySideLength * mySideLength;
    }

    /**
     * Provides the type of shape this is.
     *
     * @return this shape's name as a String
     */
    @Override
    public String name() {
        return "Square";
    }

    /**
     * Fetches this square's side length.
     *
     * @return the side length as a double
     */
    public double getSideLength() {
        return mySideLength;
    }

    /**
     * Overrides the hashCode method from Object and assigns
     * a hashCode based on the name and side length of the square.
     *
     * @return an int representing the shape
     */
    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.name(), mySideLength});
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
