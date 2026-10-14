package date;

// Date 클래스를 사용하는 메인 클래스
public class MainDate {
    public static void main(String[] args) {
        Date date1 = new Date(); // 2026년 1월 1일로 초기화
        date1.print1(); // 2026-1-1
        date1.print2(); // 2026년 1월 1일

        date1.setDate(2020, 10, 10); // 년월일 모두 수정
        date1.print1(); // 2020-10-10
        date1.print2(); // 2020년 10월 10일

        Date date2 = new Date(2026, 12, 25);
        date2.print1(); // 2026-12-25
        date2.print2(); // 2026년 12월 25일

        date2.setDate(2030); // 년만 수정
        date2.print1(); // 2030-12-25
    }
}