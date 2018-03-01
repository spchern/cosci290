/*
Shipeng Chen
Co Sci 290
Lab 3
*/

public class TestScenario{
  public static void main(String[] args){
  
    int minimum = 1;
    int maximum = 100;
    int randomNum = minimum * (int)(Math.random() * maximum);
    
    
    if(randomNum == 70 || randomNum == 30 || (randomNum >= 45 && randomNum <= 55)){
      System.out.println("The stone hit the window but didn't break the glass.");
    }
    else if(randomNum < 70 && randomNum > 30){
      System.out.println("The stone broke the window and you escaped out.");
    }
    else{
      System.out.println("The stone missed the window.");
    }                     
                          
  }
}
