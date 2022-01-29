public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("arun",10000);
        BankAccount account1=new BankAccount("kumar");

        account.deposit(1000);
        account.withDraw(10000);

        account1.deposit(100);
        account1.withDraw(1000);

    }
}
