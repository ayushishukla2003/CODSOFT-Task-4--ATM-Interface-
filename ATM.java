import javax.swing.*;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid amount.");
            return false;
        }

        if (account.withdraw(amount)) {
            JOptionPane.showMessageDialog(null, "Withdrawal successful.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient balance.");
            return false;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid amount.");
            return;
        }

        account.deposit(amount);
        JOptionPane.showMessageDialog(null, "Deposit successful.");
    }

    public void checkBalance() {
        JOptionPane.showMessageDialog(null, "Your balance is: $" + account.getBalance());
    }
}

