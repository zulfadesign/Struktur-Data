/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author achma
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //  Membuat struktur data Queue menggunakan LinkedList untuk antrean pesanan
        Queue<String> antreanRestoran = new LinkedList<>();
        
        boolean berjalan = true;

        // Perulangan Menu Utama
        while (berjalan) {
            System.out.println("\n=================================");
            System.out.println("   ANTREAN RESTORAN CEPAT SAJI   ");
            System.out.println("=================================");
            System.out.println("1. Tambah Pesanan Baru (Enqueue)");
            System.out.println("2. Proses/Layani Pesanan Pertama (Dequeue)");
            System.out.println("3. Lihat Daftar Semua Antrean");
            System.out.println("4. Keluar Aplikasi");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan sisa enter di keyboard
            System.out.println();

            switch (pilihan) {
                case 1:
                    //  Menambahkan data pesanan pelanggan (Enqueue)
                    System.out.print("Masukkan nama pelanggan & pesanannya: ");
                    String pesananBaru = input.nextLine();
                    antreanRestoran.add(pesananBaru); // Menambahkan ke barisan paling belakang
                    System.out.println("-> [Enqueue] Sukses menambah: \"" + pesananBaru + "\" ke antrean.");
                    break;

                case 2:
                    // Memproses pesanan pertama (Dequeue)
                    // Validasi: Cek dulu apakah antrean kosong atau tidak
                    if (!antreanRestoran.isEmpty()) {
                        String pesananDiproses = antreanRestoran.poll(); // Mengambil & menghapus dari urutan terdepan
                        System.out.println("-> [Dequeue] MEMPROSES PESANAN: \"" + pesananDiproses + "\"");
                        System.out.println("   (Pesanan selesai disajikan!)");
                    } else {
                        System.out.println("-> Gagal memproses! Antrean kosong, tidak ada pelanggan saat ini.");
                    }
                    break;

                case 3:
                    // b. & d. Menampilkan daftar antrean saat ini
                    System.out.println("--- DAFTAR ANTREAN SAAT INI ---");
                    if (antreanRestoran.isEmpty()) {
                        System.out.println("(Kosong - Tidak ada antrean)");
                    } else {
                        System.out.println("Urutan (Depan -> Belakang): " + antreanRestoran);
                        System.out.println("Total pelanggan mengantre: " + antreanRestoran.size() + " orang");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih! Keluar dari aplikasi restoran.");
                    berjalan = false; // Menghentikan loop
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih angka 1 sampai 4.");
            }
        }
        input.close();
    }
}

