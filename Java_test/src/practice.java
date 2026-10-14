//import java.util.Scanner;
//public class practice {
//	public static void main(String[] args) {
//		int a, b,sum;
//		double avg;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("enter integer 1: ");
//		a = sc.nextInt();
//		
//		System.out.print("enter integer 2: ");
//		b = sc.nextInt();
//		
//		sum = a+b;
//		System.out.println("sum= "+sum);
//		
//		avg = sum /2.0;
//		System.out.println("Avg= "+avg);
//		
//		sc.close();
//		
//	
//	}
//}


import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("정수를 입력하세요: ");
//        int time = scanner.nextInt();
//
//        int second = time % 60;          // ①
//        int minute = (time / 60) % 60;   // ②
//        int hour   = (time / 60) / 60;   // ③
//
//        System.out.print(time + "초는 ");
//        System.out.print(hour + "시간, ");
//        System.out.print(minute + "분, ");
//        System.out.println(second + "초입니다.");
//        scanner.close();
    	
    	for (int i = 1; i < 10; i++) {          // 단 (1~9)
    	    for (int j = 1; j < 10; j++) {      // 곱하는 수 (1~9)
    	        System.out.print(i + "*" + j + "=" + i * j);
    	        System.out.print('\t');         // 탭
    	    }
    	    System.out.println();               // 한 단 끝 → 줄바꿈
    	}
    }
}