
import java.util.Scanner;

/* author Max Knee
 * Chapter 3 Program 3.15
 * This program reads the name of employee, salary as in hours
 * and asks how many hours worked per week. 
 * Then calculates pay and factors in overtime as well at 150% of normal wage
 */
public class Ch2 {


    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      //Gather inputs
      System.out.print("Enter Employee Name: ");
      String employeeName = in.next();
      System.out.print("Enter hours worked: ");
      double hoursWorked = in.nextDouble();
      System.out.print("Enter Salary (hourly wage): ");
      double salaryHourly = in.nextDouble();
      
      //Calculate Paycheck
      if (hoursWorked > 40)
      {
         double overtimeHours = hoursWorked - 40;
         double paycheck = 40  * salaryHourly;
         double overtimePay = overtimeHours * (salaryHourly * 1.5);
         double paycheckFinal = overtimePay + paycheck;
         System.out.println("Employee Name: " + employeeName);
         System.out.println("Normal Hours Worked: " + hoursWorked + " Overtime Hours Worked: " + overtimeHours);
         System.out.println("Normal Salary: $" + paycheck + " Overtime pay: $" + overtimePay + " Final pay: $" + paycheckFinal);
         
          
      }
      else
      {
          double paycheck = hoursWorked * salaryHourly;
          System.out.println("Employee Name: " + employeeName);
          System.out.println("Normal Hours Worked: " + hoursWorked);
          System.out.println("Paycheck: $" + paycheck);
      }
      
    }

}

