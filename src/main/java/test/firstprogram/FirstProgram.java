/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package test.firstprogram;

/**
 *
 * @author maggy
 */
public class FirstProgram {

    public static void main(String[] args) {
        System.out.println("This is a two player computer game");
        Player p1 = new Player("John", 0);
        Player p2 = new Player("Lee", 0);
        
        System.out.println(p1);
        System.out.println(p2);
    }
}
