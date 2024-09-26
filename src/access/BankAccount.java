package access;

public class BankAccount {

    private int balance;


    // 생성자  -> Alt + Insert 단축키 사용
    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : deposit
    public void dsposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드 : withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드 : getBalance
    public int getBalance() {
        return balance;
    }

    // private 메서드 : isAmountValid 금액이 정상적인지 확인하는 메서드
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
