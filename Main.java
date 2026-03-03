import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        int accNo = 1001;

        while (true) {

            System.out.println("===== Welcome to Web Plus Bank =====");
            System.out.println("1 Create Account");
            System.out.println("2 Deposit");
            System.out.println("3 Withdraw");
            System.out.println("4 Transfer");
            System.out.println("5 View Accounts");
            System.out.println("6 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Balance: ");
                    double balance = sc.nextDouble();

                    System.out.println("1 Savings");
                    System.out.println("2 Current");

                    int type = sc.nextInt();

                    if (type == 1) {
                        service.createAccount(new SavingsAccount(accNo++, name, balance));
                    } else {
                        service.createAccount(new CurrentAccount(accNo++, name, balance));
                    }

                    break;

                case 2:

                    System.out.print("Enter Account No: ");
                    int dAcc = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double dAmt = sc.nextDouble();

                    service.depositMoney(dAcc, dAmt);

                    break;

                case 3:

                    System.out.print("Enter Account No: ");
                    int wAcc = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double wAmt = sc.nextDouble();

                    service.withdrawMoney(wAcc, wAmt);

                    break;

                case 4:

                    System.out.print("From Account: ");
                    int from = sc.nextInt();

                    System.out.print("To Account: ");
                    int to = sc.nextInt();

                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();

                    service.transferMoney(from, to, amt);

                    break;

                case 5:

                    service.displayAllAccounts();

                    break;

                case 6:

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");

            }

        }

    }
}