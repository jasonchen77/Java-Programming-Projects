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

public class Message
{
  private String recipient;
  private String sender;
  private String text;
  
  public Message(String eRecipient, String eSender)
  {
    recipient = eRecipient;
    sender = eSender;
  }
  
  public void append(String eText)
  {
    text = eText;
  }
  
  public String toString()
  {
    return "From: " + sender + "\n" + "To: " + recipient + "\n" + "Message: " + text;
  }
}