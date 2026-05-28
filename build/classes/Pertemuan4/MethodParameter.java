/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author achma
 */
public class MethodParameter {
    //CONTOH PROSEDUR PARAMETER
    void LuasSegitiga (int alas, int tinggi){
        int a = alas;
        int t = tinggi;
        double L = 0.5*a*t;
        System.out.println("luas segi tiga = "+L);
    }
    //CONTOH FUNGSI PARAMETER
    double LuasLingkaran (double jarijari){
       double phi = 3.14;
       double r = jarijari;
       double L = phi*r*r;
        return L;
    }
    public static void main(String[] args) {
    MethodParameter prosedur = new MethodParameter ();
         prosedur.LuasSegitiga(10, 5);
         
     MethodParameter fungsi = new MethodParameter ();
         System.out.println("luas lingkaran = " + fungsi.LuasLingkaran(6));
    }
}
