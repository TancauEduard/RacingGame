package org.eduard;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Car car = new Car("Ferrari",60, 12.5, 0, 4, 300, true, new Engine("Ferrari", 3000));
        car.DisplayProperties();
    }
}
