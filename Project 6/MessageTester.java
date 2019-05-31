//////////////////////////////////////////////////////////////////////////////////////////////
// CMSC-255 Fall 2014
//
// Name: Jason Chen
// Lab Section number : 901
// Project: Project-6
//
// Description: This program will model an email message.
//
//
/////////////////////////////////////////////////////////////////////////////////////////////

public class MessageTester
{
  public static void main(String[] args)
  {
    Message m1 = new Message("Rudolph Reindeer", "Harry Morgan");
    m1.append("Hello, merry Christmas!");
    System.out.println(m1.toString());
  }
}