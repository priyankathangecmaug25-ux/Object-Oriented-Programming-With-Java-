/*Reverse 4-Digit Number and Palindrome Check
Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome.
Input:
Enter 4-digit number: 1221
Output:
Reversed number: 1221
Palindrome: Yes*/

import java.util.Scanner;

public class ReversePalindrome 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();
        int reversed = 0;
        int original = num;

        while (num != 0) 
		{
            reversed = reversed * 10 + num % 10;  // Reverse in one step
            num /= 10;                             // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
		
        System.out.println("Palindrome: " + (reversed == original ? "Yes" : "No"));

        sc.close();
    }
}
