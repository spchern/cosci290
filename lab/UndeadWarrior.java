/* Shipeng Chen
   Lab 22
   May 22, 2018
   */
   
public class UndeadWarrior extends Undead{
  
  // instance variables
  private String leftHandWeapon;
  private String rightHandWeapon;
  
  // constructors
  public UndeadWarrior(){
    super();
    this.leftHandWeapon = "Hammer";
    this.rightHandWeapon = "Riffle";
  }
  
  // setters and getters
  public void setLeftHandWeapon(String leftHandWeapon){
    this.leftHandWeapon = leftHandWeapon;
  }
  
  public void setRightHandWeapon(String rightHandWeapon){
    this.rightHandWeapon = rightHandWeapon;
  }
  
  public String getLeftHandWeapon(){
    return this.leftHandWeapon;
  }
  
  public String getRightHandWeapon(){
    return this.rightHandWeapon;
  }
  
  public String toString(){
    return "This is an undead warrior.";
  }
  
  @Override
  public String attack(){
    return "Attack methods: " + this.leftHandWeapon + " and " + this.rightHandWeapon + ".";
  }

}