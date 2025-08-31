/*Scenario: Create a calculator that takes two numbers and an operator (+, -, *, /) and prints result using nested if-else.
Input:
Enter first number: 10
Enter second number: 5
Enter operator: *
C-DAC MUMBAI
Output:
Result: 50*/

import java.util.Scanner;

class Calculator
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double x = sc.nextDouble();

        System.out.print("Enter second number: ");
        double y = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0); 

        // Using nested if-else
        if (op == '+') 
		{
            System.out.println("Result: " + (x + y));
        } 
		else if (op == '-') 
		{
            System.out.println("Result: " + (x - y));
        } 
		else if (op == '*') 
		{
            System.out.println("Result: " + (x * y));
        } 
		else if (op == '/')
		{ 
             System.out.println("Result: " + (x / y));
        }
		else 
		{
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}
