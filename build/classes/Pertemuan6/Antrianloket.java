/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author achma
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Antrianloket {
    public static void main(String[] args) {
        // Membuat Queue untuk menyimpan nomor antrean (Integer)
        Queue<Integer> antrian = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        int nomorAuto = 1; // Counter untuk menghasilkan nomor antrean otomatis
        int pilihan;

        do {
            System.out.println("\n=== SIMULASI LOKET PELAYANAN ===");
            System.out.println("1. Ambil Nomor Antrian (Enqueue)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Tampilkan Antrian yang Menunggu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // a. Ambil nomor antrian (enqueue)
                    antrian.add(nomorAuto);
                    System.out.println("✓ Sukses mengambil nomor: " + nomorAuto);
                    nomorAuto++; // Tambah 1 untuk antrean berikutnya
                    break;

                case 2:
                    // b. Panggil antrian (dequeue)
                    // Jika antrian kosong lalu dipanggil, tampilkan pesan: "Antrian kosong"
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        int dipanggil = antrian.poll(); // Mengambil dan menghapus elemen terdepan
                        System.out.println("Panggil -> nomor " + dipanggil);
                    }
                    break;

                case 3:
                    // c. Tampilkan antrian yang menunggu
                    if (antrian.isEmpty()) {
                        System.out.println("Tidak ada antrian yang menunggu.");
                    } else {
                        System.out.println("Daftar nomor antrian yang menunggu: " + antrian);
                    }
                    break;

                case 4:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
