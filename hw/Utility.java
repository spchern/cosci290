/*
  Shipeng Chen
  Co Sci 290
  Updated April 19
  Lab 13
*/

import java.io.*;
import java.nio.*;
import java.util.*;

public class Utility{
  
  public void readFile(String FILENAME){
    String sCurrentLine;
    try {
      String encoding = "ASCII";
      File file = new File(FILENAME);
      if(file.isFile() && file.exists()){
        InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
        BufferedReader bufferedReader = new BufferedReader(read);

        while ((sCurrentLine = bufferedReader.readLine()) != null){
          System.out.println(sCurrentLine);
        }
          bufferedReader.close();
          read.close();
        }
        else {
          System.out.println("Can't find file");
        }
    }
    catch(Exception e){
      System.out.println("Read file error");
      e.printStackTrace();
    }
  }
  
  public void writeFile(String FILENAME, String CONTENT){

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

      String content = CONTENT;

			bw.write(content);
      
      System.out.println(content + " SAVED!");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
  
  public static void isAlive(){
    int randomNum = 0;
    int maximum = 144;
    int minimum = 1;
    
    randomNum = minimum + (int)(Math.random() * maximum);
    
    if(randomNum < 72){
      System.out.println("\nAfter waiting for " + randomNum + " hours, your best friend came and saved you out from your neighbor's garage.");
    }
    else{
      System.out.println("\nAfter waiting for " + (int)(randomNum / 24 + 1) + " days and you haven't had any food or water, you died. ");
    }
  }
}