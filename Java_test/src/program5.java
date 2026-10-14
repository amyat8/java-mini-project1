import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		float rad, vol;
		final float pi = 3.14f; //can't override
		
		System.out.print("please enter radius: ");
		rad = input.nextFloat();
		
		vol = (4.0f/3.0f)*pi*rad*rad*rad;
		
		System.out.println("fer: "+vol);
	}
}
