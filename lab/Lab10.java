/*
Shipeng Chen
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Lab10{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    List<Double> array = Arrays.asList();
    //List<double> array = new ArrayList<double>();
    
    System.out.println("Give 10 doubles, separated by spaces");
       
    userInput = input.nextLine();
    userInput2 =  userInput.asList(userInput.split("\\s"));
    
    for(int i=0; i<userInput2.length; i++) {
    double value = Double.parseDouble(userInput[i]);
    array.add(value);
    }
  }
}
  
   /*
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
  } */
    


//https://stackoverflow.com/questions/14635136/read-integers-separated-with-whitespace-into-int-array