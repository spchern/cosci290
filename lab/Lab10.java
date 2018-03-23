/*
Shipeng Chen
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Lab10{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    double[] array = new double[10];
    //List<double> array = new ArrayList<double>();
    
    System.out.println("Give 10 doubles, separated by spaces");
       
    String userInput = input.nextLine();
    String[] userInput2 =  userInput.split("\\s");
    
    for(int i=0; i<userInput2.length; i++) {
    double value = Double.parseDouble(userInput2[i]);
    array[i] = value;
    }
    
    System.out.println("The average is " + average(array));
  }

  

  public static int average(int[] array){
    int sum = 0;
    for(int i = 0; i < array.length; i++){
      sum = sum + array[0];
    }
    int average = (int)(sum / array.length);
    return average;
  } 

  public static double average(double[] array){
    double sum = 0;
    for(int i = 0; i < array.length; i++){
      sum = sum + array[0];
    }
    double average = sum / array.length;
    return average;
  } 

}

