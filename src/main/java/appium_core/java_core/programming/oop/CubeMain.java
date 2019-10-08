package appium_core.java_core.programming.oop;

public class CubeMain 
{

	public static void main(String[] args) 
	{
		Cube cube_1 = new Cube();
		System.out.println(cube_1.getCubeVolume());
		
		Cube cube_2 = new Cube(20, 20, 20);
		System.out.println(cube_2.getCubeVolume());

	}

}
