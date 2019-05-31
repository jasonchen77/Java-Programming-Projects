import java.util.Arrays;
import java.lang.reflect.Array;

public class Lab7Number13Arrays
{
   public static void main(String[] args)
   {
      double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
      System.out.println("Before rotation:  ==============================");
      for (int i = 0; i < x.length; i++)
      {
         System.out.println("x[" + i + "]:  " + x[i]);
      }
      x = rotate(x, 3);
      System.out.println("After rotation:  ==============================");       
      for (int i = 0; i < x.length; i++)
      {
         System.out.println("x[" + i + "]:  " + x[i]);
      } 
   }
   
   public static double[] rotate(double[] x, int n)
   {
     double[] result = new double[x.length];
     System.arraycopy(x, n, result, 0, x.length-n);
     System.arraycopy(x, 0, result, x.length-n, n);
     return result;
   }
   
}
