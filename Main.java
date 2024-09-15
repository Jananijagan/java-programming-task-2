public class Main {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of $1000
        BankAccount account = new BankAccount(1000.0);

        // Create an ATM instance associated with the bank account
        ATM atm = new ATM(account);

        // Display the ATM menu
        atm.showMenu();
    }
}
