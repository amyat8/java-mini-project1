
import java.util.*;
public class program1 {
	public static void main(String[] args) {
//		final float pi = 3.14f;
//		Scanner input = new Scanner(System.in);
//		
//		float radius;
//		float area;
//		System.out.print("Enter radius: ");
//		radius = input.nextFloat();
//		
//		area = pi * radius * radius;
//		
//		System.out.println("area of radius "+radius+" is " + area);
//		//****************
		
//		Scanner input = new Scanner(System.in);
//		int number;
//		
//		System.out.print("Enter number: ");
//		number = input.nextInt();
//		
//		if (number % 2 == 0) {
//			System.out.println("It is even. ");
//		}
//		else {
//			System.out.println("It is odd. ");
//		}
//		
//	//*******************************
		

		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Enter num1: ");
		num1 = input.nextInt();
		
		System.out.print("Enter num2: ");
		num2 = input.nextInt();
		
		System.out.print("Enter num3: ");
		num3 = input.nextInt();
		
		if ((num1>num2)&&(num1>num3)) {
			System.out.println(num1+ " is the biggest.");
		}
		
		else if((num2>num1)&&(num2>num3)) { 
			System.out.println(num2+ " is the biggest.");
		}
			
		else{
				System.out.println(num3+ " is the biggest.");
		}
		
		
	}
	
}
