/* Shipeng Chen
   Lab 22
   May 22, 2018
   */
   
public abstract class Undead{
  
  // instance variables
  
  private int health; // 0 - 100
  private int experience; // 1 - 10
  private String name;
  
  // constructors
  public void Undead(){
    this.health = 100;
    this.experience = 0;
    this.name = "Undead";
    
  }
  
  // getters and setters
  public int getHealth(){
    return this.health;
  }
  
  public int getExperience(){
    return this.experience;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setHealth(int health){
    this.health = health;
  }
  
  public void setExperience(int experience){
    this.experience = experience;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  // object info
  
  public String toString(){
    return "Name: " + this.name + "\nHealth: " + this.health + "\nExperience: " + this.experience;
    
  }
  
  public abstract String attack();
  
  
}