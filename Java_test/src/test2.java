
import java.util.Scanner;

public class test2 {
	public static void main() {
		
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int add, sub;
		
		System.out.print("Enter num1: ");
		num1 = input.nextInt();
		
		System.out.print("Enter num2: ");
		num2 = input.nextInt();
		
		add = num1 + num2;
		sub = num1 - num2;
		
		System.out.println("adding result: " + add);
		System.out.println("sub result: " + sub);
		
		
		
	}
}
