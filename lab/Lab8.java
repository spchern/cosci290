/*
Lab 8
*/

public class Lab8{
  
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
    s1.setGpa((4.0 - (Math.random()) * 4));
    s1.setMajor("Computer Science");
    s2.setGpa(4.0 - (Math.random()) * 4);
    s2.setMajor("English");
    s3.setGpa(4.0 - (Math.random()) * 4);
    s3.setMajor("Engineering");
    s4.setGpa(4.0 - (Math.random()) * 4);
    s4.setMajor("Theater");
    s5.setGpa(4.0 - (Math.random()) * 4);
    s5.setMajor("Math");
    
    sortStudent(students);
    printStudent(students);

                                          
 }
  
  public static Student sortStudent(Student students){
    for(int i = 1; i < students.length; i++){
      Student currentElement = students[i];
      int k;
      for(k = i -1; k >=0 && students[k].getGpa > currentElement.getGpa; k--){
        students[k+1] = students[k];
      }
      students[k+1] = currentElement;
    }
    return students; 
  }
  

 public static void printStudent(Student[] students){
    

    for(int i = 0; i < students.length; i++) {
      System.out.println(students[i].toString());
    }
 }
  
}