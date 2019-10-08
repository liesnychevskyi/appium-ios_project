package appium_core.java_core.classes_objects;

public class MyMainClass
{
    public static void main(String[] args)
    {
//        Student mark = new Student(); // object or instance
//        mark.id = 1;
//        mark.name = "Mark";
//        mark.age = 18;
//        System.out.println(mark.name + " is " + mark.age + " years old");
//        //==============================================================//
//        Student tom = new Student();
//        tom.id = 2;
//        tom.name = "Tom";
//        tom.age = 20;
//        System.out.println(tom.name + " is " + tom.age + " years old");
//        //==============================================================//
//        Student vika = new Student();
//        tom.id = 3;
//        tom.name = "Vika";
//        tom.age = 30;
//        System.out.println(vika.name + " is " + vika.age + " years old");

        Student mark = new Student(); // object or instance
        mark.setId(1);
        mark.setName("Mark");
        mark.setAge(18);
        System.out.println(mark.name + " is " + mark.age + " years old");
        //==============================================================//
        Student tom = new Student();
        tom.id = 2;
        tom.name = "Tom";
        tom.age = 20;
        System.out.println(tom.name + " is " + tom.age + " years old");
        //==============================================================//
        Student vika = new Student();
        vika.id = 3;
        vika.name = "Vika";
        vika.age = 30;
        System.out.println(vika.name + " is " + vika.age + " years old");
    }
}
