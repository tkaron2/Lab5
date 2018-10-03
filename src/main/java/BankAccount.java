import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private static int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        accountNumber = 0;
        ownerName = name;
        accountType = accountCategory;
        accountbalance = 0;
        interestRate = 0;
        interestEarned = 0;

    }
    public double getBalance() {
        return accountBalance;
    }
    public void setBalance(final double newBalance) {
        accountBalance = newBalance;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(final String n) {
        ownerName = n;
    }
    public static int getAccountNumber() {
        return accountNumber;
    }
    public double getInterestEarned() {
        return interestEarned;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
