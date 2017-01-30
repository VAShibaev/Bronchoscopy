package javaapplication4;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import java.nio.FloatBuffer;
import java.util.ArrayList;

/**
 *
 * @author Dima
 */
public class MarchingCube {
    private static double _BottomLimit = 1250.0;
    private static double _TopLimit = 1500.0;
    private static int _StepX = 1;
    private static int _StepY = 1;
    private static int _StepZ = 1;     
    
    static void draw(GL2 gl, FloatBuffer vertex_data, FloatBuffer color_data, float[][][] arr) {
//        gl.glBegin(GL.GL_TRIANGLES);
//            gl.glVertex3f(0.0f, 0.0f, 0.0f);
//            gl.glVertex3f(100.0f, 50.0f, 50.0f);
//            gl.glVertex3f(50.0f, 100.0f, 45.0f);
//        gl.glEnd();
        ArrayList dict = new ArrayList();
        for(int z = 0; z < arr.length-1-_StepZ; z+=_StepZ){
            for(int y = 0; y < arr[0].length-1-_StepY; y+=_StepY){
                for(int x = 0; x < arr[0][0].length-1-_StepX; x+=_StepX){
                    String str = new String();
                    str = "00000000";
                    if(arr[z][y][x] > _BottomLimit && arr[z][y][x] < _TopLimit){
                        str="1"+str.substring(1);
                    }
                    if(arr[z][y][x+_StepX] < _TopLimit && arr[z][y][x+_StepX] > _BottomLimit){
                        str=str.substring(0,1)+"1"+str.substring(2);
                    }
                    if(arr[z][y + _StepY][x + _StepX] > _BottomLimit && arr[z][y + _StepY][x + _StepX] < _TopLimit){
                        str=str.substring(0,2)+"1"+str.substring(3);
                    }
                    if(arr[z][y + _StepY][x] > _BottomLimit && arr[z][y + _StepY][x] < _TopLimit){
                        str=str.substring(0,3)+"1"+str.substring(4);
                    }
                    if(arr[z + _StepZ][y][x] > _BottomLimit && arr[z + _StepZ][y][x] < _TopLimit){
                        str=str.substring(0,4)+"1"+str.substring(5);
                    }
                    if(arr[z + _StepZ][y][x + _StepX] > _BottomLimit && arr[z + _StepZ][y][x + _StepX] < _TopLimit){
                        str=str.substring(0,5)+"1"+str.substring(6);
                    }
                    if(arr[z + _StepZ][y + _StepY][x + _StepX] > _BottomLimit && arr[z + _StepZ][y + _StepY][x + _StepX] < _TopLimit){
                        str=str.substring(0,6)+"1"+str.substring(7);
                    }
                    if(arr[z + _StepZ][y + _StepY][x] > _BottomLimit && arr[z + _StepZ][y + _StepY][x] < _TopLimit){
                        str=str.substring(0,7)+"1";
                    }
                    if (str == "10000000")
                    {
                        gl.glBegin(GL.GL_TRIANGLES);
                            gl.glClearColor(255, 0, 0, 1);
                            gl.glVertex3f((x + _StepX) / 2, y, z);
                            gl.glVertex3f(x,(y + _StepY) / 2, z);
                            gl.glVertex3f(x, y,(z + _StepZ) / 2);
                        gl.glEnd();
                    }
                }
            }
        }
    }
}