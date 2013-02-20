import java.util.Scanner;

/* author Max Knee
 * Chapter 4 Program 4.2
 * This program reads for an 8 digit credit card number
 * then calculates every other digit starting from the last and sums
 * then calculate second from last and doubles then seperates each digit then sums up
 */
public class P4_2 {


    public static void main(String[] args)
    {
      // Delcare variables and collect input

      int firstSum = 0;
      int secondSum = 0;
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter your 8 digit Credit Card Number ");
      String fullNumber = in.next();
      // Test to check to see if input for credit card number is 8 digits
      if (fullNumber.length() == 8)
      {
          // A counter loop for converting every other digit from a string to a integer starting from the last digit
          for (int i = 7; i >= 0 ; i = i - 2)
          {
            int firstProblem = Character.digit(fullNumber.charAt(i), 10);
            
            firstSum += firstProblem;
            

         }
         // A counter loop for every other digit starting from second to last
         for (int i = 6; i >= 0; i -= 2)
         {
            // Double each digit after converting from a string to an integer
            int doubledValue = (Character.digit(fullNumber.charAt(i), 10) * 2);
            //Example value: 12 (if the original value was 6)

            // Convert each integer to a string
            String breakMeApart = (Integer.toString(doubledValue));
            //Example value: "12"

            //Now you need to sum up "1" and "2"

            int breakMeApartSum = 0;
            // Loop that breaks apart each doubled value into a seperate integer
            for (int k = 0; k < breakMeApart.length() ; k++)
                {
                    int currentSplitApartDigit = (Character.digit(breakMeApart.charAt(k), 10));
                    breakMeApartSum += currentSplitApartDigit;
                }

            //At this point breakMeApartSum is 3
            secondSum += breakMeApartSum;
         }
        // Add the sum of the first set of numbers and the second set of numbers for the check number
        int checkNumber = secondSum + firstSum;
        String lastNumber = (Integer.toString(checkNumber));
        int lastDigit = (Character.digit(lastNumber.charAt(lastNumber.length()- 1), 10));
        //Check to see if the last digit of the sum is equal to 0
        if (lastDigit == 0)
        {
            System.out.println("Last digit is 0, credit card number verified" + lastDigit);
        }
        else
        {
            System.out.println("Last digit is not 0, credit card number not verified " + lastDigit);
        }



      }
      //Output if number is not 8 characters long
      else
      {
        System.out.println("Number not long enough, please enter an 8 digit number");
      }
    }
}


            


