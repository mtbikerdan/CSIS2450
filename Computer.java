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
import java.util.Random;

public class Computer extends GameItems{
    private Random random;
    
    public Computer()  {
        super();
        random = new Random();
    }
    
    public CHOICES getChoice(){
        int choice = 1 + random.nextInt(3);
        switch (choice){
            case 1:
                return CHOICES.ROCK;
            case 2:
                return CHOICES.PAPER;
        }
                return CHOICES.SCISSORS;
        
    }
}
