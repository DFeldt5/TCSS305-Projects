/*
Assignment 1 – ClockShop Conundrums
TCSS 305A
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClockShop is a class which creates and manipulates Clock objects
 * @author Dustin Feldt
 * @version 8 October 2023
 */
public class ClockShop {
    private ArrayList<Clock> myClocks;
    public ClockShop() {
        myClocks = new ArrayList<>();
    }
    public void fillClockShop(final String theInputFileName) {
        try {
            final Scanner s = new Scanner(Paths.get(theInputFileName));
            while (s.hasNextLine()) {
                final String[] row = s.nextLine().split(":|/n");
                final int hour = Integer.parseInt(row[0]);
                final int minute = Integer.parseInt(row[1]);
                final int second = Integer.parseInt(row[2]);
                final Clock newClock = new Clock(hour, minute, second);
                myClocks.add(newClock);
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public void sortClocks() {
        final ArrayList<Clock> sortedClocks = new ArrayList<Clock>();
        if (myClocks.size() == 1) {
            return;
        }
        while (!myClocks.isEmpty()) {
            int smallest = 0;
            for (int i = 0; i < myClocks.size(); i++) {
                if ((myClocks.get(smallest)).compareTo(myClocks.get(i)) > 0) {
                    smallest = i;
                }
            }
            sortedClocks.add(myClocks.remove(smallest));
        }
        myClocks = sortedClocks;
    }

    public int findClock(final Clock theClock) {
        return myClocks.indexOf(theClock);
    }
    @Override
    public String toString() {
        String clockTime = "";
        for (Clock c : myClocks) {
            clockTime = clockTime + c.toString() + System.lineSeparator();
        }
        return clockTime;
    }
    public Clock getClock(final int theIndex) throws IllegalArgumentException {
        if (theIndex >= myClocks.size() || theIndex < 0) {
            throw new IllegalArgumentException("Index out of bounds.");
        }
        return myClocks.get(theIndex);

    }
    public void setClock(final Clock theClock, final int theIndex) {
        if (theIndex >= myClocks.size() || theIndex < 0) {
            throw new IllegalArgumentException("Index out of bounds.");
        }
        myClocks.set(theIndex, theClock);
    }

    public void addClock(final Clock theNewClock) {
        myClocks.add(theNewClock);
    }

    public void writeClocksToFile(final String theFilename) {
        try {
            final File clockFile = new File(theFilename);
            final FileWriter writer = new FileWriter(clockFile);
            writer.write(this.toString());
            writer.close();
        } catch (IOException ioe) {
            System.out.println("File does not exist.");
        }
    }
}
