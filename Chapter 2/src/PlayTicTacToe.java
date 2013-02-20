import java.util.Scanner;
/*
This program is designed to play a standard tic-tac-toe game for two players.
If either player has three X's or O's in a row, they will be declared the winner.

Program Authors:      Cay Horstmann, Marie Hartlein and Max Knee
Date Created:		    January 10, 2011 (CH)
Date(s) Modified:	    April 5, 2011 (MH)
Date(s) Modified:           April 20, 2011 (MK)
							 

Textbook Reference:	Chapter 6 Arrays....Page 269; Problem P6.18 

The Problem:
This program was written by the textook publisher staff and has several problems.
1.   It needs comments throughout
2.   The user prompting is very confusing and needs clarification.    
3.   Most people don't think of the first row and column as zero.    Modify the existing code so
     so we can refer to the rows and columns as 1-3 rathar than 0-2   

Please make the above corrections, test all paths of the program and submit.
*/

public class PlayTicTacToe
{
public static void main(String[] args)
   {
      //Declare Scanner Class
      Scanner in = new Scanner(System.in);
      //Declare Array for input of the board
      int[][] board = new int[3][3];
      //Declare player variable which will
      int player = 2;

      drawBoard(board);
      //checks to see the winner
      while (!win(board, player))
      {
         if (player == 1)
         {
            player = 2;
         }
         else
         {
            player = 1;
         }
         // Asks for input from each player.
         System.out.print("Player " + player + " choose a row ");
         int row = in.nextInt();
         System.out.print("Choose a column: ");
         int column = in.nextInt();
         //Converts inputs since arrays read with an index starting at 0
         //Just subrtacts so if user inputs row 1 column 1 array is actually board[0][0]
         if (row == 1){row -=1;}
         if (row == 2){row -=1;}
         if (row == 3){row -=1;}
         if (column == 1){column -=1;}
         if (column == 2){column -=1;}
         if (column == 3){column -=1;}


         board[row][column] = player;
         drawBoard(board);
      }
      System.out.println("Player " + player + " wins!");
   
   }





   /**
      Checks if player has won tic-tac-toe along diagonal lines
      @param board a 3x3 array containing 0, 1, 2, values indicating
      blanks or player numbers
      @param player the player to check for a winning sequence of marks
      @return true if player won, false otherwise
   */
   public static boolean wonDiagonal(int[][] board, int player)
   {
      int count = 0;
      //check one diagonal
      for (int i = 0; i < 3; i++)
      {
         if (board[i][i] == player)
         {
            count++;
         }
      }
      if (count == 3)
      {
         return true;
      }
      else
      {
         count = 0;
      }

      //check other diagonal
      for (int i = 0; i < 3; i++)
      {
         if (board[i][2 - i] == player)
         {
            count++;
         }
      }
      if (count == 3)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   /**
      Checks if player has won tic-tac-toe along straight lines
      @param board a 3x3 array containing 0, 1, 2, values indicating
      blanks or player numbers
      @param player the player to check for a winning sequence of marks
      @return true if player won, false otherwise
   */
   public static boolean wonStreightLines(int[][] board, int player)
   {
      for (int i = 0; i < 3; i++)
      {
         int count = 0;
         for (int j = 0; j < 3; j++)
         {
            if (board[i][j] == player)
            {
               count++;
            }
         }
         if (count == 3)
         {
            return true;
         }
      }
      for (int i = 0; i < 3; i++)
      {
         int count = 0;
         for (int j = 0; j < 3; j++)
         {
            if (board[j][i] == player)
            {
               count++;
            }
         }
         if (count == 3)
         {
            return true;
         }
      }
      return false;
   }

   /**
      Checks if player has won
      @param board a 3x3 array containing 0, 1, 2, values indicating
      blanks or player numbers
      @param player the player to check for a winning sequence of marks
      @return true if player won, false otherwise
   */
   public static boolean win(int[][] board, int player)
   {
      if (wonDiagonal(board, player) || wonStreightLines(board, player))
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   /**
      Draws gameboard, player 1 is X, player 2 is O
      @param board the gameboard filled with 0, 1, or 2s
   */
   public static void drawBoard(int[][] board)
   {
      System.out.println("|-----|");
      for (int i = 0; i < 3; i++)
      {
         for (int j = 0; j < 3; j++)
         {
            if (board[i][j] == 1)
            {
               System.out.print("|X");
            }
            else if (board[i][j] == 2)
            {
               System.out.print("|O");
            }
            else
            {
               System.out.print("| ");
            }
         }
         System.out.println("|\n|-----|");
      }
   }

   
}
