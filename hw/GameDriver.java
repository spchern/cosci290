/*
  Shipeng Chen
  Co Sci 290
  Feb 20, 2018
  Homework 1
*/

import java.util.ArrayList;
import java.util.Scanner;
public class GameDriver{
  public static void main(String[] args){

    //variables
    Scanner input = new Scanner(System.in);
    List<Object> name = new ArrayList<>();
    //String name = "";
    int age = 0;
    List<Object> city = new ArrayList<>();
    //String city = "";
    List<Object> itemList = new ArrayList<>();
    //String itemName = "";
    int randomNum = 0;
    int maximum = 144;
    int minimum = 1;



    //splash screen
    System.out.println(" __________                      ___________                                      \n "
                +      "\\______   \\ ____   ____   _____ \\_   _____/ ______ ____ _____  ______   ____    \n "
                +      " |       _//  _ \\ /  _ \\ /     \\ |    __)_ /  ___// ___\\\\__  \\ \\____ \\_/ __ \\   \n "
                +      " |    |   (  <_> |  <_> )  Y Y  \\|        \\\\___ \\\\  \\___ / __ \\|  |_> >  ___/   \n "
                +      " |____|_  /\\____/ \\____/|__|_|  /_______  /____  >\\___  >____  /   __/ \\___  >  \n "
                +      "        \\/                    \\/        \\/     \\/     \\/     \\/|__|        \\/      \n"
);
  // story setup
    System.out.println("You just woke up in a small dark room... \n");
    System.out.println("You don't remember what happened or why you are here... \n");
    System.out.println("You're trying to recall things and figure it out... \n");

    System.out.println("\nHi, give me your name: ");
    name.add(input.nextLine());
    System.out.println("\nHi " + name + "!");
    System.out.println("\nHow old are you?");
    age = input.nextInt();
    System.out.println("\nYou are " + age + " years old!");
    System.out.println("\nWhich city do you live in?");
    city.add(input.nextLine());
    System.out.println("\nOK, you live in " + city + ".");
    System.out.println("\nList some items you hope to find in this room:");
    itemList.add(input.nextLine());
    
    
    System.out.println("\nYou found " + itemList + " in this room.");

    randomNum = minimum + (int)(Math.random() * maximum);

    if(randomNum < 72){
      System.out.println("\nAfter waiting for " + randomNum + " hours, your best friend came and saved you out from your neighbor's garage.");
    }
    else{
      System.out.println("\nAfter waiting for " + (int)(randomNum / 24 + 1) + " days and you haven't had any food or water, you died. ");
    }
    System.out.println();
    System.out.println(   "   ________                        ________                     \n"
                  +       "  /  _____/_____    _____   ____   \\_____  \\___  __ ___________\n"
                  +       " /   \\  ___\\__  \\  /     \\_/ __ \\   /   |   \\  \\/ // __ \\_  __ \\\n"
                  +       " \\    \\_\\  \\/ __ \\|  Y Y  \\  ___/  /    |    \\   /\\  ___/|  | \\/\n"
                  +       "  \\______  (____  /__|_|  /\\___  > \\_______  /\\_/  \\___  >__|   \n"
                  +       "         \\/     \\/      \\/     \\/          \\/          \\/       \n"
    );
  //  Scanner input = new Scanner(System.in);
  }
}
