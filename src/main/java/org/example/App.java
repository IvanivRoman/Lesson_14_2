package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        for (Integer number: new Range(10, 9)) {
            System.out.print(number + " ");
        }

        System.out.println();

        for (Integer number: new RangeWithStep(-1, 5, 3)) {
            System.out.print(number + " ");
        }

    }
}
