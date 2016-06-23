/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hangman;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Tyler Bohl
 */
public class Figure extends JPanel {

    private int xPosition;
    private int yPosition;
    private Color color;
    private int timesDrawn;

    public void timesDrawn(int numberOfWrongGuesses) {
        timesDrawn = numberOfWrongGuesses;
    }

    public void drawPart(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLACK);
        if (timesDrawn == 1) {
            drawHead(g, 175, 135);
        }  else if (timesDrawn == 2) {
            drawHead(g, 175, 135);
            drawBody(g, 185, 160);
        } else if (timesDrawn == 3) {
            drawHead(g, 175, 135);
            drawBody(g, 185, 160);
            drawLeftArm(g, 185, 170);
        } else if (timesDrawn == 4) {
            drawHead(g, 175, 135);
            drawBody(g, 185, 160);
            drawLeftArm(g, 185, 170);
            drawRightArm(g, 185, 173);
        } else if (timesDrawn == 5) {
            drawHead(g, 175, 135);
            drawBody(g, 185, 160);
            drawLeftArm(g, 185, 170);
            drawRightArm(g, 185, 173);
            drawLeftLeg(g, 188, 207);
        } else if (timesDrawn == 6) {
            drawHead(g, 175, 135);
            drawBody(g, 185, 160);
            drawLeftArm(g, 185, 170);
            drawRightArm(g, 185, 173);
            drawLeftLeg(g, 188, 207);
            drawRightLeg(g, 185, 207);
        }

    }

    public void drawHead(Graphics g, int x, int y) {

        g.setColor(Color.black);
        g.fillOval(x, y, 25, 25);
    }

    public void drawBody(Graphics g, int x, int y) {

        g.setColor(Color.black);
        g.fillRect(x, y, 5, 50);
    }

    public void drawLeftArm(Graphics g, int x, int y) {

        g.setColor(Color.black);
        g.drawLine(x, y, x + 25, y + 20);
    }

    public void drawRightArm(Graphics g, int x, int y) {

        g.setColor(Color.black);
        g.drawLine(x, y, x - 23, y + 18);
    }

    public void drawLeftLeg(Graphics g, int x, int y) {

        g.setColor(Color.black);
        g.drawLine(x, y, x + 20, y + 25);
    }

    public void drawRightLeg(Graphics g, int x, int y) {

        g.setColor(Color.black);
        g.drawLine(x, y, x - 20, y + 25);
    }
}
