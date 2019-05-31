public class Lab6Number45
{
   public static void main(String[] args)
   {
     printHouse(11, "*");
     
   }
        
   /**
      Prints strings.
      @param n number of strings
      @param s string to print
      @return the n number of string s 
   */
   public static void printHouse(int n, String s)
   {

     for (int i=1; i<n-1; i += 2)
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
     
     for (int i=0; i<n; i++)
     {
       for (int j=0; j<n; j++)
       {
         System.out.print(s);
       
       }
       System.out.println("");
     
     }
   }
}
