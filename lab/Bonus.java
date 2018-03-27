/*
Shipeng Chen
Midterm Bonus
Mar 27, 2018
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Bonus{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    
    // Generating a bunch of students
    
    int studentNum = input.next();
    Student[] students = new Student[studentNum];
    double randomGpa = (Math.random()) * 4;
    
    for(int i = 0; i < studentNum; i++){
      String name = "s" + i;
      Student name = new Student();
      students[i] = name;
      name.setGpa(randomGpa);
      name.setMajor("Undeclared");
    }
    
    //Sorting students according to their GPAs
    
    sortStudent(students);
    printStudent(students);

  
  }
  
  

  
  public static Student sortStudent(Student students){
    java.util.Collections.sort(students);
    
    for(int i = 1; i < students.size(); i++){
      Student currentElement = students.get(i);
      int k;
      for(k = i -1; k >=0 && students.getGpa > currentElement.getGpa; k--){
        listInt[k+1] = listInt[k];
      }
      listInt[k+1] = currentElement;
    } 
    return students;
  }
  
   public static void printStudent(Student[] students){
    
    for(int i = 0; i < students.length; i++) {
      System.out.println(students[i].toString());
    }
 }
 
}