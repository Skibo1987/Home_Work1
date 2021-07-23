package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;
    private int fieldSize;
    private int winLine;
    private boolean isInit;
    private int cellWidth;
    private int cellHeight;


    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeight;

                if (isInit && !Logic.isGameFinished) {
                    Logic.humanTurn(cellY, cellX);

                }
                repaint();
//                System.out.println(cellX + " " + cellY);
            }
        });

    }

    void startNewGame(int fieldSize, int winLine) {
        this.fieldSize = fieldSize;
        this.winLine = winLine;


        isInit = true;
        repaint();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!isInit) {
            return;
        }

        int panelWidth = getWidth();
        int panelHeigh = getHeight();

        cellWidth = panelWidth / fieldSize;
        cellHeight = panelHeigh / fieldSize;

        g.setColor(Color.GRAY);

        ((Graphics2D) g).setStroke(new BasicStroke(2f));

        for (int i = 1; i < fieldSize; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWidth, y);

        }
        for (int i = 1; i < fieldSize; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeigh);

        }


        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (Logic.map[j][i] == Logic.DOT_X) {
                    drawX(g, j, i);
                }
            }
        }
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (Logic.map[j][i] == Logic.DOT_O) {
                    DrawO(g, j, i);
                }
            }
        }


    }

    private void drawX(Graphics g, int y, int x) {
        g.setColor(Color.BLUE);
        ((Graphics2D) g).setStroke(new BasicStroke(3f));
        g.drawLine(x * cellWidth, y * cellHeight, (x + 1) * cellWidth, (y + 1) * cellHeight);
        g.drawLine(x * cellWidth, (y+1) * cellHeight, (x + 1) * cellWidth, y * cellHeight);
    }

    private void DrawO(Graphics g, int y, int x) {
        g.setColor(Color.BLUE);
        ((Graphics2D) g).setStroke(new BasicStroke(3f));
        int r = cellWidth/2;
//        x = x - (r / 2);
//        y = y - (r / 2);
        g.fillOval(x*cellWidth+(cellWidth/4), y*cellHeight+(cellHeight/4), r, r);
    }

}
