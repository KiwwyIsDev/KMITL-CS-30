import java.util.Scanner;

public class ATM {
    private long balance = 0;

    public void withdraw(long amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }
        if (amount % 100 != 0) {
            System.out.println("Invalid amount");
            return;
        }
        balance -= amount;

        int[] denominations = {1000, 500, 100};
        System.out.println("Dispensed cash:");
        for (int denom : denominations) {
            if (amount >= denom) {
                int count = (int) (amount / denom);
                amount %= denom;
                System.out.println(denom + " x " + count);
            }
        }
    }

    public void deposit(long amount) {
        if (amount % 100 != 0) {
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public static void main(String[] args) {
        ATM myATM = new ATM();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Input amount to deposit: ");
                long depositAmount = scanner.nextLong();
                myATM.deposit(depositAmount);
            } else if (choice == 2) {
                System.out.print("Input amount to withdraw: ");
                long withdrawAmount = scanner.nextLong();
                myATM.withdraw(withdrawAmount);
            } else if (choice == 3) {
                scanner.close();
                return;
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }
    }
}
