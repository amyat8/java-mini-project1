package song;

import java.util.Scanner;

// 노래 한 곡의 정보를 나타내는 클래스
public class Song {
    // 필드 (private: 클래스 밖에서 직접 접근 불가)
    private String title;   // 노래 제목
    private String artist;  // 가수
    private int year;       // 발표년도
    private String country; // 국적

    // 기본 생성자: 입력이 없을 때 사용할 기본값 지정
    public Song() {
        title = "아무 노래";
        artist = "지코";
        year = 2020;
        country = "대한민국";
    }

    // 매개변수가 있는 생성자: 입력받은 값으로 필드 초기화
    public Song(String title, String artist, int year, String country) {
        this.title = title;     // this.title은 필드, title은 매개변수
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    // 노래 정보를 출력하는 메소드
    public void show() {
        System.out.println("Song 정보: " + year + "년, " + country + " 국적의 "
                + artist + "가 부른 \"" + title + "\"");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 (1: 직접 입력, 2: 기본값): ");
        int menu = Integer.parseInt(sc.nextLine()); // 한 줄을 읽어 정수로 변환

        if (menu == 1) {
            //  4개 정보를 입력받아 매개변수 있는 생성자로 객체 생성
            System.out.println("발표년도 국적 가수 노래제목 순서로 입력해주세요.");
            int year = Integer.parseInt(sc.nextLine()); // 발표년도
            String country = sc.nextLine();             // 국적
            String artist = sc.nextLine();              // 가수
            String title = sc.nextLine();               // 노래제목 (띄어쓰기가 있어도 한 줄 전체를 받음)

            Song song1 = new Song(title, artist, year, country);
            song1.show();
        } else if (menu == 2) {
            //  입력 없이 기본 생성자로 객체 생성
            Song song2 = new Song();
            song2.show();
        } else {
            System.out.println("1 또는 2를 입력해주세요.");
        }

        sc.close();
    }
}