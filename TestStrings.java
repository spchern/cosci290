import java.util.Scanner;
public class TestStrings{

// start of application
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
      /*
  Impose some tules on user input
  name.length() - gives a int of how many characters the String is long
  */
  
  //example of a while loop
  
  int nameLength = 0;
  String answer = "";
  boolean flag = false;
  
  while(nameLength < 2 || flag == false){
    
    System.out.println("What is your name?");
    
    //get answer from console
    answer = input.next();
    //check if name is less than 2 characters
    /*
    if(answer.length() < 2 || flag == false){
    System.out.println("Please enter in a name that is at least "
                      + "two characters long and no numbers");
    } */
    else{
      //name is at least 2 characters
      //check if name contains letters
      //for example, Logan, and go through each letters in the name
      //use a for-loop because we know how many letters in it
      //name.charAt(0) to look at the characters in index 0
      
      for(int index = 0; index < answer.length(); index = index + 1){
      //check if the character is a letter
        if(!Character.isLetter(answer.charAt(index))){ //if it's NOT a letter
          flag = false;
          break; //gets out of current loop
        }
      }
      
      
    }

    nameLength = answer.length();
  
  } //end of while loop
  
  System.out.println("Your name is " + answer);

  /*
  when you want code to run at least once, use a do-while code
  
  do{
    
    the body with code...
  
  }while(some condition)
  
  */
  
  
  /*
  answer.toLowerCase() - make all letters lowercase
  answer.toUpperCase() - make all letters uppercase
  answer.equals("some other string) - check if two strings are exactly the same
  answer.equalsIgnoreCase("no") - checks if two strings are equal regardless of case
  */
  /*
System.out.println("Are you rich? Yes or No?");
  String answer = input.next();
  
  if(answer.equalsIgnoreCase("no")){
    System.out.println("That sucks!");
  }
  else{
    System.out.println("Cool.");
  }
  */
  }
  
}