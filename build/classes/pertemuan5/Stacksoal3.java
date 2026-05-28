/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author achma
 */
import java.util.Scanner;
import java.util.Stack;
public class Stacksoal3 {
    public static void main(String[] args) {
        // Stack untuk menyimpan riwayat halaman (String)
        Stack<String> riwayat = new Stack<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== SIMULASI UNDO BROWSER ===");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Kunjungi Halaman Baru (Push)");
            System.out.println("2. Undo / Kembali (Pop)");
            System.out.println("3. Lihat Halaman Saat Ini (Pick)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama halaman: ");
                    String halaman = input.nextLine();
                    riwayat.push(halaman); // Operasi Push
                    System.out.println("Berhasil membuka: " + halaman);
                    break;

                case 2:
                    if (!riwayat.isEmpty()) {
                        String dihapus = riwayat.pop(); // Operasi Pop
                        System.out.println("Menutup halaman: " + dihapus);
                        
                        if (!riwayat.isEmpty()) {
                            System.out.println("Kembali ke: " + riwayat.peek());
                        } else {
                            System.out.println("Tidak ada halaman sebelumnya.");
                        }
                    } else {
                        System.out.println("Riwayat kosong! Tidak bisa Undo.");
                    }
                    break;

                case 3:
                    if (!riwayat.isEmpty()) {
                        // Operasi Peek
                        System.out.println("Halaman aktif: " + riwayat.peek());
                    } else {
                        System.out.println("Belum ada halaman yang dibuka.");
                    }
                    break;

                case 4:
                    System.out.println("Menutup Browser...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        input.close();
    }
}
