/*  Shipeng Chen
    Lab 11
    Mar 22, 2018
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Lab11{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a list of integers. \nNote the first number "
                      + "in the input indicates the number of the elements "
                      + "in the list. \nThis number is not part of the list.");
    
    String userInput = input.nextLine();
    String[] values =  userInput.split("\\s");
    int[] listInt = new int[Integer.parseInt(values[0]) + 1];
    
    for(int i = 0; i < listInt.length - 1; i++) {
    int value = Integer.parseInt(values[i]);
    listInt[i] = value;
    
      if(isSorted(listInt)){
        System.out.println("This list is already sorted");
      }
      else{
        System.out.println("This list is not sorted");
      }
    
  }
 }
  
  
  
  public static boolean isSorted(int[] listInt){
    
    for(int i = 0; i < listInt.length - 1; i++){
      if(listInt[i] > listInt[i+1]){
        return false;
      }
    }
    return true;
  }
  
 
}