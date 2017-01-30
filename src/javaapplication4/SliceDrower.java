package javaapplication4;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author stiv
 */
public class SliceDrower extends Canvas{
    private int[][][] scene;
    private JFrame frame;
    private short currentSliceNumber = 0;
    
    public SliceDrower(JFrame frame, short[][][] scene) {
        this.scene = new int[scene.length][scene[0].length][scene[0][0].length];
        int color = 0;
        for(int z = 0; z < scene.length; z++)
            for(int y = 0; y < scene[0].length; y++)
                for(int x = 0; x < scene[0][0].length; x++)
                {
                    if(scene[z][y][x] <= -1024)
                        color = 0;
                    else
                        color = (int)((scene[z][y][x] + 1024.0f) / 2048.0f * 255.0f);
                    this.scene[z][y][x] = color;
                }

        this.frame = frame;
        drawSlice(0);
    }

    public void drawSlice(int number) {
        BufferedImage image = new BufferedImage(scene[0][0].length, scene[0].length, BufferedImage.TYPE_INT_RGB);

        int[] pxlsr = new int[scene[0].length * scene[0][0].length * 3];
        int numberOfPixels = scene[0].length * scene[0][0].length;
        for(int i = 0; i < numberOfPixels; i++) {
            int color = scene[number][i / scene[0].length][i % scene[0].length];
            pxlsr[i * 3] = color;
            pxlsr[i * 3 + 1] = color;
            pxlsr[i * 3 + 2] = color;
        }
        image.setRGB(0, 0, scene[number][0].length, scene[number].length, pxlsr, 0, scene[number][0].length);

        Graphics2D g2 = image.createGraphics();
        g2.setBackground(Color.BLACK);
        this.paint(g2);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setBackground(Color.WHITE);
        g2.clearRect(0, 0, this.getWidth(), this.getHeight());
        g2.setColor(Color.BLACK);
        g2.drawString("Draw a rectangle", 100, 100);
        g2.drawRect(100, 200, 50, 50);
    }

    
}
