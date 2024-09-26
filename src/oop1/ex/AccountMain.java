package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        // 문제2 - 객체 지향 계좌
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000); // 오류 메시지 출력
        System.out.println("잔고: " + account.balacne);
    }
}
