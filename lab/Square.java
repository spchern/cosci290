/* Shipeng Chen
   Lab 21
   May 17, 2018
   */

public class Square extends Shape{
  //private double area;
  private double side;
  
  public Square(){
    super();
    side = Math.random() * 100;
    super.setArea(computeArea());
  }
  
  public void setSide(double side){
    this.side = side;
  }
 
  public String toString(){
    return "The area of the shape is " + super.getArea();
  }
  
  @Override
  public double computeArea(){
    double a = Math.pow(side, 2);
    //super.setArea(a);    
    return a;
  } 
}