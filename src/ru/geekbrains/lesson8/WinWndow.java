package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;

public class WinWndow extends JFrame {
    private GameWindow gameWindow;

    public WinWndow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBounds(550,550,300,200);

        setTitle("Winner of the Game!");
        add(new Label(Logic.winner));
        setVisible(false);
        repaint();
    }


}
