/*
  Shipeng Chen
  Co Sci 290
  April 17
  Lab 13
*/

public class Utility{
  public static void isAlive(){
    int randomNum = 0;
    int maximum = 144;
    int minimum = 1;
    
    randomNum = minimum + (int)(Math.random() * maximum);
    
    if(randomNum < 72){
      System.out.println("\nAfter waiting for " + randomNum + " hours, your best friend came and saved you out from your neighbor's garage.");
    }
    else{
      System.out.println("\nAfter waiting for " + (int)(randomNum / 24 + 1) + " days and you haven't had any food or water, you died. ");
    }
  }
}