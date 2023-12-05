/*
Assignment 2 - Shapes
TCSS 305A
 */

package shapes;

import java.util.Objects;

/**
 * AbstractShape is an abstract parent class for various Shape objects.
 *
 * @author  Dustin Feldt
 * @version 16 October 2023
 */
public abstract class AbstractShape implements Comparable<AbstractShape> {

    /* default */AbstractShape() {
        //this constructor intentionally left empty
    }

    /**
     * Abstract method to provide the area of the given shape.
     *
     * @return  the shape's area as a double
     */
    public abstract double area();

    /**
     * Abstract method to provide the type of shape.
     *
     * @return  the name of the shape as a String
     */
    public abstract String name();

    /**
     * Presents a shape's name and area in a readable format.
     *
     * @return  a String with the name and area of the shape
     */
    public String toString() {
        return "Name: " + this.name() + ", Area: " + this.area();
    }

    /**
     * Compares one shape against another first based on name, then by area if
     * they are the same type of shape, and returns a positive value,
     * negative value, or zero depending on whether the initial shape is greater,
     * less than, or the same respectively.
     *
     * @param theOtherShape the object to be compared.
     * @return              an int representing the two shapes' relationship
     */
    public int compareTo(final AbstractShape theOtherShape) {
        int returnValue = this.name().compareTo(theOtherShape.name());
        if (returnValue == 0) {
            returnValue = Double.compare(this.area(), theOtherShape.area());
        }
        return returnValue;
    }

    /**
     * Overrides the equals method from Object.
     *
     * @param theOtherObject  the object to be compared
     * @return                True if the objects are equal and False if null or not equal
     */
    @Override
    public boolean equals(final Object theOtherObject) {
        return theOtherObject != null
            && theOtherObject.getClass().getSimpleName().equals("AbstractShape")
                && this.compareTo((AbstractShape) theOtherObject) == 0;
    }

    /**
     * Default hashCode generated from this Shape's name and area.
     *
     * @return hashCode based on name and area of this shape
     */
    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.name(), this.area()});
    }
}
