/*Day of the Week (Ternary)
Scenario: Take an int (1–7) and print the corresponding day of the week using ternary operators.
Input:
Enter day number: 3
Output:
Day is Wednesday*/

import java.util.Scanner;

class DayOfWeekTernary
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int d = sc.nextInt();

        // Directly print using ternary chain
        System.out.println(
            (d == 1) ? "Day is Monday" :
            (d == 2) ? "Day is Tuesday" :
            (d == 3) ? "Day is Wednesday" :
            (d == 4) ? "Day is Thursday" :
            (d == 5) ? "Day is Friday" :
            (d == 6) ? "Day is Saturday" :
            (d == 7) ? "Day is Sunday" :
			"Invalid day"
        );

        sc.close();
    }
}
