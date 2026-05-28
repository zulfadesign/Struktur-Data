/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author achma
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menggunakan ArrayList supaya data harganya bisa ditambah sesuka hati (dinamis)
        ArrayList<Integer> daftarHarga = new ArrayList<>();
        
        // Memasukkan 10 data harga awal sesuai ketentuan soal
        daftarHarga.addAll(Arrays.asList(50000, 15000, 85000, 12500, 30000, 75000, 22000, 95000, 45000, 60000));
        
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=================================");
            System.out.println("   MENU HARGA TOKO ONLINE   ");
            System.out.println("=================================");
            System.out.println("1. Tambah Data Harga Baru");
            System.out.println("2. Tampilkan Semua Harga (Urutan Input)");
            System.out.println("3. Urutkan Harga (Termurah -> Termahal)");
            System.out.println("4. Keluar Aplikasi");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = input.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    // Menu baru untuk menambah data harga secara interaktif
                    System.out.print("Masukkan nominal harga baru: Rp ");
                    int hargaBaru = input.nextInt();
                    daftarHarga.add(hargaBaru);
                    System.out.println("-> Sukses menambah harga Rp " + hargaBaru + " ke dalam sistem.");
                    break;

                case 2:
                    // Menampilkan kondisi list harga saat ini
                    System.out.println("--- DAFTAR HARGA SAAT INI (BELUM URUT) ---");
                    System.out.println(daftarHarga);
                    System.out.println("Total produk terdaftar: " + daftarHarga.size() + " item");
                    break;

                case 3:
                    // Proses kloning data ke array biasa agar data mentah aslinya tidak acak-acakan
                    int[] dataSort = new int[daftarHarga.size()];
                    for (int i = 0; i < daftarHarga.size(); i++) {
                        dataSort[i] = daftarHarga.get(i);
                    }

                    // Menjalankan Algoritma Bubble Sort
                    bubbleSort(dataSort);

                    System.out.println("--- HASIL URUTAN HARGA TOKO ONLINE ---");
                    System.out.println("Sebelum: " + daftarHarga);
                    System.out.println("Sesudah: " + Arrays.toString(dataSort));
                    break;

                case 4:
                    System.out.println("Terima kasih! Keluar dari aplikasi toko online.");
                    berjalan = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih angka 1 sampai 4.");
            }
        }
        input.close();
    }

    // --- Fungsi Logika Bubble Sort ---
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Skema urut dari termurah (Kecil ke Besar)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

