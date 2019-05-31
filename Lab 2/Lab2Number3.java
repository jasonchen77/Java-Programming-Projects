import java.util.Scanner;

public class Lab2Number3
{
   public static void main(String[] args)
   {
   
     Scanner in = new Scanner(System.in);
     int firstNum;
     int secondNum;
     
     System.out.print("Enter first number: ");
     firstNum = in.nextInt();
     System.out.print("Enter second number: ");
     secondNum = in.nextInt();
     
     int smallerNum = Math.min(firstNum, secondNum);
     System.out.println("The smaller number is " + smallerNum);
     
   }
}