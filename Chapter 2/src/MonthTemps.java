import java.io.*;
import java.util.*;


/**
 * Marie Hartlein
 * Monthly Temperatures Program
 * read from a text file monthly high and low temperatures and calculate
 * average, range and high and low temperatures.
 * @author Max Knee
 */
public class MonthTemps {

    public static void main(String[] args) throws FileNotFoundException
    {
        //declare variables
        Boolean inputTest = false;
        String inputFile = inputFileName();
        String outputFile = outputFileName();
        Boolean sentinel = false;
        double highTemp, lowTemp, averageTemp, range;
        double maxTemp = Double.MAX_VALUE;
        double minTemp = Double.MIN_VALUE;
        double highSum = 0, lowSum = 0, yearlySum = 0, rangeSum;
        double totalAvgHigh = 0;
        double totalAvgLow = 0;
        double totalAvgYearly = 0;
        double totalRangeAvg = 0;
        String month;
        int i = 0;

        //Exit do-while loop
        while ((!inputFile.equals("exit") || (!outputFile.equals("exit"))) && !sentinel)
            {
                sentinel = true;
                inputTest = inputValidName(inputFile);
                //Open files for reading
                Scanner inFile = new Scanner(new File(inputFile));
                //Open file for writing to.
                PrintWriter outFile = new PrintWriter(outputFile);
                //Input validation for input file name
                if (inputTest)
                {
                    
                    Boolean outputTest = outputValidName(outputFile);

                        //input validation for output file name
                        if (outputTest)
                        {
                            //Creating headers for console output and text output file                           
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("    Month    |  High Temperature | Low Temperature | Average Temperature | Range ");
                            System.out.println("---------------------------------------------------------------------------------");
                            outFile.println("---------------------------------------------------------------------------------");
                            outFile.println("    Month    |  High Temperature | Low Temperature | Average Temperature | Range ");
                            outFile.println("---------------------------------------------------------------------------------");

                            //do while loop to read file
                            while (inFile.hasNext())
                            {
                                //extract Month name from file
                                month = inFile.next();
                                //Remove comma for better presentation
                                String   formatMonth = month.replace(',', ' ');
                                //calculate high temperature from text file
                                highTemp  = inFile.nextDouble();
                                //extract low temperature file from text file
                                lowTemp = inFile.nextDouble();
                                //Calculate averaget Temperature from values
                                averageTemp = (highTemp + lowTemp)/2;
                                //Calculate Range
                                range = (highTemp - lowTemp);
                                //Calculate low temperature
                                minTemp = Math.min(minTemp, lowTemp);
                                //Calculate high temperature
                                maxTemp = Math.max(maxTemp, highTemp);
                                //Sum up high temperatures
                                highSum += highTemp;
                                //Sum up low Temperatures
                                lowSum += lowTemp;
                                //calculate yearly sum
                                yearlySum += averageTemp;
                                //Calculate average of all the high temperatures
                                totalAvgHigh = highSum/12;
                                //Calculate average of all low temperatures
                                totalAvgLow = lowSum/12;
                                //Calculate the average of the years
                                totalAvgYearly = yearlySum/12;
                                //Calculate averge of the range
                                totalRangeAvg = (highSum +lowSum)/12;

                                System.out.println(formatMonth + "   |     " + highTemp + "         |       " + lowTemp + "     |      " + averageTemp + "    |    " + range );
                                outFile.println(formatMonth + "   |           " + highTemp + "         |       " + lowTemp + "     |      " + averageTemp + "    |    " + range );

                                                          
                            }
                                
                            //Print out calculated values
                            System.out.printf("Average High Temps:" + totalAvgHigh +   " Average Low Temps: " + totalAvgLow +  " Total Average: " +  totalAvgYearly + " Total Range Average: " +  totalRangeAvg);
                            System.out.printf("High Temp " +  maxTemp);
                            System.out.printf("Low Temp " +  minTemp);
                            outFile.printf("Average High Temps: " +  totalAvgHigh + " Average Low Temps: " +  totalAvgLow + " Total Average: " +  totalAvgYearly +  " Total Range Average: " +  totalRangeAvg);
                            outFile.printf("High Temp " +  maxTemp);
                            outFile.printf("Low Temp " +  minTemp);
                            //Formatting
                            outFile.println("---------------------------------------------------------------------------------");
                            inFile.close();
                            outFile.close();
                            outFile.flush();
                        }
                        //Option to crrect output file name
                        else
                        {
                        	String correctOutput = correctOutputFilename();
                                outputFile = correctOutput;
                        }
                    }
                //Chance to correct input file name
                else
                {
                    String correctInput = correctInputFileName();
                    inputFile = correctInput;
                }
                
            }

    }


    /**
     * output corrected file name if outputfileName is wrong
     * @return
     */
    public static String correctOutputFilename() {
    	Scanner console = new Scanner(System.in);
    	System.out.print("Please enter the correct output file name ");
		return console.next();
	}
    /**
     * input corrected file name if inputfileName is wrong
     * @return
     */
    public static String correctInputFileName() {
    	Scanner console = new Scanner(System.in);
    	System.out.print("Please enter the correct input file name ");
		return console.next();
	}


    /**
     * collect inputFileName for the input file for program to read
     * @return
     */
    public static String inputFileName()
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter the filename you wish to open or enter 'exit' to exit ");
        String fileName;
        fileName = console.next();
        return fileName;

    }
    /**
     * collect input for output file
     * @return
     */
    public static String outputFileName()
    {
       Scanner console = new Scanner(System.in);
       System.out.print("Please enter the file name you wish to output to: ");
       return console.next();
    }
    /**
     *  test to see if inputfilename is valid
     * @param inputFileName
     * @return boolean value if inputfileName is correct or not
     */
    public static Boolean inputValidName(String inputFileName)
    {
        Boolean inputName;
        if (inputFileName.equals("MonthlyTemperatures.txt") || (inputFileName.equals("testTemperatures.txt")))
            {
                inputName = true;
            }
        else {inputName = false;}
        return inputName;
    }
    /**
     *  to check if outputfilename is correct
     * @param outputFileName
     * @return return boolean value if outputfilename is valid
     */
    public static Boolean outputValidName(String outputFileName)
    {
        Boolean outputName;
        if (outputFileName.equals("averageTemperatures.txt"))
        {
            outputName = true;
        }
        else {outputName = false;}
        return outputName;
    }



}