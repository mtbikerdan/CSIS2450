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
public class Game extends GameItems {

    private Player player;
    private Computer computer;
    private CHOICES playersChoice;
    private CHOICES computersChoice;
    private RESULT result;

    public Game() {
        super();
        player = new Player();
        computer = new Computer();

    }

    public void rock() {
        playersChoice = CHOICES.ROCK;
        computersChoice = computer.getChoice();
        result = getResult();
    }

    public void paper() {
        playersChoice = CHOICES.PAPER;
        computersChoice = computer.getChoice();
        result = getResult();
    }

    public void Scissors() {
        playersChoice = CHOICES.SCISSORS;
        computersChoice = computer.getChoice();
        result = getResult();
    }

    public RESULT getResult() {
        if (playersChoice == computersChoice) {
            return RESULT.TIE;
        }

        switch (playersChoice) {
            case ROCK:
                return (computersChoice == CHOICES.SCISSORS ? RESULT.WIN : RESULT.LOSE);
            case PAPER:
                return (computersChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
            case SCISSORS:
                return (computersChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);
        }
        return getResult();
    }

}
