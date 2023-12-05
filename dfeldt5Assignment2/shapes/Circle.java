/*
Assignment 2 - Shapes
TCSS 305A
 */

package shapes;

import java.util.Objects;

/**
 * Defines the Circle shape with a radius, and provides
 * methods for acquiring that field as well as the name, area, and hashCode.
 *
 * @author  Dustin Feldt
 * @version 16 October 2023
 */
public final class Circle extends AbstractShape {

    /**
     * The radius of this circle.
     */
    private final double myRadius;

    /**
     * Package level constructor that verifies the passed value and
     * throws an exception if it is zero or less.
     *
     * @param theRadius the radius of this circle
     */
    /* package */ Circle(final double theRadius) {
        super();
        if (theRadius <= 0) {
            throw new IllegalArgumentException(theRadius
                    + " is not valid. Radius must be greater than 0.");
        } else {
            myRadius = theRadius;
        }
    }

    /**
     * Calculates the area of this circle.
     *
     * @return the area as a double
     */
    @Override
    public double area() {
        return Math.pow(this.myRadius, 2) * Math.PI;
    }

    /**
     * Provides the type of shape this is.
     *
     * @return this shape's name as a String
     */
    @Override
    public String name() {
        return "Circle";
    }

    /**
     * Fetches this circle's radius.
     *
     * @return the radius as a double
     */
    public double getRadius() {
        return this.myRadius;
    }

    /**
     * Overrides the hashCode method from Object and assigns
     * a hashCode based on the name and radius of the circle.
     *
     * @return an int representing the shape
     */
    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.name(), myRadius});
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
