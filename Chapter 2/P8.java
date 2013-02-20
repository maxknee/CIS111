
import java.util.Scanner;

// author Max Knee
public class P8 {


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Declare Constants
        final double TAX = 0.075;
        final double SHIPPING = 2.00;

        //Read input for book price
        System.out.println("Book price? ");
        int book_price = in.nextInt();

        //Read input for quantity of books
        System.out.print("How many books? ");
        int book_quantity = in.nextInt();

        //Calculations for total price

        //Tax
        double tax_per_book = TAX * book_price;
        double total_tax = tax_per_book * book_quantity;

        //Shipping
        double total_shipping = SHIPPING * book_quantity;

        //Total price of books
        double total_book_price = book_price * book_quantity;

        //Total price with shipping and tax
        double total_price = total_tax + total_shipping + total_book_price;
        
        //Print total price
        System.out.printf("Total price is%10.2f", total_price);
        

    }
        

}
