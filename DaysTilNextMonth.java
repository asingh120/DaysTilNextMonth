/* Exercise 10 page 227

	Filename: DaysTilNextMonth.java
	Author: Amit
	Date: 8/1/19

	Application to determine how many days till the beginning of next month */

import java.util.Scanner;
import java.time.*;

public class DaysTilNextMonth 
{
	public static void main(String[] args)
	{
		LocalDate today = LocalDate.now();
		int day;
		int daysTilNextMonth;
		System.out.println("Today is " + today);
		day = today.getDayOfMonth();
		daysTilNextMonth = today.lengthOfMonth() - day;
		System.out.println("There are " + daysTilNextMonth + " days until " + today.plusMonths(1).getMonth() + " starts");
	}
}