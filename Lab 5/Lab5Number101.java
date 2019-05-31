public class Lab5Number101
{
   public static void main(String[] args)
   {
      int bcStart = 400;
      int bcEnd = 499;
      for (int century = 5; century >= 1; century--)
      {
        if (bcStart == 0)
        {
          bcStart = 1;
        }
        System.out.println("Century " + century + " BC  " + bcStart + "-" + bcEnd);
        bcStart -= 100;
        bcEnd -= 100;
        
      }
      
      int adStart = 1;
      int adEnd = 99;
      for (int century = 1; century <= 5; century++)
      {
        if (adStart == 101)
        {
          adStart = 100;
        }
        System.out.println("Century " + century + " AD  " + adStart + "-" + adEnd);
        adStart += 100;
        adEnd += 100;
        
      }
    
   }
}
