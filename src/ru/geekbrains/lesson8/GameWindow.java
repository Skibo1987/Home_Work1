package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    private BattleMap battleMap;
    private Setting setting;
    private WinWndow winWndow;

    public GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 500, 500);
        setTitle("Ziro_Cross");

        JPanel panel = new JPanel(new GridLayout(1, 2));
        JButton button = new JButton("New Game");
        panel.add(button);
        add(panel, BorderLayout.SOUTH);

        JButton buttonExit = new JButton("Exit");
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);

        battleMap = new BattleMap(this);
        add(battleMap, BorderLayout.CENTER);
        setting = new Setting(this);
        winWndow = new WinWndow(this);


        button.addActionListener(e -> setting.setVisible(true));
        if(Logic.isGameFinished){
            winWndow.setVisible(true);
        }
        buttonExit.addActionListener(e -> System.exit(0));


        setVisible(true);


    }

    void startNewGame(int fieldSize, int winLine) {
        battleMap.startNewGame(fieldSize, winLine);
    }


}
