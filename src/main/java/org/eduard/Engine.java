package org.eduard;

public class Engine {
    String manufacturer;
    int capacity;

    public Engine(String manufacturer, int capacity) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }
    public void DisplayProperties()
    {
        System.out.println("Engine manufacturer: " + manufacturer);
        System.out.println("Engine capacity: " + capacity);
    }
}
