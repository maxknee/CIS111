
import java.util.Scanner;

// author Max Knee
public class P3 {

  public static void main(String[] args)
    {
      String card_name;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the card notation: ");
      card_name = in.next();
      switch (card_name)
      {
          case 1: card_name.equals("AD"); System.out.print("Ace of diamonds");
          case 2: card_name.equals("AH"); System.out.print("Ace of hearts");
          case 3: card_name.equals("AS"); System.out.print("Ace of spades");
          case 4: card_name = "AC"; System.out.print("Ace of clubs");
          case 5: card_name = "A"; System.out.print("Ace of hearts");
          default: card_name= ""; break;
      }
      


    }

}
