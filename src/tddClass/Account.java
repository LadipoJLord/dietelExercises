package tddClass;

public class Account {
    private int balance;
    public void deposit(int amount) {
        if (amount > 0) {
            balance = amount + balance;
        }
    }
        public int getBalance() {
            int balance = this.balance;
            return balance;
        }

        public void withdraw(int amount){
            balance = balance - amount;
        }


}

