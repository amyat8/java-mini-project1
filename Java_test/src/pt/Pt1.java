package pt;
import java.util.Scanner;

public class Pt1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first integer: ");
		int num1 = sc.nextInt();
		System.out.print("enter second integer: ");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
		double avg = sum/2.0;
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
		sc.close();
		
	}
}
