package Works;

import java.util.Scanner;

public class CheckRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ask the USER for a string and print if the string is palindrome
Scanner n= new Scanner(System.in);
String word=n.nextLine();
char[] a=word.toCharArray();
String san="";
for(int i=a.length-1;i>=0;i--) {
	san = san+a[i];
}


System.out.println(san);

if (san.equalsIgnoreCase(word)) {
	System.out.println("word is palindrome");
}
else {
	System.out.println("word is not palindrome");
}
	}

}
