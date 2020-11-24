


package firstProject;

import java.util.Scanner;

public class firstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("class is created:");
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("what  operation you want to perform? ");
		char op = sc.next().charAt(0);
		
		System.out.println("enter second number: ");
		int b = sc.nextInt();
		
		
		switch(op) {
		case '+':
			System.out.println("result is : " + (a + b));
			break;
		case '*' :
			System.out.println("result is : "  + (a * b));
			break;
		case '/' :
			System.out.println("result is : " + (a / b));
			break;
		case '-':
			
			System.out.println("result is : "  + (a - b));
			break;
		}
		
		
		//System.out.println("result is : " + a + op +b);
		
		

	}

}
