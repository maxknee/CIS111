
import java.util.Scanner;

// author Max Knee
public class P2 {

    
	public static void main(String[] args)
    	{
        	Scanner in = new Scanner(System.in);
        	// Gather Inputs
        	System.out.print("Please enter an integer: ");
        	int input1 = in.nextInt();
        	System.out.print("Please enter another integer: ");
        	int input2 = in.nextInt();

        	//The sum
     
        	System.out.println("The sum is " + (input1 + input2));
        
        	//The difference
        	System.out.println("The difference is " + (input1-input2));

        	//The Product
        	System.out.println("The product is " + (input1 * input2));

        	//The Average
        	double average = ((input1 + input2)/2.0);
        	System.out.print("The average is ");
        	System.out.println(average);

        	//The distance
        	System.out.print("The distance is ");
        	System.out.println(Math.abs(input1-input2) );

        	//The Maximum
        	System.out.print("The maximum is ");
        	System.out.println(Math.max(input2, input1));

        	//The minimum
        	System.out.print("The minimum is ");
        	System.out.print(Math.min(input2, input1));
        
        
    }

}


