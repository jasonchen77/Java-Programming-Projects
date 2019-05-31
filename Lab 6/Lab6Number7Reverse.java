public class Lab6Number7Reverse
{
   public static void main(String[] args)
   {
      String word = "abcdefg";
      System.out.println("Word:  " + word );
      System.out.println("Word reversed: " + reverse(word));
   }
   
   public static String reverse(String str)
   {
   if ((null == str) || (str.length() <= 1)) 
   {
     return str;
   }
    return reverse(str.substring(1)) + str.charAt(0);
   }
}
