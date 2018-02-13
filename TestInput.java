/*
  Shipeng Chen
  Co Sci 290

  Testing datatypes and input from the user

  */

  /* github
  Pushing code to GitHub through CodeAnywhere
  git init
  git add
  git commit -m "some note about what you did"
  git push origin master

  */


  import java.util.Scanner; //is a
  public class TestInput{
    // main method - starting point of application
    public static void main(String[] args){
      // datatype variableName - expression
      // 1. Identifiers can only starts with a letter, _, or $
      // 2. Identifiers with multiple words are camelCased
      // e.g. - numOfStudents, name, interestRate

      // primitive datatypes
      // int - integer - whole number => 3, 2147483647, 102, -11
      // double - decimal number => 3.33, 0.2, 0.333, -33.3
      // char - single character inside single quotations => '3', '!', ' '
      // boolean - true or false => true, false

      // object/reference datatypes
      // String - characters surrounded with double quotations
      /* there are other objects in Java that comes with Java and that are custom
      => objects/class that comes with Java: Scanner, System, etc.objects
      => customer classes: Zombie, SpaceInvader, Person, etc.
      */

      final double PI_VALUE = 3.1415; //constants are all capital, multiple words seperated by underscores
      int numberOfStudents = 29;
      double aveGPA = 3.78;
      String name = "";
      boolean gameOver = false; //or true

      Scanner input = new Scanner(System.in);

      System.out.println("Hi, give me your name: ");

      name = input.next();

      System.out.println("Hi " + name);

      System.out.println("How old are you?");

      int age = input.nextInt(); //.nextInt() is for int types

      System.out.println("You are " + age + " years old!");

      /*
        Arithmetic Operators
        + addition
        - substraction
        * multiplication
        / division
        = assignment operator, equals
        % modulus, remainder, e.g. 10 % 2 ==> 10 / 2 and then finding remander, which is 0


        */

      int month = age * 12;
      int days = age * 365;
      int hours = days * 24;

      System.out.println("You are " + month + " months old OR " + days + " days old OR " + hours + " hours old!");

      // double for user input is input.nextDouble();
      //
     }

    }