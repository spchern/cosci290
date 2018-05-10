/*
  Shipeng Chen
  Co Sci 290
  April 26, 2018
  Map for GameDriver.java
*/

public class Player{
  private String name;
  private int xloc;
  private int yloc;
  private int energy;
  
  public Player(){
    name = "Player";
    xloc = 1;
    yloc = 1;
    energy = 100;
  }
  
  public int getXLoc(){
    return this.xloc;
  }
  
  public int getYLoc(){
    return this.yloc;
  }
  
  public String getName(){
    return this.name;
  }
  
  public int getEnergy(){
    return this.energy;
  }
  
  public void setLoc(int X,int Y){
    this.xloc = X;
    this.yloc = Y;
  }
  
  public void setEnergy(int ener){
    this.energy = ener;
  }
  
  public void setName(String newName){
    this.name = newName;
  }
}