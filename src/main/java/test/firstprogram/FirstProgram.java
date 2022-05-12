/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package test.firstprogram;

/**
 *
 * @author maggy
 */
import java.util.Scanner;
public class FirstProgram {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("This is a two player computer game");
        
        System.out.print("Player 1: what is your name: ");
        String player1 = key.nextLine();
        
        System.out.print("Player 2: what is your name: ");
        String player2 = key.nextLine();
        
        Player p1 = new Player(player1, 0);
        Player p2 = new Player(player2, 0);
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println("\f");
        System.out.println("In this game, you will try and match the computer to get points.");
        
        int turns = 0;
        
        while(turns < 10){
            //Player one goes first
            System.out.println();
            list();
            System.out.println("\n\nTurns: " + turns);
            System.out.println(p1);
            System.out.print("Player 1, choose a word: ");
            String choice = key.next();
            System.out.print("\t\t\t " + p1.rand(choice));
            
            
            //player 2 goes next
            System.out.println();
            list();
            System.out.println("\n\nTurns: " + turns);
            System.out.println(p2);
            System.out.print("Player 2, choose a word: ");
            String choice2 = key.next();
            System.out.print("\t\t\t " + p2.rand(choice2));
            
            //fix the score
            
            
            turns++;
        }
    
        
        
    }
    
    //List
    public static void list(){
        System.out.println("Mice, Cat, Dog, Horse");
        
        
    }
}
