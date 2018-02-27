import java.util.Scanner;
public class Lab5{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int nameLength = 0;
    String answer = "";
    //boolean flag = false; //flag is optional
    
    while(nameLength < 2){
      
      System.out.println("\nWhat is your name?");
    
      answer = input.next();
      nameLength = answer.length();

      if(nameLength < 2){
      System.out.println("Please enter in a name that is at least "
                        + "two letters long");
        nameLength = 0;
      }
      else{
        for(int index = 0; index < nameLength; index++){
          
         // System.out.println(answer.charAt(index));
          
          //check if the character is a letter or number
          if(!Character.isLetter(answer.charAt(index))){ //if it's not a letter
            System.out.println("Please enter in a name that contains "
                  + "letters only");
            nameLength = 0;
            break; //gets out of current loop
          }
        }//end of for-loop
        
      }
      
    } //end while loop
  } //end of main method
} //end of class