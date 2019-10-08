package appium_core.java_core.constructor;

public class Cube
{
    int length;
    int breadth;
    int height;

    public int getCubeValue()
    {
        return (length * breadth * height);
    }

    Cube() // default constructor
    {
        length = 10;
        breadth = 20;
        height = 30;
        System.out.println("We are in default constructor");
    }

    Cube(int a, int b, int c) // constructor overloading
    {
        length = a;
        breadth = b;
        height = c;
        System.out.println("We are in constructor overloading");
    }


}
