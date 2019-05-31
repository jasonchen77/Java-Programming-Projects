import java.util.Random;

public class Lab5Number15
{
   public static void main(String[] args) 
   {
     Random rNum = new Random();
      
      
      for (int i = 1; i <= 10; i++)
      {
        int cardSuit = rNum.nextInt(4)+1;
        int cardNumber = rNum.nextInt(13)+1;
        String cardNumberString;
        String cardSuitString = "";
        switch (cardNumber)
        {
          case 1: cardNumberString = "Ace";
          break;
          case 11: cardNumberString = "Jack";
          break;
          case 12: cardNumberString = "Queen";
          break;
          case 13: cardNumberString = "King";
          break;
          default: cardNumberString = Integer.toString(cardNumber);
        }
        switch (cardSuit)
        {
          case 1: cardSuitString = "Spade";
          break;
          case 2: cardSuitString = "Heart";
          break;
          case 3: cardSuitString = "Diamond";
          break;
          case 4: cardSuitString = "Club";
          break;
        }
        System.out.println(cardNumberString + " of " + cardSuitString);
      
      }
   }
}
