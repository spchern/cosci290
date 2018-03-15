/*
Shipeng Chen
Lab 8
Co Sci 290
*/

public class Student{
  
  public static void main(String[] args){
    
  Student[] students = new Student[10];
    
    //instantiate each Student object
    Student s1 = new Student();
    
    //add student object to array
    students[0] = s1;
    
    //print info based on default constructor
    System.out.println("Student gpa: " + students[0].getGpa());
    
    s1.setGpa(3.4);
    s1.setMajor("Computer Science");
    
    //print info after setting/updating info
    System.out.println("Student gpa: " + students[0].getGpa());
  }
  
  private double gpa;
  private String major;
  
  //zero-argument default constructor
  public Student(){
    this.gpa = 0.0;
    this.major = "undecided";
  }
  
  public double getGpa(){
    return this.gpa;
  }
  
  public void setGpa(double gpa){
    this.gpa = gpa;
  }
  
  public String getMajor(){
    return this.major;
  }
  
  public void setMajor(String major){
    this.major = major;
  }
  
  public String toString(){
    return "Student = GPA: " + this.gpa + " Major: " + this.major;
  }
  
  }