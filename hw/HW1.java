/*
  Shipeng Chen
  Co Sci 290
  Feb 15, 2018
  Homework 1
*/

import java.util.Scanner;
public class HW1{
  public static void main(String[] args){
    System.out.println(" __________                      ___________                                      \n "
                +      "\\______   \\ ____   ____   _____ \\_   _____/ ______ ____ _____  ______   ____    \n " 
                +      " |       _//  _ \\ /  _ \\ /     \\ |    __)_ /  ___// ___\\\\__  \\ \\____ \\_/ __ \\   \n "
                +      " |    |   (  <_> |  <_> )  Y Y  \\|        \\\\___ \\\\  \\___ / __ \\|  |_> >  ___/   \n "
                +      " |____|_  /\\____/ \\____/|__|_|  /_______  /____  >\\___  >____  /   __/ \\___  >  \n "
                +      "        \\/                    \\/        \\/     \\/     \\/     \\/|__|        \\/      "
);
    System.out.println("Welcome to Room Escape");
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
