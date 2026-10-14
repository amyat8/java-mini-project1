package pt;

import java.util.Scanner;

public class Pt6 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("enter 3 integer(space in between): ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int max = (num1>num2)? ((num1>num3)? num1: num3): ((num2>num3)?num2 :num3);
			System.out.println("max num= "+max);
			sc.close();
	}
	
}
