package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;

public class Setting extends JFrame {
    private final int Min_Field_Size = 3;
    private final int Max_Field_Size = 10;
    private GameWindow gameWindow;

    private JSlider slFieldSize;
    private JSlider slDotsToWin;

    public Setting(GameWindow gameWindow) {

        this.gameWindow = gameWindow;
        setBounds(550, 550, 450, 450);
        setTitle("Ziro_Cross settings");

        slFieldSize = new JSlider(Min_Field_Size, Max_Field_Size, Min_Field_Size);
        slFieldSize.setMajorTickSpacing(1);
        slFieldSize.setPaintTicks(true);
        slFieldSize.setPaintLabels(true);

        slFieldSize.addChangeListener(e -> slDotsToWin.setMaximum(slFieldSize.getValue()));

        slDotsToWin = new JSlider(Min_Field_Size, Min_Field_Size, Min_Field_Size);
        slDotsToWin.setMajorTickSpacing(1);
        slDotsToWin.setPaintTicks(true);
        slDotsToWin.setPaintLabels(true);

        setLayout(new GridLayout(5, 1));


        add(new Label("Chose field size "));
        add(slFieldSize);

        add(new Label("Chose winning line "));
        add(slDotsToWin);


        JButton button=new JButton("Start a game");
        add(button);

        button.addActionListener(e -> {
            int fieldSize = slFieldSize.getValue();
            int winLine = slDotsToWin.getValue();

            Logic.SIZE = fieldSize;
            Logic.DOTS_TO_WIN = winLine;
            Logic.initMap();
            Logic.printMap();
            Logic.isGameFinished = false;


            gameWindow.startNewGame(fieldSize,winLine);

            setVisible(false);
        });

        setVisible(false);
    }
}
