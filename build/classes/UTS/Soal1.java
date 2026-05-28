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

public class Soal1 {
    // Array 2D untuk denah kursi (5x5)
    static int[][] kursi = new int[5][5];
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Inisialisasi semua kursi kosong (0)
        inisialisasiKursi();
        
        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            
            switch(pilihan) {
                case 1:
                    tampilkanDenah();
                    break;
                case 2:
                    isikursi();
                    break;
                case 3:
                    hapusKursi(); 
                    break;
                case 4:
                    tampilkanStatistik(); 
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while(pilihan != 5);
    }
    
    // Menu utama
    static void tampilkanMenu() {
        System.out.println("\n========== MENU DENAH KELAS ==========");
        System.out.println("1. Tampilkan Denah Kursi");
        System.out.println("2. Isi Kursi");
        System.out.println("3. Kosongkan Kursi");
        System.out.println("4. Tampilkan Statistik");
        System.out.println("5. Keluar");
        System.out.println("======================================");
    }
    
    // Inisialisasi semua kursi menjadi 0 (kosong)
    static void inisialisasiKursi() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                kursi[i][j] = 0;
            }
        }
    }
    
    // Menampilkan denah kursi
    static void tampilkanDenah() {
        System.out.println("\n========== DENAH KURSI ==========");
        System.out.println("    Kolom 1  2  3  4  5");
        for(int i = 0; i < 5; i++) {
            System.out.print("Baris " + (i+1) + ": ");
            for(int j = 0; j < 5; j++) {
                if(kursi[i][j] == 0) {
                    System.out.print(" 0 "); // Kursi kosong
                } else {
                    System.out.print(" 1 "); // Kursi terisi
                }
            }
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println("Keterangan: 0 = Kosong, 1 = Terisi");
    }
    
    // Mengisi kursi
    static void isikursi() {
        System.out.print("\nMasukkan baris (1-5): ");
        int baris = scanner.nextInt() - 1; 
        System.out.print("Masukkan kolom (1-5): ");
        int kolom = scanner.nextInt() - 1; 
        
        if(baris >= 0 && baris < 5 && kolom >= 0 && kolom < 5) {
            if(kursi[baris][kolom] == 0) {
                kursi[baris][kolom] = 1;
                System.out.println("✓ Kursi baris " + (baris+1) + ", kolom " + (kolom+1) + " berhasil diisi."); // Tanda petik diperbaiki
            } else {
                System.out.println("✗ Kursi sudah terisi!");
            }
        } else {
            System.out.println("✗ Posisi kursi tidak valid!");
        }
    }
    
    // Mengosongkan kursi
    static void hapusKursi() { 
        System.out.print("\nMasukkan baris (1-5): ");
        int baris = scanner.nextInt() - 1; 
        System.out.print("Masukkan kolom (1-5): ");
        int kolom = scanner.nextInt() - 1; 
        
        if(baris >= 0 && baris < 5 && kolom >= 0 && kolom < 5) {
            if(kursi[baris][kolom] == 1) {
                kursi[baris][kolom] = 0;
                System.out.println("✓ Kursi baris " + (baris+1) + ", kolom " + (kolom+1) + " berhasil dikosongkan."); // Tanda petik diperbaiki
            } else {
                System.out.println("✗ Kursi sudah kosong!");
            }
        } else {
            System.out.println("✗ Posisi kursi tidak valid!");
        }
    }
    
    // Menampilkan statistik jumlah kursi kosong dan terisi
    static void tampilkanStatistik() {
        int terisi = 0;
        int kosong = 0;
        
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(kursi[i][j] == 1) {
                    terisi++;
                } else {
                    kosong++;
                }
            }
        }
        
        System.out.println("\n========== STATISTIK KURSI ==========");
        System.out.println("Kursi terisi: " + terisi + " kursi"); 
        System.out.println("Kursi kosong: " + kosong + " kursi"); 
        System.out.println("=====================================");
    }
}