class SavingsAccount extends BankAccount {

    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    void withdraw(double amount) {

        if (getBalance() - amount >= 1000) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Minimum balance must be 1000");
        }

    }
}