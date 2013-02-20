public class homework
{
    public static void main (String[] args)
            {
    int[] values = {1, 2, 5};
    int[] test = new int[2];
    test = evenOdds(values);
    System.out.print(test);
    }
public static int[] evenOdds(int [] values)
{
int totalEvens = 0; int totalOdds = 0;
int[] totalNumber = new int [2];
        
        
        for (int i = 0; i < values.length; i++)
        {
            int number = values[i];
            if (number % 2 == 0)
            {
                totalEvens++;

            }

            if (number % 2 != 0)
            {
                totalOdds++;
            }

        }
        totalNumber[0] = totalEvens;
        totalNumber[1] = totalOdds;
        return totalNumber;




}
}


   
