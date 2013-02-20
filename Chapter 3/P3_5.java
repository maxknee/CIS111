import java.util.Scanner;

/* author Max Knee
 * Chapter 3 Program 3.5
 * This program reads for inputs for card values in
 * shorthand and displays the full name
 */
public class P3_5 {


    public static void main(String[] args)
    {
      //Declare Card Values
      final String DIAMOND = "of Diamonds";
      final String HEARTS = "of Hearts";
      final String CLUBS = "of Clubs";
      final String SPADES = "of Spades";

      //Read for input
      String cardName = "";
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the card notation: ");
      if (in.hasNext())
      {
        cardName = in.next();
        char numberName = cardName.charAt(0);
        char cardSuite = cardName.charAt(cardName.length() - 1);
      //If else statements to test card values
        if (cardName.length() == 2)
        {
            switch (numberName)
            {
                case 'A': System.out.print("Ace "); break;
                case '2': System.out.print("Two "); break;
                case '3': System.out.print("Three "); break;
                case '4': System.out.print("Four "); break;
                case '5': System.out.print("Five "); break;
                case '6': System.out.print("Six "); break;
                case '7': System.out.print("Seven "); break;
                case '8': System.out.print("Eight "); break;
                case '9': System.out.print("Nine "); break;
                case 'K': System.out.print("King "); break;
                case 'Q': System.out.print("Queen "); break;
                case 'J': System.out.print("Jack "); break;
            }

        }
        else
        {
          System.out.print("Ten ");
        }
        switch (cardSuite)
        {
            case 'D': cardSuite = 'D'; System.out.print(DIAMOND); break;
            case 'C': cardSuite = 'C'; System.out.print(CLUBS); break;
            case 'H': cardSuite = 'H'; System.out.print(HEARTS); break;
            case 'S': cardSuite = 'S'; System.out.print(SPADES); break;
        }
      }
      else
      {
          System.out.println("Not a Valid Card");
      }
    }
}



