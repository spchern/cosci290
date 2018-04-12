/*
	<<!----- Shipeng Chen ------>>
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	        *
	      * * * 
	    * * * * *
	  * * * * * * *
	* * * * * * * * *
	  * * * * * * *
	    * * * * *
	      * * *
	        *
  * * * * *
	  * * * * 
	    * * * 
	      * * 
	        *
	4. Fix the indentation of the code. 
	Note:
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/

public class Lab12{

	public static void main(String[] args) {
		int i, j, k;
		
		//upper half of the diamond
		for(i=0;i<5;i++){
			for(j=i;j<4;j++){
				System.out.print(" ");  
			}
			for(k=0;k<(i*2+1);k++){
				System.out.print("*");
		  }
			
			System.out.println();
		 }
		
		//lower half of the diamond
		for(i=4;i>0;i--){
			for(j=4;j>=i;j--){
				System.out.print(" ");
				}
			for(k=0;k<(i*2-1);k++){
				System.out.print("*");
			} 
		System.out.println();
	} 
		
	printTriangle();
}	

	public static void printTriangle(){
		int l, m, n;
		for(l=0;l<5;l++){
			for(m=l;m>0;m--){
				System.out.print(" ");
			}
			for(n=l;n<5;n++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//to-do: implement triangle
	}
	
}