/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import javaapplication4.Ren;

import java.util.Objects;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import java.awt.*;

/**
 *
 * @author Dima
 */
public class Background extends SwingWorker<Integer, Objects> {

    private JFrame frame;
    private JPanel panel;
    private String path;
    private Canvas canvas;
    
    
    Background(MainFrame Frame, JPanel Panel, Canvas canvas, String Path) {
        frame = Frame;
        panel = Panel;
        path = Path;
        this.canvas = canvas;

    }
    
    public int doSomeWork()
    {
        try {
            Unavailable isBuild = new Unavailable();
            isBuild.setVisible(true);
            //Ren.main(frame, panel, path);
            isBuild.setVisible(false);
            isBuild=null;
            Thread.sleep(1);
        } catch (InterruptedException ex) {}
        return 1;                
    }
    
    @Override
    protected Integer doInBackground(){
        return doSomeWork();
    }
    
}
