public class BankAccount {
    private final String owner;
    private int balance;

    public BankAccount(String owner) {
        this(owner,0);
    }
    public BankAccount(String owner,int balance){
        this.owner=owner;
        this.balance=balance;
    }
    public void deposit(int money){
        if(money<0){
            System.out.println("Mpney Greater than 0");
            return;
        }
        this.balance+=money;
        System.out.println("Mpney Credited ");
    }
    public void withDraw(int money){
        if(money>0 && this.balance>=money){
            this.balance-=money;
            System.out.println("Money Debited");
        }
        else
            System.out.println("Insufficient Balance");
    }
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
}
