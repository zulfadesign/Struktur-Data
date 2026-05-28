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

public class Bufferprint {
    public static void main(String[] args) {
        // Menggunakan Queue bertipe String untuk menyimpan nama dokumen/file
        Queue<String> printQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SIMULASI ANTRIAN PRINTER ===");
            System.out.println("1. Tambah Dokumen ke Antrian (Enqueue)");
            System.out.println("2. Cetak Dokumen (Dequeue)");
            System.out.println("3. Lihat Dokumen Berikutnya (Peek)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer setelah input angka

            switch (pilihan) {
                case 1:
                    // a. Tambah dokumen ke antrian (enqueue)
                    System.out.print("Masukkan nama file (contoh: laporan.pdf): ");
                    String namaFile = scanner.nextLine();
                    printQueue.add(namaFile);
                    System.out.println("Tambah: " + namaFile);
                    break;

                case 2:
                    // b. Cetak dokumen (dequeue)
                    // Jika tidak ada dokumen, tampilkan pesan sesuai instruksi soal
                    if (printQueue.isEmpty()) {
                        System.out.println("Tidak ada dokumen dalam antrian");
                    } else {
                        String dicetak = printQueue.poll(); // Mengambil dan menghapus dokumen terdepan
                        System.out.println("Cetak -> " + dicetak);
                    }
                    break;

                case 3:
                    // c. Lihat dokumen berikutnya (peek)
                    if (printQueue.isEmpty()) {
                        System.out.println("Tidak ada dokumen dalam antrian");
                    } else {
                        String dokumenBerikutnya = printQueue.peek(); // Hanya melihat tanpa menghapus
                        System.out.println("Dokumen terdepan yang siap dicetak: " + dokumenBerikutnya);
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
