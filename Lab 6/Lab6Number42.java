public class Lab6Number42
{
   public static void main(String[] args)
   {
     printUpTriangle(13, "*");
     
   }
        
   /**
      Prints strings.
      @param n number of strings
      @param s string to print
      @return the n number of string s 
   */
   public static void printUpTriangle(int n, String s)
   {
     for (int i=0; i<n; i++)
     {
       for (int j=0; j<=n-i; j++)
       {
         System.out.print(" ");
       }
       for (int k=0; k<=i; k++)
       {
         System.out.print(s);
       
       }
       
       System.out.println("");
     }
   }
}
