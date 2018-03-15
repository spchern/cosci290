/*

Shipeng Chen
Co Sci 290
Lab 8

*/

/*
import java.util.*;

public class Lab9Test {
  public static void main(String[] args) {
  List<Integer> arrayList = new ArrayList<>();
  arrayList.add(1); 
  arrayList.add(2);
  arrayList.add(3);
  arrayList.add(1);
  arrayList.add(4);
  arrayList.add(0, 10);
  arrayList.add(3, 30);

  System.out.println("A list of integers in the array list:");
  System.out.println(arrayList);

  LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
  linkedList.add(1, "red");
  linkedList.removeLast();
  linkedList.addFirst("green");

  System.out.println("Display the linked list forward:");
  ListIterator<Object> listIterator = linkedList.listIterator();
  while (listIterator.hasNext()) {
    System.out.print(listIterator.next() + " ");
    }
    System.out.println();

  System.out.println("Display the linked list backward:");
  listIterator = linkedList.listIterator(linkedList.size());
  while (listIterator.hasPrevious()) {
    System.out.print(listIterator.previous() + " ");
    } 
  } 
}
*/

/*
Shipeng Chen
Lab 8
Co Sci 290
*/



public class Lab9Test{
  
  //main method
  public static void main(String[] args){
  
   //declare an array of students
   Student[] students = new Student[5];
  
    //instantiate each Student object
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    Student s4 = new Student();
    Student s5 = new Student();
    
    //add student object to array
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;
    students[3] = s4;
    students[4] = s5;
    
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
    
    
    
    printStudents(students);
    
    /*
    //change student info
    s5.setMajor("Undecided");
    
    //reprint results
    printStudents(students);
    */
                                          
 }//end of main
  
  
  
  
 /*
  This functinos prints an array of Student objects
 */
 public void printStudents(Student[] students){
    
   //printing information of each student after setting properties
    for(int i = 0; i < students.length; i++) {
      System.out.println(students[i].toString());
    }
        
  
 }//end printStudent
  
      
}