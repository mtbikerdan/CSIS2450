/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RockPaperScissors;

import static RockPaperScissors.GameItems.RESULT.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Dan
 */
public class PlayGame extends JFrame {

    BorderLayout grid = new BorderLayout();
    BorderLayout grid2 = new BorderLayout();
    GridLayout grid3 = new GridLayout();

    JPanel player = new JPanel(grid);
    JPanel computer = new JPanel(grid2);
    JPanel header = new JPanel();
    JPanel footer = new JPanel(grid3);

    JLabel welcome = new JLabel("Welcome to Rock Paper Sicssors");
    JLabel win = new JLabel("You Win!! Try again");
    JLabel lose = new JLabel("Sorry you lost, please try again");
    JLabel tie = new JLabel("Oh Man it's a Tie! Try again!");
    JLabel computerWindow = new JLabel("Compter");
    JLabel playerWindow = new JLabel("You");

    ImageIcon open = new ImageIcon(getClass().getResource("open.jpg"));
    ImageIcon rockImg = new ImageIcon(getClass().getResource("rock.jpg"));
    ImageIcon paperImg = new ImageIcon(getClass().getResource("paper.jpg"));
    ImageIcon scissorsImg = new ImageIcon(getClass().getResource("scissors.jpg"));

    JLabel playerstart = new JLabel(open);
    JLabel playerrockImg = new JLabel(rockImg);
    JLabel playerpaperImg = new JLabel(paperImg);
    JLabel playerscissorsImg = new JLabel(scissorsImg);

    JLabel computerstart = new JLabel(open);
    JLabel computerrockImg = new JLabel(rockImg);
    JLabel computerpaperImg = new JLabel(paperImg);
    JLabel computerscissorsImg = new JLabel(scissorsImg);

    JButton Rock = new JButton("Rock");
    JButton Paper = new JButton("Paper");
    JButton Scissors = new JButton("Scissors");

    public PlayGame() {
        //setting the jframe layout size and defaults
        setLayout(new BorderLayout());
        setVisible(true);//set JFrame to visible
        setSize(1350, 700);//set JFrame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close app on exit
        setLocationRelativeTo(null);//center JFrame

        welcome.setFont(welcome.getFont().deriveFont(77.0f));
        win.setFont(win.getFont().deriveFont(77.0f));
        lose.setFont(lose.getFont().deriveFont(77.0f));
        tie.setFont(tie.getFont().deriveFont(77.0f));
        computerWindow.setFont(computerWindow.getFont().deriveFont(25.0f));
        playerWindow.setFont(playerWindow.getFont().deriveFont(25.0f));
        computerWindow.setHorizontalAlignment(SwingConstants.CENTER);
        playerWindow.setHorizontalAlignment(SwingConstants.CENTER);

        grid3.setColumns(3);
        grid3.setRows(1);
        grid3.setHgap(20);

        add(header, BorderLayout.NORTH);
        add(computer, BorderLayout.WEST);
        add(player, BorderLayout.EAST);
        add(footer, BorderLayout.SOUTH);

        header.add(welcome);

        computer.add(computerWindow, BorderLayout.NORTH);
        computer.add(computerstart, BorderLayout.SOUTH);

        player.add(playerWindow, BorderLayout.NORTH);
        player.add(playerstart, BorderLayout.SOUTH);

        footer.add(Rock);
        footer.add(Paper);
        footer.add(Scissors);

        Rock.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Game rocks = new Game();
                rocks.rock();
                if (rocks.getResult().equals(WIN)) {
                    header.removeAll();
                    computer.removeAll();
                    player.removeAll();
                    repaint();
                    header.add(win);
                    computer.add(computerWindow, BorderLayout.NORTH);
                    computer.add(computerscissorsImg, BorderLayout.SOUTH);
                    player.add(playerWindow, BorderLayout.NORTH);
                    player.add(playerrockImg, BorderLayout.SOUTH);
                    revalidate();
                } else if (rocks.getResult().equals(LOSE)) {
                    header.removeAll();
                    computer.removeAll();
                    player.removeAll();
                    repaint();
                    header.add(lose);
                    computer.add(computerWindow, BorderLayout.NORTH);
                    computer.add(computerpaperImg, BorderLayout.SOUTH);
                    player.add(playerWindow, BorderLayout.NORTH);
                    player.add(playerrockImg, BorderLayout.SOUTH);
                    revalidate();
                } else {
                    header.removeAll();
                    computer.removeAll();
                    player.removeAll();
                    repaint();
                    header.add(tie);
                    computer.add(computerWindow, BorderLayout.NORTH);
                    computer.add(computerrockImg, BorderLayout.SOUTH);
                    player.add(playerWindow, BorderLayout.NORTH);
                    player.add(playerrockImg, BorderLayout.SOUTH);
                    revalidate();
                }
            }
        });

        Paper.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Game paper = new Game();
                paper.paper();
                if (paper.getResult().equals(WIN)) {
                    header.removeAll();
                    computer.removeAll();
                    player.removeAll();
                    repaint();
                    header.add(win);
                    computer.add(computerWindow, BorderLayout.NORTH);
                    computer.add(computerrockImg, BorderLayout.SOUTH);
                    player.add(playerWindow, BorderLayout.NORTH);
                    player.add(playerpaperImg, BorderLayout.SOUTH);
                    revalidate();
                } else if (paper.getResult().equals(LOSE)) {
                    header.removeAll();
                    computer.removeAll();
                    player.removeAll();
                    repaint();
                    header.add(lose);
                    computer.add(computerWindow, BorderLayout.NORTH);
                    computer.add(computerscissorsImg, BorderLayout.SOUTH);
                    player.add(playerWindow, BorderLayout.NORTH);
                    player.add(playerpaperImg, BorderLayout.SOUTH);
                    revalidate();
                } else {
                    header.removeAll();
                    computer.removeAll();
                    player.removeAll();
                    repaint();
                    header.add(tie);
                    computer.add(computerWindow, BorderLayout.NORTH);
                    computer.add(computerpaperImg, BorderLayout.SOUTH);
                    player.add(playerWindow, BorderLayout.NORTH);
                    player.add(playerpaperImg, BorderLayout.SOUTH);
                    revalidate();
                }
            }
        });
        
                Scissors.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Game Scissors = new Game();
                Scissors.Scissors();
                if (Scissors.getResult().equals(WIN)) {
                    header.removeAll();
                    computer.removeAll();
                    player.removeAll();
                    repaint();
                    header.add(win);
                    computer.add(computerWindow, BorderLayout.NORTH);
                    computer.add(computerpaperImg, BorderLayout.SOUTH);
                    player.add(playerWindow, BorderLayout.NORTH);
                    player.add(playerscissorsImg, BorderLayout.SOUTH);
                    revalidate();
                } else if (Scissors.getResult().equals(LOSE)) {
                    header.removeAll();
                    computer.removeAll();
                    player.removeAll();
                    repaint();
                    header.add(lose);
                    computer.add(computerWindow, BorderLayout.NORTH);
                    computer.add(computerrockImg, BorderLayout.SOUTH);
                    player.add(playerWindow, BorderLayout.NORTH);
                    player.add(playerscissorsImg, BorderLayout.SOUTH);
                    revalidate();
                } else {
                    header.removeAll();
                    computer.removeAll();
                    player.removeAll();
                    repaint();
                    header.add(tie);
                    computer.add(computerWindow, BorderLayout.NORTH);
                    computer.add(computerscissorsImg, BorderLayout.SOUTH);
                    player.add(playerWindow, BorderLayout.NORTH);
                    player.add(playerscissorsImg, BorderLayout.SOUTH);
                    revalidate();
                }
            }
        });

    }

    public static void main(String[] args) {
        PlayGame window = new PlayGame();

    }

}
