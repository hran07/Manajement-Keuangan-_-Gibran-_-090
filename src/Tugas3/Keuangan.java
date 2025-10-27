package Tugas3;

import java.util.ArrayList;

/**
 * Kelas Keuangan digunakan untuk mencatat pemasukan dan pengeluaran.
 * Menyimpan total pemasukan, total pengeluaran, dan saldo saat ini.
 */
public class Keuangan {
    /** Catatan pemasukan */
    static ArrayList<String> incomeNotes = new ArrayList<>();
    /** Catatan pengeluaran */
    static ArrayList<String> expenseNotes = new ArrayList<>();
    /** Nominal pemasukan */
    static ArrayList<Double> incomeAmounts = new ArrayList<>();
    /** Nominal pengeluaran */
    static ArrayList<Double> expenseAmounts = new ArrayList<>();

    /** Nilai awal untuk total dan saldo */
    public static final int INT = 0;

    /** Total pemasukan */
    private static double totalIncome = INT;
    /** Total pengeluaran */
    private static double totalExpense = INT;
    /** Saldo saat ini */
    private static double saldo = INT;

    /**
     * Menampilkan seluruh catatan keuangan, termasuk total dan detail masing-masing transaksi.
     */
    static void lihatCatatan() {
        System.out.println("\n--- Catatan Keuangan ---");
        System.out.println("Total Pemasukan: " + getTotalIncome());
        System.out.println("Total Pengeluaran: " + getTotalExpense());
        System.out.println("Total Uang Sekarang: " + getSaldo());

        System.out.println("\nDetail Pemasukan:");
        for (int i = 0; i < incomeNotes.size(); i++) {
            System.out.println("- " + incomeNotes.get(i) + " : " + incomeAmounts.get(i));
        }

        System.out.println("\nDetail Pengeluaran:");
        for (int j = 0; j < expenseNotes.size(); j++) {
            System.out.println("- " + expenseNotes.get(j) + " : " + expenseAmounts.get(j));
        }
    }

    /**
     * Menambahkan transaksi pengeluaran.
     * @param transaksi Objek Transaksi yang berisi nominal dan catatan pengeluaran.
     */
    static void inputPengeluaran(Transaksi transaksi) {
        setTotalExpense(getTotalExpense() + transaksi.nominal());
        expenseAmounts.add(transaksi.nominal());
        expenseNotes.add(transaksi.catatan());
        setSaldo(getSaldo() - transaksi.nominal());
    }

    /**
     * Menambahkan transaksi pemasukan.
     * @param transaksi Objek Transaksi yang berisi nominal dan catatan pemasukan.
     */
    static void inputPemasukan(Transaksi transaksi) {
        setTotalIncome(getTotalIncome() + transaksi.nominal());
        incomeAmounts.add(transaksi.nominal());
        incomeNotes.add(transaksi.catatan());
        setSaldo(getSaldo() + transaksi.nominal());
    }

    /** @return total pemasukan */
    public static double getTotalIncome() {
        return totalIncome;
    }

    /** @param totalIncome set total pemasukan */
    public static void setTotalIncome(double totalIncome) {
        Keuangan.totalIncome = totalIncome;
    }

    /** @return total pengeluaran */
    public static double getTotalExpense() {
        return totalExpense;
    }

    /** @param totalExpense set total pengeluaran */
    public static void setTotalExpense(double totalExpense) {
        Keuangan.totalExpense = totalExpense;
    }

    /** @return saldo saat ini */
    public static double getSaldo() {
        return saldo;
    }

    /** @param saldo set saldo saat ini */
    public static void setSaldo(double saldo) {
        Keuangan.saldo = saldo;
    }
}
