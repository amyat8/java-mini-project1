package pt;
import java.util.*;

public class Pt3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int num = sc.nextInt();
		int sum =0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println("sum: "+ sum);
		sc.close();
	}

}
