package appium_core.java_core.access_modifaers;

public class Student
{
    /*
     * Access modifiers levels
     * -----------------------
     * Modifiers:     class   package  subclass  world
     * public          Y        Y         Y        Y
     * protected       Y        Y         Y        N
     * no modifier     Y        Y         N        N
     * private         Y        N         N        N
     *
     */

    private  String name;
    private  int age;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
