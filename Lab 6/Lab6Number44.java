public class Lab6Number44
{
   public static void main(String[] args)
   {
     printPyramid(21, "*");
     
   }
        
   /**
      Prints strings.
      @param n number of strings
      @param s string to print
      @return the n number of string s 
   */
   public static void printPyramid(int n, String s)
   {

     for (int i=1; i<n; i += 2)
     {
       for (int k=0; k < (n/2 - i/2); k++)
       {
        System.out.print(" ");
       }
       for (int j=0; j<i; j++)
       {
         System.out.print(s);
       }
      System.out.println("");
     }
   }
}
