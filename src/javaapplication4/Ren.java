package javaapplication4;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.jogamp.graph.curve.opengl.RenderState;
import com.jogamp.graph.font.*;
import com.jogamp.graph.geom.SVertex;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import java.awt.*;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;
import com.jogamp.opengl.util.FPSAnimator;
import com.jogamp.common.nio.Buffers;
import com.jogamp.opengl.GL2ES2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

import com.jogamp.opengl.util.awt.Overlay;
import com.jogamp.opengl.util.awt.TextRenderer;
import com.jogamp.opengl.util.gl2.GLUT;
import com.jogamp.opengl.util.glsl.ShaderState;
import javaapplication4.marchingCubes.*;
import javaapplication4.Objects.*;

import javax.swing.*;

import UserInterface.*;


public class Ren implements GLEventListener{
//    private static GraphicsEnvironment graphicsEnvironment;
//    private static boolean isFullScreen = false;
//    public static DisplayMode dm, dm_old;
//    private static Dimension xgraphic;
//    private static Point point = new Point(0, 0);
    
    private float xRotation = 0.0f;
    private float yRotation = 0.0f;
    private float zRotation = 0.0f;
    private float scale = 1.0f;
    private Point mousePos = null;
    
    private GLCanvas glcanvas = null;
    
    private float[] verteces = null;
    private FloatBuffer vertex_data = null;
    
    private LinkedList<Float> colors = null;
    private FloatBuffer color_data = null;
    
    private float[] normals = null;
    private FloatBuffer normal_data = null;
    
    
    private GLU glu = new GLU();
    private GLUT glut = new GLUT();

    private ArrayList<javaapplication4.Point> userPoints = new ArrayList<javaapplication4.Point>();

    public static short[][][] arr;

    TextRenderer tr;
    Overlay overlay;
    
    
    

    @Override
    public void init(GLAutoDrawable drawable) {
         final GL2 gl = drawable.getGL().getGL2();

         gl.glClearColor(0, 0, 0, 1);
         gl.glEnable(GL2.GL_DEPTH_TEST);
         gl.glShadeModel(GL2.GL_SMOOTH);
         //gl.glEnable(GL2.GL_CULL_FACE);
         gl.glPolygonMode(GL2.GL_FRONT_AND_BACK, GL2.GL_FILL);
         gl.glEnable(GL2.GL_NORMALIZE);

         float[] light0_position = {1.0f, 1.0f, 1.0f, 0.0f};
         float[] light1_position = {-1.0f, -1.0f, -1.0f, 0.0f};
         float[] light2_position = {-1.0f, 1.0f, -1.0f, 0.0f};
         float[] light3_position = {1.0f, -1.0f, 1.0f, 0.0f};

         gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_POSITION, Buffers.newDirectFloatBuffer(light0_position));
         gl.glLightfv(GL2.GL_LIGHT1, GL2.GL_POSITION, Buffers.newDirectFloatBuffer(light1_position));
         gl.glLightfv(GL2.GL_LIGHT2, GL2.GL_POSITION, Buffers.newDirectFloatBuffer(light2_position));
         gl.glLightfv(GL2.GL_LIGHT3, GL2.GL_POSITION, Buffers.newDirectFloatBuffer(light3_position));

         gl.glEnable(GL2.GL_LIGHTING);
         gl.glEnable(GL2.GL_LIGHT0);
         gl.glEnable(GL2.GL_LIGHT1);
         gl.glEnable(GL2.GL_LIGHT2);
         gl.glEnable(GL2.GL_LIGHT3);


        this.overlay = new Overlay(drawable);
        tr = new TextRenderer(new java.awt.Font("SansSerif", Font.PLAIN, 72));

         
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
       final GL2 gl = drawable.getGL().getGL2();
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glEnable(GL2.GL_LIGHTING);
        
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
        //gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
        
        gl.glScalef(scale, scale, scale);
        gl.glRotatef(xRotation, 1.0f, 0.0f, 0.0f);
        gl.glRotatef(yRotation, 0.0f, 1.0f, 0.0f);
        gl.glRotatef(zRotation, 0.0f, 0.0f, 1.0f);

        if(vertex_data != null) {
            //gl.glColor3f(1.0f, 1.0f, 1.0f);
            gl.glVertexPointer(3, GL.GL_FLOAT, 0, vertex_data);
            //gl.glColorPointer(3, GL.GL_FLOAT, 0, color_data);
            gl.glNormalPointer(GL.GL_FLOAT, 0, normal_data);

            gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
            //gl.glEnableClientState(GL2.GL_COLOR_ARRAY);
            gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
            float[] mat_specular = {1.0f / 255.0f * 238.0f,
                    1.0f / 255.0f * 238.0f,
                    1.0f / 255.0f * 224.0f,
                    1.0f};
            float[] mat_ambient = {1.0f / 255.0f * 208.0f,
                    1.0f / 255.0f * 208.0f,
                    1.0f / 255.0f * 194.0f,
                    1.0f};
            float[] mat_shininess = {50.0f};
            gl.glMaterialfv(GL.GL_FRONT, GL2.GL_SPECULAR, Buffers.newDirectFloatBuffer(mat_specular));
            gl.glMaterialfv(GL.GL_FRONT, GL2.GL_AMBIENT, Buffers.newDirectFloatBuffer(mat_ambient));
            gl.glMaterialfv(GL.GL_FRONT, GL2.GL_SHININESS, Buffers.newDirectFloatBuffer(mat_shininess));
            //gl.glDrawArrays(GL2.GL_POINTS, 0, verteces.size() / 3);
            gl.glDrawArrays(GL2.GL_TRIANGLES, 0, verteces.length / 3);

            //gl.glDisableClientState(GL2.GL_COLOR_ARRAY);
            gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
            gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);

            float[] mat_specular1 = {1.0f,
                    0.5f,
                    0.0f,
                    1.0f};
            float[] mat_ambient1 = {0.9f,
                    0.4f,
                    0.0f,
                    1.0f};
            float[] mat_shininess1 = {50.0f};
            gl.glMaterialfv(GL.GL_FRONT, GL2.GL_SPECULAR, Buffers.newDirectFloatBuffer(mat_specular1));
            gl.glMaterialfv(GL.GL_FRONT, GL2.GL_AMBIENT, Buffers.newDirectFloatBuffer(mat_ambient1));
            gl.glMaterialfv(GL.GL_FRONT, GL2.GL_SHININESS, Buffers.newDirectFloatBuffer(mat_shininess1));

            if (userPoints.size() != 0) {
                for (javaapplication4.Point p: userPoints) {
                    drawSphere(gl, p);
                    drawString(gl, p, String.valueOf(userPoints.indexOf(p)));
                }

            }
        }
        gl.glFlush();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        final GL2 gl = drawable.getGL().getGL2();
        if(height <= 0)
            height = 1;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
    }

    public Ren(GLCanvas canvas) {
        this.glcanvas = canvas;
        this.initCanvas(canvas);
    }

    public void actionPerformed(String path) {
        xRotation = 0.0f;
        yRotation = 0.0f;
        zRotation = 0.0f;
        scale = 1.0f;
        mousePos = null;
        verteces = null;
        vertex_data = null;
        colors = null;
        color_data = null;
        normals = null;
        normal_data = null;
        userPoints = new ArrayList<javaapplication4.Point>();

        if(path != null && path != "")
            counting(arr);
    }

    public static short[][][]getScene(String path) {
        short[][][] arr = DicomLoader.ReadDICOMDir(path);
        Ren.arr = arr;
        return arr;
    }


    public void addUserPoint(javaapplication4.Point point) {
        this.userPoints.add(point);
    }

    public void removeUserPoint(javaapplication4.Point point) {
        this.userPoints.remove(point);
    }

    private void drawSphere(GL2 gl, javaapplication4.Point point) {
        gl.glPushMatrix();
        int zl = arr.length / 2;
        int yl = arr[0].length / 2;
        int xl = arr[0][0].length / 2;
        float x = 1.0f / xl * (point.GetX() - xl);
        float y = 1.0f / yl * (point.GetY() - yl);
        float z = 1.0f / zl * (point.GetZ() - zl);
        gl.glTranslatef(x, y, z);
        glut.glutSolidSphere(0.03, 90, 90);
        gl.glPopMatrix();
    }

    private void drawString(GL2 gl, javaapplication4.Point point, String string) {
        int zl = arr.length / 2;
        int yl = arr[0].length / 2;
        int xl = arr[0][0].length / 2;
        float x = 1.0f / xl * (point.GetX() - xl + 7);
        float y = 1.0f / yl * (point.GetY() - yl + 7);
        float z = 1.0f / zl * (point.GetZ() - zl + 7);
//        gl.glPushMatrix();
//        gl.glLoadIdentity();
        tr.begin3DRendering();
        tr.setColor(1.0f, 0.0f, 0.0f, 1.0f);
        tr.draw3D(string, x, y, z, 0.0004f);
        tr.end3DRendering();
//        gl.glPopMatrix();

    }
    
    
    public void counting(short[][][] arr) {

        //short[][][] arr = DicomLoader.ReadDICOMDir(path);

//        Thresholding t = new Thresholding();
//        int threshold = t.GetThreshold(arr);
//        
//        boolean[][][] thresholdedVolume = new boolean[arr.length][arr[0].length][arr[0][0].length];
//        for(int z = 0; z < arr.length; z++)
//            for(int y = 0; y < arr[0].length; y++)
//                for(int x = 0; x < arr[0][0].length; x++)
//                    if(arr[z][y][x] < threshold) {
//                        thresholdedVolume[z][y][x] = true;
//                    }
//        
//        LungsExtracting extractor = new LungsExtracting();
//        boolean[][][] lungs = extractor.extract(thresholdedVolume);
//        
//        HoleFilling  hf = new HoleFilling();
//        hf.fillHoles(lungs);
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //---------------------СГЛАЖИВАНИЕ--------------------------------------
        GaussianFilter gf = new GaussianFilter(DicomLoader.x,
                DicomLoader.y, DicomLoader.z);
        short[][][] smoothedScene = gf.applyFilter(arr);
        //----------------------------------------------------------------------
//        
//        //---------------------ПОИСК 2D УЧАСТКА ТРАХЕИ--------------------------
        ExtractionOfTrahea extractor = new ExtractionOfTrahea();
        int slice = 0;
        ArrayList<ArrayList<javaapplication4.Point>> regions = new ArrayList<ArrayList<javaapplication4.Point>>();
        while (regions.size() == 0 && slice < arr.length) {
            regions = extractor.findPotentialRegions(smoothedScene, slice, DicomLoader.x, DicomLoader.y);
            slice++;
        }

        ArrayList<javaapplication4.Point> trahea2D = null;
        int maxSize = 0;
        for (ArrayList<javaapplication4.Point> region : regions) {
            if (region.size() > maxSize) {
                trahea2D = region;
                maxSize = region.size();
            }
        }
//        //----------------------------------------------------------------------
//        
//        //------------------------ПРОЦЕДУРА 3D РОСТА ОБЛАСТЕЙ-------------------
        AirwaySegmentation3D segmentator = new AirwaySegmentation3D(trahea2D.get(0),
                DicomLoader.x,
                DicomLoader.y,
                DicomLoader.z);

        ArrayList<javaapplication4.Point> airway3D = segmentator.segmentation(smoothedScene);

        for (javaapplication4.Point p : airway3D) {
            smoothedScene[p.GetZ()][p.GetY()][p.GetX()] = 9000;
            arr[p.GetZ()][p.GetY()][p.GetX()] = 9000;
        }
        //----------------------------------------------------------------------

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        // ArrayList<ArrayList<javaapplication4.Point>> elements = new ArrayList<ArrayList<javaapplication4.Point>>();
//
//
//
//        FatDeleter deleter = new FatDeleter();
//        deleter.DeletePlusXFat(arr, -450, 1000, 10);
//        deleter.DeleteMinusXFat(arr, -450, 1000, 10);
//        deleter.DeletePlusYFat(arr, -450, 1000, 10);
//        deleter.DeleteMinusYFat(arr, -450, 1000, 10);

//        Extractor e = new Extractor(arr);
//        char[][][] scene = e.Scene();


//         Statistics s = new Statistics();
//         s.Variance(arr);
//         boolean [][][] lowVariance = s.DencityDistribution(arr);


        //elements = me.Labeling2D(arr[counter], -900, -500, counter);

        ////////////////////////
//        MyExtractor me = new MyExtractor();
//        int counter = 0;
//        
//        while(elements.size() == 0)
//        {
//           elements = me.Labeling2D(arr[counter], -1000, -900, counter);
//           elements = me.TraheaExtraction3D(arr, elements, -1700, -930);
//           counter++;
//        }
//                  
//        for(javaapplication4.Point point : elements.get(0))
//        {
//            arr[point.GetZ()][point.GetY()][point.GetX()] = 9000;
//        }

//        TracheaFilling tf = new TracheaFilling(arr);
//        tf.FillScene(me.GetToptraheaIntens());
//        arr = tf.GetNewScene();
        //////////////////////////////
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++==
//                                      Нужно
//        Skeletonizator sk = new Skeletonizator();
//        sk.Skeletonization(smoothedScene);
//        Pruning pr = new Pruning(sk.SizeSkelet(), smoothedScene);
//        boolean[][] matrixAdj = pr.ConvertIntoGraph(smoothedScene);
//        HashSet<javaapplication4.Point> usingPoint = pr.Dijkstra(matrixAdj);
//        for(javaapplication4.Point i: usingPoint)
//        {
//            smoothedScene[i.GetZ()][i.GetY()][i.GetX()] = 9998;
//        }   
//        for(int z = 0; z < arr.length; z++)
//            for(int y = 0; y < arr[0].length; y++)
//                for(int x = 0; x < arr[0][0].length; x++)
//                    if(smoothedScene[z][y][x] == 9999)
//                    {
//                        smoothedScene[z][y][x] = 9000;
//                    }
//        DistanceTransformation dt = new DistanceTransformation(smoothedScene); // Здесь Происходит удаление ненужных ветвей
//        
//        Smoothing smoo = new Smoothing();
//        smoo.smooth(smoothedScene);
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


//        int[][][] distanceMap = dt.GetDistanceMap();
//        int[][][] sdistanceMap = dt.skeletalDistanceMap;

        //sk.Skeletonization(arr, elements.get(0));
//         
//         me.TraheaCapacity(arr, elements);
//         
//         for(javaapplication4.Point point : elements.get(0))
//         {
//             arr[point.GetZ()][point.GetY()][point.GetX()] = 9999;
//         }
//         
//         me.TraheaCapacity(arr, elements);
//         
//         for(javaapplication4.Point point : elements.get(0))
//         {
//             arr[point.GetZ()][point.GetY()][point.GetX()] = 9999;
//         }
//         
//         Skeletonizator sk = new Skeletonizator();
//         boolean[][][] binaryScene = sk.binarizator(arr, elements.get(0));
//         float[][][] dictanceScene = sk.SquaredEDT(binaryScene);
//         binaryScene = null;
//         boolean[][][] skeleton = sk.ExtractionOfSkeleton(dictanceScene);
//         dictanceScene = null;


        int STEPX = 1;
        int STEPY = 1;
        int STEPZ = 1;


        int zl = arr.length / 2;
        int yl = arr[0].length / 2;
        int xl = arr[0][0].length / 2;
//
//        verteces = new LinkedList<Float>();
//        colors = new LinkedList<Float>();
//        
//        //int z = 190;
//        for(int z = 0; z < arr.length; z++)
//            for(int y = 0; y < arr[0].length; y++)
//                for(int x = 0; x < arr[0][0].length; x++)
//                    if(smoothedScene[z][y][x] == 9998)
//                        {
//                           verteces.add(1.0f / xl * (x - xl));
//                           verteces.add(1.0f / yl * (y - yl));
//                           verteces.add(1.0f / zl * (z - zl));
//                           
////                           colors.add((float)((smoothedScene[z][y][x] + 1024) / 2048.0));
////                           colors.add((float)((smoothedScene[z][y][x] + 1024) / 2048.0));
////                           colors.add((float)((smoothedScene[z][y][x] + 1024) / 2048.0));
//                           
//                           colors.add((float)(255.0 / 255.0));
//                           colors.add((float)(255.0 / 255.0));
//                           colors.add((float)(255.0 / 255.0));
//                        }

        //int z = 150;
//        for(int z = 0; z < arr.length; z++)
//            for(int y = 0; y < arr[0].length; y++)
//                for(int x = 0; x < arr[0][0].length; x++)
//                    if(smoothedScene[z][y][x] == 9998)
//                        {
//                           verteces.add(1.0f / xl * (x - xl));
//                           verteces.add(1.0f / yl * (y - yl));
//                           verteces.add(1.0f / zl * (z - zl));
//                           
////                           colors.add((float)((smoothedScene[z][y][x] + 1024) / 2048.0));
////                           colors.add((float)((smoothedScene[z][y][x] + 1024) / 2048.0));
////                           colors.add((float)((smoothedScene[z][y][x] + 1024) / 2048.0));
//                           
//                           colors.add((float)(255.0 / 255.0));
//                           colors.add((float)(255.0 / 255.0));
//                           colors.add((float)(255.0 / 255.0));
//                        }


        final short BOTTOM_LIMIT = 520;
        final short TOP_LIMIT = 2048;
        Variant0 variant0 = new Variant0();
        Variant1 variant1 = new Variant1();
        Variant2 variant2 = new Variant2();
        Variant3 variant3 = new Variant3();
        Variant4 variant4 = new Variant4();
        Variant5 variant5 = new Variant5();
        Variant6 variant6 = new Variant6();
        Variant7 variant7 = new Variant7();
        Variant8 variant8 = new Variant8();
        Variant9 variant9 = new Variant9();
        Variant10 variant10 = new Variant10();
        Variant11 variant11 = new Variant11();
        Variant12 variant12 = new Variant12();
        Variant13 variant13 = new Variant13();
        Variant14 variant14 = new Variant14();
        Variant15 variant15 = new Variant15();
        Variant16 variant16 = new Variant16();
        Variant17 variant17 = new Variant17();

        LinkedList<Triangle> polygons = new LinkedList<Triangle>();

        System.out.println("Begin1");
        for (int z = 0; z < arr.length - 2; z++) {
            for (int y = 0; y < arr[0].length - 2; y++)
                for (int x = 0; x < arr[0][0].length - 2; x++) {
                    char[] chars = {'0', '0', '0', '0', '0', '0', '0', '0'};

                    //short v1 = arr[z][y][x];
                    short sv1 = smoothedScene[z][y][x];
                    if (/*v1 > BOTTOM_LIMIT && v1 < TOP_LIMIT ||*/ sv1 == 9000) {
                        chars[0] = '1';
                    }

                    //short v2 = arr[z][y][x + 1];
                    short sv2 = smoothedScene[z][y][x + 1];
                    if (/*v2 > BOTTOM_LIMIT && v2 < TOP_LIMIT || */sv2 == 9000) {
                        chars[1] = '1';
                    }

                    //short v3 = arr[z][y + 1][x + 1];
                    short sv3 = smoothedScene[z][y + 1][x + 1];
                    if (/*v3 > BOTTOM_LIMIT && v3 < TOP_LIMIT ||*/ sv3 == 9000) {
                        chars[2] = '1';
                    }

                    //short v4 = arr[z][y + 1][x];
                    short sv4 = smoothedScene[z][y + 1][x];
                    if (/*v4 > BOTTOM_LIMIT && v4 < TOP_LIMIT ||*/ sv4 == 9000) {
                        chars[3] = '1';
                    }

                    //short v5 = arr[z + 1][y][x];
                    short sv5 = smoothedScene[z + 1][y][x];
                    if (/*v5 > BOTTOM_LIMIT && v5 < TOP_LIMIT ||*/ sv5 == 9000) {
                        chars[4] = '1';
                    }

                    //short v6 = arr[z + 1][y][x + 1];
                    short sv6 = smoothedScene[z + 1][y][x + 1];
                    if (/*v6 > BOTTOM_LIMIT && v6 < TOP_LIMIT ||*/ sv6 == 9000) {
                        chars[5] = '1';
                    }

                    //short v7 = arr[z + 1][y + 1][x + 1];
                    short sv7 = smoothedScene[z + 1][y + 1][x + 1];
                    if (/*v7 > BOTTOM_LIMIT && v7 < TOP_LIMIT ||*/ sv7 == 9000) {
                        chars[6] = '1';
                    }

                    //short v8 = arr[z + 1][y + 1][x];
                    short sv8 = smoothedScene[z + 1][y + 1][x];
                    if (/*v8 > BOTTOM_LIMIT && v8 < TOP_LIMIT ||*/ sv8 == 9000) {
                        chars[7] = '1';
                    }

                    String str = new String(chars);

                    LinkedList<Triangle> cubePolygons =
                            variant0.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));

                    cubePolygons =
                            variant1.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }

                    cubePolygons =
                            variant2.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant3.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant4.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant5.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant6.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant7.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant8.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant9.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant10.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant11.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant12.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant13.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant14.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant15.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant16.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                    cubePolygons =
                            variant17.chose(str, new javaapplication4.Objects.Point(x, y, z, 1.0f, 1.0f, 1.0f));
                    if (cubePolygons != null && !cubePolygons.isEmpty()) {
                        polygons.addAll(cubePolygons);
                        continue;
                    }
                }
        }

        verteces = new float[polygons.size() * 9];
        normals = new float[polygons.size() * 9];
        colors = new LinkedList<Float>();
        int index = 0;
        for (Triangle polygon : polygons) {
            float x1 = 1.0f / xl * (polygon.getFirst().getX() - xl);
            float y1 = 1.0f / yl * (polygon.getFirst().getY() - yl);
            float z1 = 1.0f / zl * (polygon.getFirst().getZ() - zl);
            float x2 = 1.0f / xl * (polygon.getSecond().getX() - xl);
            float y2 = 1.0f / yl * (polygon.getSecond().getY() - yl);
            float z2 = 1.0f / zl * (polygon.getSecond().getZ() - zl);
            float x3 = 1.0f / xl * (polygon.getThird().getX() - xl);
            float y3 = 1.0f / yl * (polygon.getThird().getY() - yl);
            float z3 = 1.0f / zl * (polygon.getThird().getZ() - zl);
            float b1 = x3 - x1;
            float b2 = y3 - y1;
            float b3 = z3 - z1;
            float a1 = x2 - x1;
            float a2 = y2 - y1;
            float a3 = z2 - z1;
            float n1 = a2 * b3 - a3 * b2;
            float n2 = a3 * b1 - a1 * b3;
            float n3 = a1 * b2 - a2 * b1;
            normals[index] = n1;
            verteces[index++] = x1;
            normals[index] = n2;
            verteces[index++] = y1;
            normals[index] = n3;
            verteces[index++] = z1;
            normals[index] = n1;
            verteces[index++] = x2;
            normals[index] = n2;
            verteces[index++] = y2;
            normals[index] = n3;
            verteces[index++] = z2;
            normals[index] = n1;
            verteces[index++] = x3;
            normals[index] = n2;
            verteces[index++] = y3;
            normals[index] = n3;
            verteces[index++] = z3;

        }


        System.out.println("Begin3");
        vertex_data = Buffers.newDirectFloatBuffer(verteces);
        normal_data = Buffers.newDirectFloatBuffer(normals);

        vertex_data.rewind();
        normal_data.rewind();
    }
        
         
         
//        final GLProfile profile = GLProfile.get(GLProfile.GL2);
//        GLCapabilities capabilities = new GLCapabilities(profile);
//
//        glcanvas = new GLCanvas(capabilities);
//        Ren r = new Ren();
//        glcanvas.addGLEventListener(r);
        

    public void initCanvas(GLCanvas glcanvas) {
        glcanvas.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseMoved(MouseEvent e) {                
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                xRotation += 180 / scale * (e.getY() - mousePos.y) / glcanvas.getHeight();
                yRotation += 180 / scale * (e.getX() - mousePos.x) / glcanvas.getWidth();
                mousePos = e.getPoint();
            }
        });
        
        glcanvas.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e))
                    mousePos = e.getPoint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e))
                    mousePos = e.getPoint();
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
        
        
        
        glcanvas.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(e.getWheelRotation() > 0)
                    scale *= 1.1;
                else
                    if (e.getWheelRotation() < 0)
                        scale /= 1.1;
            }       
        });
        
        final FPSAnimator animator = new FPSAnimator(glcanvas, 300, true);
        
//        frame.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e){
//                if(animator.isStarted())
//                    animator.stop();
//                //System.exit(0);
//            }
//        });
        animator.start();
    }
    
}