/*Month Name from Number
Scenario: Take month number (1–12) and print the month name using ternary operators or if-else.
Input:
Enter month number: 8
Output:
Month is August*/

import java.util.Scanner;
class MonthNameFromNumber 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter month number (1-12): ");
        int m = sc.nextInt();

        System.out.println(
		    (m == 1) ? "January"
            : (m == 2) ? "February"
            : (m == 3) ? "March"
            : (m == 4) ? "April"
            : (m == 5) ? "May"
            : (m == 6) ? "June"
            : (m == 7) ? "July"
            : (m == 8) ? "August"
            : (m == 9) ? "September"
            : (m == 10) ? "October"
            : (m == 11) ? "November"
            : (m == 12) ? "December"
            : "Invalid month number. Enter 1-12.");
       
        sc.close();
    }
}