/*Menu-Based Simple Arithmetic Operations
Scenario: Implement a menu-based program that asks user to select operation (Addition, Subtraction, Multiplication, Division) and prints result.
Input:
Select operation (1-Addition, 2-Subtraction): 1
Enter first number: 20
Enter second number: 30
Output:
Result: 50*/

import java.util.Scanner;
class MenuBaseArithmetic 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Select operation: 1-Addition, 2-Subtraction, 3-Multiplication, 4-Division");
		
        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();
		
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
		
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (choice) 
		{
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b == 0) 
				{
				System.out.println("Error: Division by zero.");
				}
                else
                {				
				System.out.println("Result: " + (a / b));
				}
                break;
            default:
                System.out.println("Invalid choice. Enter 1-4.");
        }

        sc.close();
    }
}