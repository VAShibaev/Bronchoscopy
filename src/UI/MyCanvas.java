package UI;

import javaapplication4.Ren;
import javaapplication4.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.EventListener;
import java.util.LinkedList;

/**
 * Created by stiv on 30.01.17.
 */
public class MyCanvas extends JComponent{
    private int[][][] scene;
    private int currentSlice = 0;
    private Graphics graphics;
    private LinkedList<Point> points = new LinkedList<Point>();
    private String path = "";
    private Ren ren;

    public MyCanvas(short[][][] scene, Ren ren) {
        super();
        this.ren = ren;
    }


    public void actionPerformed(String path) {
        this.scene = null;
        this.points = new LinkedList<Point>();
        this.currentSlice = 0;
        this.path = path;
        if (path != "" && path != null) {
            this.SliceDrower(Ren.arr);
            if (this.getMouseWheelListeners().length == 0)
                this.addMouseWheelListener(new MouseWheelListener() {
                @Override
                public void mouseWheelMoved(MouseWheelEvent e) {
                    if (scene != null) {
                        if (e.getWheelRotation() > 0) {
                            if (currentSlice != scene.length - 1) {
                                currentSlice++;
                                paint(graphics);
                            }
                        } else if (e.getWheelRotation() < 0) {
                            if (currentSlice != 0) {
                                currentSlice--;
                                paint(graphics);
                            }
                        }
                    }
                }
            });

            if (this.getMouseListeners().length == 0)
                this.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (scene != null) {
                        if (SwingUtilities.isLeftMouseButton(e)) {
                            javaapplication4.Point point = new javaapplication4.Point(e.getX(), e.getY(), currentSlice);
                            points.add(point);
                            ren.addUserPoint(point);
                            System.out.println("(" + point.GetX() + "; " + point.GetY() + "; " + point.GetZ() + ")");
                            paint(graphics);
                        }
                        if (SwingUtilities.isRightMouseButton(e)) {
                            LinkedList<Point> removePoints = new LinkedList<Point>();
                            for (Point p : points) {
                                if (currentSlice == p.GetZ())
                                    if (Math.sqrt(Math.pow(p.GetX() - e.getX(), 2) + Math.pow(p.GetY() - e.getY(), 2)) <= 10) {
                                        removePoints.add(p);
                                    }
                            }

                            for (Point pr : removePoints) {
                                points.remove(pr);
                                ren.removeUserPoint(pr);
                            }

                            paint(graphics);
                        }
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            });
        }
        paint(this.graphics);
    }


    public void paint(Graphics g) {
        this.graphics = this.getGraphics();
        Graphics2D g2 = (Graphics2D) g;
        g2.clearRect(0, 0, 512, 512);
        if (scene != null) {
            int width = scene[0][0].length;
            int height = scene[0].length;
            int[] data = new int[width * height];
            int i = 0;
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int color = scene[currentSlice][y][x];
                    if (color > 800)
                        data[i++] = (0 << 16) | (0 << 8) | 255;
                    else
                        data[i++] = (color << 16) | (color << 8) | color;
                }
            }


            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            image.setRGB(0, 0, width, height, data, 0, width);
            g2.drawImage(image, 0, 0, this);
            g2.setColor(Color.WHITE);
            g2.drawString("Номер снимка: " + String.valueOf(currentSlice), 10, 30);
            g2.drawString("Размер снимка: " + String.valueOf(scene[0].length) + " x "
                    + String.valueOf(scene[0][0].length), 10, 50);
            g2.drawString("Поставлено меток: " + String.valueOf(points.size()), 350, 30);
            g2.setColor(Color.ORANGE);
            g2.setStroke(new BasicStroke(2));
            for (Point p : points) {
                if (p.GetZ() == currentSlice) {
                    g2.drawOval(p.GetX(), p.GetY(), 1, 1);
                    g2.drawOval(p.GetX() - 7, p.GetY() - 7, 14, 14);
                }
            }
        }
    }


    public void SliceDrower(short[][][] scene) {
        this.scene = new int[scene.length][scene[0].length][scene[0][0].length];
        int color = 0;
        for(int z = 0; z < scene.length; z++)
            for(int y = 0; y < scene[0].length; y++)
                for(int x = 0; x < scene[0][0].length; x++)
                {
                    if(scene[z][y][x] <= -1024)
                        color = 0;
                    else
                        color = (int)((scene[z][y][x] + 1024.0f) / 2600.0f * 255.0f);
                    this.scene[z][y][x] = color;
                }
    }

}
