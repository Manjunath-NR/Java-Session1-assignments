/**This program uses bitwise and bitshift operator to calculate sum of two number without using + operator.
*/

import java.util.Scanner;
public class AddTwoNumbers {
     public static void main(String[] arg) 
	 {
	   int x, y ;
	   Scanner in = new Scanner(System.in);	
	   System.out.print("Input first number: ");
	   x = in.nextInt(); 
	   System.out.print("Input second number: ");
	   y = in.nextInt(); 
      
	// Iterate till there is no carry 
	while(y != 0)
	{
            int carry = x & y; //carry is AND of two bits
            x = x ^ y; //SUM of two bits is x XOR y

            y = carry << 1; //shifts carry to 1 bit to calculate sum

        }
        System.out.print("Sum: "+x); 
		System.out.print("\n");     	
	}	
}
