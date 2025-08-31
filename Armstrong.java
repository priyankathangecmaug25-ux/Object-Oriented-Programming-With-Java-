/*41. Check Armstrong Number (3-Digit)
Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits = number).
Input:
Enter number: 153
Output:
153 is an Armstrong number*/

import java.util.Scanner;

public class Armstrong
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        // Loop to get each digit and add its cube
        while (num != 0)
		{
            int digit = num % 10;  // Get last digit
            sum += digit * digit * digit; // Cube and add
            num = num / 10;        // Remove last digit
        }

        // Check Armstrong
        if (sum == original) {
		
            System.out.println(original + " is an Armstrong number");
        } 
		else 
		{
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}
