public class BankDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to Bank ARNI");

        // Membuat array bertipe Bank untuk menampung beberapa akun bank sekaligus
        BankAccount[] daftarAkun = new BankAccount[2];
        daftarAkun[0] = new BankAccount(100000); // Akun ke-1 dengan saldo awal 100.000
        daftarAkun[1] = new BankAccount(250000); // Akun ke-2 dengan saldo awal 250.000

        // Menjalankan transaksi pada akun pertama (daftarAkun[0])
        System.out.println("--- Transaksi Akun Pertama ---");
        daftarAkun[0].getBalance();
        daftarAkun[0].deposit(500000);
        daftarAkun[0].withdraw(150000);

        // Menampilkan riwayat transaksi yang tersimpan di dalam ArrayList pada class Bank
        daftarAkun[0].showTransactionHistory();
    }
}
    