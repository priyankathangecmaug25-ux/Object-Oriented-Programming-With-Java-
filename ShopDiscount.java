/*Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amount as input and calculate final cost.
Input:
Enter total purchase amount: 1200
Output:
Final cost after discount: 1080*/

import java.util.Scanner; // Import Scanner class

class ShopDiscount 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total purchase amount: ");
        double amount = sc.nextDouble();
        if (amount > 1000)
            amount = amount - (amount * 0.10);
        System.out.println("Final cost after discount: " + amount);
        sc.close();
    }
}