package appium_core.java_core.constructor;

public class MyMainClass
{
    public static void main(String[] args)
    {
        Cube cube_1 = new Cube();
        System.out.println(cube_1.getCubeValue());

        Cube cube_2 = new Cube(20,20,20);
        System.out.println(cube_2.getCubeValue());

    }
}
