/*Day Type Selection
Scenario: Take user input for day type (1–Workday, 2–Weekend) and print working status.
Input:
Enter day type (1–Workday, 2–Weekend): 2
Output:
It’s weekend. No work today*/

import java.util.Scanner;
public class DayType
{
    public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter day type (1 -Workday, 2 -Weekend):");
        int day=sc.nextInt();
		
		 System.out.println(
            (day == 1) ? "It's workday. Time to work!"
          : (day == 2) ? "It's weekend. No work today"
          : "Invalid input choice 1 or 2!"
        );
		
	    sc.close();
	}

}