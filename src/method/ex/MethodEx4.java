package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        // 문제 - 은행 계좌 입출금
        Scanner scanner = new Scanner(System.in);
        int balacne = 0;     // 통장 잔액

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            int amount;

            if (choice == 1) {
                System.out.print("입금액을 입력하세요: ");
                amount = scanner.nextInt();
                balacne = deposit(balacne, amount);
            } else if (choice == 2) {
                System.out.print("출금액을 입력하세요: ");
                amount = scanner.nextInt();
                balacne = withdraw(balacne, amount);
            } else if (choice == 3) {
                System.out.println("현재 잔액: " + balacne + "원");
            } else if (choice == 4) {
                System.out.println("시스템을 종료합니다.");
                // break;
                return;    // main 메서드 종료. 프로그램이 종료됨
            } else {
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
            }
        }
    }

    // 입금 메서드
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return  balance;
    }

    // 출금 메서드
    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
