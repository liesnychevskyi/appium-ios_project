package appium_core.java_core.practice;

public class DoWhileLoop
{

    public static void main(String[] args)
    {
        int a = -10;

        while (a <= 10)
        {
            System.out.println("a = " + a);
            a++;
        }
        //=====================================//
        int s = 0;

        do
        {
            System.out.println("s = " + s);
            s++;
        }
        while (s <= 10);
    }
}
