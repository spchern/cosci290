/*
  Shipeng Chen
  Co Sci 290
  April 26, 2018
  Map for GameDriver.java
*/
public class Map{
    //map
    Object[][] room = new Object[5][5]; //user start at random location in the room
    int x,y;
    
 
  
  // random start location
  public void startRandom(){
    this.x = (int)(Math.random() * 5);
    this.y = (int)(Math.random() * 5);
    this.currentLoc();
  }
  
  //palyer movement
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
  
}
    