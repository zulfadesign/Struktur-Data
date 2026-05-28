/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author achma
 */
import java.util.Arrays;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Data awal nama mahasiswa yang belum urut
        String[] dataAwal = {"Dora", "Bintang", "Ela", "Ali", "Citra"};
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=================================");
            System.out.println("   MENU PENGURUTAN NAMA (SORTING) ");
            System.out.println("=================================");
            System.out.println("Data: " + Arrays.toString(dataAwal));
            System.out.println("---------------------------------");
            System.out.println("1. Urutkan dengan Bubble Sort");
            System.out.println("2. Urutkan dengan Selection Sort");
            System.out.println("3. Urutkan dengan Insertion Sort");
            System.out.println("4. Keluar Aplikasi");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = input.nextInt();
            System.out.println();

            // Membuat salinan data agar data mentah asli tidak berubah saat diurutkan
            String[] dataSalinan = dataAwal.clone();

            switch (pilihan) {
                case 1:
                    bubbleSort(dataSalinan);
                    System.out.println("--- HASIL BUBBLE SORT ---");
                    System.out.println("Sebelum: " + Arrays.toString(dataAwal));
                    System.out.println("Sesudah: " + Arrays.toString(dataSalinan));
                    break;

                case 2:
                    selectionSort(dataSalinan);
                    System.out.println("--- HASIL SELECTION SORT ---");
                    System.out.println("Sebelum: " + Arrays.toString(dataAwal));
                    System.out.println("Sesudah: " + Arrays.toString(dataSalinan));
                    break;

                case 3:
                    insertionSort(dataSalinan);
                    System.out.println("--- HASIL INSERTION SORT ---");
                    System.out.println("Sebelum: " + Arrays.toString(dataAwal));
                    System.out.println("Sesudah: " + Arrays.toString(dataSalinan));
                    break;

                case 4:
                    System.out.println("Terima kasih! Keluar dari aplikasi.");
                    berjalan = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih angka 1 sampai 4.");
            }
        }
        input.close();
    }

    // --- Fungsi Bubble Sort ---
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // --- Fungsi Selection Sort ---
    public static void selectionSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indeksTerkecil = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[indeksTerkecil]) < 0) {
                    indeksTerkecil = j;
                }
            }
            String temp = arr[indeksTerkecil];
            arr[indeksTerkecil] = arr[i];
            arr[i] = temp;
        }
    }

    // --- Fungsi Insertion Sort ---
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String kunci = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(kunci) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = kunci;
        }
    }
}

