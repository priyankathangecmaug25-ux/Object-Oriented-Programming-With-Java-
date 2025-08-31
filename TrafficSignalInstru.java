// 28. Traffic Signal Instruction
import java.util.Scanner;
class TrafficSignalInstru 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter traffic light color (Red/Green/Yellow): ");
        String color = sc.nextLine().trim();   //trim for space

        switch (color) 
		{
            case "Red":
                System.out.println("Stop");
                break;
				
            case "Green":
                System.out.println("Go");
                break;
				
            case "Yellow":
                System.out.println("Get ready to stop");
                break;
				
            default:
                System.out.println("Invalid color. Enter Red, Green, or Yellow.");
        }

        sc.close();
    }
}
