package oop1.ex;

public class Account {
    // 객체 지향 프로그래밍을 위한 데이터와 기능이 들어간 클래스
    int balacne;    // 잔액

    // 입금 메서드
    void deposit(int amount) {
        balacne += amount;
    }

    // 출금 메서드
    void withdraw(int amount) {
        if (balacne >= amount) {
            balacne -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}
