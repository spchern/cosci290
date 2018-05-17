/* Shipeng Chen
   Lab 21
   May 17, 2018
   */

public class Circle extends Shape{
  //private double area;
  private double radius;
  
  public Circle (){
    super();
    setRadius(Math.random() * 100);
  }
  
  public void setRadius(double radius){
    this.radius = radius;
  }
  
  public String toString(){
    return "The area of the shape is " + super.getArea();
  }
  
  @Override
  public double computeArea(){
    return Math.pow(radius, 2) * Math.PI;
  } 
}