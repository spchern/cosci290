/*
  Shipeng Chen
  Co Sci 290
  April 26, 2018
  Map for GameDriver.java
*/

import java.util.Scanner;

public class Map{
    //map
    Object[][] room = new Object[5][5]; //user start at random location in the room
    int x,y;
    int exitX = (int)(Math.random() * 5);
    int exitY = (int)(Math.random() * 5);
    
 
  // print map
  public void printMap(){
    System.out.println("\n_______________________________"+
                       "\n|     |     |     |     |     |"+
                       "\n| 1-1 | 2-1 | 3-1 | 4-1 | 5-1 |"+
                       "\n|_____|_____|_____|_____|_____|"+
                       "\n|     |     |     |     |     |"+
                       "\n| 1-2 | 2-2 | 3-2 | 4-2 | 5-2 |"+
                       "\n|_____|_____|_____|_____|_____|"+
                       "\n|     |     |     |     |     |"+
                       "\n| 1-3 | 2-3 | 3-3 | 4-3 | 5-3 |"+
                       "\n|_____|_____|_____|_____|_____|"+
                       "\n|     |     |     |     |     |"+
                       "\n| 1-4 | 2-4 | 3-4 | 4-4 | 5-4 |"+
                       "\n|_____|_____|_____|_____|_____|"+
                       "\n|     |     |     |     |     |"+
                       "\n| 1-5 | 2-5 | 3-5 | 4-5 | 5-5 |"+
                       "\n|_____|_____|_____|_____|_____|"
                       );
  }
  

  
  // random start location
  public void startRandom(){
    this.x = (int)(Math.random() * 5);
    this.y = (int)(Math.random() * 5);
  }
  

  public boolean checkExit(){
    if(x == exitX && y == exitY){
      System.out.println("You found the exit!");
      return false;
    }
    else{
      System.out.println("There's nothing here.");
      return true;
    }
  }
  
  //palyer movement
  
  
  public void goTo(){
    Utility utility = new Utility();
    Scanner userInput = new Scanner(System.in);
    int xTemp;
    int yTemp;
    do{
      String userMove = userInput.next();
      xTemp = Character.getNumericValue(userMove.charAt(0));
      yTemp = Character.getNumericValue(userMove.charAt(2));
      x = xTemp-1;
      y = yTemp-1;
    } while(goToValidate(xTemp,yTemp));

  }
  
  public boolean goToValidate(int xTemp, int yTemp){
    if((xTemp > 0) && (xTemp <6) && (yTemp > 0) && (yTemp < 6)){
      return false;
    }
    else{
      System.out.println("Invalid input. Please try again.");
      return true;
    }
  }
  
  public void moveNorth(){
    this.y = this.y - 1;
    this.inRoom();
    this.currentLoc();
  }
  
  public void moveSouth(){
    this.y = this.y + 1;
    this.inRoom();
    this.currentLoc();
  }
  
  public void moveEast(){
    this.x = this.x + 1;
    this.inRoom();
    this.currentLoc();
  }
  
  public void moveWest(){
    this.x = this.x - 1;
    this.inRoom();
    this.currentLoc();
  }
  
  //check boundary
  public void inRoom(){
    if (y > 4){
      System.out.println("Can't move south. It's WALL!");
      this.y = this.y - 1;
    }
    else if (y < 0){
      System.out.println("Can't move north. It's WALL!");
      this.y = this.y + 1;
    }   
    else if (x > 4){
      System.out.println("Can't move east. It's WALL!");
      this.x = this.x - 1;
    }
    else if (x < 0){
      System.out.println("Can't move west. It's WALL!");
      this.x = this.x + 1;
    }
  }
  
  public void currentLoc(){
    System.out.println("Your current location is " + (x+1) + "-" + (y+1));
  }
  
  public int getX(){
    return x;
  }
  
  public int getY(){
    return y;
  }
  
}
    