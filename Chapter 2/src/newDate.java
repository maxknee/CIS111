import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee
 */
public class newDate {
    public static void main(String[] args)
    {
        Boolean sentinal = true;
        while (sentinal)
        {
            String input = getInput();
            if (checkInput(input))
            {
                sentinal = false;
                System.out.println("The date you entered is: " + parseMonth(input) + " " + parseDay(input) + ", " + parseYear(input));
            }
            else {System.out.println("Please enter valid date ");}

        }
    }

    public static String getInput()
    {
       System.out.print("Enter a date with the following format: MM/DD/YYYY: ");
       Scanner in = new Scanner(System.in);
       String input = in.next();
       return input;

    }
    public static int parseMonth(String input)
    {
        String month = input.substring(0,2);
        int monthNumber = Integer.parseInt(month);
        return monthNumber;
    }
    public static int parseDay(String input)
    {
        String day = input.substring(3,5);
        int dayNumber = Integer.parseInt(day);
        return dayNumber;
    }
    public static int parseYear(String input)
    {
       String year = input.substring(6);
       int yearNumber = Integer.parseInt(year);
       return yearNumber;
    }

    public static Boolean checkInput(String input)
    {

            
            String wrongInput = "Wrong Input, please enter again";
            System.out.println("year " + parseYear(input) + " month " + parseMonth(input) + " day " + parseDay(input));
            if (!(input.length()== 10 && input.substring(2).equals("/") && input.substring(5).equals("/") ))
            {
                return false;
            }

            if (parseMonth(input) == 1 || parseMonth(input) == 3 || parseMonth(input) == 5 || parseMonth(input) == 7 || parseMonth(input) == 8 || parseMonth(input) == 10 || parseMonth(input) == 12)
            {
                if (dayNumber <= 31)
                {
                return true;
                }
            }
            else {return false;}
            if (parseMonth(input) == 4 || parseMonth(input) == 6 || parseMonth(input) == 9 || parseMonth(input) == 11)
            {
                if (dayNumber <= 30)
                {
                    return true;
                }
                else {return false;}
            }
            if (parseMonth(input) == 02)
            {
                 if (((yearNumber % 4 == 0) && yearNumber % 100 != 0) || (yearNumber % 4 == 0) && (yearNumber % 100 == 0) && (yearNumber % 400 == 0))
                 {
                    if (dayNumber <= 29)
                     {
                        return true;
                     }
                 }

                 else if (dayNumber <= 28)
                 {
                    return true;
                 }

            }
            else {return false;}
            return true;
        }
    /**
     * 
     * @param parseMonth
     * @return
     */
    public static String wordMonth(int parseMonth)
    {
        if (parseMonth == 1) {return "January";}
        if (parseMonth == 2) {return "February";}
        if (parseMonth == 3) {return "March";}
        if (parseMonth == 4) {return "April";}
        if (parseMonth == 5) {return "May";}
        if (parseMonth == 6) {return "June";}
        if (parseMonth == 7) {return "July";}
        if (parseMonth == 8) {return "August";}
        if (parseMonth == 9) {return "September";}
        if (parseMonth == 10) {return "October";}
        if (parseMonth == 11) {return "November";}
        if (parseMonth == 12) {return "December";}
        return "";
      }



}





