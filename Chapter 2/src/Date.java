import java.util.Scanner;


/**
 *
 * @author Max Knee
 * Chapter 5 Date input program with methods 
 * to read an input as MM/YY/DDDD and then parse the date 
 * into Month DD, YYYY and also convert into a number
 * as X of 365
 */
public class Date {
    public static  void main(String[] args)
    {
        //Set While loop for correctDate to check for input
        Boolean correctDate = false;
        String date;
        Boolean valid = false;
        while (!correctDate)
        {
            //Declare variables for parameters from methods
		
            date = getInput();
            int month = parseMonth(date);
            int day = parseDay(date);
            int year = parseYear(date);
            int monthDate = numberMonth(month, year);
            int numericalDate = monthDate + day;
            String monthName = wordMonth(month);
            correctDate = checkInput(date);
            valid = validDate(date);

            //Checking for valid input with the if(correctDate == true)
            if (correctDate == true || valid == true)
            {
                
               
               
                //If input is valid, output correct input then Month DD, YYYY
                //And also printout numerical value of input
                System.out.println("The date you entered is: " + date);
                System.out.println(monthName + " " + day + ", " + year);
                System.out.println("The numerical date is " + numericalDate);
     
                
            }
            //If input is not valid
            else
            {
                System.out.println("Please enter valid date ");
            }
        }
    }
/*
 * To gather input
 * @getInput is the collect string input
 * @return collected input
 */
    public static String getInput()
    {
       System.out.print("Enter a date with the following format: MM/DD/YYYY: ");
       Scanner in = new Scanner(System.in);
       return in.next();

    }
    /*
     * To check the the string input is the correct length 
     * and the string has the correct /
     * @input is the collected input
     * @return valid input
     */
    public static Boolean checkInput(String input)
    {
        if (!(input.length()== 10 && input.substring(2,3).equals("/") && input.substring(5,6).equals("/") ))
        {
            //return true;
            return true;
            
        }
        return false;
    }
    /*
     * To make sure the date is valid
     * @input is collected input
     * @return to make sure the date is valid
     */
    
    public static Boolean validDate(String input)
    {
        //To check the days in a month
        if (parseMonth(input) == 1 || parseMonth(input) == 3 || parseMonth(input) == 5 || parseMonth(input) == 7 || parseMonth(input) == 8 || parseMonth(input) == 10 || parseMonth(input) == 12)
            {
                if (parseDay(input) <= 31)
            {
                return true;
            }
        }
        

        //Checks to see if month has 30 days or less on certain months
        if (parseMonth(input) == 4 || parseMonth(input) == 6 || parseMonth(input) == 9 || parseMonth(input) == 11)
            {
                if (parseDay(input) <= 30)
                {
                    return true;
                }
            }
        
        //Checks to see if febuary is a leap year first
        if (parseMonth(input) == 02)
        {
            {
                //Checking for a leap year first
                if ((parseYear(input) % 4 == 0) && (parseYear(input) % 100 == 0) && (parseYear(input) % 400 == 0))

                {
                    //If a leap year days are 29
                    if (parseDay(input) <= 29)
                    {
                    return true;

                    }
               //Else days are 28
               else if (parseDay(input) < 28)
                    {return true;}
               
               }
              
            }
        }
        else {return false;}
        return true;
        
    }
    
    /*
     * To convert the first part of the string into a month value
     * @input is the collected input
     * @return first to chars of the string as a number for month
     */

    public static int parseMonth(String input)
    {
        //Return chars from a string into a month number
        String month = input.substring(0,2);
        int monthNumber = Integer.parseInt(month);
        return monthNumber;
    }
    /*
     * To convert the second part of the string into a day value
     * @input is collected input
     * @return day value 
     */
    public static int parseDay(String input)
    {
        //Parse string chars into a day value
        String day = input.substring(3,5);
        int dayNumber = Integer.parseInt(day);
        return dayNumber;
    }
    /*
     * To convert third part of the string into a year value
     * @input is collected input
     * @return year value
     */
    public static int parseYear(String input)
    {
       String year = input.substring(6);
       int yearNumber = Integer.parseInt(year);
       return yearNumber;
    }


    /**
     * Convert parseMonth into a Name for the month
     * @param parseMonth is the parse month from above
     * @return the name value of the digit
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
    /*
     * To add the days in a month together when calculating the numerical value 
     * @param parseMonth and parseYear are values from other methods
     * @return the numerical value of the months added up.
     */
    public static int numberMonth(int parseMonth, int parseYear)
    {
        //if monthNumber is out of range, return -1
        if(parseMonth< 1 || parseMonth > 12)
        {
            return -1;
        }
        //I know we haven't learned arrays but from what I know in php
        //it would be easier to make it an array to add the dates together
        int[] monthArray= {31,28,31,30,31,30,31,31,30,31,30,31};

        int days = 0;

        //add up the days in the months preceding the month in question
        for (int i = 1; i < parseMonth; i++)
        {
            days += monthArray[i - 1];
        }

        //add an extra day if it was a leap year and the month is after February
        if ((parseYear % 4 == 0) && (parseYear % 100 == 0) && (parseYear % 400 == 0) && parseMonth > 2)
        {
            days++;
        }

        return days;
    }

}

    
    
        











