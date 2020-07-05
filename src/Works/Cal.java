package Works;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner n= new Scanner(System.in);
System.out.println("please enter first number");
int num = n.nextInt();
System.out.println("please enter second number");
int num1= n.nextInt();
System.out.println("enter from add,sub,mul,div,..any one");
String a= n.next();

// if-else 

if (a.equalsIgnoreCase("add")) {
		System.out.println("Addition ="+add( num, num1));
	}
else 
	if (a.equalsIgnoreCase("sub")) {
		System.out.println("Substraction ="+sub(num, num1));
	}
else
	if (a.equalsIgnoreCase("mul")) {
		System.out.println("multiplication ="+mul(num, num1));
	}
else
	if (a.equalsIgnoreCase("div")) {
		System.out.println("division ="+div(num, num1));
	}
else
 System.out.println("invalid entry");
}


public static int add(int num,int num1) {
	return (num+num1);
}
public static int sub(int num,int num1) {
	return num-num1;
}
public static int mul(int num,int num1) {
	return num*num1;
}
public static int div(int num,int num1) {
	return num/num1;
}
}
