
import java.util.Scanner;

/* author Max Knee
 * Chapter 3 Program 3.15
 * This program reads the name of employee, salary as in hours
 * and asks how many hours worked per week. 
 * Then calculates pay and factors in overtime as well at 150% of normal wage
 */
public class P3_15 {


    public static void main(String[] args)
    {
       int s = 1;
       int n = 1;
       do
       {
           s = s + n;
           n++;
       }
       while (s < 10 * n);
       System.out.println(s);

    }
}

