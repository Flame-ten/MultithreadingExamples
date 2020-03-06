package synchronize;

public class Account {
    private int balance;

    public Account(int balance){	this.balance = balance;}

    public int getBalance(){	return balance; }

    public synchronized void deposit(int amount){ // synchronized added
        int x = balance + amount;
        balance = x;
    }

    public synchronized void withdraw(int amount){ // synchronized added
        int x = balance - amount;
        balance = x;
    }
}
