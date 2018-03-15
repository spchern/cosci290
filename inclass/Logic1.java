public class Logic1{
  public static void main(String[] args){
  
    //declare an array of type int
    String[] numbers = new String[10] // assign 10 plots next to each other in memory
      
    //iterate through the loop and print
    for(int 1 = 0; i < numbers.length; i++){
      System.out.println(numbers[i]);

    }
    //assign elements at index 3 the value "five"
    numbers[3] = "five";
    //numbers[11] = "twenty": can't do this line, will give arrayIndexOutOfBounds error
    
    //redeclare with a different size because you can't add or remove
    //numbers = new String[0]
    
  }

}