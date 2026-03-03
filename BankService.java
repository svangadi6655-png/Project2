import java.util.ArrayList;

class BankService {

    ArrayList<BankAccount> accounts = new ArrayList<>();

    void createAccount(BankAccount acc) {
        accounts.add(acc);
        System.out.println("Account Created Successfully");
    }

    BankAccount findAccount(int accNo) {

        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }

        return null;
    }

    void depositMoney(int accNo, double amount) {

        BankAccount acc = findAccount(accNo);

        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    void withdrawMoney(int accNo, double amount) {

        BankAccount acc = findAccount(accNo);

        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    void transferMoney(int fromAcc, int toAcc, double amount) {

        BankAccount sender = findAccount(fromAcc);
        BankAccount receiver = findAccount(toAcc);

        if (sender != null && receiver != null) {

            sender.withdraw(amount);
            receiver.deposit(amount);

            System.out.println("Transfer Successful");

        } else {
            System.out.println("Account not found");
        }
    }

    void displayAllAccounts() {

        for (BankAccount acc : accounts) {
            acc.displayDetails();
        }

    }
}