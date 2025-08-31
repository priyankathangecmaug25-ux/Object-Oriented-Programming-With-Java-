/*33. Even or Odd (Ternary)
Scenario: Take a number and check if it is even or odd using ternary operator.
Input:
Enter a number: 17
Output:
Number is Odd*/

import java.util.Scanner;
class EvenOddTernary 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + result);
        sc.close();
    }
}