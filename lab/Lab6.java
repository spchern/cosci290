/* 
  Shipeng Chen
  Co Sci 290
  Mar 1, 2018
  Lab 6
*/

import java.util.Scanner;

public class Lab6{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    String inputValue;
    int quant = 0;
    String nameOfItem = "";

    System.out.println("\nEnter Quantity + Name of the Item you want.");
    inputValue = input.nextLine();
    String[] value = inputValue.split(" ");
    
    quant = Integer.parseInt(value[0]);
    nameOfItem = value[1];
      
    if(quant <=0){
      System.out.println("\nIt seems like you don't want any " + nameOfItem.toLowerCase() + "...");
    }
    else if(quant == 1){
      System.out.println("\nYou want " + nameOfItem.toLowerCase() + "...");
      System.out.println("\nAnd you want just one.");
    }
    else{
      System.out.println("\nYou want " + nameOfItem.toLowerCase() + "...");
      System.out.println("\nAnd you want " + quant + " of them.");
    }
   
  }
}
