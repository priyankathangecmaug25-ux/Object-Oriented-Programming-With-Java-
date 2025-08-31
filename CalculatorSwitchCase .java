/*Basic Calculator Using Switch-Case
Scenario: Create a calculator that uses switch-case for operators (+, -, *, /) and prints result.
Input:
Enter first number: 15
Enter second number: 3
Enter operator: /
Output:
Result: 5*/

import java.util.Scanner;
class CalculatorSwitchCase 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
		
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
		
       //sc.nextLine(); // consume newline
	   
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.nextLine().trim();

        switch (op) 
		{
            case "+":
                System.out.println("Result: " + (a + b));
                break;
			
            case "-":
                System.out.println("Result: " + (a - b));
                break;
				
            case "*":
                System.out.println("Result: " + (a * b));
                break;
				
            case "/":
                System.out.println("Result: " + (a / b));
                break;
				
            default:
                System.out.println("Invalid operator. Use +, -, *, or /");
        }
        sc.close();
    }
}