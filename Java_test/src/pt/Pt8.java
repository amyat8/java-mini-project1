package pt;

import java.util.Scanner;

public class Pt8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===menu====");
		System.out.println("1.colar(1500), 2.cider(1300), 3.water(800)");
		System.out.print("enter menu number(1 or 2 or 3): ");
		int num = sc.nextInt();
		int price =0;
		
		switch(num) {
		case 1:
			price = 1500;
			break;
		case 2:
			price = 1300;
			break;
		case 3:
			price = 800;
			break;
		default:
			System.out.println("You need to enter 1 2 3 ");
			break;
		}
		
		if (price!=0) {
		System.out.print("enter money: ");
		int money = sc.nextInt();
		if(money>=price) {
			System.out.println("here it is. money left "+ (money-price));
		}
		else {
			System.out.println("not enough money, "+(price-money)+" need");
		}
		}
		sc.close();
	
	}
}
