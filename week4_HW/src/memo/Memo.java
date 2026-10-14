package memo;

// 메모 1개의 정보를 담는 클래스
public class Memo {
    // 필드 (private)
    private String name;    // 작성자 이름
    private String time;    // 작성 시간
    private String content; // 메모 내용

    // 매개변수 3개가 있는 생성자
    public Memo(String name, String time, String content) {
        this.name = name;
        this.time = time;
        this.content = content;
    }

    // 다른 메모와 작성자가 같은지 비교 (같으면 true, 다르면 false)
    public boolean isSameName(Memo other) {
        return name.equals(other.name); // 문자열 비교 equals() 사용
    }

    // 메모 출력
    public void show() {
        System.out.println(name + ", " + time + " " + content);
    }

    // 작성자 이름 리턴
    public String getName() {
        return name;
    }

    // 메모 내용의 길이(글자 수) 리턴
    public int length() {
        return content.length();
    }
}