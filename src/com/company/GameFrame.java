package com.company;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //Fit JFrame components around the frame
        this.setVisible(true);
        this.setLocationRelativeTo(null); //For the frame to pop in the middle of the screen

    }

}
