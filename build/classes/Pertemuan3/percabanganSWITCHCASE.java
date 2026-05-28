/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author achma
 */
public class percabanganSWITCHCASE {
    public static void main(String[] args) {
      int status = 3;
      
      switch (status){
          case 1 :
          System.out.println("pesanan anda sedang dikemas" );
          break;
          case 2 :
              System.out.println("pesanan sedang dalam pengiriman");
          break;
          case 3 :
              System.out.println("pesanan anda telah terkirim");
          break;
          default :
              System.out.println("pilihan tidak valid");
    }
      
      }
}
