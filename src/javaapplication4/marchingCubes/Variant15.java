package javaapplication4.marchingCubes;
import javaapplication4.Objects.*;
import java.util.LinkedList;

/**
 *
 * @author Dima
 */
public class Variant15{
    private Point vertex0;


    public LinkedList<Triangle> chose(String string, Point point0) {
        this.vertex0 = point0;
        LinkedList<Triangle> tr = null;
        switch (string){
            case "01011111": return Variant15_1();
            case "10101111": return Variant15_2();
            case "11011011": return Variant15_3();
            case "10111101": return Variant15_4();
            case "11111010": return Variant15_5();
            case "11110101": return Variant15_6();
            case "01111110": return Variant15_7();
            case "11100111": return Variant15_8();
            case "10110111": return Variant15_9();
            case "01111011": return Variant15_10();
            case "11011110": return Variant15_11();
            case "11101101": return Variant15_12();
        }
        return tr;
    }
    
    private LinkedList<Triangle> Variant15_1()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e4(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant15_2()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e4(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0)));
        return tr;
    }
    
    private LinkedList<Triangle> Variant15_3()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e5(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e12(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant15_4()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0), MiddlePoint.e12(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant15_5()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e10(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e7(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant15_6()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e12(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e8(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant15_7()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e1(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e4(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e9(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e8(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant15_8()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e11(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e5(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e8(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant15_9()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e2(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e9(vertex0)));
            tr.add( new Triangle(MiddlePoint.e8(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e5(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant15_10()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e10(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e5(vertex0), MiddlePoint.e4(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e1(vertex0), MiddlePoint.e10(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e9(vertex0), MiddlePoint.e5(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant15_11()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e12(vertex0)));
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e8(vertex0), MiddlePoint.e7(vertex0)));
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e8(vertex0)));
            tr.add( new Triangle(MiddlePoint.e2(vertex0), MiddlePoint.e3(vertex0), MiddlePoint.e11(vertex0)));        
        return tr;
    }
    
    private LinkedList<Triangle> Variant15_12()
    {
        LinkedList<Triangle> tr = new LinkedList<Triangle>();
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e11(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e11(vertex0), MiddlePoint.e7(vertex0), MiddlePoint.e6(vertex0)));
            tr.add( new Triangle(MiddlePoint.e4(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e3(vertex0)));
            tr.add( new Triangle(MiddlePoint.e3(vertex0), MiddlePoint.e6(vertex0), MiddlePoint.e12(vertex0)));        
        return tr;
    }
    
}
