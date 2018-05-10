/*
  Shipeng Chen
  Co Sci 290
  Updated April 19, 2018
  Homework 1 / Lab 14
*/

import java.util.Scanner;

public class GameDriver{
  public static void main(String[] args){
    
    
    Utility utility = new Utility();
    Scanner userInput = new Scanner(System.in);
    
    //initialize new player
    Player player = new Player();
    
    //User input variables
    String name;
    int age;
    String ageAsString;
    String city;
    String wishItem;
    String userMove;


    //splash screen
    SplashScreen splash = new SplashScreen();
    splash.welcome();
    
    //story setup
    utility.readFile("Story.txt");
    
    
    //instantiate a new map
    Map map = new Map();
    map.startRandom(); 
    
    //ask name
    System.out.println("\nHi, give me your name: ");
    name = userInput.nextLine();
    player.setName(name);
    utility.writeFile("PlayerProfile.txt",name);
    System.out.println("\nHi " + name +"!");
    
    /*//ask age
    System.out.println("\nHow old are you?");
    ageAsString = userInput.next();
    age = Integer.parseInt(ageAsString);
    utility.writeFile("PlayerAge.txt",ageAsString);
    System.out.println("\nYou are " + age + " years old!");*/
    
    //ask city
    System.out.println("\nWhich city do you live in?");
    city = userInput.nextLine();
    utility.writeFile("PlayerCity.txt",city);
    System.out.println("\nOK, you live in "+ city + "."); 
    
    //ask wishlist
    System.out.println("\nList some items you hope to find in this room: ");
    wishItem = userInput.nextLine();
    utility.writeFile("PlayerWishlist.txt",wishItem);
    
    if(Math.random() > 0.5){
      System.out.println("\nGreat! You found " + wishItem + " in this room");
    }
    else{
      System.out.println("\nSorry, no " + wishItem + " found in this room.");
    }
    
    // let player move around in the room
    System.out.println("\nYou can move around this room. Here's the map.");
    map.printMap();
    map.currentLoc();
    player.setLoc(map.getX(), map.getY());
    System.out.println("\nEnter a location you want to go."+
                      "\nFor example, enter 1-1 to go to the upper left block.");
    
    //userMove = userInput.next();
    do{
      map.goTo();
      map.currentLoc();
      player.setLoc(map.getX(), map.getY());
    }while(map.checkExit());
    
    //random result

    utility.isAlive();
    
    //splash screen end
    splash.bye();

  }
}