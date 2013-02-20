import java.util.Scanner;
/*Name: Max Knee
 * Problem 4.5 To input a series of numbers until a sential value is entered
 * then calculate the average, smallest number largest number and the range of numbers.
 *
 */


public class P4_5 {
    public static void main(String[] args){
    // Declaring the variables
    double sum = 0;
    int count = 0;
    double inputNumber = 0;
    double largest = Double.MIN_VALUE;
    double smallest = Double.MAX_VALUE;
    double range = 0;
    // Setting up the input and sential value
    System.out.print("Please enter floating decimal numbers and enter q to finish: ");
    Scanner in = new Scanner(System.in);
    // Starting to read for the series of inputs
    while (in.hasNextDouble())
    {
        inputNumber = in.nextDouble();
        sum = sum + inputNumber;
        count++;
        
        // Starting the calculations for the largest number
        if (inputNumber > largest)
        {
            largest = inputNumber;
        }
        //Starting the calculation for the smallest number
        if (inputNumber < smallest)
        {
            smallest = inputNumber;
        }
        //Calculate the range
        range = largest - smallest;
        
    //Else loop for input validation
    
    }
    if (count > 0)
    {
        //Calculate the average then output the numbers with the floating point formatting
        double average = sum / count;
        System.out.printf("Average of the numbers: %f\n", average);
        System.out.printf("Largest number: %f\n", largest);
        System.out.printf("Smallest number: %f\n", smallest);
        System.out.printf("Range of numbers %f\n", range);
    }
    else
    {
        System.out.println("No data");
    }
    
  }

}
