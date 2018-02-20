/*
Shipeng Chen
Co Sci 290
Topics:
  -multi-way if-else
  -logical operators
  -symbolic logic
 */

import java.util.Scanner;
public class TestLogic{

  public static void main(String[] args){
    //prompt the user to enter in a grade
    Scanner input = new Scanner(System.in);
    
    int grade = input.nextInt();
    
    /*
    if(grade >= 90){
      System.out.println("A");
    }
    
    //if - else
    if(grade < 90){
      System.out.println("grade is not an A");
    }
    else{
      System.out.println("grade is an A");
    }
  */
    //multi if - else if - else
    if(grade >= 90){
      System.out.println("Grade is an A");
    }
    else if(grade >= 80){
      System.out.println("Grade is a B");
    }
    else if(grade >= 70){
      System.out.println("Grade is a C");
    }
    else if(grade >= 60){
      System.out.println("Grade is a D");
    }
    else{
      System.out.println("Grade is an F");
    }
    /*logic operators
    
    ! - not
    != - not equal to
    == - is equal to?
    && - and ==> if both are true, the conditional evaluates to true
    || - or  ==> if either is true, the condition evaluates to true; if both are false, evaluates to false;
    
    symbolic logic w/ java logical operators
    
    p  q  !p  !q   !p||!q
    T  T  F   F    F
    T  F  F   T    T
    F  T  T   F    T
    F  F  T   T    T
    
    p  q  !p  !q  p&&q  !p||(p&&q)    !q&&[!p||(p&&q)]
    T  T  F   F   T     T             F
    T  F  F   T   F     F             F
    F  T  T   F   F     T             F
    F  F  T   T   F     T             T
    
    
    */
    
    if(grade >= 80){
      System.out.println("This is a good grade.")
    }
    else if(grade < 80 && grade >= 70){
      System.out.println("This grade is average.")
    }
    else{
      System.out.println("This is a bad grade.")
    }
  }
}