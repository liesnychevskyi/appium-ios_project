package appium_core.java_core.programs;

public class Addition
{
    public static void main(String[] args)
    {
        //Addition addition = new Addition();
        int res = additionTwoNumbers(200,20);
        System.out.println(res);
    }

    public static int additionTwoNumbers(int num_1, int num_2)
    {
        return num_1 + num_2;
    }
}
