package date;

// 날짜 정보를 관리하는 클래스
// 디폴트 접근 지정 
class Date {
    // 필드 (private)
    private int year;
    private int month;
    private int day;

    // 기본 생성자: 2026년 1월 1일로 초기화
    Date() {
        year = 2026;
        month = 1;
        day = 1;
    }

    // 매개변수 3개가 있는 생성자
    Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // setDate 메소드 오버로딩 (이름은 같고 매개변수가 다름)
    // 1. 년만 수정
    void setDate(int year) {
        this.year = year;
    }

    // 2. 월과 일 수정
    void setDate(int month, int day) {
        this.month = month;
        this.day = day;
    }

    // 3. 년, 월, 일 모두 수정
    void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 2026-1-1 형식으로 출력
    void print1() {
        System.out.println(year + "-" + month + "-" + day);
    }

    // 2026년 1월 1일 형식으로 출력
    void print2() {
        System.out.println(year + "년 " + month + "월 " + day + "일");
    }
}