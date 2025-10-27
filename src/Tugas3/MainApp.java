package Tugas3;

import java.util.Scanner;

/**
 * Kelas MainApp berfungsi sebagai program utama.
 * Menyediakan menu interaktif untuk memasukkan pemasukan, pengeluaran, melihat catatan, dan keluar.
 */
class MainApp {

    /**
     * Method utama untuk menjalankan aplikasi keuangan.
     * @param args argumen dari command line (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== Sistem Keuangan CH ===");
            System.out.println("1. Pemasukan");
            System.out.println("2. Pengeluaran");
            System.out.println("3. Lihat Catatan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menuOption = scanner.nextInt();
            scanner.nextLine();

            if (menuOption == 1) {
                System.out.print("Masukkan nominal pemasukan: ");
                double nominal = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Masukkan catatan pemasukan: ");
                String catatan = scanner.nextLine();

                Keuangan.inputPemasukan(new Transaksi(nominal, catatan));
            } else if (menuOption == 2) {
                System.out.print("Masukkan nominal pengeluaran: ");
                double nominal = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Masukkan catatan pengeluaran: ");
                String catatan = scanner.nextLine();

                Keuangan.inputPengeluaran(new Transaksi(nominal, catatan));
            } else if (menuOption == 3) {
                Keuangan.lihatCatatan();
            } else if (menuOption == 4) {
                isRunning = false;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}
