/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

/**
 *
 * @author achma
 */
import java.util.Scanner;

public class Queue {
    // Array dengan ukuran maksimal 5
    static int MAX = 5;
    static int[] queue = new int[MAX];
    static int front = 0;
    static int rear = 0;
    static int size = 0; // Untuk mencatat jumlah elemen saat ini
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== MENU QUEUE ===");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    enqueue();
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 4);
    }

    // Fungsi a: enqueue (tambah data ke antrean)
    static void enqueue() {
        if (size == MAX) {
            System.out.println("✗ Queue Penuh! Tidak bisa menambah data.");
        } else {
            System.out.print("Masukkan data (angka): ");
            int data = scanner.nextInt();
            queue[rear] = data;
            rear = (rear + 1) % MAX; // Menggunakan circular array agar memori efektif
            size++;
            System.out.println("✓ Data " + data + " berhasil dimasukkan ke dalam queue.");
        }
    }

    // Fungsi b: dequeue (hapus/ambil data dari antrean paling depan)
    static void dequeue() {
        if (size == 0) {
            System.out.println("✗ Queue Kosong! Tidak ada data yang bisa dihapus.");
        } else {
            int dataDihapus = queue[front];
            front = (front + 1) % MAX; // Geser pointer depan
            size--;
            System.out.println("✓ Data " + dataDihapus + " berhasil keluar dari queue.");
        }
    }

    // Fungsi c: display (tampilkan isi queue saat ini)
    static void display() {
        if (size == 0) {
            System.out.println("Queue kosong.");
        } else {
            System.out.print("Isi Queue saat ini: ");
            int index = front;
            for (int i = 0; i < size; i++) {
                System.out.print(queue[index] + " ");
                index = (index + 1) % MAX;
            }
            System.out.println();
        }
    }
}
