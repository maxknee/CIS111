
import java.util.Scanner;

/* author Max Knee
 * Chapter 3 Program 3.14
 * This program reads for inputs for a checking account and a savings account
 * shorthand and displays the full name
 */
public class P314 {


    public static void main(String[] args)
    {


      Scanner in = new Scanner(System.in);
      System.out.println("Please enter your 8 digit Credit Card Number ");
      String cardNumber = in.next();
      int currentIndex = cardNumber.length() - 1;
      while (currentIndex >= 0)
        {
          int smallValue;
          smallValue = Integer.valueOf(cardNumber.charAt(currentIndex));
          int runningTotal = 0;
          runningTotal = runningTotal + smallValue;
          currentIndex = currentIndex -2;
          
        }
      
    }
}




