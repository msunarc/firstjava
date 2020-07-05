package work6;

import java.util.Scanner;

/*import java.util.Random;

public class RANDOM {
	 //Generate 500 RANDOM numbers, and find the Nth smallest number 
//		(range from 100 – 1000)
		static int count=500;
		public static void main(String[] args) throws Exception {
			
			for(int i=0;i<=count;i++) {
				System.out.println("random num :" + getrandom(100,1000) );}
			}
	public static int getrandom(int min,int max) throws Exception {
		if(min>=max) {
			throw new Exception("be happy");
		}
			Random r= new Random();
			System.out.println("smallest number is:" +min);
			return r.nextInt((max-min)+1) +min;
		}
	}*/
/*
 * import java.util.Random; public class RandomNumeberNth {
 * 
 * public static void main(String[] args) {
 * 
 * // int startcounter=100; int n=0; //int endCounter=1000; //int arraysize =
 * endCounter-startcounter; int numbers[] = new int[arraysize+1]; Random rnum =
 * new Random(); System.out.println("Random Numbers\n****************"); //
 * for(int counter=startcounter;counter<=endCounter;counter++) for(int i
 * =100;i<=i-numbers.length-1;i++) { int c = n++; int num = rnum.nextInt(900);
 * numbers[c]= num; System.out.println(numbers[c]);
 * 
 * } int smallest = numbers[0]; int biggest = numbers[0];
 * 
 * for(int i=100; i< numbers.length; i++) { if(numbers[i] > biggest) biggest =
 * numbers[i]; else if (numbers[i] < smallest) smallest = numbers[i]; }
 * System.out.println("Largest Number is : " + biggest);
 * System.out.println("Smallest Number is : " + smallest); } }
 */

public class DuplStr {
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
	     System.out.print(inp[j] + "\t");
	     cnt++;
	     break;
	    }
	   }
	  }
	 }
	}
	 

