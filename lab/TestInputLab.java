/*
  Shipeng Chen
  Co Sci 290
  Lab assignment -  testing datatypes and input from the user
*/

import java.util.Scanner;
public class TestInputLab{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Hi, give me your name: ");
    String name = input.next();
    System.out.println("Hi " + name);
    System.out.println("How old are you?");
    int age = input.nextInt();
    System.out.println("You are " + age + " years old!");
    System.out.println("Which city do you live in?");
    String city = input.next();
    System.out.println("OK, you live in " + city);
    System.out.println("List one item you want to have:");
    String itemName = input.next();
    System.out.println(itemName + " is now in your backpack.");
  }
 
}
