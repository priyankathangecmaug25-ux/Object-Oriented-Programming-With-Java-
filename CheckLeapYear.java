/*Scenario: You want to celebrate your friend’s birthday on Feb 29 if it’s a leap year. Take the year as input and check if it’s a leap year
Input:
Enter year: 2024
Output:
2024 is a leap year.*/

import java.util.Scanner;

public class CheckLeapYear
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0) 
		{
            System.out.println(year + " is a Leap Year");
        } 
		else if (year % 100 != 0) 
		{
            System.out.println(year + " is Leap Year");
        } 
		else if (year % 4 == 0) 
		{
            System.out.println(year + " is a Leap Year");
        } 
		else 
		{
            System.out.println(year + " is NOT a Leap Year");
        }

        sc.close();
    }
}
