package access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.dsposit(10000);
        account.withdraw(3000);
        System.out.println("잔액: " + account.getBalance());
    }
}
