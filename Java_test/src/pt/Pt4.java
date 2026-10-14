package pt;
import java.util.*;

public class Pt4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int num = sc.nextInt();
		System.out.println("======"+num+"단======");
		for(int i =1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+ (num*i));
		}
		sc.close();
	}
}
