class CurrentAccount extends BankAccount {

    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    void withdraw(double amount) {

        if (getBalance() + 5000 >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Overdraft limit exceeded");
        }

    }
}