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

public class Stacksoal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> Stack = new Stack<>();

        // Input kata dari user
        System.out.print("Masukkan sebuah kata: ");
        String kata = input.nextLine();

        // Memasukkan setiap karakter kata ke dalam stack (Push)
        for (int i = 0; i < kata.length(); i++) {
            Stack.push(kata.charAt(i));
        }

        // Mengambil karakter dari stack untuk membalikkan kata (Pop)
        System.out.print("Kata terbalik: ");
        while (!Stack.isEmpty()) {
            System.out.print(Stack.pop());
        }
        
        System.out.println(); // Baris baru
        input.close();
    }
}
