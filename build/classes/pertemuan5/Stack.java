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
public class Stack {
    private int maxSize = 20;
    private int[] stackArray = new int[maxSize];
    private int top = -1;

    // Operasi Push (Tambah Data)
    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack Penuh! Tidak bisa menambah data.");
        } else {
            stackArray[++top] = data;
            System.out.println("Data " + data + " berhasil dimasukkan.");
        }
    }

    // Operasi Pop (Hapus Data)
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Kosong! Tidak ada data yang dihapus.");
        } else {
            System.out.println("Data " + stackArray[top--] + " berhasil dihapus.");
        }
    }

    // Operasi Display (Tampilkan Isi Stack)
    public void display() {
        if (top == -1) {
            System.out.println("Stack Kosong.");
        } else {
            System.out.print("Isi Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner input = new Scanner(System.in);
        int pilihan, nilai;

        do {
            System.out.println("\n--- MENU STACK ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai: ");
                    nilai = input.nextInt();
                    s.push(nilai);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
        
        input.close();
    }
    
}
