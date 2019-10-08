package appium_core.java_core.basic.com;

import java.text.SimpleDateFormat;
import java.util.Date;

;

public class Date_time
{

	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println(date.toString()); // Current date & time
		System.out.println(date.getTime());  // milliseconds from 1 January 1970
		System.out.println(1 + date.getMonth()); // Current month // it starts from "0"
		System.out.println(1900 + date.getYear());
		System.out.println(date.getDay()); 
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH-mm-ss");
		System.out.println(sdf.format(date));

	}

}
