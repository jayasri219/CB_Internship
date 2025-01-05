
//Account class with encapsulation
class Account {
    // Private fields
    private int accountNumber;
    private String accountHolderName;
    private double balance;
   
    // Constructor to initialize the Account details
    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
   
    // Getter and Setter methods for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }
   
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
   
    // Getter and Setter methods for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }
   
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
   
    // Getter and Setter methods for balance
    public double getBalance() {
        return balance;
    }
   
    public void setBalance(double balance) {
        this.balance = balance;
    }
   }
   
   //SavingsAccount subclass inheriting from Account
   class SavingsAccount extends Account {
    private double interestRate;
   
    // Constructor to initialize the SavingsAccount details
    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance); // Calling the superclass constructor
        this.interestRate = interestRate;
    }
   
    // Getter and Setter methods for interestRate
    public double getInterestRate() {
        return interestRate;
    }
   
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
   
    // Method to calculate and update the balance after applying interest
    public void applyInterest() {
        double currentBalance = getBalance(); // Get current balance from the superclass
        double interestAmount = (interestRate / 100) * currentBalance; // Calculate interest
        double newBalance = currentBalance + interestAmount; // New balance after adding interest
        setBalance(newBalance); // Update the balance using setter
    }
   }
   
   public class BankingSystem {
    public static void main(String[] args) {
        // Sample input
        String accountHolderName = "John Doe";
        double initialBalance = 1000.0;
        double interestRate = 2.0;
   
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(123456, accountHolderName, initialBalance, interestRate);
   
        // Display account details before applying interest
        System.out.println("Account Holder: " + savingsAccount.getAccountHolderName());
   
        // Apply interest and update the balance
        savingsAccount.applyInterest();
   
        // Display the updated balance after interest is applied
        System.out.println("Balance after interest: " + savingsAccount.getBalance());
    }
   }
