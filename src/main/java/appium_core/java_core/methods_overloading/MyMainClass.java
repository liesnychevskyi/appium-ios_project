package appium_core.java_core.methods_overloading;

public class MyMainClass
{
    public static void main(String[] args)
    {
        String res = Add("Stas", "Money");
        System.out.println(res);

    }

    public static int Add(int a , int b)
    {
        return (a + b);
    }
    public static double Add(double a , double b)
    {
        return (a + b);
    }
    public static String Add(String a , String b)
    {
        return (a + b);
    }

}
