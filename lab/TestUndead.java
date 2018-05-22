/* Shipeng Chen
   Lab 22
   May 22, 2018
   */
import java.util.*;
public class TestUndead{
  
  public static void main(String[] args){
    
    // new array list of undead objects
    List<Undead> undeadList = new ArrayList<>();
    int n = 0;
      
    do{
      if(Math.random() < 0.5){
        UndeadMage a = new UndeadMage();
        undeadList.add(a);
        n++;
      }
      else{
        UndeadWarrior b = new UndeadWarrior();
        undeadList.add(b);
        n++;
      }
    }while(n < 10);
    
    
    for(int i = 0; i < undeadList.size(); i++){
      Undead currentOne = undeadList.get(i);
      System.out.println(currentOne.attack());
    }
    
  }
}