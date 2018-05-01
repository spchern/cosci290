/*
  Shipeng Chen
  Co Sci 290
  April 26, 2018
  Object for GameDriver.java
*/

public class Door{
  //class attributes
  private String passcode; //a three-digit passcode (0-6) ending with #
  passcode = Integer.toString(this.setPasscode) + 
    Integer.toString(this.setPasscode) + Integer.toString(this.setPasscode) + "#";
  
  System.out.println("Enter passcode to unlock the door.\n" +
                     "Use the number key 0-5 and then press #.\n" +
                     "Passcode has three digits.");
  
  //System.out.println("Continue? Y/N");
  
  
  
  
  
  

  // get a random integer between 0-5
  public int setPasscode(){
    int digit;
    digit = (int)(Math.random() * 6);
    return digit;
  }
}