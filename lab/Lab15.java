/*
  Shipeng Chen
  Co Sci 290
  Lab 15
  April 24, 2018
*/

public class Lab15{
  public static void main(String[] args){
    // new variables
    int i,j;
    // create a matrix of 5 x 5
    int[][] matrix = new int[5][5];
    
    // assign random value to each integer in the matrix
    for(i=0;i<5;i++){
      for(j=0;j<5;j++){
        matrix[i][j] = returnRandom();
        // print out values one at a time in one row
        System.out.print(matrix[i][j] + " ");
      }
      // change to next row
      System.out.println();
    }
  }
  
  // get a random integer between 0-9
  public static int returnRandom(){
    int ran;
    ran = (int)(Math.random() * 10);
    return ran;
  }
}