import java.util.*;

abstract class Account {
    String customer_name, account_no, account_type;
    double balance = 0.0;

    Account(String customer_name, String account_no, String account_type) {
        this.customer_name = customer_name;
        this.account_no = account_no;
        this.account_type = account_type;
    }

    public void display() {
        System.out.println("Balance is: " + balance);
    }

    public void deposit(double d_amount) {
        balance += d_amount;
        System.out.println("Deposited: " + d_amount);
        display();
    }

    abstract void withdraw(double w_amount);
}

class CurrAcc extends Account {
    final double min_bal = 500.0;
    final double penalty = 50.0;

    CurrAcc(String customer_name, String account_no, String account_type) {
        super(customer_name, account_no, account_type);
    }

    public void minbalance() {
        if (balance < min_bal) {
            balance -= penalty;
            System.out.println("Penalty Applied");
        }
        display();
    }

    public void checkbook(String to_name, double c_amount) {
        System.out.println("Check issued to " + to_name);
        balance -= c_amount;
        minbalance();
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("No sufficient balance");
        } else {
            balance -= amount;
        }
        minbalance();
    }
}

class SavAcc extends Account {
    final double interest_rate = 7.0;

    SavAcc(String customer_name, String account_no, String account_type) {
        super(customer_name, account_no, account_type);
    }

    public void computeInterest() {
        double interest = balance * interest_rate / 100;
        balance += interest;
        display();
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("No sufficient balance");
        } else {
            balance -= amount;
        }
        display();
    }
}

public class Bank {
    public static void main(String[] args) {
        System.out.println("Chitrashree K\n 1BM23CS081");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = a.nextLine();
        System.out.println("Enter acc no:");
        String acc_no = a.nextLine();
        System.out.println("Enter acc type (savings/current):");
        String acc_type = a.nextLine().toLowerCase();

        Account account; 

        if (acc_type.equals("savings")) {
            account = new SavAcc(name, acc_no, acc_type);
        } else {
            account = new CurrAcc(name, acc_no, acc_type);
        }

        while (true) {
            int choice;
            System.out.println("1.Deposit.\n2.Display.\n3.Compute Interest/Check Book.\n4.Withdrawal.\n5.Exit");
            choice = a.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount:");
                    double d_amount = a.nextDouble();
                    account.deposit(d_amount);
                    break;
                case 2:
                    account.display();
                    break;
                case 3:
                    if (acc_type.equals("savings")) {
                        ((SavAcc)account).computeInterest();
                    } else {
                        a.nextLine(); 
                        System.out.println("Enter person name:");
                        String n = a.nextLine();
                        System.out.println("Enter amount:");
                        double c_amount = a.nextDouble();
                        ((CurrAcc) account).checkbook(n, c_amount); 
                    }
                    break;
                case 4:
                    System.out.println("Enter amount:");
                    double amount = a.nextDouble();
                    account.withdraw(amount);
                    break;
                case 5:
                    System.exit(0); 
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
