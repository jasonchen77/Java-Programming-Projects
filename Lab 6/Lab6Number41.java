public class Lab6Number41
{
   public static void main(String[] args)
   {
     makeRow(5, "*");
     makeRow(5, "=");
     makeRow(5, "*");
     
   }
        
   /**
      Prints strings.
      @param n number of strings
      @param s string to print
      @return the n number of string s 
   */
   public static void makeRow(int n, String s)
   {
     for (int i=0; i<n; i++)
     {
       System.out.print(s);
     }
   }
}
