/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee
 */
public class leapyear {
    public static void main (String[]args)
            {
        String leapYear ="";
         if (((parseYear(input) % 4 == 0) && parseYear(input) % 100 != 0) || (parseYear(input) % 4 == 0) && (parseYear(input) % 100 == 0) && (parseYear(input) % 400 == 0))
            {
                if (parseDay(input) <= 29) {return "leap";}
            }
            else if (parseDay(input) <= 28) {return "no leap";}

    }

}
