/**
Problem Statement
2. Write a program to print the result of the following expressions provided the integer variable
a is 20 and b is 10.
int b = a-- - --a;
int c = a--;
int d = a>>2;
int e = a&b;
*/



/**This program prints the result of the given expressions
*/

public class Assignment2 {
     public static void main(String[] arg) 
	 {
	   int a =20;
	   int b =10;
	   
		b = a-- - --a;  
		System.out.print("b= "+b); 
		System.out.print("\n");

		int c = a--;
	  	System.out.print("c= "+c); 
		System.out.print("\n");
		
		int d = a>>2;
		System.out.print("d= "+d); 
		System.out.print("\n");
		
		int e = a&b;
		System.out.print("e= "+e); 
		System.out.print("\n");
      
	    	
	}	
}
