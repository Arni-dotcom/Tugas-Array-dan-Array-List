import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private ArrayList<String> transactionHistory;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Initial balance: Rp " + (long) balance);
    }

    // Method untuk deposit
    public void deposit(double amount) {
        this.balance += amount;
        transactionHistory.add("Deposit: Rp " + (long) amount);
        System.out.println("Deposit: Rp " + (long) amount);
        getBalance();
    }

    // Method untuk withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            transactionHistory.add("Withdraw: Rp " + (long) amount);
            System.out.println("Withdraw: Rp " + (long) amount);
            getBalance();
        } else {
            System.out.println("Penarikan gagal! Saldo tidak mencukupi.");
        }
    }

    // Method untuk menampilkan saldo saat ini
    public void getBalance() {
        System.out.println("Current balance: Rp " + (long) balance);
        System.out.println();
    }

    // Method tambahan untuk menampilkan isi ArrayList (riwayat transaksi)
    public void showTransactionHistory() {
        System.out.println("--- Riwayat Transaksi ---");
        for (String log : transactionHistory) {
            System.out.println("- " + log);
        }
    }
}