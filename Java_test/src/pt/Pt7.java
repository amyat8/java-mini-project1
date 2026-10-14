package pt;

import java.util.*;

public class Pt7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter 1st integer: ");
		double num1 = sc.nextDouble();
		
		System.out.print("enter one (+, -, *, /): ");
		char n = sc.next().charAt(0);
				
		System.out.print("enter 2nd integer: ");
		double num2 = sc.nextDouble();
		
		switch(n) {
		case '+':
			System.out.println("result = "+ (num1 + num2));
			break;
			
		case '-':
			System.out.println("result = "+ (num1 - num2));
			break;
			
		case '*':
			System.out.println("result = "+ (num1 * num2));
			break;
			
		case '/':
			if (num2 ==0) {	
				System.out.println("can't divide by 0");
			}else {
				System.out.println("result = "+ (num1 / num2));
			}
			break;
		
		default:
			System.out.println("enter right method");
		
		}
		
		sc.close();
	}
}
