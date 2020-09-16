package org.add;

import java.util.Scanner;
public class Students {
public static void main(String[] args) {
	Scanner se = new Scanner(System.in);
	
	System.out.println("Enter your name");
	String name = se.next();
	System.out.println("Your name is "+name);
	System.out.println("Enter your mark1");
	int mark1 = se.nextInt();
	System.out.println("your mark is "+ mark1);
	System.out.println("Enter your mark2");
	int mark2 = se.nextInt();
	System.out.println("your mark is "+ mark2);
	System.out.println("Enter your mark3");
	int mark3 = se.nextInt();
	System.out.println("your mark is "+ mark3);
	System.out.println("your total is "+ (mark1+mark2+mark3));
	System.out.println("your average is "+ ((mark1+mark2+mark3)/3));
	se.close();

}
}
