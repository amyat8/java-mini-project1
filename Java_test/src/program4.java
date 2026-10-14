import java.util.*;

public class program4 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		float cel, fer;
		
		System.out.print("please enter cel: ");
		cel = input.nextFloat();
		
		fer = (cel * 9.0f/5.0f)+32;
		
		System.out.println("fer: "+fer);
	}
}
