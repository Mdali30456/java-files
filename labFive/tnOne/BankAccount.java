public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    static String bankName = "Sonali Bank";

    BankAccount(int accNo, String name, double bal) {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = bal;
    }

    void displayInfo() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Bank: " + bankName);
        System.out.println("-----------------------");
    }

    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    public static void main(String[] args) {
        BankAccount.showBankName();
        System.out.println();

        BankAccount a1 = new BankAccount(101, "Ali", 5000);
        BankAccount a2 = new BankAccount(102, "Roy", 7000);

        a1.displayInfo();
        a2.displayInfo();
    }
}
