
import java.util.*;
public class program2 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int hours, minutes, seconds, total_sec;
		
		System.out.print("Enter hours: ");
		hours = input.nextInt();
		System.out.print("Enter minutes: ");
		minutes = input.nextInt();
		System.out.print("Enter seconds: ");
		seconds = input.nextInt();
		
		total_sec = (hours*3600)+(minutes*60)+seconds;
		
		System.out.println("total seconds are " +total_sec +" seconds");
	}
}