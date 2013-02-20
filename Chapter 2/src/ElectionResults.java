import java.io.*;
import java.util.*;
/*
 * Marie Hartlien 
 * Election Results Program
 * To open a file with election results and output results and calculate the winner
 */

/**
 *
 * @author mknee000
 */
public class ElectionResults {

    public static void main (String[] args) throws FileNotFoundException
    {
        //Initialize all values
        String inputFile = inputFileName();
        Boolean sentinel = false;
        int vote;
        String name;
        int count = 0;
        double voteSum = 0;
        int fileLength = arrayLength(inputFile);
        while (!inputFile.equals("exit") && !sentinel)
        {
            
            sentinel = true;
            //initialize integers
            //read input file
            Scanner inFile = new Scanner(new File(inputFile));
            int[] fileVotes = new int[fileLength];
            String[] candidate = new String[fileLength];
            double[] percentage = new double[fileLength];
            //Print header for columns
            header();
            //Read input file and put information into variables
            while (inFile.hasNext())
            {
                //read for name
                name = inFile.next();
                //read for vote tally
                vote = inFile.nextInt();
                //put values into arrays
                candidate[count] = name;
                fileVotes[count] = vote;
                
                
                count++;
            }
            //do sum method
            voteSum = sum(fileVotes);

            //calculate % of votes
            for(int i = 0; i < fileVotes.length; i++)
                {
                  //  votePercent = (fileVotes[i]/voteSum) *100;
                    percentage[i] = ((fileVotes[i]/ voteSum)*100);
                    
                }
            //close file
            inFile.close();
            //print out election results
            for (int x = 0; x <candidate.length; x++ )
            {
            System.out.printf("%15s|%15s|%.2f15 %n", candidate[x], fileVotes[x],  percentage[x]);
            
            
            }
            //delcare election winner
            int winnerIndex = voteHigh(fileVotes);  
            System.out.println("Winner " + candidate[winnerIndex] + " " + fileVotes[winnerIndex]);


        }
        
    }
    /**
     * collect inputFileName for the input file for program to read
     * @return filename
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
     * Create the header for the output
     */
    public static void header()
    {
        System.out.printf("%15s|%15s|%15s", " Name ", " Votes Recieved ",  " % of Total Votes ");
        System.out.println();
    }
    /**
     *
     * @param fileVotes
     * @return sum of the votes
     */
    public static double sum(int[] fileVotes)
    {
        
        double total = 0;
        for (int i = 0; i < fileVotes.length; i++)
        {
            total += fileVotes[i];
            
        }
        
        return total;
    }

    /**
     * reads input file for how many lines and calculates array length
     * @param inputFile
     * @return array length
     * @throws FileNotFoundException
     */
    public static int arrayLength(String inputFile) throws FileNotFoundException
    {
        Scanner inFile = new Scanner(new File(inputFile));
        int length = 0;
            while(inFile.hasNextLine() == true)
            {
                String name = inFile.nextLine();

                length++;
            }
            inFile.close();

            return length;
    }
    /**
     *
     * @param fileVotes
     * @return the index with the high vote
     */
    public static int voteHigh(int[] fileVotes)
    {
        double highVote = fileVotes[0];
        int highVoteIndex =0;
        for (int i = 0; i < fileVotes.length; i++)
        {
            if (fileVotes[i] > highVote)
            {
                highVote = fileVotes[i];
                highVoteIndex = i;
            }
        }
        return highVoteIndex;
    }


}



