public class DemoBoolean{

// start of application
public static void main(String[] args){

int num = 1;
num = num + 1; //increment num by 1
num++; //post-increment
++num; //pre-increment

num = 1;
int count = ++num; //pre-increment, count 2, num 2
System.out.println("count " + count + " num " + num);
num = 1;
count = num++; //post-increment, count 1, num 2
System.out.println("count " + count + " num " + num);

count = num--; //post-decrement
count = --num; //pre-decrement

//examples of augmented assignment operators
num += 2; //equivalent to => num = num + 2;
//num *= 2; num = num * 2;
//num /= 2; num = num /2;
num -= 2; // num = num - 2;

num = 2;
double num2 = 3.0;
System.out.println("Double wins: " + num * num2);
System.out.println("Casting a double to int: " + (int) num2);//lose to decimal part
System.out.println("Casting an int to a double: " + (double) num);//turns the 2 into 2.0
System.out.println("Casting a char to an int: " + (int) 'c');//turns the c into 99 because of ASCII


/*
Comparison Operators
> greater than
< lesser than
>= greater than or equal to
<= lesser than or equal to
== is equal to
!= not equal to
= assignment operator
*/
  
int numberOfZombies = 100;
int actualNumberOfZombies = 100;

  if (numberOfZombies < 5){ //condition statement/expression, evaluates trie
    System.out.println("You might survive this apocalypse."); //if the expression above is true, run code inside this if-block
  }
  else{
    System.out.println("You might NOT survive this apocalypse.");
  }
  
  if (numberOfZombies == actualNumberOfZombies){ //condition statement/expression, evaluates trie
    System.out.println("You might or might NOT survive this apocalypse."); //if the expression above is true, run code inside this if-block
  }
  
 //generating a random number
  System.out.println(Math.random()); // random number between 0 and 100
  // minimum + Math.random() 
  System.out.println((int) (Math.random() * 10));
  System.out.println(5 + (int) (Math.random() * (10 - 5)));
  
  int chanceOfSurviving = 1 * (int)(Math.random() * (10-1));
  if(chanceOfSurviving <= 3){
    System.out.println(chanceOfSurviving + "You made it alive!");
  }
  else{
    System.out.println(chanceOfSurviving + "Game over!");
  }
  
 }

}
