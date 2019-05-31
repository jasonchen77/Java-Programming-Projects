public class Lab5Number102
{
   public static void main(String[] args)
   {
      int start = 400;
      int end = 499;
      for (int century = -5; century <= 5; century++)
      {
        if (century < 0)
        {
        if (start == 0)
        {
          start = 1;
        }
        System.out.println("Century " + century*(-1) + " BC  " + start + "-" + end);
        start -= 100;
        end -= 100;
        }
        else
        {
          if (century == 0)
          {
            century ++;
            start = 1;
            end = 99;
            
          }
        if (start == 101)
        {
          start = 100;
        }
        System.out.println("Century " + century + " AD  " + start + "-" + end);
        start += 100;
        end += 100;
        }
      }
      
    
   }
}
