package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();   // The main window to store all JPanel instances
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        //  Usually called before making the window visible
        window.pack();  // Causes this window to be of preferred size of its subcomponents (main.GamePanel)

        window.setLocationRelativeTo(null);    // Not specify the location of window
        window.setVisible(true);

        gamePanel.setupGame();  // Set up objects before starting the game
        gamePanel.startGameThread();
    }
}