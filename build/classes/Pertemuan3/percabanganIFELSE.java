/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author achma
 */
public class percabanganIFELSE {
    public static void main(String[] args) {
        int umur = 80;
        String kategori = "anak - anak"; 
        
        if (umur >= 5){
            kategori = "balita";
        }
        if (umur >=6 ){
            kategori = "anak - anak";
        }
        if (umur >= 13){
            kategori = "remaja";
        }
        if (umur >= 19){
            kategori = "dewasa";
        }
        if (umur >= 60){
            kategori = "lansia";
        }
        System.out.println("kategori = " + kategori);
    }
    
}

