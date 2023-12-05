/*
Assignment 2 - Shapes
TCSS 305A
 */

package controller;

import java.util.ArrayList;
import java.util.List;
import shapes.AbstractShape;
import shapes.ShapeFactory;

/**
 * Defines the Rectangle shape with a length and width, and provides
 * methods for acquiring those instances as well as the name, area, and hashCode.
 *
 * @author Dustin Feldt
 * @version 16 October 2023
 */
public final class ShapeTester {

    /**
     * An empty ArrayList for Shapes to be placed into.
     */
    private static List<AbstractShape> myShapeList;

    /**
     * Deliberately unused constructor.
     */
    private ShapeTester() { }

    /**
     * Calls the ShapeFactory class to create Circle shapes
     * and add them to myShapeList.
     */
    private static void circleFactory() {
        myShapeList.add(ShapeFactory.createCircle(1));
        myShapeList.add(ShapeFactory.createCircle(7.6));
        myShapeList.add(ShapeFactory.createCircle(3.2));
        myShapeList.add(ShapeFactory.createCircle(8.8));
        myShapeList.add(ShapeFactory.createCircle(8.8));

    }

    /**
     * Calls the ShapeFactory class to create Square shapes
     * and add them to myShapeList.
     */
    private static void squareFactory() {
        myShapeList.add(ShapeFactory.createSquare(2));
        myShapeList.add(ShapeFactory.createSquare(6.3));
        myShapeList.add(ShapeFactory.createSquare(9.2));
        myShapeList.add(ShapeFactory.createSquare(4.4));
        myShapeList.add(ShapeFactory.createSquare(4.4));

    }

    /**
     * Calls the ShapeFactory class to create Triangle shapes
     * and add them to myShapeList.
     */
    private static void triangleFactory() {
        myShapeList.add(ShapeFactory.createTriangle(4.6, 9));
        myShapeList.add(ShapeFactory.createTriangle(2.5, 6.8));
        myShapeList.add(ShapeFactory.createTriangle(8, 3.1));
        myShapeList.add(ShapeFactory.createTriangle(1.3, 5));
        myShapeList.add(ShapeFactory.createTriangle(1.3, 5));

    }

    /**
     * Calls the ShapeFactory class to create Rectangle shapes
     * and add them to myShapeList.
     */
    private static void rectangleFactory() {
        myShapeList.add(ShapeFactory.createRectangle(3.3, 5.9));
        myShapeList.add(ShapeFactory.createRectangle(4, 8));
        myShapeList.add(ShapeFactory.createRectangle(6.5, 7.4));
        myShapeList.add(ShapeFactory.createRectangle(2.6, 4.1));
        myShapeList.add(ShapeFactory.createRectangle(2.6, 4.1));

    }

    /**
     * Sorts the current shapes from smallest to largest.
     * Initializes a new blank ArrayList and fills it by repeatedly looping through
     * myShapeList to find the smallest Shape, remove it, and add it to the new ArrayList.
     *
     * @return the ArrayList of sorted shapes
     */
    private static List<AbstractShape> shapeSorter() {
        final List<AbstractShape> sortedShapes = new ArrayList<>();
        while (!myShapeList.isEmpty()) {
            int smallest = 0;
            for (int i = 0; i < myShapeList.size(); i++) {
                if ((myShapeList.get(smallest)).compareTo(myShapeList.get(i)) > 0) {
                    smallest = i;
                }
            }
            sortedShapes.add(myShapeList.remove(smallest));
        }
        return sortedShapes;
    }

    /**
     * Prints every shape in an array with their name and area.
     *
     * @param theArray  the ArrayList to be printed
     */
    private static void printer(final List<AbstractShape> theArray) {
        for (final AbstractShape shape : theArray) {
            System.out.println(shape.toString());
        }
    }

    public static void main(final String[] theArgs) {
        myShapeList = new ArrayList<>();
        circleFactory();
        triangleFactory();
        rectangleFactory();
        squareFactory();
        System.out.println("Now printing the unsorted Shapes:");
        printer(myShapeList);
        System.out.println("Now printing the sorted Shapes:");
        printer(shapeSorter());
    }
}
