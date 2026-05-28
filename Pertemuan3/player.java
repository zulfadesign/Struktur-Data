/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author achma
 */
public class player {
    String name;
        int speed; 
        int healthpoin; 
        void run()
        {
            System.out.println(name + " is running... ");
            System.out.println(" speed = " + speed);
        }
    boolean isDead(){
        if(healthpoin <= 0) return true;
        return false;
}
}
