public class Lab7Number5Sudoku
{
   public static void main(String[] args)
   {
      // Row and column Latin but with invalid subsquares
      String config1 = "1234567892345678913456789124567891235678912346" 
         + "78912345789123456891234567912345678";
      String[][] puzzle1 = makeSudoku(config1);
      if (isValidSudoku(puzzle1))
      {
         System.out.println("This puzzle is valid.");
      }
      else
      {
         System.out.println("This puzzle is invalid.");
      }
      System.out.println(getPrintableSudoku(puzzle1));
      System.out.println("--------------------------------------------------");

      // Row Latin but column not Latin and with invalid subsquares
      String config2 = "12345678912345678912345678912345678912345678"
         + "9123456789123456789123456789123456789";
      String[][] puzzle2 = makeSudoku(config2);
      if (isValidSudoku(puzzle2))
      {
         System.out.println("This puzzle is valid.");
      }
      else
      {
         System.out.println("This puzzle is invalid.");
      } 
       
      System.out.println(getPrintableSudoku(puzzle2));
      System.out.println("--------------------------------------------------"); 
       
      // A valid sudoku
      String config3 = "25813764914698532779324685147286319558149273663"
         + "9571482315728964824619573967354218";
      String[][] puzzle3 = makeSudoku(config3);
      if (isValidSudoku(puzzle3))
      {
         System.out.println("This puzzle is valid.");
      }
      else
      {
         System.out.println("This puzzle is invalid.");
      } 
      System.out.println(getPrintableSudoku(puzzle3));
      System.out.println("--------------------------------------------------"); 

   }
   
   public static String[][] makeSudoku(String s)
   {
      int SIZE = 9;
      int k = 0;
      String[][] x = new String[SIZE][SIZE];
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
         {
            x[i][j] = s.substring(k, k + 1);
            k++;
         }
      }
      return x;
   }

   public static String getPrintableSudoku(String[][] x)
   {
      int SIZE = 9;
      String temp = "";
      for (int i = 0; i < SIZE; i++)
      {
         if ((i == 3) || (i == 6))
         {
            temp = temp + "=================\n";
         }
         for (int j = 0; j < SIZE; j++)
         {
            if ((j == 3) || (j == 6))
            {
               temp = temp + " || ";
            }
            temp = temp + x[i][j];
         }
         temp = temp + "\n";
      }
      return temp;
   }

   public static boolean isValidSudoku(String[][] x)
   {
      return rowsAreLatin(x) && colsAreLatin(x) && goodSubsquares(x);
   }

   public static boolean rowsAreLatin(String[][] x)
   {
     int SIZE = 9;
     boolean result = true;
     boolean[] found = new boolean[SIZE];
     for (int i = 0; i<SIZE; i++)
     {
       found[i] = rowIsLatin(x, i);
     }
      for (int i = 0; i<SIZE ; i++)
     {
       if (found[i]==false)
       {
         result = false;
       }
     }
     return result;
   }

   public static boolean rowIsLatin(String[][] x, int i)
   {
     int SIZE = 9;
     int boolSize = 10;
     boolean result = true;
     boolean[] found = new boolean[boolSize];
     for (int k = 1; k < boolSize; k++)
     {
       for (int j = 0; j < SIZE; j++)
       {
         if (k==Integer.parseInt(x[i][j]))
         {
           found[k] = true;
         }
       }
     }
     for (int k = 1; k < boolSize; k++)
     {
       if (found[k]==false)
       {
         result = false;
       }
     }
     return result;
   }

   public static boolean colsAreLatin(String[][] x)
   {
     int SIZE = 9;
     boolean result = true;
     boolean[] found = new boolean[SIZE];
     for (int i = 0; i<SIZE; i++)
     {
       found[i] = colIsLatin(x, i);
     }
      for (int i = 0; i<SIZE ; i++)
     {
       if (found[i]==false)
       {
         result = false;
       }
     }
      return result;
   }   

   public static boolean colIsLatin(String[][] x, int j)
   {
     int SIZE = 9;
     int boolSize = 10;
     boolean result = true;
     boolean[] found = new boolean[boolSize];
     for (int k = 1; k < boolSize; k++)
     {
       for (int i = 0; i < SIZE; i++)
       {
         if (k==Integer.parseInt(x[i][j]))
         {
           found[k] = true;
         }
       }
     }
     for (int k = 1; k < boolSize; k++)
     {
       if (found[k]==false)
       {
         result = false;
       }
     }
     return result;
   }
   
   public static boolean goodSubsquares(String[][] x)
   {
     int SIZE = 9;
     boolean result = true;
     boolean[] found = new boolean[SIZE];
     for (int k = 0; k<SIZE; k++)
     {
       for (int i = 0; i<SIZE; i+=3)
       {
         for (int j = 0; j<SIZE; j+=3)
         {
           found[k] = goodSubsquare(x, i, j);
         }
       }
     }
      for (int i = 0; i<SIZE ; i++)
     {
       if (found[i]==false)
       {
         result = false;
       }
     }
      return result;
   }

   public static boolean goodSubsquare(String[][] x, int i, int j)
   {
     int SIZE = 9;
     int boolSize = 10;
     boolean result = true;
     boolean[] found = new boolean[boolSize];
     for (int k = 1; k < boolSize; k++)
     {
       for (int row = i; row < i+3; row++)
       {
         for (int col = j; col < j+3; col++)
         {
           if (k==Integer.parseInt(x[row][col]))
           {
             found[k] = true;
           }
         }
       }
     }
     for (int k = 1; k < boolSize; k++)
     {
       if (found[k]==false)
       {
         result = false;
       }
     }
     return result;
   }
}

