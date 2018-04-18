/*
  Shipeng Chen
  Co Sci 290
  Feb 20, 2018
  Homework 1
*/

import java.io.*;
import java.nio.*;
import java.util.*;

public class GameDriver{
  public static void main(String[] args){
    List<String> list = new ArrayList<String>();
    try {
        String encoding = "ASCII";
        File file = new File("./Story.txt");
        if (file.isFile() && file.exists()) {
            InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineText = null;

            while ((lineText = bufferedReader.readLine()) != null) {
                list.add(lineText);
            }
            bufferedReader.close();
            read.close();
        }
        else {
            System.out.println("Can't find file");
        }
    }
    catch (Exception e) {
        System.out.println("Read file error");
        e.printStackTrace();
    }
    
    //variables
    Scanner userInput = new Scanner(System.in);
    List<Object> name = new ArrayList<>();
    //String name = "";
    int age = 0;
    List<Object> city = new ArrayList<>();
    //String city = "";
    List<Object> itemList = new ArrayList<>();



    //splash screen
    SplashScreen startss = new SplashScreen();
    startss.welcome();
    
    //story setup

    System.out.println(list.get(0) + "\n");
    System.out.println(list.get(1) + "\n");
    System.out.println(list.get(2) + "\n");
    
    //ask name
    System.out.println("\n" + list.get(4));
    name.add(userInput.nextLine());
    System.out.println("\n" + list.get(5) + name + list.get(6));
    //ask age
    System.out.println("\n" + list.get(7));
    age = userInput.nextInt();
    System.out.println("\n" + list.get(8) + age + list.get(9));
    //ask city
    System.out.println("\n" + list.get(10));
    city.add(userInput.nextLine());
    System.out.println("\n" + list.get(11) + city + list.get(12));
    //ask wishlist
    System.out.println("\n" + list.get(13));
    itemList.add(userInput.nextLine());
    System.out.println("\n" + list.get(14) + itemList + list.get(15));

    //random result
    Utility playerStatus = new Utility();
    playerStatus.isAlive();
    
    //splash screen end
    SplashScreen endss = new SplashScreen();
    endss.bye();


  }
}