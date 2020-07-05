package Works;

import java.util.Scanner;

public class Numcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ask user for a number and print out ODD if the number is odd; otherwise print EVEN.
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       
       if (n%2!=0) {
    	   System.out.println("number is odd");
       }
       else
    	   System.out.println("number is even");

	}

}
