/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author achma
 */
public class objekclassplayer {
    public static void main(String[] args) {
        
        player petani = new player();
        
        petani.name = "petani kode";
        petani.speed = 78;
        petani.healthpoin = 0;
        
        petani.run();
        
        if(petani.isDead()){
            System.out.println("Game Over");
        }
    }
}
