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
import java.util.Stack;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Membuat struktur data Stack untuk menyimpan riwayat aksi (String)
        Stack<String> riwayatAksi = new Stack<>();
        
        boolean berjalan = true;

        // Perulangan Menu Utama
        while (berjalan) {
            System.out.println("\n=================================");
            System.out.println("     SIMULASI FITUR UNDO         ");
            System.out.println("=================================");
            System.out.println("1. Lakukan Aksi Baru (Push)");
            System.out.println("2. Batalkan Aksi Terakhir (Pop / Undo)");
            System.out.println("3. Lihat Semua Riwayat Aksi");
            System.out.println("4. Keluar Aplikasi");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan sisa enter di keyboard
            System.out.println(); 

            switch (pilihan) {
                case 1:
                    // c. Proses push (menyimpan aksi baru)
                    System.out.print("Masukkan aksi baru: ");
                    String aksiBaru = input.nextLine();
                    riwayatAksi.push(aksiBaru);
                    System.out.println("-> [Push] Sukses menyimpan: \"" + aksiBaru + "\"");
                    break;

                case 2:
                    // c. Proses pop (pembatalan aksi terakhir)
                    // Validasi: Cek dulu apakah stack kosong atau tidak
                    if (!riwayatAksi.isEmpty()) {
                        String aksiDibatalkan = riwayatAksi.pop();
                        System.out.println("-> [Pop/Undo] BERHASIL MEMBATALKAN: \"" + aksiDibatalkan + "\"");
                    } else {
                        System.out.println("-> Gagal Undo! Riwayat aksi kosong (tidak ada yang bisa dibatalkan).");
                    }
                    break;

                case 3:
                    // Menampilkan kondisi isi stack saat ini
                    System.out.println("--- ISI RIWAYAT AKSI SAAT INI ---");
                    if (riwayatAksi.isEmpty()) {
                        System.out.println("(Kosong - Belum ada aksi)");
                    } else {
                        System.out.println(riwayatAksi);
                        System.out.println("Jumlah aksi di memori: " + riwayatAksi.size());
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih! Keluar dari aplikasi simulasi.");
                    berjalan = false; // Menghentikan loop while
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih angka 1 sampai 4.");
            }
        }
        input.close();
    }
}

