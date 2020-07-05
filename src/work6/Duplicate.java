package work6;

import java.util.Scanner;

public class Duplicate {
	
	//Ask the USER for a string (let’s assume they input “hello world”):
		//a.	Find and Print the Duplicated Character (it should print: l o)
		
	public static void main(String argu[]) {
	Scanner word=new Scanner(System.in);
	String str=word.nextLine();
		//  String str = "hello world";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     cnt++;
		     break;
		    }
		   }
		  }
		 }
		}


