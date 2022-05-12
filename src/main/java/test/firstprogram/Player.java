/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.firstprogram;

/**
 *
 * @author maggy
 */
import java.util.Random;
public class Player {
    private String name;
    private int score;
    private String word;
    private String computer;
    
    public Player(String theName, int theScore){
        name = theName;
        score = theScore;  
   }
    
   public void setter(String a, int num){
       name = a;
       score = num;
   }
   
   //Random
   public String rand(String x){
       Random ran = new Random(3);
       word = x;
       
       
       
       String words[] = {"Cat", "Mice", "Dog", "Horse"};
       
       int rand = (int) (Math.random() * 4);
       computer = (words[rand]);
       if(word.equalsIgnoreCase(computer)){
           System.out.println("Match!");
           score++;
       }
       return computer;
   }
   
   
   
   public String toString(){
       return(name + " " + " Current Score: " + score);
   }
   
   
    
    
    
    
    
}
