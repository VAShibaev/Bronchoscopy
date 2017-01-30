package UI;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import javaapplication4.Ren;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;

/**
 * Created by stiv on 30.01.17.
 */
public class MainFrame extends JFrame {
    private String path;
    private MyCanvas canvas2D;
    private GLCanvas glCanvas;
    private JButton open;
    private JButton distance;
    private JButton close;
    private JButton clear;


    public static void main(String[] args) {
        JFrame frame = new MainFrame("iLungHelper");
        frame.setVisible(true);
    }

    public MainFrame(String name) {
        super(name);
        setTitle("iLungHelper");


        setSize(1040, 585);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.LIGHT_GRAY);
        setLayout(null);



        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        glCanvas = new GLCanvas(capabilities);
        Ren render = new Ren(glCanvas);
        glCanvas.addGLEventListener(render);
        glCanvas.setSize(512, 512);
        glCanvas.setLocation(522, 5);
        add(this.glCanvas);

        this.canvas2D = new MyCanvas(Ren.arr, ((Ren)(this.glCanvas.getGLEventListener(0))));
        this.canvas2D.setSize(512, 512);
        this.canvas2D.setLocation(5, 5);
        add(this.canvas2D);



        open = new JButton("Загрузка снимков");
        open.setSize(150, 30);
        open.setLocation(5, 525);
        add(open);
        open.addActionListener(event -> LoadStudy());

        close = new JButton("Выход");
        close.setSize(100, 30);
        close.setLocation(470, 525);
        add(close);
        close.addActionListener(event -> System.exit(0));

        clear = new JButton("Очистка");
        clear.setSize(100, 30);
        clear.setLocation(365, 525);
        add(clear);
        clear.addActionListener(event -> Clear());

        distance = new JButton("Определение расстояния");
        distance.setSize(200, 30);
        distance.setLocation(160, 525);
        add(distance);
        distance.addActionListener(null);

        clear.setEnabled(false);
        distance.setEnabled(false);

    }


    public void LoadStudy() {
        LoadFrame load = new LoadFrame();
        this.path = load.GetPath();
        if (this.path != null && this.path != "") {
            javaapplication4.Ren.getScene(path);
            ((Ren)(this.glCanvas.getGLEventListener(0))).actionPerformed(path);
            this.canvas2D.actionPerformed(path);
            clear.setEnabled(true);
            distance.setEnabled(true);
        }
    }

    public void Clear() {
        this.path = "";
        this.canvas2D.actionPerformed(path);
        ((Ren)(this.glCanvas.getGLEventListener(0))).actionPerformed(path);
        clear.setEnabled(false);
        distance.setEnabled(false);
    }

}
