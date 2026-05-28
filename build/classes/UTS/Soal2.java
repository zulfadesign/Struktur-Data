/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author achma
 */
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Nama produk sebagai penanda baris
        String[] namaProduk = {"sabun cair", "shampo zink", "snack jezz"};
        
        //  Data penjualan dalam array 2 dimensi (3 produk x 7 hari)
        int[][] dataPenjualan = {
            {   10, 15, 12, 20, 18, 25, 30},
            {   8,  11, 9,  14, 12, 20, 22},
            {   15, 22, 18, 25, 30, 35, 40}
        };

        boolean berjalan = true;

        // Perulangan Menu Utama
        while (berjalan) {
            System.out.println("  --- MENU PENJUALAN MINIMARKET ---    ");
            System.out.println("1. Tampilkan Semua Data (Tabel)");
            System.out.println("2. Hitung Total Penjualan tiap Produk");
            System.out.println("3. Tampilkan Produk Terlaris");
            System.out.println("4. Keluar Aplikasi");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = input.nextInt();
            System.out.println(); // Jarak baris kosong

            switch (pilihan) {
                case 1:
                    // d. Menampilkan seluruh data dalam bentuk tabel
                    System.out.println("========================================");
                    System.out.println("  DATA PENJUALAN MINIMARKET (7 HARI)  ");
                    System.out.println("========================================");
                    System.out.println("Produk\t\tH1\tH2\tH3\tH4\tH5\tH6\tH7");
                    System.out.println("------------------------------------------------------------");
                    for (int i = 0; i < dataPenjualan.length; i++) {
                        System.out.print(namaProduk[i] + "\t");
                        for (int j = 0; j < dataPenjualan[i].length; j++) {
                            System.out.print(dataPenjualan[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println("------------------------------------------------------------");
                    break;

                case 2:
                    // b. Menghitung total penjualan tiap produk
                    System.out.println("--- TOTAL PENJUALAN TIAP PRODUK ---");
                    for (int i = 0; i < dataPenjualan.length; i++) {
                        int jumlah = 0;
                        for (int j = 0; j < dataPenjualan[i].length; j++) {
                            jumlah += dataPenjualan[i][j];
                        }
                        System.out.println(namaProduk[i] + ": " + jumlah + " unit");
                    }
                    break;

                case 3:
                    // c. Menentukan produk dengan penjualan tertinggi
                    int indeksTertinggi = 0;
                    int penjualanMaksimal = 0;

                    // Hitung dulu total penjualan produk pertama untuk perbandingan awal
                    for (int j = 0; j < dataPenjualan[0].length; j++) {
                        penjualanMaksimal += dataPenjualan[0][j];
                    }

                    // Bandingkan dengan produk lainnya
                    for (int i = 1; i < dataPenjualan.length; i++) {
                        int totalProdukIni = 0;
                        for (int j = 0; j < dataPenjualan[i].length; j++) {
                            totalProdukIni += dataPenjualan[i][j];
                        }
                        if (totalProdukIni > penjualanMaksimal) {
                            penjualanMaksimal = totalProdukIni;
                            indeksTertinggi = i;
                        }
                    }

                    System.out.println("--- PRODUK DENGAN PENJUALAN TERTINGGI ---");
                    System.out.println("Produk Terlaris : " + namaProduk[indeksTertinggi]);
                    System.out.println("Total Penjualan  : " + penjualanMaksimal + " unit");
                    break;

                case 4:
                    System.out.println("Terima kasih! Keluar dari aplikasi.");
                    berjalan = false; // Menghentikan perulangan while
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih angka 1 sampai 4.");
            }
        }
        input.close();
    }
}

