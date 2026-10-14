package account;

// 은행 계좌 1개를 나타내는 클래스
public class Account {
    private int balance; // 잔금 (private)

    // 생성자: 처음 예금할 금액으로 계좌 생성
    public Account(int balance) {
        this.balance = balance;
    }

    // 예금 (금액 1개)
    public void deposit(int money) {
        balance += money;
    }

    // 예금 (배열에 있는 모든 금액) -> 메소드 오버로딩
    public void deposit(int[] moneys) {
        for (int i = 0; i < moneys.length; i++) {
            balance += moneys[i];
        }
    }

    // 인출: 실제로 인출한 금액을 리턴
    public int withdraw(int money) {
        if (balance < money) {      // 잔금이 부족하면
            int real = balance;     // 남은 잔금만큼만 인출
            balance = 0;
            return real;
        }
        balance -= money;           // 잔금이 충분하면 요청한 금액 인출
        return money;
    }

    // 현재 잔금 리턴
    public int getBalance() {
        return balance;
    }
}