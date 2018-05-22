/* Shipeng Chen
   Lab 22
   May 22, 2018
   */
   
public class UndeadMage extends Undead{
  
  // instance variables
  private String spellOne;
  private String spellTwo;
  
  // constructors
  public UndeadMage(){
    super();
    this.spellOne = "Frost Nova";
    this.spellTwo = "Blink";
  }
  
  // setters and getters
  public void setSpellOne(String spellOne){
    this.spellOne = spellOne;
  }
  
  public void setSpellTwo(String spellTwo){
    this.spellTwo = spellTwo;
  }
  
  public String getSpellOne(){
    return this.spellOne;
  }
  
  public String getSpellTwo(){
    return this.spellTwo;
  }
  
  public String toString(){
    return "This is an undead mage.";
  }
  
  @Override
  public String attack(){
    return "Attack methods: " + this.spellOne + " and " + this.spellTwo + ".";
  }
  
}