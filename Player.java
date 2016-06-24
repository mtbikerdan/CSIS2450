/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RockPaperScissors;

/**
 *
 * @author Dan
 */
import java.util.Scanner;

public class Player extends GameItems{
    Scanner scan;
    
    public Player(){
        super();
        scan = new Scanner(System.in);
    }
    
    public CHOICES getChoice(){
        System.out.println("Please enter your choice: R, P, S");
        char choice = scan.nextLine().toUpperCase().charAt(0);
        switch (choice){
            case 'R':
                return CHOICES.ROCK;
            case 'P':
                return CHOICES.PAPER;
            case 'S':
                return CHOICES.SCISSORS;
        }
         return getChoice();
        
    }
}
