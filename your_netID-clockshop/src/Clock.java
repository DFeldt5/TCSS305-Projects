/*
Assignment 1 – ClockShop Conundrums
TCSS 305A
 */

/**
 * Clock is a class which creates and manipulates Clock objects.
 * @author Dustin Feldt
 * @version 8 October 2023
 */
public class Clock implements Comparable<Clock> {

    private int myHour;
    private int myMinute;
    private int mySecond;

    /**
     * A constructor for Clock objects that sets the clock's time according the parameters
     *
     * @param theHour   An integer representing the clock's time in hours
     * @param theMinute An integer representing the clock's time in minutes
     * @param theSecond An integer representing the clock's time in seconds
     */
    public Clock(final int theHour, final  int theMinute, final  int theSecond) {
        setHour(theHour);
        setMinute(theMinute);
        setSecond(theSecond);
    }

    /**
     * A default Clock constructor that sets the clock's time as 23:58:00
     */
    public Clock() {
        this(23, 58, 0);
    }

    /**
     * Converts the clock's time values to a printable String
     *
     * @return  a String with the time in HH:MM:SS format
     */
    public String toString() {
        return this.myHour + ":" + this.myMinute + ":" + this.mySecond;
    }

    /**
     * Returns the given clock's hour
     *
     * @return  the clock's myHour value
     */
    public int getHour() {
        return myHour;
    }

    /**
     * Returns the given clock's minute
     *
     * @return  the clock's myMinute value
     */
    public int getMinute() {
        return myMinute;
    }

    /**
     * Returns the given clock's second
     *
     * @return  the clock's mySecond value
     */
    public int getSecond() {
        return mySecond;
    }

    /**
     * Assigns a value to the clock's myHour
     * @param theHour
     */
    public void setHour(final int theHour) {
        if (theHour < 0 || theHour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23.");
        } else {
            myHour = theHour;
        }
    }
    public void setMinute(final int theMinute) {
        if (theMinute < 0 || theMinute > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59.");
        } else {
            myMinute = theMinute;
        }
    }
    public void setSecond(final int theSecond) {
        if (theSecond < 0 || theSecond > 59) {
            throw new IllegalArgumentException("Second must be between 0 and 59.");
        } else {
            mySecond = theSecond;
        }
    }
    public void advanceHour(final int theAmount) {
        if (theAmount < 0) {
            throw new IllegalArgumentException("Cannot advance by a negative number.");
        } else {
            this.myHour = (myHour + theAmount) % 24;
        }
    }
    public void advanceMinute(final int theAmount) {
        if (theAmount < 0) {
            throw new IllegalArgumentException("Cannot advance by a negative number.");
        } else {
            advanceHour((myMinute + theAmount) / 60);
            this.myMinute = (myMinute + theAmount) % 60;
        }
    }
    @Override
    public boolean equals(final Object theObject) {
        if (theObject == null || !theObject.getClass().getSimpleName().equals("Clock")) {
            return false;
        } else {
            return this.compareTo((Clock) theObject) == 0;
        }
    }
    public int compareTo(final Clock theOtherClock) {
        //convert to total seconds
        if (this.myHour < theOtherClock.myHour) {
            return -1;
        }
        if (this.myHour > theOtherClock.myHour) {
            return 1;
        }
        if (this.myMinute < theOtherClock.myMinute) {
            return -1;
        }
        if (this.myMinute > theOtherClock.myMinute) {
            return 1;
        }
        if (this.mySecond < theOtherClock.mySecond) {
            return -1;
        }
        if (this.mySecond > theOtherClock.mySecond) {
            return 1;
        }
        return 0;
    }
}
