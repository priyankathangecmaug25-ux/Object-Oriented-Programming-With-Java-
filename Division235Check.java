/*50. Divisibility by 2, 3, 5 Custom Messages
Scenario: Take a number and check divisibility by 2, 3, and 5. printing custom
Input:
Enter number: 30
Output:
Divisible by 2
Divisible by 3
Divisible by 5  */

import java.util.Scanner;

public class Division235Check 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) 
		{
            System.out.println("Divisible by 2");
        }
        if (num % 3 == 0) 
		{
            System.out.println("Divisible by 3");
        }
        if (num % 5 == 0)
		{
            System.out.println("Divisible by 5");
        }
		else
		{
            System.out.println("Not Divisible");
        }
			

        sc.close();
    }
}
