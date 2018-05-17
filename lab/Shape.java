/* Shipeng Chen
   Lab 20
   Co Sci 290
   */

public abstract class Shape{
  
  // instance variables
  private double area;
  
  // constructors 
  public void Shape(){
    this.area = 100.0;
  }
  
  // getters and setters
  public double getArea(){
    return this.area;
  }
  
  public void setArea(double area){
    this.area = area;
  }
  
  // object info
  public String toString(){
    return "The area of the shape is " + this.area;
  }
  
  public abstract double computeArea();
  
}