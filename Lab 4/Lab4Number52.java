import java.util.Scanner;
public class Lab4Number52
{
     public static void main(String[] args)
     {
     
       Scanner scan = new Scanner(System.in);
       String first = "";
       String second = "";
       String third = "";
       
       System.out.print("Enter first string: ");
       first = scan.next();
       
       System.out.print("Enter second string: ");
       second = scan.next();
       
       System.out.print("Enter third string: ");
       third = scan.next();
       
      if ((first.compareTo(third) < 0 && first.compareTo(second) > 0)
            || (first.compareTo(third) > 0 && first.compareTo(second) < 0))
      {
      System.out.println("The middle string is " + first);
      }
      
      if ((second.compareTo(third) < 0 && second.compareTo(first) > 0)
            || (second.compareTo(third) > 0 && second.compareTo(first) < 0))
      {
      System.out.println("The middle string is " + second);
      }
       
      if ((third.compareTo(second) < 0 && third.compareTo(first) > 0)
            || (third.compareTo(second) > 0 && third.compareTo(first) < 0))
      {
      System.out.println("The middle string is " + third);
      }
      
     if (second.equals(third))
     {
     System.out.println("The middle string is " + second);      
     }
     if (first.equals(third))
     {
     System.out.println("The middle string is " + first);      
     }
     if (first.equals(second))
     {
     System.out.println("The middle string is " + second);      
     } 
       
     }
}