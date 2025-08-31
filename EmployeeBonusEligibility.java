/*Scenario: A company gives a 5% bonus to employees with more than 5 years of service. Take salary and years of service as input and print bonus amount.
Input:
Enter salary: 50000
Enter years of service: 6
Output:
Bonus amount: 2500*/


import java.util.Scanner; 

class EmployeeBonusEligibility 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        // Take years of service input
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

         if (years > 5)
	    {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } 
		else 
		{
            System.out.println("Not eligible for bonus.");
        }
        sc.close();
    }
}
