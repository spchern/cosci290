/*
Shipeng Chen
Lab 9
Co Sci 290
*/

import java.util.*;
public class Lab9{
  
  //main method
  public static void main(String[] args){
  
   //declare an array of students
    List<Object> studentList = new ArrayList<>();
  
    
    //instantiate each Student object
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    Student s4 = new Student();
    Student s5 = new Student();
   
    
    //add student object to array
    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(s4);
    studentList.add(s5);
    
    //Setting properties for each student object
    s1.setGpa(3.4);
    s1.setMajor("Computer Science");
    s2.setGpa(2.3);
    s2.setMajor("English");
    s3.setGpa(1.7);
    s3.setMajor("Engineering");
    s4.setGpa(5.0);
    s4.setMajor("Theater");
    s5.setGpa(2.7);
    s5.setMajor("Math");
    
    System.out.println(studentList);
                                          
 }
  
    
}