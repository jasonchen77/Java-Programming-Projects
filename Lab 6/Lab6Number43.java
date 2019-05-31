public class Lab6Number43
{
   public static void main(String[] args)
   {
     printDownTriangle(13, "*");
     
   }
        
   /**
      Prints strings.
      @param n number of strings
      @param s string to print
      @return the n number of string s 
   */
   public static void printDownTriangle(int n, String s)
   {
     for (int i=0; i<n; i++)
     {
     
       for (int k=0; k<=i; k++)
       {
         System.out.print(" ");
       
       }
       for (int j=n; j>i; j--)
       {
         System.out.print(s);
       }
       System.out.println("");
      
     }
   }
}
