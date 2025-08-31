/*Sort Three Numbers in Ascending Order
Scenario: Take three numbers and print them in ascending order.
Input:
Enter numbers: 45, 12, 78
Output:
Ascending order: 12,45,78*/

import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[3];  // Array to store 3 numbers

        System.out.print("Enter three numbers: ");
		
        for (int i = 0; i < 3; i++) 
		{
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);  // Sort the array in ascending order

        System.out.println("Ascending order: " + numbers[0] + "," + numbers[1] + "," + numbers[2]);
        sc.close();
    }
}


/*public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int temp;
        if (a > b) { temp = a; a = b; b = temp; }
        if (a > c) { temp = a; a = c; c = temp; }
        if (b > c) { temp = b; b = c; c = temp; }
        System.out.println("Ascending order: " + a + "," + b + "," + c);
        sc.close();
    }
}*/