/*
Shipeng Chen
Midterm
Mar 27, 2018
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Midterm{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a list of integers. \nNote the first number "
                      + "in the input indicates the number of the elements "
                      + "in the list. \nThis number is not part of the list.");
    
    String userInput = input.nextLine();
    String[] values =  userInput.split("\\s");
    int[] listInt = new int[Integer.parseInt(values[0]) + 1];
    
    for(int i = 1; i < listInt.length; i++) {
    int value = Integer.parseInt(values[i]);
    listInt[i] = value;
    }
      
    
      
      if(isSorted(listInt)){
        System.out.println("This list is already sorted");
      }
      else{
        System.out.println("This list is not sorted");
        System.out.print("The sorted list is: ");
        int[] sorted = sortArray(listInt);
        for(int i = 1; i < sorted.length; i++){
        System.out.print(sorted[i] + " ");
        }
        System.out.println(); 
      }
      
    //System.out.println(sortArray(listInt));

  
  }
  
  
  public static boolean isSorted(int[] listInt){
    for(int i = 0; i < listInt.length - 1; i++){
      if(listInt[i] > listInt[i+1]){
        return false;
      }
    }
    return true;
  }
  
  // Couldn't come up with something like "list.sort()" ...
  // Looked up the following in textbook Chapter 23: Sorting
  
  public static int[] sortArray(int[] listInt){
    for(int i = 1; i < listInt.length; i++){
      int currentElement = listInt[i];
      int k;
      for(k = i -1; k >=0 && listInt[k] > currentElement; k--){
        listInt[k+1] = listInt[k];
      }
      listInt[k+1] = currentElement;
    }
    return listInt;
  }
 
}