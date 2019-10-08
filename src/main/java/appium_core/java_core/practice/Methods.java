package appium_core.java_core.practice;

public class Methods
{
    public static void main(String[] args)
    {
        myMethod();
        myMethod();
        myMethod();

        myName("Stanislav");
        int sum = addition(10, 10);
        System.out.println("Sum is " + sum);
    }





    public static void myMethod()
    {
        System.out.println("Hello virtual world");
    }

    public static void myName(String name)
    {
        System.out.println("Hello - " + name);
    }

    public static int addition(int x, int y)
    {
        int res = y + x;
        return res;
    }

}
