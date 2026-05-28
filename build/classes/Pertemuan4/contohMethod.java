/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author achma
 */
public class contohMethod {
    //CONTOH PROSEDUR
        void luaspersegipanjang (){
        int p = 10;
        int l = 5;
        int L = p*l;
            System.out.println("luas persegi panjang = " +L);

        }
        
        public static void main(String[] args) {
        
            contohMethod Prosedur = new contohMethod ();
            Prosedur.luaspersegipanjang();
            
            contohMethod fungsi= new contohMethod ();
            System.out.println("luas persegi = "+ fungsi.luaspersegi());
    }
        //CONTOH FUNGSI
        int luaspersegi (){
            
            int sisi = 10;
            int L = sisi * sisi;  
            return L;
            
        }
}
