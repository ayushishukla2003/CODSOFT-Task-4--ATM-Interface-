import javax.swing.*;

public class ATMGUI {
    private static ATM atm;

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        atm = new ATM(account);

        JFrame frame = new JFrame("ATM Machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();

        JButton withdrawButton = new JButton("Withdraw");
        JButton depositButton = new JButton("Deposit");
        JButton balanceButton = new JButton("Check Balance");

        JTextField amountField = new JTextField(10);

        withdrawButton.addActionListener(e -> {
            double amount = Double.parseDouble(amountField.getText());
            atm.withdraw(amount);
        });

        depositButton.addActionListener(e -> {
            double amount = Double.parseDouble(amountField.getText());
            atm.deposit(amount);
        });

        balanceButton.addActionListener(e -> {
            atm.checkBalance();
        });

        panel.add(new JLabel("Amount:"));
        panel.add(amountField);
        panel.add(withdrawButton);
        panel.add(depositButton);
        panel.add(balanceButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}

