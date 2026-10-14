package pt;

import java.util.Scanner;

public class Pt5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int sumPlus =0;
		int sumMinus = 0;
		for(int i=1; i<=5; i++) {
			System.out.printf("%d 번째 정수: ",i);
			int num = sc.nextInt();
			if(num <0) {
				sumMinus+=1;
			}
			else if(num>0) {
				sumPlus +=1;
			}
			
		}
	System.out.println("sumplus: "+sumPlus);
	System.out.println("sumMinus: "+sumMinus);
		sc.close();
	}
}
