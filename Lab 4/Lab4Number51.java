import java.util.Scanner;
public class Lab4Number51
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
       
      if (first.compareTo(third) > 0) 
      {
        if(first.compareTo(second) < 0)
        {
        System.out.println("The middle string is " + first);
        }
      }
      
      if (first.compareTo(third) < 0) 
      {
        if (first.compareTo(second) > 0)
        {
        System.out.println("The middle string is " + first);
        }
      }

      
       if (second.compareTo(third) > 0) 
      {
        if(second.compareTo(first) < 0)
        {
        System.out.println("The middle string is " + second);
        }
      }
      
      if (second.compareTo(third) < 0) 
      {
        if (second.compareTo(first) > 0)
        {
        System.out.println("The middle string is " + second);
        }
      }
      
      
       if (third.compareTo(first) > 0) 
      {
        if(third.compareTo(second) < 0)
        {
        System.out.println("The middle string is " + third);
        }
      }
      
      if (third.compareTo(first) < 0) 
      {
        if (third.compareTo(second) > 0)
        {
        System.out.println("The middle string is " + third);
        }
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